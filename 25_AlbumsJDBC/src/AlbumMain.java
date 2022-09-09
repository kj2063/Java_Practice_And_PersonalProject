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
			System.out.println("======�޴� �����ϱ�======");
			System.out.println("1.��� ���� ��ȸ");
			System.out.println("2.���� �˻�");
			System.out.println("3.���� �������� �˻�(����:��������, ����:��������)");
			System.out.println("4.�ٹ� ����");
			System.out.println("5.�ٹ� ����");
			System.out.println("6.�ٹ� �߰�");
			System.out.println("7.����");
			System.out.println("8.���α׷� ����");
			System.out.print("�޴� ���� >> ");
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
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
				break;
			default:
				System.out.println("1~8������ ���ڸ� �Է��� �ּ���");
			}
		}
	}//init()
	
	public void showAll() {
		ArrayList<AlbumBean> arr = dao.showAll();
		
		System.out.println("��ȣ\t�뷡����\t����\tȸ��\t����\t�߸���");
		for(AlbumBean ab : arr) {
			System.out.println(ab.getNum() +"\t"+ ab.getSong() +"\t"+ ab.getSinger() +"\t"+ ab.getCompany() +"\t"+ ab.getPrice() +"\t"+ ab.getPub_day());
		}
	}
	
	public void selectShow() {
		String colName = null;
		String name = null;
		
		System.out.println("����˻�:1     �����˻�:2     ȸ��˻�:3");
		System.out.print("�˻��� �׸��� ���� : ");
		int selectNum = sc.nextInt();
		
		switch(selectNum) {
		case 1:
			System.out.print("�˻��� ���� �Է� : ");
			name = sc.next();
			
			colName = "song";
			break;
		case 2:
			System.out.print("�˻��� ���� �Է� : ");
			name = sc.next();
			
			colName = "singer";
			break;
		case 3:
			System.out.print("�˻��� ȸ�� �Է� : ");
			name = sc.next();
			colName = "company";
			break;
		default:
			System.out.println("1~3������ ���ڸ� �Է��� �ּ���");
			return;
		}
		
		name.toUpperCase();
		
		ArrayList<AlbumBean> arr = dao.selectShow(colName, name);
		
		System.out.println("��ȣ\t�뷡����\t����\tȸ��\t����\t�߸���");
		for(AlbumBean ab : arr) {
			System.out.println(ab.getNum() +"\t"+ ab.getSong() +"\t"+ ab.getSinger() +"\t"+ ab.getCompany() +"\t"+ ab.getPrice() +"\t"+ ab.getPub_day());
		}
		
	}//selectShow()
	
	public void showPriceRank() {
		System.out.print("���۵�� �Է� : ");
		int firstNum = sc.nextInt();
		System.out.print("����� �Է� : ");
		int lastNum = sc.nextInt();
		
		ArrayList<AlbumBean> arr = dao.showPriceRank(firstNum, lastNum);
		
		System.out.println("��ȣ\t�뷡����\t����\tȸ��\t����\t�߸���");
		for(AlbumBean ab : arr) {
			System.out.println(ab.getNum() +"\t"+ ab.getSong() +"\t"+ ab.getSinger() +"\t"+ ab.getCompany() +"\t"+ ab.getPrice() +"\t"+ ab.getPub_day());
		}
	}//showPriceRank
	
	public void update() {
		System.out.print("������ ��ȣ�� ���� => ");
		int num = sc.nextInt();
		System.out.print("���� �� �뷡���� : ");
		String song = sc.next();
		System.out.print("���� �� ���� : ");
		String singer = sc.next();
		System.out.print("���� �� ȸ�� : ");
		String company = sc.next();
		System.out.print("���� �� ���� : ");
		int price = sc.nextInt();
		System.out.print("���� �� �߸��� : ");
		String pub_day = sc.next();
		
		ab = new AlbumBean(num,song,singer,company,price,pub_day);
	
		int count = dao.update(ab);

		if(count==-1) {
			System.out.println("���� ����");
		}else if(count==0) {
			System.out.println("������ Data�� �����ϴ�");
		}else {
			System.out.println("���� ����");
		}
		
	}//update()
	
	public void delete() {
		System.out.print("������ ��ȣ �Է� => ");
		int selectNum = sc.nextInt();
		
		int count = dao.delete(selectNum);
		
		if(count==-1) {
			System.out.println("���� ����");
		}else if(count==0) {
			System.out.println("������ Data�� �����ϴ�");
		}else {
			System.out.println("���� ����");
		}
	}//delete()
	
	public void insert() {
		System.out.println("��ȣ�� �������� �ڵ��Է� �˴ϴ�(����)");
		System.out.print("�뷡���� �Է� :");
		String song = sc.next();
		System.out.print("���� �Է� : ");
		String singer = sc.next();
		System.out.print("ȸ�� �Է� : ");
		String company = sc.next();
		System.out.print("���� �Է� : ");
		int price = sc.nextInt();
		System.out.print("�߸��� �Է� : ");
		String pub_day = sc.next();
		
		ab = new AlbumBean(0,song,singer,company,price,pub_day);
		
		int count = dao.insert(ab);
		
		if(count==-1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}//insert()
	
	public void arrange() {
		String colName;
		String ascOrDesc;
		
		System.out.println("������ �׸� �����ϼ���");
		System.out.print("��ȣ:1     �뷡����:2     ������:3    ��ȣ�Է�>> ");
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
			System.out.println("�ùٸ� �����׸��� �ƴմϴ�");
			return;
		}
		
		System.out.println("���Ĺ�� �����ϼ���");
		System.out.print("��������:1     ��������:2    ��ȣ�Է�>> ");
		int selectSubNum = sc.nextInt();
		
		switch(selectSubNum) {
		case 1:
			ascOrDesc = "asc";
			break;
		case 2:
			ascOrDesc = "desc";
			break;	
		default:
			System.out.println("�ùٸ� ���Ĺ���� �ƴմϴ�");
			return;
		}
		
		ArrayList<AlbumBean> arr = dao.arrange(colName, ascOrDesc);
		
		System.out.println("�˻��� �׸��� : " + arr.size() + " �� �Դϴ�.");
		
		System.out.println("��ȣ\t�뷡����\t����\tȸ��\t����\t�߸���");
		for(AlbumBean ab : arr) {
			System.out.println(ab.getNum() +"\t"+ ab.getSong() +"\t"+ ab.getSinger() +"\t"+ ab.getCompany() +"\t"+ ab.getPrice() +"\t"+ ab.getPub_day());
		}
		
	}//arrange()
	
	
	
	public static void main(String[] args) {
		new AlbumMain();
	}
}
