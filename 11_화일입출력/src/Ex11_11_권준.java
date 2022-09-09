import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex11_11_권준 {
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
					System.out.print("1.단어입력  2.단어검색  3.종료 >>");
					selectNum = sc.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("===1,2,3중 하나를 입력해 주세요===");
					continue;
				}
				
				if(selectNum == 1) {
					BufferedWriter bw = new BufferedWriter(new FileWriter("dic.txt",true));
					
					System.out.print("단어/뜻 입력:");
					text = br_input.readLine();
					bw.write(text);
					bw.newLine();
					bw.close();
				}
				else if(selectNum == 2) {
					boolean flag = false;
					
					BufferedReader br = new BufferedReader(new FileReader("dic.txt"));
					
					System.out.print("검색 단어 입력:");
					text = br_input.readLine();
					while((read = br.readLine()) != null) {
						String[] str = read.split("/");
						if(str[0].equals(text)) {
							System.out.println("단어>" + str[0]);
							System.out.println("뜻>" + str[1]);
							flag = true;
						}
					}
					if(flag==false)
						System.out.println("찾는 단어 없음");
					
					br.close();
				}
				else if(selectNum == 3) {
					System.out.println("프로그램 종료합니다");
					break;
				}
				else {
					System.out.println("===1,2,3중 하나를 입력해 주세요===");
				}
				
			}
			
			br_input.close();
			sc.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
}

