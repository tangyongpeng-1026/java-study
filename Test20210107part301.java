package com.neuedu.part03;

import java.util.Scanner;

/**
 * ���̿������
 * 1.������䣺�ڳ������й����У����������Ƿ����ѡ��ִ�д���Ĺ��̡�
 * if���   if�����ʽ��{ִ������;}  ���б��ʽ���ֻ��Ϊtrue����false��������ʽΪ���������ִ�С�
 * if���Ķ�ѡһģʽ   if����{} else{} if�����Բ�д�����ţ�ǰ����ֻ��һ�д�����Ҫִ��
 * if���Ķ�ѡһģʽ   if����{} else if(){} else if(){} else{}
 * 
 * 
 *
 */
public class Test20210107part301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�ӿ���̨����һ�������ж����������������ż�� 
		Scanner sc = new Scanner (System.in);
		System.out.print("������һ������");
		int number = sc.nextInt();
		if(number%2==0){
			System.out.println(number+"��ż��");
		}
		else{
			System.out.println(number+"������");
		}
		
		//����̨����һ���ɼ�������óɼ��ĵȼ���90-100���ţ�80-89����70-79�еȣ�60-69����60���²�����
		Scanner scanner = new Scanner (System.in);
		System.out.print("������һ���ɼ���");
		int score = scanner.nextInt();
		//�ж���������Ƿ�Ϸ�
		if(score<0 || score>100){
			System.out.println("����������������루ʣ�����0��");
			score = scanner.nextInt();
			if(score<0 || score>100){
				System.out.println("Ƶ�������������");
				//return ������ǰ��������
				return;
			}
		}
		
		if(score>=90){
			System.out.println("����");
		}
		else if(score>=80 && score<90){
			System.out.println("��");
		}
		else if(score>=70 && score<80){
			System.out.println("�е�");
        }
		else if(score>=60 && score<70){
			System.out.println("����");
        }
		else {
			System.out.println("������");
        }
		
	}
}
		
