
public class Ex08_02_String {//String 클래스의 반드시 알아야 하는 메서드!
	public static void main(String[] args) {
		
//		String str1 = "Have a nice day";
//		String str2 = "Have a nice day";
		
		String str1 = new String("Have a nice day");
		String str2 = new String("have a nic2e day");
		String str3 = new String("hahaha");
		
//		String str1 = new String("가나다라마바사아자차카타파하");
//		String str2 = new String("가나다라마바사아자차카타파하");
//		String str3 = new String("하하하하");
		

		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		System.out.println(str1 == str2); //주소가 같나? 가장 위에의 경우 같다. 하지만 객체를 만들어 따로 같은 문장을 넣으면 다르다.
		
		System.out.println(str1.length());
		boolean b = str1.equals(str2); //.equals는 Object class에 있는 문자열을 비교하는 메서드 이다. 
		System.out.println("b:" + b);
		System.out.println("b1:"+str1.equals("Have"));
		
		System.out.println("b2:" + str1.equalsIgnoreCase(str2));// equalsIgnoreCase메서드 : 대소문자 무시하고 비교하라!
		
		int c = str1.compareTo(str2);//compareTo 메서드 : 가장 처음의 다른 문자의 아스키코드 값의 뺄셈값을 retrun함. 
		System.out.println("c:" +c); //같으면 :0 / 다르면: 0이 아닌 숫자
		/*
		char c1 = 'H';
		char c2 = 'h';
		System.out.println(c1-c2);
		*/
			
		int d = str1.compareToIgnoreCase(str2); //대소문자 구분없이 compareTo 메서드 실행
		System.out.println("d:" + d);

		String str4 = str1.concat(str3); //concat() : string 타입을 이어주는 메서드 // str1+str3
		System.out.println("str4:" + str4);
		
		String str5 = str1.toUpperCase();//toUpperCase() : 모든 문장을 대문자로 바꾸는 메서드
		System.out.println("str5:" + str5);

		String str6 = str1.toLowerCase();//toLowerCase() : 모든 문장을 소문자로 바꾸는 메서드
		System.out.println("str6:" + str6);
		
		int indexof = str1.indexOf("nice"); //str1 에서 nice가 시작되는 문자 번째 수.
		System.out.println("indexof(string):" + indexof);
		int indexof1 = str1.indexOf("happy"); //찾는 문자열이 str1에 없으면 -1 return
		System.out.println("indexof1(string):" + indexof1);
		
		char str1_ca = str1.charAt(3); //charAt(3) :str1의 3번째 문자는 무엇인가 // Have a nice day
		System.out.println("str1_ca:"+ str1_ca);
		
		String f = str1.substring(8); //substring(8) :str1의 8번째이후의 문자 출력
		System.out.println("f:" +f);
		String f1 = str1.substring(7, 9); //substring(7,9) : str1의 7번째부터 시작해서 9번째 앞에있는 문자까지 출력
		System.out.println("f1:" +f1);
		
		boolean h = str1.contains("nice"); //contains("nice") : str1에 nice 가 포함되어있으면 true 아니면 false 리턴.
		System.out.println("h:" +h);
		boolean h1 = str1.contains("Nice"); 
		System.out.println("h1:" +h1);
		
		String s = "   ab c  d e  f  ";
		System.out.println("s:" + s);
		System.out.println(s.length());
		String s2 = s.trim();// trim() : 문장 앞부분 뒷부분의 공백 제거, 문장 사이사이 공백은 지우지 않음.
		System.out.println("s2:" + s2);
		System.out.println(s2.length());
		
		
	}
}	
