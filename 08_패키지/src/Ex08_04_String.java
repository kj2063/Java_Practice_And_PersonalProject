import java.util.Scanner;

class Person{
	private String id;
	private String pw;
	private String name;
	
	Person(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
		
	}
	
	void display() {
		System.out.println(id + " " + pw + " " + name);
	}
	
	String getId(){
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}
}


public class Ex08_04_String {
	public static void main(String[] args) {
		
		Person[] p = {
				new Person("kim","1234","김연아"),
				new Person("park","9876","박보검"),
				new Person("lee","3333","이수현")
		};
		
//		for(Person pp : p) {
//			p.display();
//		}
		
		Scanner sc = new Scanner(System.in);
		String id, pw, retry;
		boolean flag;
		boolean pwMatch;
		

		do{ 
			flag = false; //찾았냐 못찾았냐 변수 만듬.
			
			System.out.print("id입력 : ");
			id = sc.next();
			if(3>id.length() || id.length()>8) {
				System.out.println("===3글자 ~ 8글자 입력해야 합니다===");
				continue;
			}


			do {
				pwMatch = false;
				
				System.out.print("pw입력 : ");
				pw = sc.next();

				for(int i=0; i<p.length; i++) {

					if(p[i].getId().equals(id)) {
						if(p[i].getPw().equals(pw)) {
							System.out.println("==="+p[i].getName() + "님 반갑습니다===");
							flag = true;

						}
						else {
							System.out.println("===비밀번호가 일치하지 않습니다===");
							flag = true;
							pwMatch = true; //일치 안한다:true
						}
					}
//				else {   //존재하는 모든 방을 확인 후 출력시키기 때문에 좋지 않음.
//					System.out.println("해당 아이디가 존재하지 않습니다");
//				}
				}
				if(pwMatch == false)
					break;
			}while(true);
			
			if(flag == false) {
				System.out.println("===해당 아이디가 없습니다===");
			}

			while(true) {
				System.out.print("계속?(y/n) : ");
				retry = sc.next();

				if (retry.equalsIgnoreCase("y") || retry.equalsIgnoreCase("n")) {
					break;
				} 
				else {
					System.out.println("==='y'또는'n'을 입력해 주세요===");
					continue;
				}

			}
			if(retry.equalsIgnoreCase("n")) {
				break;
			}else if(retry.equalsIgnoreCase("y")) {
				continue;
			}

		} while(true);

		System.out.println("===프로그램을 종료합니다===");

	}
}
