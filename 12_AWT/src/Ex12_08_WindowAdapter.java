import java.awt.*;
import java.awt.event.*;

class Ex12_08_sub extends Frame implements WindowListener{
	Ex12_08_sub(){
		setSize(400,500);
		setVisible(true);
		
		//this.addWindowListener( ... );
		addWindowListener(
				new WindowAdapter() {// WindowAdapter() �޼��带 �̿��Ͽ� �ʿ��� �޼��常 ���� //WindowAdapter Interface�� �͸�(class)���� [Ex12_09 , Ex07_14 ����]
					public void windowClosing(WindowEvent e) {
						System.out.println("X��ư Ŭ����");
						System.exit(0); 
					}//windowClosing
					
					public void windowActivated(WindowEvent e) {
						System.out.println("â�� Ȱ��ȭ ��");
					}
				}// ��ü ����
				
				);

	
	
	}
}


public class Ex12_08_WindowAdapter {

	public static void main(String[] args) {
		new Ex12_08_sub();
		
		
	}

}
