class Top2<T>{//���ʸ�: �ϳ��� �ڵ带 ���� Ÿ�Կ� ���Ͽ� ������ �� �ֵ��� ���ִ� ���
	private T data; //��� Ÿ��(�� ����)�� ��� �� �� �ְ� ����
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data; 
	}
}

public class Ex09_02_���ʸ������ {
	public static void main(String[] args) {
		

		String str = "Hello";
		
		Top2<String> top = new Top2<String>();//��ü�� ���鶧 ������ �ڷ����� �ڷ����� Ȯ���Ѵ�.
		top.setData(str);
		String s = top.getData();
		System.out.println(s);
		System.out.println("-----------");
		
		Top2<Integer> t2 = new Top2<Integer>();
		t2.setData(123);
		Integer it = t2.getData();
		System.out.println(it);
		
	}
}
