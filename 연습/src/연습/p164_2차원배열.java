package 연습;

public class p164_2차원배열 {
	public static void main(String[] args) {
	
		int i , j;
		int[][] mathScores = new int[2][3];
		
		for(i=0; i<mathScores.length; i++) //mathScores.length = 행의 갯수
			for(j=0; j<mathScores[i].length; j++) { //mathScores[i].length = i행의 열의 갯수 
				System.out.printf("mathScores[%d][%d] = ",i,j);
				System.out.println(mathScores[i][j]);
			}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2]; //1행에 2열을 만듬
		englishScores[1] = new int[3]; //2행에 3열을 만듬
		
		for(i=0; i<englishScores.length; i++)
			for(j=0; j<englishScores[i].length; j++) {
				System.out.printf("englishScores[%d][%d] = ",i,j);
				System.out.println(englishScores[i][j]);
			}

		System.out.println();
		
		int[][] javaScores = { {95 ,80} , {92 ,96 ,80} };// 이렇게 초기화와 함께 한번에 array를 만들 수 도 있다.
		for(i=0; i<javaScores.length; i++)
			for(j=0; j<javaScores[i].length; j ++) {
				System.out.printf("javaScore[%d][%d] = ",i,j);
				System.out.println(javaScores[i][j]);
			}
		
	}
}
