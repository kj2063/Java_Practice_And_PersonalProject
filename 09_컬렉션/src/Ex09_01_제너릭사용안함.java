class Top{
	private String data; //멤버변수> 인스턴스변수, 참조변수 //인스턴스 변수에는 아무것도 넣지 않으면 null값이 들어간다.

	public Object getData() {
		return data;
	}

	public void setData(Object data) { //업캐스팅 된 String이 들어간후 다운캐스팅 하여 this.data에 입력
		this.data = (String)data;//Object를 받으면 모든 자식들을 받을 수 있기때문에 편하지만
		//다음과 같이 모든것들을 String으로 다운캐스팅 해줘야 한다.
	}
	
	
								
	
}


public class Ex09_01_제너릭사용안함 {
	public static void main(String[] args) {
		
		String str = "Hello";
		
		Top top = new Top();
		top.setData(str);
		String s = (String)top.getData();//다운캐스팅
		System.out.println(s);
		
		
		
	}
}
