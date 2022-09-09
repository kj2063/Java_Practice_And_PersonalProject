
class Product{
	private String code;
	private String name;

	Product(String code, String name){
		this.code = code;
		this.name = name;
	}
	
	public void display(){//display(this) �� ��� ������ this�� �����Ͽ� ����.
		//��ǰ �ڵ忡 s�� �ֳ�? => �Ｚ�Դϴ�.
		// L�� �ֳ� => LG�Դϴ�.
		//�׹��� ��� => ���̽� �Դϴ�. ���
		if (code.contains("S")) {
			System.out.println("�Ｚ �Դϴ�");
		}
		else if(code.contains("L")){
			System.out.println("LG �Դϴ�");
		}
		else {
			System.out.println("���̽� �Դϴ�");
		}
	}	
	
}


public class Ex09_04_���� {
	public static void main(String[] args) {
		
		Product[] p={
						new Product("S01","TV"),
						new Product("L03","�����"),
						new Product("D04","����̱�")
					};
		
		for(int i=0; i<p.length; i++) {
			p[i].display();// p1.display(p1) ������ ��ȣ���� p1�� �����Ͽ� ����. display�޼��忡�� this�� �޴´�.
		}
		
		
	}
}
