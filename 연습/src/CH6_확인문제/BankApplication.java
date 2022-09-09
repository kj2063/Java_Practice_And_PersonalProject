package CH6_Ȯ�ι���;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("______________________________________________");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("______________________________________________");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount();
			} else if(selectNo ==2) {
				accountList();
			} else if(selectNo ==3) {
				deposit();
			} else if(selectNo ==4) {
				withdraw();
			} else if(selectNo ==5) {
				run = false;
			} 
		}
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		System.out.println("_________");
		System.out.println("���»���");
		System.out.println("_________");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		Account ac = new Account(ano,owner,balance);
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = ac;
				break;
			}
			else 
				continue;
		}
	}
	
	private static void accountList() {
		System.out.println("_________");
		System.out.println("���¸��");
		System.out.println("_________");
		for(Account a: accountArray) {
			if(a == null)
				break;
			else
				System.out.printf("%s   %s   %d\n",a.getAno(),a.getOwner(),a.getBalance());
			}
	}
	
	private static void deposit() {
		
		System.out.println("_________");
		System.out.println("����");
		System.out.println("_________");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		
		
	}

	private static void withdraw() {
		
	}

	private static Account findAccount(String ano) { 
		
	}
	
}
