import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	
	PersonDao pdao = new PersonDao();
	Scanner sc = new Scanner(System.in);
	
	PersonMain(){
		System.out.println("PersonMain()");
		init();
	}//PersonMain()
	
	public void init() {
		while(true) {
			System.out.println("===== 메뉴 선택하기 =====");
			System.out.println("1. 전체 정보 조회");
			System.out.println("2. 성별로 조회");
			System.out.println("3. 정보 수정");
			System.out.println("4. 정보 삭제");
			System.out.println("5. 정보 추가");
			System.out.println("6. 프로그램 종료");
			System.out.print(">> 메뉴 번호 입력 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				ArrayList<PersonBean> lists = pdao.getAllPerson();
				showPerson(lists);
				break;
			case 2: 
				findGender();
				break;
			case 3: 
				updateData();
				break;
			case 4: 
				deleteData();
				break;
			case 5: 
				insertData();
				break;
			case 6: System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			default:System.out.println("1~6사이의 번호만 입력 가능");
				
			
			}
		}
	}//init()
	
	public void deleteData() {
		System.out.print("삭제할 번호 입력:");
		int num = sc.nextInt();
		pdao.deleteData(num);
	}
	
	public void updateData() {
		System.out.print("수정할 번호 입력:");
		int num = sc.nextInt();
		System.out.print("이름 입력:");
		String name = sc.next();
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		System.out.print("성별 입력:");
		String gender = sc.next();
		System.out.print("생일 입력:");
		String birth = sc.next();
		
		PersonBean bean = new PersonBean(num,name,age,gender,birth);
		pdao.updateData(bean);
	}
	
	public void insertData() {
		System.out.println("번호는 시퀀스로 자동입력됩니다.(생략)");
		System.out.print("이름 입력:");
		String name = sc.next();
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		System.out.print("성별 입력:");
		String gender = sc.next();
		System.out.print("생일 입력:");
		String birth = sc.next();
		
		PersonBean bean = new PersonBean(0,name,age,gender,birth);
		pdao.insertData(bean);
	}
	
	public void findGender() {
		System.out.print("찾으려는 성별 입력 : ");
		String gender = sc.next();
		 ArrayList<PersonBean> lists = pdao.findGender(gender);
		showPerson(lists);
	}
	
	public void showPerson(ArrayList<PersonBean> lists) {
		System.out.println("번호\t이름\t나이\t성별\t생일");
		
		for(PersonBean a : lists) {
			System.out.println(a.getNum() + "\t" + a.getName() + "\t" + a.getAge() + "\t" + a.getGender() + "\t" + a.getBirth());
		}
		
//		for(int i=0; i<lists.size(); i++) {
//			PersonBean comp = lists.get(i);
//			System.out.println(comp.getNum() + "\t" + comp.getName() + "\t" + comp.getAge() + "\t" + comp.getGender() + "\t" + comp.getBirth());
//		}
	}
	
	public static void main(String[] args) {
		new PersonMain();
	}
}
