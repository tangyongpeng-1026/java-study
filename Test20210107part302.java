package com.neuedu.part03;

import java.util.Scanner;

/**
 * switch��� �����ж�
 * ���ṹ   switch (���ʽ){ ���ʽ���ΪԤ��ֵ
 *                       case ֵ��
 *                       �����;
 *                     [ break;]��д�ɲ�д  ������ִ�е���ֹͣ
 *                       case ֵ��
 *                       �����;
 *                     [ break;]��д�ɲ�д  ������ִ�е���ֹͣ
 *                     ...
 *                       default��
 *                       �����;
 *                  }
 * ע����� 1.���ʽ��ֵ����Ϊbyte��short��char��int��String
 *        2.case�����ֵ����Ϊ��������ֵ��  ���Ҳ����ظ�
 *        3.���ܴ���鲿�ֿ���Ϊ����
 *        4.default �൱�� if else�е�else
 * ���������ɱ�������̶�ֵ   �ڶ������ʱǰ�����final
 * 
 * 
 * 
 * 
 *
 */
public class Test20210107part302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=2;
		switch(i){
		case 1:
			System.out.println(1);
		case 2:
			//����2���߼���ͣ����
			System.out.println(2);
			break;
		default:
			System.out.println("����Ĭ��ֵ");
		
		}
		//����̨����һ���ɼ�������óɼ��ĵȼ���90-100���ţ�80-89����70-79�еȣ�60-69����60���²�����
		//��switchд
		//����Ĺؼ�������η��飬Ҳ����case�������
		Scanner scanner = new Scanner (System.in);
		System.out.print("������һ���ɼ���");
		int score = scanner.nextInt();
		switch (score/10){
		    case 10:	
		    case 9:	
		    	System.out.println("����");
		    	break;
		    case 8:	
		    	System.out.println("��");
		    	break;
		    case 7:	
		    	System.out.println("�е�");
		    	break;
		    case 6:	
		    	System.out.println("����");
		    	break;	
		    case 5:		
		    case 4:	
		    case 3:
		    case 2:
		    case 1:
		    case 0:	
		    	System.out.println("������");
		    	break;
		}
		
		//��ϰ1������һ����ݣ��ж��Ƿ������꣨1.�ܱ�4�����������ܱ�100������2.�ܱ�400������
		    Scanner sc = new Scanner (System.in);
		    System.out.print("������һ����ݣ�");
		    int year = sc.nextInt();
		    if(year%4==0 && year%100!=0){
			    System.out.println("������");
		    }
		    else if(year%400==0){
		    	System.out.println("������");
		    }
		    else{
		    	System.out.println("��������");
		    }
		    
		 //��ϰ2 ������һ���·ݣ��������·�������ͬ���·ݣ���switchд��
		    //1,3,5,7,8,10,12  ����31��
		    //4,6,9,11 ����30��
		    //2 ����28����29�죨�ж��Ƿ������꣩
		    System.out.print("�������·ݣ�");
		    int month = sc.nextInt();
		    switch(month){
		        case 1:
		        case 3:
		        case 5:
		        case 7:
		        case 8:
		        case 10:
		        case 12:
		        	System.out.println("1,3,5,7,8,10,12  ����31��");
		        	break;
		        case 4:
		        case 6:	
		        case 9:	
		        case 11:
		        	System.out.println("4,6,9,11 ����30��");
		        	break;
		        case 2:
		        	 if(year%4==0 && year%100!=0){
		 			    System.out.println("��29��");
		 		    }
		 		    else if(year%400==0){
		 		    	System.out.println("��29��");
		 		    }
		 		    else{
		 		    	System.out.println("��28��");
		 		    }
		        	break;
		    }
		    
		    	
	}

}
