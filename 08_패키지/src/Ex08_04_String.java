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
				new Person("kim","1234","�迬��"),
				new Person("park","9876","�ں���"),
				new Person("lee","3333","�̼���")
		};
		
//		for(Person pp : p) {
//			p.display();
//		}
		
		Scanner sc = new Scanner(System.in);
		String id, pw, retry;
		boolean flag;
		boolean pwMatch;
		

		do{ 
			flag = false; //ã�ҳ� ��ã�ҳ� ���� ����.
			
			System.out.print("id�Է� : ");
			id = sc.next();
			if(3>id.length() || id.length()>8) {
				System.out.println("===3���� ~ 8���� �Է��ؾ� �մϴ�===");
				continue;
			}


			do {
				pwMatch = false;
				
				System.out.print("pw�Է� : ");
				pw = sc.next();

				for(int i=0; i<p.length; i++) {

					if(p[i].getId().equals(id)) {
						if(p[i].getPw().equals(pw)) {
							System.out.println("==="+p[i].getName() + "�� �ݰ����ϴ�===");
							flag = true;

						}
						else {
							System.out.println("===��й�ȣ�� ��ġ���� �ʽ��ϴ�===");
							flag = true;
							pwMatch = true; //��ġ ���Ѵ�:true
						}
					}
//				else {   //�����ϴ� ��� ���� Ȯ�� �� ��½�Ű�� ������ ���� ����.
//					System.out.println("�ش� ���̵� �������� �ʽ��ϴ�");
//				}
				}
				if(pwMatch == false)
					break;
			}while(true);
			
			if(flag == false) {
				System.out.println("===�ش� ���̵� �����ϴ�===");
			}

			while(true) {
				System.out.print("���?(y/n) : ");
				retry = sc.next();

				if (retry.equalsIgnoreCase("y") || retry.equalsIgnoreCase("n")) {
					break;
				} 
				else {
					System.out.println("==='y'�Ǵ�'n'�� �Է��� �ּ���===");
					continue;
				}

			}
			if(retry.equalsIgnoreCase("n")) {
				break;
			}else if(retry.equalsIgnoreCase("y")) {
				continue;
			}

		} while(true);

		System.out.println("===���α׷��� �����մϴ�===");

	}
}
