import static java.lang.Math.*; // Math class�� static �޼���� Math�� ���� �ʾƵ� ��� �� �� �ְ� �ϰڴ�.

public class Ex08_09_Math {
	public static void main(String[] args) {
		
		
		System.out.println(Math.max(10, 20)); //ū �� ���
		
		int random = (int)(Math.random()*36) + 10;
		// 10~45 ���� ���� �߻�
		
		System.out.println("random : "+ random);
		
		long l = round(4.3); //Math.round() : �ݿø� �޼��� 
		System.out.println("l:" +l);

		double c = ceil(4.32); //Math.ceil() : �ø� �޼���
		System.out.println("c:" + c);

		double f = floor(4.82); //Math.floor() : ���� �޼���
		System.out.println("f:" + f);
		
		double p = pow(2,4); //Math.pow(2,4) : power �� retrun, 2�� 4�°� 
		System.out.println("p:" + p);
		
	}
}
