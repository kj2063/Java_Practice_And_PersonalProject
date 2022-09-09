package ReTest;

import java.util.Vector;

public class VideoShop {
	
	Vector<String> v = new Vector<String>();
	
	VideoShop() { //new VideoShop
		v.addElement("어벤져스"); //v.add도 된다
		v.addElement("쥬라기공원");
		v.addElement("헐크");
	}
	
	
	synchronized public String lendVideo() throws InterruptedException{
		
		if(v.size() == 0) {	
			Thread th =  Thread.currentThread();
			wait();
			System.out.println(th.getName() + ":번호표 받음" );
		}
		
		String movie = v.remove(v.size()-1);
		return movie; 
	}
	
	synchronized void returnVideo(String movie){
		v.add(movie);
		notify();
	}
	
}
