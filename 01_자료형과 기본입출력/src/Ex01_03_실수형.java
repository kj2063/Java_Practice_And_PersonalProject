
public class Ex01_03_실수형 {
	public static void main(String[] args) {
		System.out.println("===실수형 자료형===");
		
//		float : 4byte
//		double : 8byte
				
		//float ft1 = 1.234;//1.234는 자동으로 8byte(double) 로 잡혀서 error 발생
		float ft1 = 1.234f;
		System.out.println("ft1:" + ft1);
		
		float ft2 = 0.0987000f;
		System.out.println("ft2:" + ft2); // 값의 뒷쪽의 의미없는 000은 나오지 않는다

		float ft3 = 1.1234567890123456f;
		System.out.println("ft3:" + ft3); // 소숫점 7째 자리까지 나온다. 8번째 자리는 반올림된다.
		
		
		double d1 = 1.234;
		System.out.println("d1:" + d1);
		
		double d2 = 1.1234567890123456789f;
		System.out.println("d2:" + d2); // 소숫점 16째 자리까지 나온다. 17번째 자리는 반올림된다.
		
		d2 = ft1;
		//ft1 = d2; //작은공간(float)에 큰것을(double) 넣을 수 없다. type mismatch
		ft1 = (float)d2;
		System.out.println("ft1:" + ft1);
		
		double d3 = .987e-2; // 0.987 * 10^-2
		System.out.println("d3:" + d3);
//----------------------------
		
		int i = 10;
		float f = 1.2f;
		
		f = i;
		System.out.println("f:" + f);

		//i = f; //같은 byte를 차지하는 type의 변수라도 실수가 정수형 변수보다 더 크다. 따라서 정수형변수값을 실수형 변수값에다 넣지 못한다.
		//type mismatch
		i = (int)f;//강제형변환 하면 넣을 수 있다.
		System.out.println("i:" + i);

	}	
}
