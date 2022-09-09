import java.awt.*;
import java.awt.event.*;

class Ex12_07_sub extends Frame implements WindowListener { //Frame = window <<구현된것
	
	Ex12_07_sub(){
		addWindowListener(this);//this.addWindowListener(this);
		
		setTitle("제목");
		setSize(500,400);
		setVisible(true);
		
		
		
	
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {//우측 상단 X버튼 누르면 작동되는 메서드
		System.out.println("X버튼 클릭함");
		System.exit(0); //시스템 강제 종료
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {//창이 활성화 될때(최소화 -> 프로그램열기 포함) 실행되는 메서드
		System.out.println("창이 활성화 됨");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}
}


public class Ex12_07_WindowEvent {
	public static void main(String[] args) {
		new Ex12_07_sub();
	}
}
