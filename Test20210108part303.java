package com.neuedu.part03;
/**
 * ѭ��
 * 1.while(���ʽ){�����} 
 *   ������ʽ���Ϊ��  ��ִ�д���飬����������ʱѭ��ֹͣ��
 * 2.do...while   do{�����}while(���ʽ)
 *   do...while ѭ����Ĭ����ִ��һ�δ���飬Ȼ�������ʽ��������ʽ���Ϊ��  ���ٴ�ִ�д���飬����������ʱѭ��ֹͣ��
 *   do...whileʹ�ó�������
 * 3.for(���ʽ1;���ʽ2;���ʽ3){�����}
 *    ���ʽ1����ʼ��������ִֻ��һ��
 *    ���ʽ2��ѭ���ж��������Ϊ������
 *    ���ʽ3�������仯
 *    �����ʽ���Բ�д���ֺű���д��
 * ѭ���ǿ���Ƕ�׵�
 * 4.ѭ�����ж�
 *    break �ؼ��ֿ����жϣ�  �жϵ�ǰѭ��
 * 5.continue���
 * 
 * 
 * �ֶ���������ʽctrl+shift+f
 *
 * debugģʽ �ȼӶϵ㣬F6ִ�д��룬F8������ǰ�ϵ�
 */
public class Test20210108part303 {
         public static void main(String[] args) {
		
		//��ѭ������Զ����ֹͣ��ѭ��
		int a=1;
		int b=2;
		while(a<b){
			System.out.println("ִ����ѭ��");
			a++;
		}
        
		//���1��100�ĺ�
		int i=1;
		int sum=0;
		while(i<=100){
			//����ʲôֹͣѭ��
			sum +=i; //sum=sum+i
			i++;
		}
		 System.out.println(sum);
		
		 
		//�Ƚ�sum��i��ʼ��
		sum=0;
		i=1;
		do{
			sum +=i; //sum=sum+i
			i++;
		}
		while(i<=100);
		System.out.println(sum); 
		 
		//��ϰ�����1-1000��������
		int j=1;
		int sums=0;
		while(j<=1000){
			//�ж�����
			if(j%2 != 0){
				sums +=j;
			}
			j++;	
		}
		 System.out.println(sums);
		 
         sums=0;
		 for(int k=1;k<=1000;k++){
			 //���ʽ����ʡ��
			 if(k%2 != 0){
					sums +=k;
		    }		 
		}
		 System.out.println("1-1000��������Ϊ"+sums);
		 
		 //���5��7�е�*��
		 for(int o=1;o<=5;o++){
			 System.out.println("*******");
		 }
		 
		 //ѭ�����ж�
		 //�ж�һ�����Ƿ�Ϊ����
		 int num = 103;
		 for(int g=2;g<num;g++){
			 if(num%g == 0){
				 System.out.println("��������");
				 break;
			 }
		 }
		         System.out.println("������");
		         
		 //һ���� 3�� ÿ���4%������ ������������֮��ı�Ϣһ�����٣�
		 double money = 1000000;
		 for(int year=1;year<=3;year++){
			 money *=(1+0.04);//money=money*(1+0.04)
		 }
		         System.out.println(money);
		 
		 //���5��7�е�*��
	     for(int h=1;h<=5;h++){
		         for(int f=1;f<=7;f++){
			     System.out.print("*");
		         }
		         System.out.print('\n');
	     } 
	     
	     //���1+1/2+1/3....1/100�ĺ�
         double result=0;
	     for(double x=1;x<=100;x++){
	    	 result += (1/x);
	     }
	             System.out.println(result); 
	     
	     //���99�˷���
	     for(int hang=1;hang<=9;hang++){
	    	 for(int lie=1;lie<=hang;lie++){
	    		 System.out.print(hang+"*"+lie+"="+(hang*lie)+'\t');
	    	 }
	    	 System.out.println(); 
	     }
	     
	     //1+2+3+4+....�ж��ۼӶ��ٴ��ܳ���666
	     sum=0;
	     int count=0;//����
	     i=1;//��ֵ
	     while(true){
	    	 count++;
	    	 sum+=i;
	    	 if(sum>666){
	    		 break;
	    	 }
	    	 i++;
	     }
	     System.out.println(count+" "+sum); 
	     
	     //��дһ�������ҳ�����200����С����
	     //��Ƿ�
	     i = 200;
	     while(true){
	    	 count=0;//��ǣ���Ǳ仯i�Ͳ�����������ǲ��仹����0����ôi����������
	    	 i++;
	    	 for(int g=2;g<i;g++){
				 if(i%g == 0){
					 count++;
					 break;
				 }
			 }
	    	 if(count==0){
	    		 System.out.println(i+"������");
		    	 break;
	    	 }
	     }
	     // 
	     i = 200;
	     boolean flag=true;
	     while(true){
	    	 flag=true;//��ǳ�ʼ��
	    	 i++;
	    	 for(int g=2;g<i;g++){
				 if(i%g == 0){
					 flag=false;
					 break;
				 }
			 }
	    	 if(flag){
	    		 System.out.println(i+"������");
		    	 break;
	    	 }
	     }
	     
	     //continue��������ѭ��
	     for (int g = 1 ; g < 20 ; g++){
	    	 if((g%2) == 0){
	    		 continue;
	    	 }
	    	 System.out.print(g+" ");
	     }
	     
	     //ָ��ѭ��λ������ ����Ŀ��λ�ô������ƣ�label����ʶ����ð�ţ��������ؼ��ֺ���ӱ�ʶ������
	     inner:for (int g = 1 ; g < 20 ; g++){
	    	 if((g%2) == 0){
	    		 continue inner;
	    	 }
	    	 System.out.println(g+" ");
	     }
	     
	     //continue lable��ָ��ѭ����ʼ
	     //break lable��ָ��ѭ����ֹ
	     
	     //��չ���������ģʽ�еĲ���ģʽ�����else if��������
	     
	             
  }
}
	