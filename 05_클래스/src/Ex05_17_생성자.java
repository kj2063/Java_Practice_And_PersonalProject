class Member{
	private String id;
	private String pw;
	
	
	// �� �����ڴ� �ۼ����� �ʾƵ� Member(){} �� ���·� �����Ѵ�.> �⺻������
	// ������ �Ű������� �ִ� �����ڸ� ����� �� �����ڴ� �ڵ����� �������� �ʴ´�.
	Member() {// ������ : ��ü�� ����� �ڵ����� ������ ȣ�� , ���� ���� �ʾƵ� void�� ���� �ȵȴ�.
		System.out.println("Member() ������");
		id = "kim";
		pw = "1234";
	}
	
	Member(String id){ //�����ڵ� overloading �����ϴ�.
		System.out.println("Member(String s) ������");
		this.id = id;
		this.pw = "5678";
	}
	
	Member(String id, String pw){
		System.out.println("Member(String a,String b) ������");
		this.id = id;
		this.pw = pw;
	}
	
	
	void abc() {
		System.out.println("abc �޼���");
	}
	
	String getId() {
		return id;
	}
	
	String getPw() {
		return pw;
	}
}

public class Ex05_17_������ {// �����ڴ� �޼����.
	public static void main(String[] args) {
		
		Member a = new Member(); // ����
		Member b = new Member("choi");
		Member c = new Member("park","9876");
		
		a.abc();// ȣ��
		
		System.out.println();
		
		System.out.println(a.getId());
		System.out.println(a.getPw());
		
		System.out.println(b.getId());
		System.out.println(b.getPw());
		
		System.out.println(c.getId());
		System.out.println(c.getPw());

		
	}	
		
}		

//������, Ŭ������ �̸��� ���� �޼���