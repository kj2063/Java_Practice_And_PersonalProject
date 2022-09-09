
public class Ex04_01_1차원 {
	public static void main(String[] args) {
		//하나로 묶을려면 같은 type의 값만 묶을 수 있다
		//int a=10, b=20, c=30, d=40;
		//double x = 1.2;
		//배열의 메모리는 연속적으로 잡힌다. 따라서 한 곳의 위치정보를 알면 나머지 배열도 쉽게 찾을 수 있다.
		
		
		int[] arr = {10,20,30,40};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]+"\n");
		
		System.out.println(arr);//arr의 주소
		System.out.println(arr.length + "\n");//arr의 길이 출력
		
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
