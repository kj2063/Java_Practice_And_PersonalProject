import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex11_11_���� {
	public static void main(String[] args) {
		
		try {
			int selectNum;
			String text, read; 
			
			
			Scanner sc = new Scanner(System.in);
			BufferedReader br_input = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedWriter bw1 = new BufferedWriter(new FileWriter("dic.txt"));
			bw1.close();
			
			while(true) {
				try{	
					System.out.print("1.�ܾ��Է�  2.�ܾ�˻�  3.���� >>");
					selectNum = sc.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("===1,2,3�� �ϳ��� �Է��� �ּ���===");
					continue;
				}
				
				if(selectNum == 1) {
					BufferedWriter bw = new BufferedWriter(new FileWriter("dic.txt",true));
					
					System.out.print("�ܾ�/�� �Է�:");
					text = br_input.readLine();
					bw.write(text);
					bw.newLine();
					bw.close();
				}
				else if(selectNum == 2) {
					boolean flag = false;
					
					BufferedReader br = new BufferedReader(new FileReader("dic.txt"));
					
					System.out.print("�˻� �ܾ� �Է�:");
					text = br_input.readLine();
					while((read = br.readLine()) != null) {
						String[] str = read.split("/");
						if(str[0].equals(text)) {
							System.out.println("�ܾ�>" + str[0]);
							System.out.println("��>" + str[1]);
							flag = true;
						}
					}
					if(flag==false)
						System.out.println("ã�� �ܾ� ����");
					
					br.close();
				}
				else if(selectNum == 3) {
					System.out.println("���α׷� �����մϴ�");
					break;
				}
				else {
					System.out.println("===1,2,3�� �ϳ��� �Է��� �ּ���===");
				}
				
			}
			
			br_input.close();
			sc.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
}

