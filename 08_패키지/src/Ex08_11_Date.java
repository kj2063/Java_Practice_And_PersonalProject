import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_11_Date {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);//���������� �״�� ���� toString�� ���� �ʾƵ� �پ��ִ°����� �����ش�.
		System.out.println(now.toString()); // Date�� toString�� �ּҸ� �������� �ʰ� overriding �Ͽ� ��¥�� �ð��� �����Ѵ�.
		
		
		System.out.println(now.getYear() + 1900 + "��");//.getYear() : 1900�⵵ �������� ����� �������� �˷���
		
		System.out.println(now.getMonth() + 1 +"��");//.getMonth() : �����ϴ� ������ ���� ������� �˷���. 0������ ����. 
												     // ex. 1�� = 0 return, 2�� = 1 return... 12�� = 11 return
		System.out.println(now.getDate() + "��");//.getDate() : �� �� ������.
		
		System.out.println(now.getDay()); //.getDay() : ������ ���� // �Ͽ���->0 ������->1 ȭ����->2 ...
		
		
		System.out.println(now.getHours() +"�� "+now.getMinutes() +"�� " + now.getSeconds() + "��");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd E����");//��¥�� ������ ���� �� �ִ� Ŭ���� ��ü ����.
		String sdfr = sdf.format(now); //now�� ��¥�� SimpleDateFormat��ü�� �������� ����
		System.out.println(sdfr);
		
		sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a"); //DD�� ����ϸ� �ϳ��� ���ݱ��� �����³� �� �� ��µȴ�.
		System.out.println(sdf.format(now));
		
		
		
	}
}

