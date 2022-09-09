import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
	
	BookDao dao = new BookDao();
	BookBean bean = new BookBean();
	
	static Scanner sc = new Scanner(System.in);
	
	
	BookMain(){
		init();
	}
	
	public void init() {
		while(true) {
			System.out.println("======메뉴 선택하기======");
			System.out.println("1.전체 정보 조회");
			System.out.println("2.조건 조회");
			System.out.println("3.정보 수정");
			System.out.println("4.정보 삭제");
			System.out.println("5.정보 추가");
			System.out.println("6.프로그램 종료");
			System.out.print(">> 메뉴 번호 입력 : ");
			String selectNum = sc.next();
			
			switch(selectNum) {
			case "1":
				showAll();
				break;
			case "2":
				showSelected();
				break;
			case "3":
				update();
				break;
			case "4":
				delete();
				break;
			case "5":
				insert();
				break;
			case "6":
				sc.close();
				try {
					dao.conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;
			default:
				System.out.println("올바른 번호가 아닙니다");
			}//switch
			
			
		
		}//while
		
	}//init()
	
	
	public void showAll(){
		ArrayList<BookBean> arr = dao.showAll();
		
		System.out.println("번호\t책제목\t저자\t출판사\t가격\t출간일");
		for(BookBean bean : arr) {
			System.out.println(bean.getNo() +"\t"+ bean.getTitle() +"\t"+ bean.getAuthor() +"\t"+ bean.getPublisher() +"\t"+ bean.getPrice() +"\t"+ bean.getPub_day());
		}
	}//showAll()
	
	
	public void showSelected() {
		System.out.print("제목:1   저자:2   출판사:3    번호입력>>");
		String selectNum = sc.next();
		
		ArrayList<BookBean> arr = dao.showSelected(selectNum);
		
		System.out.println("번호\t책제목\t저자\t출판사\t가격\t출간일");
		for(BookBean bean : arr) {
			System.out.println(bean.getNo() +"\t"+ bean.getTitle() +"\t"+ bean.getAuthor() +"\t"+ bean.getPublisher() +"\t"+ bean.getPrice() +"\t"+ bean.getPub_day());
		}
	}
	
	public void update() {
		System.out.print("수정할 번호 입력 : ");
		int no = sc.nextInt();
		System.out.print("책제목 입력 : ");
		String title = sc.next();
		System.out.print("저자 입력 : ");
		String author = sc.next(); 
		System.out.print("출판사 입력 : ");
		String publisher = sc.next();
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		System.out.print("출간일(yyyy/mm/dd 형식으로 입력하세요.) : ");
		String pub_day = sc.next();
		
		bean = new BookBean(no,title,author,publisher,price,pub_day);
		
		int count = dao.update(bean);
		
		if(count == -1) {
			System.out.println("수정 실패");
		}else if(count == 0) {
			System.out.println("수정할 Data가 없습니다");
		}else {
			System.out.println("수정 성공");
		}
	}//update()
	
	public void delete() {
		System.out.print("삭제할 책번호 입력 : ");
		int no = sc.nextInt();
		
		int count = dao.delete(no);
		
		if(count == -1) {
			System.out.println("삭제 실패");
		}else if(count == 0) {
			System.out.println("삭제할 Data가 없습니다");
		}else {
			System.out.println("삭제 성공");
		}
	}
	
	public void insert() {
		
		System.out.println("번호는 시퀀스로 입력됩니다(생략)");
		System.out.print("책제목 입력 : ");
		String title = sc.next();
		System.out.print("저자 입력 : ");
		String author = sc.next();
		System.out.print("출판사 입력 : ");
		String publisher = sc.next();
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		System.out.print("출간일(yyyy/mm/dd 형식으로 입력하세요.) : ");
		String pub_day = sc.next();
		
		bean = new BookBean(0,title,author,publisher,price,pub_day);
		
		int count = dao.insert(bean);
		if(count == -1) {
			System.out.println("삽입 실패");
		}else {
			System.out.println("삽입 성공");
		}
	}
	
	

	public static void main(String[] args) {
		new BookMain();
	}
}
