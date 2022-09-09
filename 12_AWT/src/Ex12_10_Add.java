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

public class Ex12_10_Add extends JFrame{ //JFrame 은 swing에서 제공하는 frame //swing에서 제공하는 메서드들은 awt에서 제공하는 메서드에 J를 붙인다.
	Ex12_10_Add(String str){
		super(str);
		setSize(500,400);
		
		Container contentPane = getContentPane();//JFrame 의 작업영역을 가져와라
		
		JPanel p1 = new JPanel();	
		JPanel p2 = new JPanel();	
		
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.cyan);
		
		contentPane.add(p1,BorderLayout.CENTER);
		contentPane.add(p2,BorderLayout.SOUTH);
		
		JTextField text1 = new JTextField(5); //swing에서 제공하는 TextField
		JTextField text2 = new JTextField(5); 
		JTextField text3 = new JTextField(5); 
		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));
		p1.add(text3);
		
		JButton b1 = new JButton("확인");
		JButton b2 = new JButton("취소");
		
		p2.add(b1);
		p2.add(b2);
		
		b1.addActionListener(new OkButton(text1,text2,text3)); //b1의 버튼을 눌렀을때 OkButton class에서 text1,text2,text3를 사용하여 계산 및 산출
		b2.addActionListener(new CancelButton(text1,text2,text3));
		
		pack();//setSize() 로 정한 크기를 무시하고, 안에 들어간 내용물의 크기만큼만 보이게 만듬
		setVisible(true);//다 만들고 나서 보이게함. swing 은 이렇게 해야 한다.
	}
	
	public static void main(String[] args) {
		new Ex12_10_Add("덧셈 프로그램");
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
//		System.out.println("확인버튼");
		
		try {
			int result = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
//			t3.setText(result);// setText(String s); 이므로 숫자 => 문자열
			t3.setText(String.valueOf(result));
		}
		catch(NumberFormatException e2) {
//			System.out.println("숫자를 넣어주세요");
			JOptionPane.showMessageDialog(null, "숫자만 입력 가능");
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
//		System.out.println("취소버튼");
		
		t1.setText("");
		t2.setText("");
		t3.setText("");
		
	}
	
}