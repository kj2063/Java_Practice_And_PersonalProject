
public class Ex07_03 {
	public static void main(String[] args) {
		
		String str = "asb";
		int num;
		try {
			System.out.println(str.length());
			num = 3/0;
			System.out.println("num:" + num);
		
			int[] arr= {10,20,30};
			
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
			
		} 
		catch(NullPointerException e) {
			System.out.println("�������� �ͼ��� �����߻�");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		} 
		catch(ArithmeticException e){
			System.out.println("0���� ������ ������");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		} 
		catch(Exception e) {
			System.out.println("���� ����ִ� Exception catch");
			
		}
		System.out.println("���α׷� ����");
	}
}
