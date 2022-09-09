
public class Ex04_03_2차원 {
	public static void main(String[] args) {
		
		//주소가 들어가는 공간은 무조건 4byte로 잡힌다.
		int[][] arr1 = {{1,2,3,4},{5,6,7},{8,9,10,11}}; //층마다 갯수가 다르네? => 가변 배열
		int[][] arr2 = new int[][] {{1,2,3,4},{5,6,7},{8,9,10,11}};
		int[][] arr3 = new int[2][2]; //{{1,2},{3,4}}
		arr3[0][0] = 1;
		arr3[0][1] = 2;
		arr3[1][0] = 3;
		arr3[1][1] = 4;
		
		
		System.out.println("arr1.length : " + arr1.length);//행의 갯수
		System.out.println("arr1[0].length : " + arr1[0].length);//0행의 열의 갯수
		
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][1]);
		System.out.println(arr1[0][2]);
		System.out.println(arr1[0][3]);
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[1][i] + " ");
		}
		System.out.println("\n");
		
		//=== array 모든값 출력===//
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
}
