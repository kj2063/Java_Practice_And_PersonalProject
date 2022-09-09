import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_11_Date {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);//참조변수를 그대로 쓰면 toString을 쓰지 않아도 붙어있는것으로 보여준다.
		System.out.println(now.toString()); // Date의 toString은 주소를 리턴하지 않고 overriding 하여 날짜와 시간을 리턴한다.
		
		
		System.out.println(now.getYear() + 1900 + "년");//.getYear() : 1900년도 기준으로 몇년이 지났는지 알려줌
		
		System.out.println(now.getMonth() + 1 +"월");//.getMonth() : 실행하는 순간의 날이 몇월인지 알려줌. 0월부터 시작. 
												     // ex. 1월 = 0 return, 2월 = 1 return... 12월 = 11 return
		System.out.println(now.getDate() + "일");//.getDate() : 일 을 리턴함.
		
		System.out.println(now.getDay()); //.getDay() : 요일을 리턴 // 일요일->0 월요일->1 화요일->2 ...
		
		
		System.out.println(now.getHours() +"시 "+now.getMinutes() +"분 " + now.getSeconds() + "초");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd E요일");//날짜의 형식을 만들 수 있는 클래스 객체 생성.
		String sdfr = sdf.format(now); //now의 날짜를 SimpleDateFormat객체의 포멧으로 리턴
		System.out.println(sdfr);
		
		sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a"); //DD를 사용하면 일년중 지금까지 지나온날 수 로 출력된다.
		System.out.println(sdf.format(now));
		
		
		
	}
}

