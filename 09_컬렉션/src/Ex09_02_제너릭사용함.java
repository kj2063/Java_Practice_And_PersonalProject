class Top2<T>{//제너릭: 하나의 코드를 여러 타입에 대하여 재사용할 수 있도록 해주는 방법
	private T data; //모든 타입(미 지정)이 들어 올 수 있게 만듬
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data; 
	}
}

public class Ex09_02_제너릭사용함 {
	public static void main(String[] args) {
		

		String str = "Hello";
		
		Top2<String> top = new Top2<String>();//객체를 만들때 미지정 자료형의 자료형을 확정한다.
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
