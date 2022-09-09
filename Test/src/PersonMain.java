import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	
	PersonDao pdao = new PersonDao();
	Scanner sc = new Scanner(System.in);
	
	PersonMain(){
		System.out.println("PersonMain()");
		init();
	}
	
	public void init() {
		//System.out.println("init");
		
		while(true) {
			System.out.println("=====메뉴 선택하기=====");
			System.out.println("1.전체 정보 조회");
			System.out.println("2.성별로 조회");
			System.out.println("3.정보 수정");
			System.out.println("4.정보 삭제");
			System.out.println("5.정보 추가");
			System.out.println("6.프로그램 종료");
			System.out.print(">> 메뉴 번호 입력 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				ArrayList<PersonBean> lists = pdao.getAllPerson(); 
				showPerson(lists);
				break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:break;
			case 6: System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			default:System.out.println("1~6사이의 번호만 입력 가능");		
				
			}
		}
		
	}// init
	
	public void showPerson(ArrayList<PersonBean> lists){
		System.out.println("번호\t이름\t나이\t성별\t생일");
		for( int i=0;i<lists.size();i++) {
			PersonBean pb = lists.get(i);
			String result = pb.getNum()+"\t"+
							pb.getName()+"\t"+
							pb.getAge()+"\t"+
							pb.getGender()+"\t"+
							pb.getBirth();
			System.out.println(result);
			
//			for(PersonBean pb:lists) {
//				System.out.println(pb.getNum()+"\t"+pb.getName()+"\t"+pb.getAge()+"\t"+pb.getGender()+"\t"+pb.getbirth());
//			}

			
		}
	}//showPerson
	
	public static void main(String[] args) {
		new PersonMain();
	}
}
