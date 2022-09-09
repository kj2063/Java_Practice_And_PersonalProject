package Video;

import java.util.Vector;

public class VideoShop {
	
	Vector<String> v = new Vector<String>();
	
	VideoShop() { //new VideoShop
		v.addElement("어벤져스"); //v.add도 된다
		v.addElement("쥬라기공원");
		v.addElement("헐크");
	}
	
	synchronized String lendVideo() throws InterruptedException { //throws 로 wait 에서 발생될 예외를 lendVideo() 를 던져 호출할 객체에서 처리하게 만듬.
																  //남은 한개를 빌리고,돌려주는것을 한사람만 할 수 있도록 싱크로나이즈드 처리
		Thread th = Thread.currentThread(); //currentThread() : 현재 lendVideo 메서드를 호출한 스레드가 누구냐? 를 리턴
		
		if(v.size() == 0) {
			System.out.println(th.getName()+":번호표 받음");
			wait(); //잠깐 멈춤. Thread.sleep() 과 비슷
		}
		String str = v.remove(v.size()-1); //삭제하고 삭제한것을 retrun 하고 리턴한것을 str에 받음
		return str;
	}
	
	synchronized void returnVideo(String video) {
		v.addElement(video);
		notify(); //wait(); 에 의해 계속 기다리는것을 깨움.
	}
}
