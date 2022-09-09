import java.util.StringTokenizer;

public class Ex08_10_StringTokenizer {
	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("2021/12|02,16:14", ",/");// class StringTokenizer : �տ� �ִ� ���ڿ��� �ڿ��ִ� ���ڵ�� �߶��!
																			// �����ڸ� �Ⱦ��� �⺻���� ����(�����̽�) �� ����.
																			// �����ڸ� ", /"��� ���� [, / (����)] �� 3������ �ڸ���.
		
		int count = str.countTokens();//StringTokenizer.countTokens() : �߶��� ���ڿ��� ������ ���
		System.out.println("count:" + count);
			
		//.hasMoreTokens() �� .nextToken() �� ������ ���δ�.
		while(str.hasMoreTokens()) {//str.hasMoreTokens() : str�� �����ϴ� ��ū�� �ִ°�? =>�ϳ��� ������ true
			String s = str.nextToken();//str���� ó�� ���� ��ū�� �����Ͷ�. ������ ��ū�� �����.
			System.out.println(s);
		}

		System.out.println("===================================");
		
		String str2 = "2021/12/02,16:14";
		String[] sp = str2.split("/");
		for(int i=0; i<sp.length; i++) {
			System.out.println(sp[i]);
		}
		
		
		
		
		//�����ڸ� �ϳ��� ������ String.split �� �ᵵ �ǰ� StringTokenizer�� �ᵵ ������
		//�����ڰ� ������ �϶��� StringTokenizer�� ����Ѵ�.
	}
}
