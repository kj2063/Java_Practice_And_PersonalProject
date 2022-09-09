
public class Ex04_05_정렬 {
	public static void main(String[] args) {
		
		int[] arr = {8, 3, 2, 5, 9};
		
		for(int value : arr ) {
			System.out.print(value + " ");
		}
		System.out.println("\n");
		
		// arr = {2,3,4,8,9} 로 정렬 : 오름차수 정렬
		
		// use 두변수 값 바꾸기
		int x=10,y=20;
		int temp_y;
		
		temp_y = y;
		y=x;
		x=temp_y;
		System.out.println("x=" + x + " y=" + y);
		System.out.println();
		//-------------------------
		// 선택정렬
		
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int value : arr) {
			System.out.print(value + " ");
		}
		
		
	}
}
