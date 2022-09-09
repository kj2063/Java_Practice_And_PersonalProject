
public class Ex02_03_증감 {
	public static void main(String[] args) {
		
		int a=5, b=5, aa, bb;
		
		System.out.println("a="+ a);
		
		//a = a+1
		//a += 1;
		//a++; // 1증가 연산자
		//a--; --a; // 1감소 연산자
		++a;
		System.out.println("a="+ a);
		
		aa = ++a;//단독으로 쓸때는 a++ 와 ++a는 같지만 앞에 다른 연산자가 나오면 다른 의미를 갖는다.
			     //++가 앞에 붙으면, 먼저~ 라는 의미, a를 +1을 증가 하고나서 다른 연산을 해라 라는 의미 
		System.out.println("a=" + a + "  aa=" + aa);
		
		bb = b++;//++가 뒤에 붙으면, 나중에~ 라는 의미, b를 넣고 나서(다른 연산을 하고 나서) 1증가됨
		System.out.println("b=" + b + "  bb=" + bb);

		int i = 10;
		System.out.println(i); //10
		System.out.println(i++); //10
		System.out.println(i++); //11
		System.out.println(++i); //13
		System.out.println(i++); //13
		System.out.println(i + "\n"); //14
		
		System.out.println(i); //14
		System.out.println(i--); //14
		System.out.println(i--); //13
		System.out.println(--i); //11
		System.out.println(i--); //11
		System.out.println(i); //10
	}
}
