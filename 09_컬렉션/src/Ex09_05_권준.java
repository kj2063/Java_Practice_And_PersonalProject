
public class Ex09_05_권준 {
	public static void main(String[] args) {

		String str = "Victory belongs to the most persevering";

		
		/*
		a:몇개
		b:몇개
		c:몇개
		...
		z:몇개
		
		대소문자 구분없이 몇개인지 구해서 출력
		*/
		
		
		/* 1번째 방법
		
		System.out.println("문장:" + str);
		
		System.out.println();
		
		char[] str_arr = new char[str.length()];
		str.getChars(0, str.length(), str_arr, 0);
		Character[] str_arrc = new Character[str.length()];
		String[] str_arrs = new String[str.length()];
		int[] count = new int[((int)'Z') - ((int)'A') + 1 ];
		
		for(int i=0; i<str_arr.length;i++) {
			str_arrc[i] = str_arr[i];
			str_arrs[i] = str_arrc[i].toString();
			for(int j='A'; j<'Z'; j++) {
				if(str_arrs[i].equalsIgnoreCase(((Character)(char)j).toString())) {
					count[j-(int)'A'] += 1;
				}
			}
			
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println((char)(i+(int)'a') + "의 갯수 : " + count[i]);
		}
		*/
		
		
		
		
		
		/* 2번째 방법

		int[] count = new int[(int)'Z'-(int)'A'+1];
		String str_up = str.toUpperCase();
		
		for(int i=0; i<str_up.length(); i++) {
			for(int j='A'; j<'Z'; j++) {
				if((int)str_up.charAt(i) == j){
					count[j-(int)'A'] += 1;
				}
			}
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println((char)(i+(int)'A') + "의 갯수 : " + count[i]);
		}
		*/
		
	}
}
