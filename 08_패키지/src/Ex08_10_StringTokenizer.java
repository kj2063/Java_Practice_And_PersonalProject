import java.util.StringTokenizer;

public class Ex08_10_StringTokenizer {
	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("2021/12|02,16:14", ",/");// class StringTokenizer : 앞에 있는 문자열을 뒤에있는 문자들로 잘라라!
																			// 구분자를 안쓰면 기본으로 공백(스페이스) 가 들어간다.
																			// 구분자를 ", /"라고 쓰면 [, / (공백)] 이 3가지로 자른다.
		
		int count = str.countTokens();//StringTokenizer.countTokens() : 잘라진 문자열의 갯수를 출력
		System.out.println("count:" + count);
			
		//.hasMoreTokens() 와 .nextToken() 은 쌍으로 쓰인다.
		while(str.hasMoreTokens()) {//str.hasMoreTokens() : str이 관리하는 토큰이 있는가? =>하나라도 있으면 true
			String s = str.nextToken();//str에서 처음 만난 토큰을 가져와라. 가져온 토큰은 사라짐.
			System.out.println(s);
		}

		System.out.println("===================================");
		
		String str2 = "2021/12/02,16:14";
		String[] sp = str2.split("/");
		for(int i=0; i<sp.length; i++) {
			System.out.println(sp[i]);
		}
		
		
		
		
		//구분자를 하나로 나눌땐 String.split 을 써도 되고 StringTokenizer을 써도 되지만
		//구분자가 여러개 일때는 StringTokenizer을 써야한다.
	}
}
