import java.util.Scanner;

public class Ex04_02_1���� {

	public static void main(String[] args) {
		
		double[] arr1 = {1.1, 2.2, 3.3};
		double[] arr2 = new double[] {1.1, 2.2, 3.3};
		double[] arr3 = new double[3];
		arr3[0] = 1.1;
		arr3[1] = 2.2;
		arr3[2] = 3.3;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		for(double value: arr3) {//Ȯ�� for��
			System.out.print(value + " ");
		}
		System.out.println();
		
		String[] s = {"������","ũ����Ż","����"};
		for(String value : s) {
			System.out.print(value + " ");
		}
		System.out.println("\n");
		
		int[] score = {77,89,93,45,100,23,69};
		int sum = 0;
		
		/*
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + " ");
			sum += score[i];
		}
		System.out.println();
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum/(double)score.length);
		System.out.println();
		*/
		
		for(int value: score) {
			System.out.print(value + " ");
			sum += value;
		}
		System.out.println();
		System.out.println("�հ� : " + sum);
		System.out.printf("��� : %.2f\n",(sum/(double)score.length));
		System.out.println();
		
		
		int max;
		int min;
		
		max = score[0];
		min = score[0];
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i]; 
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println();
		
		/*
		int max=0, min=score[0];
		for(int value: score) {
			if(value>max)
				max = value;
			if(value<min) 
				min = value;	
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		*/
		Scanner sc = new Scanner(System.in);
		
		String[] subject = {"����","����","����"};
		int[] jumsu = new int[3];
		
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(subject[i] + "�� ���� �Է� : ");			
			jumsu[i] = sc.nextInt();
		}
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(subject[i] + " ���� : " + jumsu[i] + " , ");
		}
		System.out.println();
		
		/*
		System.out.print("array �� ���� �Է� : ");
		int arr_num = sc.nextInt();
		int[] jumsu = new int[arr_num];
		
		for(int i=0; i<jumsu.length; i++) {
			System.out.printf("jumsu[%d] �� �Է� = ",i);
			jumsu[i] = sc.nextInt();
		}
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(jumsu[i] + " ");
		}
		System.out.println();
		*/
		
		
		
	}
}
