package ����;

import java.awt.*;
import java.awt.event.*;

class TrainWA extends Frame implements WindowListener{
	
	TrainWA(){
		setSize(400,300);
		setVisible(true);
		
		addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e) {
						System.out.println("����");
						System.exit(0);
					}
					
					public void windowActivated(WindowEvent e) {
						System.out.println("�۵���");
					}
					
					
				}
				
				);
		
	}

	
}


public class Training_12_09_WindowAdapter {
	public static void main(String[] args) {
		
		new TrainWA();
	}
}
