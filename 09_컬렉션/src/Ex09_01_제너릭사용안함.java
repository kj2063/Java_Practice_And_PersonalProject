class Top{
	private String data; //�������> �ν��Ͻ�����, �������� //�ν��Ͻ� �������� �ƹ��͵� ���� ������ null���� ����.

	public Object getData() {
		return data;
	}

	public void setData(Object data) { //��ĳ���� �� String�� ���� �ٿ�ĳ���� �Ͽ� this.data�� �Է�
		this.data = (String)data;//Object�� ������ ��� �ڽĵ��� ���� �� �ֱ⶧���� ��������
		//������ ���� ���͵��� String���� �ٿ�ĳ���� ����� �Ѵ�.
	}
	
	
								
	
}


public class Ex09_01_���ʸ������� {
	public static void main(String[] args) {
		
		String str = "Hello";
		
		Top top = new Top();
		top.setData(str);
		String s = (String)top.getData();//�ٿ�ĳ����
		System.out.println(s);
		
		
		
	}
}
