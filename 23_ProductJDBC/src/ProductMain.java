import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


	
	

public class ProductMain {
	
	ProductBean pb = new ProductBean();
	ProductDao dao = new ProductDao();
	
	Scanner sc = new Scanner(System.in);
	
	ProductMain(){
		
		while(true) {
			System.out.println("======메뉴 선택하기======");
			System.out.println("1.모든 상품 조회");
			System.out.println("2.특정 상품만 조회(아이디를 이용)");
			System.out.println("3.특정 상품만 조회(카테고리를 이용)");
			System.out.println("4.상품 수정 하기");
			System.out.println("5.상품 삭제");
			System.out.println("6.상품 추가");
			System.out.println("7.프로그램 종료");
			System.out.print("번호 입력 >>");
			String selectNum = sc.next();
			
			switch(selectNum) {
			case "1":
				showAllProduct();
				break;
			case "2":
				showProduct_id();
				break;
			case "3":
				showProduct_cat();
				break;
			case "4":
				updateProduct();
				break;
			case "5":
				deleteProduct();
				break;
			case "6":
				addProduct();
				break;
			case "7":
				sc.close();
				try {
					dao.conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;
			default :
				System.out.println("올바른 번호가 아닙니다");
			}//case
		}//while
	}//ProductMain생성자
	
	
	
	public void deleteProduct() {
		System.out.print("삭제할 아이디 입력 : ");
		int id = sc.nextInt();
		
		dao.deleteProduct(id);
	}//deleteProduct
	
	
	public void updateProduct() {
		System.out.print("수정할 아이디 입력 : ");
		int id = sc.nextInt();
		System.out.print("상품명 입력 : ");
		String name = sc.next();
		System.out.print("재고 수량 입력 : ");
		int stock = sc.nextInt();
		System.out.print("단가 입력 : ");
		int price = sc.nextInt();
		System.out.print("카테고리 입력 : ");
		String category = sc.next();
		System.out.print("입고 일자 입력 : yyyy/mm/dd 형식으로 입력하세요. : ");
		String inputdate = sc.next();
		
		pb = new ProductBean(id,name,stock,price,category,inputdate);
		
		dao.updateProduct(pb);
		
		/*
		수정할 아이디 입력 : 2
		상품명 입력 : 드럼
		재고 수량 입력 : 33
		단가 입력 : 3333
		카테고리 입력 : IT
		입고 일자 입력 : yyyy/mm/dd 형식으로 입력하세요. : 2000/1/1
		 */
	}//updateProduct
	
	
	public void addProduct() {
		System.out.println("아이디는 시퀀스로 입력됩니다(생략)");
		System.out.print("상품명 입력 : ");
		String name = sc.next();
		System.out.print("재고 수량 입력 : ");
		int stock = sc.nextInt();
		System.out.print("단가 입력 : ");
		int price = sc.nextInt();
		System.out.print("카테고리 입력 : ");
		String category = sc.next();
		System.out.print("입고 일자 입력 :  yyyy/mm/dd 형식으로 입력하세요. : ");
		String inputdate = sc.next();
		
		pb = new ProductBean(0,name,stock,price,category,inputdate);
		
		dao.addProduct(pb);
		
		/*
		아이디는 시퀀스로 입력됩니다(생략)
		상품명 입력 : 스타일러
		재고 수량 입력 : 20
		단가 입력 : 5000
		카테고리 입력 : KJ
		입고 일자 입력 :
		 */
	}//addProduct
	
	
	public void showProduct_cat() {
		System.out.print("찾으시는 카테고리 입력 :");
		String category1 = sc.next();
		String category = category1.toUpperCase();
		
		ArrayList<ProductBean> arr = dao.showProduct_cat(category);
		
		System.out.println("아이디\t이름\t재고\t단가\t카테고리\t입고일자");
		

		for(ProductBean pb : arr) {
			System.out.println(pb.getId() +"\t"+ pb.getName() +"\t"+ pb.getStock() +"\t"+ pb.getPrice() +"\t"+ pb.getCategory() +"\t"+ pb.getInputdate());	
		}
		
	}//showProduct_cat
	
	
	public void showProduct_id() {
		System.out.print("찾으시는 ID 입력 :");
		int num = sc.nextInt();
		
		pb = dao.showProduct_id(num);
		System.out.println("아이디\t이름\t재고\t단가\t카테고리\t입고일자");
		try {
			System.out.println(pb.getId() +"\t"+ pb.getName() +"\t"+ pb.getStock() +"\t"+ pb.getPrice() +"\t"+ pb.getCategory() +"\t"+ pb.getInputdate());
		}catch(NullPointerException e) {
			System.out.println("해당하는 ID가 없습니다");
		}
	}//showProduct_id
	
	
	public void showAllProduct() {
		ArrayList<ProductBean> arr = dao.showAllProduct();
		
		System.out.println("아이디\t이름\t재고\t단가\t카테고리\t입고일자");
		for(ProductBean pb : arr) {
			System.out.println(pb.getId() +"\t"+ pb.getName() +"\t"+ pb.getStock() +"\t"+ pb.getPrice() +"\t"+ pb.getCategory() +"\t"+ pb.getInputdate());
		}
	}//showAllProduct
	
	
	
	
	
	
	public static void main(String[] args) {
		new ProductMain();
	}//main
}
