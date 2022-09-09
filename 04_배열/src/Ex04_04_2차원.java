
public class Ex04_04_2차원 {
	public static void main(String[] args) {
		
		//int[][] array = {{1,2,3,4},{5,6,7,8}};
		int[][] array = new int[][] {{1,2,3,4},{5,6,7,8}};
		
		int i,j;
		for(i=0; i<array.length; i++) {
			for(j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int[] temp : array) { //확장 for문을 사용하여 모든 array값 출력하기
			// int[] temp = {1,2,3,4}
			// int[] temp = {5,6,7,8}
			for(int x : temp) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
	}
}
