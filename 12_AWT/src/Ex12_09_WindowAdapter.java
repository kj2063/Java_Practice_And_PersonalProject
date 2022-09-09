import java.awt.*;
import java.awt.event.*;

class Ex12_09_sub extends Frame {
	Ex12_09_sub(){
		setSize(500,400);
		setVisible(true);
		addWindowListener(new MyWindow()); //이 클래스의 MyWindow class에 메서드가 있음.
	}//생성자
	
	class MyWindow extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("X버튼 클릭함");
			System.exit(0); 
		}//windowClosing
		
		public void windowActivated(WindowEvent e) {
			System.out.println("창이 활성화 됨");
		}//windowActivated
	}//MyWindow (내부 class)
}


public class Ex12_09_WindowAdapter {
	public static void main(String[] args) {
		new Ex12_09_sub();
		
		
	}
}
