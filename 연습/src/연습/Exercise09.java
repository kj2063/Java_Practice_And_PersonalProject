package ����;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("________________________________________________");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("________________________________________________");
			System.out.print("����> ");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				studentNum = 3;
				System.out.println("�л���> " + studentNum);
			}
			else if(selectNo == 2) {
				scores = new int[3];
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> ",i);
					int score = sc.nextInt();
					scores[i] = score;
				}
			}
			else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n",i,scores[i]);
				}
			}	
			else if(selectNo == 4) {
				int max = 0, sum = 0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(scores[i]>max)
						max = scores[i];
				}
				
				System.out.printf("�ְ� ����: %d\n",max);
				System.out.printf("��� ����: %.1f\n",(double)sum/scores.length);
				
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}
}
