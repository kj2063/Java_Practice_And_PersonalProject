package 연습;

public class p166_참조타입배열and배열복사and_For_in문 {
	public static void main(String[] args) {
		//참조 타입 배열은 각 항목의 객체의 번지를 가지고 있다.
		//예를 들어 String은 클래스 타입이므로 String[] 배열은 각 항목에 문자열이 아니라 ,String 객체의 주소를 가지고 있다.
		//즉, String 객체를 참조하게 된다.
 		
		
		String[] strarr = new String[3];
		
		strarr[0] = "java";
		strarr[1] = "java";
		strarr[2] = new String("java"); //새로운 "java" String 객체 생성

		System.out.println(strarr[0] == strarr[1]); // true  같은 객체 참조
		System.out.println(strarr[0] == strarr[2]); // false  서로 다른 객체 참조
		System.out.println(strarr[0].equals(strarr[2])); //true  문자열은 같다 
		
		
		//=================================================
		System.out.println("===================");
		
		//배열은 한번 생성하면 크기를 변경할 수 없기 때문에 더 많은 저장공간이 필요하다면
		//보다 큰 배열을 새로 만들고 이전 배열로부터 항목값들을 복사 해야 한다.
		
		
		int[] oldarr = { 1, 2, 3};
		int[] newarr = new int[5];
		
		/*
		for(int i=0; i<oldarr.length; i++)
			newarr[i] = oldarr[i]; // 이렇게 for 문을 사용하여 복사 하거나.
		*/
		System.arraycopy(oldarr, 0, newarr, 0, 3); 
		// (복사할arr(원본) , 복사시작할index(원본) , 복사받을arr , 복사시작위치 , 복사할부분의arr크기(원본))
		
		for(int i=0; i<newarr.length; i++)
			System.out.print(newarr[i] + " ");
		
		//====================================================
		System.out.println("\n===================");
		
		//제일 윗쪽의 string 배열인 strarr을 사용 
		for(String a: strarr) { //python 의 for~in 문 과 같음.
			System.out.println(a);
		}
		
	}
}
