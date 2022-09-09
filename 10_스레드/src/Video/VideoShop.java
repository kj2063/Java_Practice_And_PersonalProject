package Video;

import java.util.Vector;

public class VideoShop {
	
	Vector<String> v = new Vector<String>();
	
	VideoShop() { //new VideoShop
		v.addElement("�����"); //v.add�� �ȴ�
		v.addElement("�������");
		v.addElement("��ũ");
	}
	
	synchronized String lendVideo() throws InterruptedException { //throws �� wait ���� �߻��� ���ܸ� lendVideo() �� ���� ȣ���� ��ü���� ó���ϰ� ����.
																  //���� �Ѱ��� ������,�����ִ°��� �ѻ���� �� �� �ֵ��� ��ũ�γ������ ó��
		Thread th = Thread.currentThread(); //currentThread() : ���� lendVideo �޼��带 ȣ���� �����尡 ������? �� ����
		
		if(v.size() == 0) {
			System.out.println(th.getName()+":��ȣǥ ����");
			wait(); //��� ����. Thread.sleep() �� ���
		}
		String str = v.remove(v.size()-1); //�����ϰ� �����Ѱ��� retrun �ϰ� �����Ѱ��� str�� ����
		return str;
	}
	
	synchronized void returnVideo(String video) {
		v.addElement(video);
		notify(); //wait(); �� ���� ��� ��ٸ��°��� ����.
	}
}
