
public class Ex04_06_권준 {
	public static void main(String[] args) {
		
		/*5사람 국어 영어 수학 점수
		김씨 국어점수,영어점수,수학점수
		박씨 국어점수,영어점수,수학점수
		 ...
		
		번호 국어 영어 수학 총점 평균
		==============================================
		1 	54	90	33 244	81.333336
		...
		5	50	100	90	240	80.0
		==============================================
		총점: 313 348 232
		*/
		
		int[][] sj = {
					  {54,90,33},
					  {99,100,89},
					  {73,65,56},
					  {100,77,43},
					  {89,82,71}
					 };
		
		int i, j, sum_man;
		int[] sum_sub = new int[3];
		
		System.out.println(" 번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==============================================");
		for(i=0; i<sj.length; i++) {
			sum_man = 0;
			System.out.printf(" %d",i+1);
			for(j=0; j<sj[i].length; j++) {
				System.out.printf("\t%d",sj[i][j]);
				sum_man += sj[i][j];
				sum_sub[j] += sj[i][j];
			}
			System.out.printf("\t%d",sum_man);
			System.out.printf("\t%.2f\n",sum_man/(double)sj[i].length);
		}
		System.out.println("==============================================");
		System.out.print(" 총점");
		for(i=0; i<sum_sub.length; i++)
			System.out.printf("\t%d",sum_sub[i]);
		
	}	
}
