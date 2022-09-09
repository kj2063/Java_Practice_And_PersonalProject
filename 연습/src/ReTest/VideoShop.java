package ReTest;

import java.util.Vector;

public class VideoShop {
	
	Vector<String> v = new Vector<String>();
	
	VideoShop() { //new VideoShop
		v.addElement("�����"); //v.add�� �ȴ�
		v.addElement("�������");
		v.addElement("��ũ");
	}
	
	
	synchronized public String lendVideo() throws InterruptedException{
		
		if(v.size() == 0) {	
			Thread th =  Thread.currentThread();
			wait();
			System.out.println(th.getName() + ":��ȣǥ ����" );
		}
		
		String movie = v.remove(v.size()-1);
		return movie; 
	}
	
	synchronized void returnVideo(String movie){
		v.add(movie);
		notify();
	}
	
}
