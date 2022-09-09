import java.util.Calendar;



public class Ex08_12_Calendar {
	public static void main(String[] args) {
		
		//new Calendar(); //생성자가 private로 되어 있어서 다음과 같이 객체 생성하지 못한다.
		Calendar cal = Calendar.getInstance();//하지만 static class이기 때문에 다음과 같이 객체를 만들 수 있다.
		System.out.println("cal: "+ cal);
		
		System.out.println(cal.get(Calendar.YEAR)+ "년");
//		System.out.println(cal.get(Calendar.SUNDAY)+ "년");
		System.out.println(cal.get(Calendar.MONTH)+1 + "월");
		System.out.println(cal.get(Calendar.DATE) + "일");
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		int ampm = cal.get(Calendar.AM_PM); //Calender.AM_PM : 오전이면 0 오후면 1 return
		if(ampm == 0) {// ampm == Calendar.AM 이라고 해도 된다. Calendar.AM = 0 , Calendar.PM = 1 return
			System.out.print("현재 시간은 AM:");	
		}
		else {
			System.out.print("현재 시간은 PM:");
		}
		System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // Date class와 다르게, 일요일:1 부터 시작
		//일:1, 월:2, 화:3, 수:4, 목:5, 금:6, 토:7
		
		String[] week = {"","일","월","화","수","목","금","토"}; //일요일이면 1번방 월요일이면 2번방 이렇게 출력하기 쉽게 하기 위해 빈값을 제일 앞에 넣어줌.
		
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		
		
		
	}
}
