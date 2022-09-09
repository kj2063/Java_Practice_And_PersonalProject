import java.awt.*;
import java.awt.event.*;

class Ex12_09_sub extends Frame {
	Ex12_09_sub(){
		setSize(500,400);
		setVisible(true);
		addWindowListener(new MyWindow()); //�� Ŭ������ MyWindow class�� �޼��尡 ����.
	}//������
	
	class MyWindow extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("X��ư Ŭ����");
			System.exit(0); 
		}//windowClosing
		
		public void windowActivated(WindowEvent e) {
			System.out.println("â�� Ȱ��ȭ ��");
		}//windowActivated
	}//MyWindow (���� class)
}


public class Ex12_09_WindowAdapter {
	public static void main(String[] args) {
		new Ex12_09_sub();
		
		
	}
}
