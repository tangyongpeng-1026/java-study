package com.neuedu.part03;

import java.util.Scanner;

public class Test20210108part304 {

	public static void main(String[] args) {
		//��ϰ1��������������������ǵ����Լ�� 
		
		/*
		Scanner scanner= new Scanner(System.in);
		System.out.println("�����һ����");
		int first = scanner.nextInt();
		System.out.println("����ڶ�����");
		int second = scanner.nextInt();
		int result = 0;
		int min = first>second?second:first;
		for(int i=1; i<=min; i++){
			if(first%i==0 && second%i==0 ){
				result = i;
			}
		}
        System.out.println(result);
        */
        
		
		//��ϰ2���������1000����ˮ�ɻ���
        //ָһ���������λ�������ĸ�λ���ֵ������������������
        for(int i=1; i<1000; i++){
			if((i/100%10)*(i/100%10)*(i/100%10)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10) == i ){
				System.out.println(i);
			}
		}
        //��ϰ3��������Ԫ�ټ�����
        //ĸ������Ϊa����������Ϊb��С������Ϊc
        for(int a=1;a<=33;a++){
        	for(int b=1;b<=25;b++){
        		int c =100-a-b;
        		if(a*3+b*4+c*0.5==100){
        			System.out.println("ĸ������Ϊ��"+a);
        			System.out.println("��������Ϊ��"+b);
        			System.out.println("С������Ϊ��"+c);
        		}
        	}
        }
        
       
      
		/* ��ϰ4�����ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ����
		 *      �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
		 *      �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�
		 */
        //�ӵ�9����ǰ����
        int sum=1;
        for(int i=9; i>=1;i--){
        	sum=(sum+1)*2;
        }
        System.out.println(sum);
        
        //��ϰ5����ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ���������10%���������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣������7.5%��
        //20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%��
        //����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��ڳ������趨һ������Ϊ����������Ӧ���Ž���������
        Scanner scanner= new Scanner(System.in);
		System.out.println("��������������");
		double profit = scanner.nextInt();
		double bonus;
		if (profit<=100000){
			bonus = profit*0.1;
		}
		else if(profit>100000 && profit<=200000){
			bonus =100000*0.1+(profit-100000)*0.075;
		}
		else if(profit>200000 && profit<=400000){
			bonus =100000*0.1+100000*0.075+(profit-200000)*0.05;
		}
		else if(profit>400000 && profit<=600000){
			bonus =100000*0.1+100000*0.075+200000*0.05+(profit-400000)*0.03;
		}
		else if(profit>600000 && profit<=1000000){
			bonus =100000*0.1+100000*0.075+200000*0.05+200000*0.03+(profit-600000)*0.015;
		}
		else{
			bonus =100000*0.1+100000*0.075+200000*0.05+200000*0.03+400000*0.015+(profit-1000000)*0.01;
		}
		 System.out.println(bonus);
  
        //��ϰ6��������������һ��4λ�������󽫸�����ת�Ժ��������ԭ��Ϊ1234����ת�����Ϊ4321��
        
		Scanner sc= new Scanner(System.in);
		System.out.println("������һ����λ����");
		int num = sc.nextInt();
		if(num>999 && num<10000){
		 int result;
		 int a=num/1000%10;
		 int b=num/100%10;
		 int c=num/10%10;
		 int d=num%10;
		 result=1000*d+100*c+10*b+a;
		 System.out.println(result);
		}
		else{
			System.out.println("����������д���");
		}
		

	}

}
