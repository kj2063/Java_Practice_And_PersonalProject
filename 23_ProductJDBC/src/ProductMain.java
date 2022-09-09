import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


	
	

public class ProductMain {
	
	ProductBean pb = new ProductBean();
	ProductDao dao = new ProductDao();
	
	Scanner sc = new Scanner(System.in);
	
	ProductMain(){
		
		while(true) {
			System.out.println("======�޴� �����ϱ�======");
			System.out.println("1.��� ��ǰ ��ȸ");
			System.out.println("2.Ư�� ��ǰ�� ��ȸ(���̵� �̿�)");
			System.out.println("3.Ư�� ��ǰ�� ��ȸ(ī�װ��� �̿�)");
			System.out.println("4.��ǰ ���� �ϱ�");
			System.out.println("5.��ǰ ����");
			System.out.println("6.��ǰ �߰�");
			System.out.println("7.���α׷� ����");
			System.out.print("��ȣ �Է� >>");
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
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
				break;
			default :
				System.out.println("�ùٸ� ��ȣ�� �ƴմϴ�");
			}//case
		}//while
	}//ProductMain������
	
	
	
	public void deleteProduct() {
		System.out.print("������ ���̵� �Է� : ");
		int id = sc.nextInt();
		
		dao.deleteProduct(id);
	}//deleteProduct
	
	
	public void updateProduct() {
		System.out.print("������ ���̵� �Է� : ");
		int id = sc.nextInt();
		System.out.print("��ǰ�� �Է� : ");
		String name = sc.next();
		System.out.print("��� ���� �Է� : ");
		int stock = sc.nextInt();
		System.out.print("�ܰ� �Է� : ");
		int price = sc.nextInt();
		System.out.print("ī�װ� �Է� : ");
		String category = sc.next();
		System.out.print("�԰� ���� �Է� : yyyy/mm/dd �������� �Է��ϼ���. : ");
		String inputdate = sc.next();
		
		pb = new ProductBean(id,name,stock,price,category,inputdate);
		
		dao.updateProduct(pb);
		
		/*
		������ ���̵� �Է� : 2
		��ǰ�� �Է� : �巳
		��� ���� �Է� : 33
		�ܰ� �Է� : 3333
		ī�װ� �Է� : IT
		�԰� ���� �Է� : yyyy/mm/dd �������� �Է��ϼ���. : 2000/1/1
		 */
	}//updateProduct
	
	
	public void addProduct() {
		System.out.println("���̵�� �������� �Էµ˴ϴ�(����)");
		System.out.print("��ǰ�� �Է� : ");
		String name = sc.next();
		System.out.print("��� ���� �Է� : ");
		int stock = sc.nextInt();
		System.out.print("�ܰ� �Է� : ");
		int price = sc.nextInt();
		System.out.print("ī�װ� �Է� : ");
		String category = sc.next();
		System.out.print("�԰� ���� �Է� :  yyyy/mm/dd �������� �Է��ϼ���. : ");
		String inputdate = sc.next();
		
		pb = new ProductBean(0,name,stock,price,category,inputdate);
		
		dao.addProduct(pb);
		
		/*
		���̵�� �������� �Էµ˴ϴ�(����)
		��ǰ�� �Է� : ��Ÿ�Ϸ�
		��� ���� �Է� : 20
		�ܰ� �Է� : 5000
		ī�װ� �Է� : KJ
		�԰� ���� �Է� :
		 */
	}//addProduct
	
	
	public void showProduct_cat() {
		System.out.print("ã���ô� ī�װ� �Է� :");
		String category1 = sc.next();
		String category = category1.toUpperCase();
		
		ArrayList<ProductBean> arr = dao.showProduct_cat(category);
		
		System.out.println("���̵�\t�̸�\t���\t�ܰ�\tī�װ�\t�԰�����");
		

		for(ProductBean pb : arr) {
			System.out.println(pb.getId() +"\t"+ pb.getName() +"\t"+ pb.getStock() +"\t"+ pb.getPrice() +"\t"+ pb.getCategory() +"\t"+ pb.getInputdate());	
		}
		
	}//showProduct_cat
	
	
	public void showProduct_id() {
		System.out.print("ã���ô� ID �Է� :");
		int num = sc.nextInt();
		
		pb = dao.showProduct_id(num);
		System.out.println("���̵�\t�̸�\t���\t�ܰ�\tī�װ�\t�԰�����");
		try {
			System.out.println(pb.getId() +"\t"+ pb.getName() +"\t"+ pb.getStock() +"\t"+ pb.getPrice() +"\t"+ pb.getCategory() +"\t"+ pb.getInputdate());
		}catch(NullPointerException e) {
			System.out.println("�ش��ϴ� ID�� �����ϴ�");
		}
	}//showProduct_id
	
	
	public void showAllProduct() {
		ArrayList<ProductBean> arr = dao.showAllProduct();
		
		System.out.println("���̵�\t�̸�\t���\t�ܰ�\tī�װ�\t�԰�����");
		for(ProductBean pb : arr) {
			System.out.println(pb.getId() +"\t"+ pb.getName() +"\t"+ pb.getStock() +"\t"+ pb.getPrice() +"\t"+ pb.getCategory() +"\t"+ pb.getInputdate());
		}
	}//showAllProduct
	
	
	
	
	
	
	public static void main(String[] args) {
		new ProductMain();
	}//main
}
