import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AlbumMain {
	AlbumDao dao = new AlbumDao();
	AlbumBean ab = new AlbumBean();
	
	Scanner sc = new Scanner(System.in);
	
	AlbumMain(){
		init();
	}
	
	public void init() {

		while(true) {
			System.out.println("======메뉴 선택하기======");
			System.out.println("1.모든 정보 조회");
			System.out.println("2.조건 검색");
			System.out.println("3.가격 범위조건 검색(가격:내림차순, 가수:오름차순)");
			System.out.println("4.앨범 수정");
			System.out.println("5.앨범 삭제");
			System.out.println("6.앨범 추가");
			System.out.println("7.정렬");
			System.out.println("8.프로그램 종료");
			System.out.print("메뉴 선택 >> ");
			int selectNum = sc.nextInt();
			
			switch(selectNum) {
			case 1:
				showAll();
				break;
			case 2:
				selectShow();
				break;
			case 3:
				showPriceRank();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			case 6:
				insert();
				break;
			case 7:
				arrange();
				break;
			case 8:
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
				System.out.println("1~8까지의 숫자를 입력해 주세요");
			}
		}
	}//init()
	
	public void showAll() {
		ArrayList<AlbumBean> arr = dao.showAll();
		
		System.out.println("번호\t노래제목\t가수\t회사\t가격\t발매일");
		for(AlbumBean ab : arr) {
			System.out.println(ab.getNum() +"\t"+ ab.getSong() +"\t"+ ab.getSinger() +"\t"+ ab.getCompany() +"\t"+ ab.getPrice() +"\t"+ ab.getPub_day());
		}
	}
	
	public void selectShow() {
		String colName = null;
		String name = null;
		
		System.out.println("제목검색:1     가수검색:2     회사검색:3");
		System.out.print("검색할 항목을 선택 : ");
		int selectNum = sc.nextInt();
		
		switch(selectNum) {
		case 1:
			System.out.print("검색할 제목 입력 : ");
			name = sc.next();
			
			colName = "song";
			break;
		case 2:
			System.out.print("검색할 가수 입력 : ");
			name = sc.next();
			
			colName = "singer";
			break;
		case 3:
			System.out.print("검색할 회사 입력 : ");
			name = sc.next();
			colName = "company";
			break;
		default:
			System.out.println("1~3사이의 숫자를 입력해 주세요");
			return;
		}
		
		name.toUpperCase();
		
		ArrayList<AlbumBean> arr = dao.selectShow(colName, name);
		
		System.out.println("번호\t노래제목\t가수\t회사\t가격\t발매일");
		for(AlbumBean ab : arr) {
			System.out.println(ab.getNum() +"\t"+ ab.getSong() +"\t"+ ab.getSinger() +"\t"+ ab.getCompany() +"\t"+ ab.getPrice() +"\t"+ ab.getPub_day());
		}
		
	}//selectShow()
	
	public void showPriceRank() {
		System.out.print("시작등수 입력 : ");
		int firstNum = sc.nextInt();
		System.out.print("끝등수 입력 : ");
		int lastNum = sc.nextInt();
		
		ArrayList<AlbumBean> arr = dao.showPriceRank(firstNum, lastNum);
		
		System.out.println("번호\t노래제목\t가수\t회사\t가격\t발매일");
		for(AlbumBean ab : arr) {
			System.out.println(ab.getNum() +"\t"+ ab.getSong() +"\t"+ ab.getSinger() +"\t"+ ab.getCompany() +"\t"+ ab.getPrice() +"\t"+ ab.getPub_day());
		}
	}//showPriceRank
	
	public void update() {
		System.out.print("수정할 번호를 선택 => ");
		int num = sc.nextInt();
		System.out.print("수정 후 노래제목 : ");
		String song = sc.next();
		System.out.print("수정 후 가수 : ");
		String singer = sc.next();
		System.out.print("수정 후 회사 : ");
		String company = sc.next();
		System.out.print("수정 후 가격 : ");
		int price = sc.nextInt();
		System.out.print("수정 후 발매일 : ");
		String pub_day = sc.next();
		
		ab = new AlbumBean(num,song,singer,company,price,pub_day);
	
		int count = dao.update(ab);

		if(count==-1) {
			System.out.println("수정 실패");
		}else if(count==0) {
			System.out.println("수정할 Data가 없습니다");
		}else {
			System.out.println("수정 성공");
		}
		
	}//update()
	
	public void delete() {
		System.out.print("삭제할 번호 입력 => ");
		int selectNum = sc.nextInt();
		
		int count = dao.delete(selectNum);
		
		if(count==-1) {
			System.out.println("삭제 실패");
		}else if(count==0) {
			System.out.println("삭제할 Data가 없습니다");
		}else {
			System.out.println("삭제 성공");
		}
	}//delete()
	
	public void insert() {
		System.out.println("번호는 시퀀스로 자동입력 됩니다(생략)");
		System.out.print("노래제목 입력 :");
		String song = sc.next();
		System.out.print("가수 입력 : ");
		String singer = sc.next();
		System.out.print("회사 입력 : ");
		String company = sc.next();
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		System.out.print("발매일 입력 : ");
		String pub_day = sc.next();
		
		ab = new AlbumBean(0,song,singer,company,price,pub_day);
		
		int count = dao.insert(ab);
		
		if(count==-1) {
			System.out.println("삽입 실패");
		}else {
			System.out.println("삽입 성공");
		}
	}//insert()
	
	public void arrange() {
		String colName;
		String ascOrDesc;
		
		System.out.println("정렬할 항목 선택하세요");
		System.out.print("번호:1     노래제목:2     가수명:3    번호입력>> ");
		int selectNum = sc.nextInt();
		
		switch(selectNum) {
		case 1:
			colName = "num";
			break;
		case 2:
			colName = "song";
			break;
		case 3:
			colName = "singer";
			break;
		default:
			System.out.println("올바른 정렬항목이 아닙니다");
			return;
		}
		
		System.out.println("정렬방법 선택하세요");
		System.out.print("오름차순:1     내림차순:2    번호입력>> ");
		int selectSubNum = sc.nextInt();
		
		switch(selectSubNum) {
		case 1:
			ascOrDesc = "asc";
			break;
		case 2:
			ascOrDesc = "desc";
			break;	
		default:
			System.out.println("올바른 정렬방법이 아닙니다");
			return;
		}
		
		ArrayList<AlbumBean> arr = dao.arrange(colName, ascOrDesc);
		
		System.out.println("검색한 항목은 : " + arr.size() + " 건 입니다.");
		
		System.out.println("번호\t노래제목\t가수\t회사\t가격\t발매일");
		for(AlbumBean ab : arr) {
			System.out.println(ab.getNum() +"\t"+ ab.getSong() +"\t"+ ab.getSinger() +"\t"+ ab.getCompany() +"\t"+ ab.getPrice() +"\t"+ ab.getPub_day());
		}
		
	}//arrange()
	
	
	
	public static void main(String[] args) {
		new AlbumMain();
	}
}
