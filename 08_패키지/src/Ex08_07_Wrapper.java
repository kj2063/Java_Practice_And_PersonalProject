
public class Ex08_07_Wrapper {
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		int sum = 0;
		
		for(int a : n) {
			sum+=a;
		}
		System.out.println(sum);
		
		//=========================
		
		String[] str = {"Have","a","nice","day"};
		
		String sum_str = "";
		for(String a: str) {
			sum_str += a;
		}
		
		System.out.println(sum_str);
		
		//===========================
		
		String[] num = {"1","2","3.7","4","5"};
		int sum2 =0;

		for(int i=0; i<num.length; i++) {
			try {
				sum2 += Integer.parseInt(num[i]); //new NumberFormatException
				//sum2 += Integer.valueOf(a);
			}
			catch(NumberFormatException e) {
				System.out.println(" ==="+i +"번째 방 실수는 덧셈 불가 합니다.===");
				System.out.println("===실수를 정수로 변환 하여 계산 합니다.===");
				double d = Double.parseDouble(num[i]);
				sum2 += (int)d;
			}
		}

		System.out.println(sum2);
	
		//=============================
		
		
		
		
	}
}
