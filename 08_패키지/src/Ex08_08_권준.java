
public class Ex08_08_���� {
	public static void main(String[] args) {
		
		String[] str = {"�ξ�:70", "ũ����Ż:90", "������:76"};
		
		//����� ������ �հ� ���
		System.out.println("1������. [������� ���� �հ� ����ϱ�]");
		int sum = 0;
		
		for(String a : str) {
			int n =  a.indexOf(":");
			sum += Integer.parseInt(a.substring(n+1));
			//sum += Integer.valueOf(a.substring(n+1));
		}
		System.out.println("1�� �� => ������� ���� �� : " + sum);
		
		System.out.println();
		//2.split ���
		System.out.println("2������. ['split'����Ͽ� 1�������� �� ���ϱ�]");
		sum = 0;
		String[] sp;
		
		for(String a : str) {
			sp = a.split(":");
			sum += Integer.parseInt(sp[1]);
			//sum += Integer.valueOf(sp[1]);
		}
		System.out.println("2�� �� => ������� ���� �� : " + sum);
		
	}//main
}
