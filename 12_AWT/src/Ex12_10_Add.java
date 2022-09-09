import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex12_10_Add extends JFrame{ //JFrame �� swing���� �����ϴ� frame //swing���� �����ϴ� �޼������ awt���� �����ϴ� �޼��忡 J�� ���δ�.
	Ex12_10_Add(String str){
		super(str);
		setSize(500,400);
		
		Container contentPane = getContentPane();//JFrame �� �۾������� �����Ͷ�
		
		JPanel p1 = new JPanel();	
		JPanel p2 = new JPanel();	
		
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.cyan);
		
		contentPane.add(p1,BorderLayout.CENTER);
		contentPane.add(p2,BorderLayout.SOUTH);
		
		JTextField text1 = new JTextField(5); //swing���� �����ϴ� TextField
		JTextField text2 = new JTextField(5); 
		JTextField text3 = new JTextField(5); 
		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));
		p1.add(text3);
		
		JButton b1 = new JButton("Ȯ��");
		JButton b2 = new JButton("���");
		
		p2.add(b1);
		p2.add(b2);
		
		b1.addActionListener(new OkButton(text1,text2,text3)); //b1�� ��ư�� �������� OkButton class���� text1,text2,text3�� ����Ͽ� ��� �� ����
		b2.addActionListener(new CancelButton(text1,text2,text3));
		
		pack();//setSize() �� ���� ũ�⸦ �����ϰ�, �ȿ� �� ���빰�� ũ�⸸ŭ�� ���̰� ����
		setVisible(true);//�� ����� ���� ���̰���. swing �� �̷��� �ؾ� �Ѵ�.
	}
	
	public static void main(String[] args) {
		new Ex12_10_Add("���� ���α׷�");
	}
}


class OkButton implements ActionListener{
	JTextField t1;
	JTextField t2;
	JTextField t3;
	
	OkButton(JTextField t1,JTextField t2,JTextField t3){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("Ȯ�ι�ư");
		
		try {
			int result = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
//			t3.setText(result);// setText(String s); �̹Ƿ� ���� => ���ڿ�
			t3.setText(String.valueOf(result));
		}
		catch(NumberFormatException e2) {
//			System.out.println("���ڸ� �־��ּ���");
			JOptionPane.showMessageDialog(null, "���ڸ� �Է� ����");
		}
	}
}//

class CancelButton implements ActionListener{
	JTextField t1;
	JTextField t2;
	JTextField t3;
	
	CancelButton(JTextField t1,JTextField t2,JTextField t3){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("��ҹ�ư");
		
		t1.setText("");
		t2.setText("");
		t3.setText("");
		
	}
	
}