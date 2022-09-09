import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}


public class Ex09_08_권준 {
	
	static ArrayList<Card> cards = new ArrayList<Card>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num;
		
		
		while(true) {
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			System.out.print("번호 입력 :");
			num = sc.nextInt();
			
			
			
			if(num == 1) {
				m1();
			}
			else if(num ==2) {
				m2();
			}
			else if(num ==3) {
				m3();
			}
			else if(num ==4) {
				m4();
			}
			else if(num ==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
							
		}//while
				
		
		
	}//main
	
	static void m1() {
		System.out.print("이름을 입력하세요 :");
		String name = sc.next();
		System.out.print("전화번호를 입력하세요 :");
		String pnum = sc.next();
		
		cards.add(new Card(name,pnum));
		System.out.println();
	}
	
	static void m2() {
		int i;
		boolean retry = false;
		System.out.print("이름을 입력하세요 :");
		String name = sc.next();
		
		for(i=0; i<cards.size(); i++) {
			if(cards.get(i).getName().equals(name)) {
				retry = true;
				break;
			}
		}
		if(retry == false) {
			System.out.println("이름을 잘못 입력하였습니다");
			System.out.println();
			return;
		}
		else {
			cards.remove(i);
			System.out.println("삭제 되었습니다");
		}
		System.out.println();
		
	}
	
	static void m3() {
		int i;
		boolean retry = false;
		System.out.print("이름을 입력하세요 :");
		String name = sc.next();
		
		for(i=0; i<cards.size(); i++) {
			if(cards.get(i).getName().equals(name)) {
				retry = true;
				break;
			}
		}
		if(retry == false) {
			System.out.println("이름을 잘못 입력하였습니다");
			System.out.println();
			return;
		}
		
		System.out.print("수정하실 번호는 :");
		String pnum_re = sc.next();
		cards.get(i).setTel(pnum_re);
		System.out.println("수정되었습니다");
		System.out.println();
	}
		
	static void m4() {
		System.out.println("이름\t\t전화번호");
		for(int i=0; i<cards.size(); i++) {
			System.out.println(cards.get(i).getName() + "\t\t" + cards.get(i).getTel());
		}
		System.out.println();
	}
	
}
