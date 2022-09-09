
public class Ex01_02_정수형_문자형_논리형 {
	public static void main(String[] args) {
		System.out.println("===정수형 자료형===");
		System.out.println(10+20);
		/*
		  자료형 :
		  	 byte : 1byte 정수 -128~128
		  	 short : 2byte 정수 -32,768~32,768
		  	 int : 4byte 정수 -21억~21억
			 long : 8byte 정수 -900경~900경 		 
		*/
		// int 보다 작은 byte나 short의 연산
		
		
		int a,b; //용도 지정 => '선언'
		a = 1000; // a cannot be resolved to a variable(상자==변수)
		b = 2000; //값을 상자에 집어 넣는것 => '초기화'
		a = 7;
		
		int c = 500; //선언 + 초기화
		
		System.out.println("a+b");
		System.out.println(a+b);
		System.out.println("a+b=" + (a+b));

//-------------------------------		
		byte b1 = 10;
		byte b2 = 20;
		//System.out.println();  => 'syso' + ctrl + space
		System.out.println("b1+b2=" + (b1+b2));
		
		int b3 = b1 + b2;// int 보다 작은 type의 연산은 int type(long포함)이 된다.
		
//-------------------------------		
		byte b10 = 1;
		short s10 = 2;
		int i10;
		long l10;
		
		//b10 = s10; // 큰 type 안에 작은type 값을 넣을 수 있지만 반대는 안된다.(type mismatch)
		b10 = (byte)s10; // 하지만 큰타입을 작은 타입으로 강제 변환하여 넣을 수 있다.(강제형변환)
		System.out.println("b10:" + b10);
		
		int x = 1000000;
		int y = 2000000;
		
		int z = x*y;
		System.out.println("int_z:" + z); // -1454759936
		
		long z2 = x*y;
		System.out.println("long_z:" + z2); //2조는 long 안에 들어가지만 int형에 넣은것과 같은 결과가 나온다.
										   //x(4byte)와 y(4byte)의 계산 결과값이 4byte(int형)로 주어지는데 long(8byte)에 넣어봤자 4byte 결과 값이므로 그렇다. 
		long z3 = (long)x*y;
		System.out.println("z:" + z3); //x값이나 y값을 long형으로 강제형변환 후 계산하면 long type의 값으로 제대로 나온다.
		
//--------------------------------
		System.out.println("===문자형 자료형===");
		
		char ch1 = 'A';
		char ch2 = 'B';
		/*
		 아스키 코드값
		 A : 65
		 B : 66
		 
		 a : 97
		 b : 98
		 ! : ~
		 @ : ~
		 (공백) : ~
		 
		 0 : 48  **중요
		 1 : 49
		 */
		
		
		System.out.println("ch1:" +ch1);
		System.out.println("ch2:" +ch2);
		
		int ch3 = ch1 + ch2; // 'A'(2byte) + 'B'(2byte) => int형 (4byte 보다 작은 것들을 계산하면 int형이 된다)
		System.out.println("ch3:" + ch3);//ch3:131 
		
		System.out.println(ch1 + 1); // 'A'(2byte) + 1(4byte 로 저절로 잡힘)
		System.out.println( (char)(ch1 + 1) );// (char)66
		System.out.println( (char)ch1 + 1 );// (char)'A'(어차피 문자인데 char로 바꿔도 의미 없음) + 1
		
		//char ch4 = "apple"; // char은 '' 안의 한글자만 가질 수 있다.
		String ch4 = "apple";

//-------------------------------
		System.out.println("===논리형 자료형===");
		boolean bool1 = true;// boolean 형 type 의 변수에는 true 아니면 false 만 담길 수 있다.
		boolean bool2 = false;
		
		bool1 = 5 > 10; // ==false
		System.out.println("bool1 : "+ bool1);
		
		
	}
}
