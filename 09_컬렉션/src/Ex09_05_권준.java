
public class Ex09_05_���� {
	public static void main(String[] args) {

		String str = "Victory belongs to the most persevering";

		
		/*
		a:�
		b:�
		c:�
		...
		z:�
		
		��ҹ��� ���о��� ����� ���ؼ� ���
		*/
		
		
		/* 1��° ���
		
		System.out.println("����:" + str);
		
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
			System.out.println((char)(i+(int)'a') + "�� ���� : " + count[i]);
		}
		*/
		
		
		
		
		
		/* 2��° ���

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
			System.out.println((char)(i+(int)'A') + "�� ���� : " + count[i]);
		}
		*/
		
	}
}
