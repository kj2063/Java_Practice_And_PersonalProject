
public class Ex05_10_���ȣ�� {
	public static void main(String[] args) {
		//��� ȣ�� ����Ͽ� 4!(���丮��) �� ���ϱ�
		
		System.out.println("4 factorial : " + fact(4));
	}
	
	static int fact(int f) {
		if (f == 1)
			return 1;
		else
			return f*fact(--f);
	}
	 
	
	
}
