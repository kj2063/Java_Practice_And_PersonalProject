import java.awt.*;
import java.awt.event.*;

class Ex12_07_sub extends Frame implements WindowListener { //Frame = window <<�����Ȱ�
	
	Ex12_07_sub(){
		addWindowListener(this);//this.addWindowListener(this);
		
		setTitle("����");
		setSize(500,400);
		setVisible(true);
		
		
		
	
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {//���� ��� X��ư ������ �۵��Ǵ� �޼���
		System.out.println("X��ư Ŭ����");
		System.exit(0); //�ý��� ���� ����
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
	public void windowActivated(WindowEvent e) {//â�� Ȱ��ȭ �ɶ�(�ּ�ȭ -> ���α׷����� ����) ����Ǵ� �޼���
		System.out.println("â�� Ȱ��ȭ ��");
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
