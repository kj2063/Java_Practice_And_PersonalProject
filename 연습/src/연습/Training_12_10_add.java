package 연습;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class Calculator extends JFrame{
	
	static JButton b1,b2;
	static JTextField text1, text2, text3;
	
	Calculator(){
		JFrame frame = new JFrame("제목");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container contentPane = getContentPane();
		frame.setSize(400,300);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.GRAY);
		
		text1 =new JTextField(5);
		text2 =new JTextField(5);
		text3 =new JTextField(5);
		
		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));		
		p1.add(text3);
		
		
		b1 = new JButton("확인");
		b2 = new JButton("취소");
		
		p2.add(b1);
		p2.add(b2);
		
		frame.add("Center",p1);
		frame.add("South",p2);
		
		b1.addActionListener(new myActionListener());
		b2.addActionListener(new myActionListener());
		
		frame.pack();
		frame.setVisible(true);
	}
}

class myActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		Object obj = e.getSource();
		
		if(obj == Calculator.b1) {
			int result = Integer.parseInt(Calculator.text1.getText()) + Integer.parseInt(Calculator.text2.getText());
			Calculator.text3.setText(String.valueOf(result));	
		}
		else {
			Calculator.text1.setText("");
			Calculator.text2.setText("");
			Calculator.text3.setText("");			
		}
		
	}
	
}




public class Training_12_10_add {
	public static void main(String[] args){
		
		new Calculator();
		
	}
}
