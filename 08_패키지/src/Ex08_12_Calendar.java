import java.util.Calendar;



public class Ex08_12_Calendar {
	public static void main(String[] args) {
		
		//new Calendar(); //�����ڰ� private�� �Ǿ� �־ ������ ���� ��ü �������� ���Ѵ�.
		Calendar cal = Calendar.getInstance();//������ static class�̱� ������ ������ ���� ��ü�� ���� �� �ִ�.
		System.out.println("cal: "+ cal);
		
		System.out.println(cal.get(Calendar.YEAR)+ "��");
//		System.out.println(cal.get(Calendar.SUNDAY)+ "��");
		System.out.println(cal.get(Calendar.MONTH)+1 + "��");
		System.out.println(cal.get(Calendar.DATE) + "��");
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		int ampm = cal.get(Calendar.AM_PM); //Calender.AM_PM : �����̸� 0 ���ĸ� 1 return
		if(ampm == 0) {// ampm == Calendar.AM �̶�� �ص� �ȴ�. Calendar.AM = 0 , Calendar.PM = 1 return
			System.out.print("���� �ð��� AM:");	
		}
		else {
			System.out.print("���� �ð��� PM:");
		}
		System.out.println(hour + "�� " + minute + "�� " + second + "�� ");
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "����"); // Date class�� �ٸ���, �Ͽ���:1 ���� ����
		//��:1, ��:2, ȭ:3, ��:4, ��:5, ��:6, ��:7
		
		String[] week = {"","��","��","ȭ","��","��","��","��"}; //�Ͽ����̸� 1���� �������̸� 2���� �̷��� ����ϱ� ���� �ϱ� ���� ���� ���� �տ� �־���.
		
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)] + "����");
		
		
		
		
	}
}
