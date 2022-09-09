import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginGUI extends JFrame implements ActionListener {
	Container contentPane;
	JTextField id_field;
	TextField pw_field;
	JLabel id, pw;
	JButton login, exit;
	ImageIcon img, image;
	JPanel background;
	
	String input_id, input_pw;
	
	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage();  //ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg); 
		return xyimg;
	}
	
	LoginGUI(){
		img = new ImageIcon("도시.jpg");
		contentPane = getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Login");
		setSize(300,200);
		setLocationRelativeTo(null);
		setResizable(false);
		
		image = imageSetSize(img, 290, 170);
		
		background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(image.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		background.setLayout(null);
		contentPane.add(background);
		
		compose();
		
		setVisible(true);
	}
	
	public void compose(){
		id = new JLabel("ID");
		pw = new JLabel("PW");
		id.setFont(new Font("Serif",Font.BOLD,12));
		pw.setFont(new Font("Serif",Font.BOLD,12));
		id.setForeground(Color.white);;
		pw.setForeground(Color.white);
		id.setBounds(75,25,20,23);
		pw.setBounds(70,55,20,23);
		background.add(id);
		background.add(pw);
		
		id_field = new JTextField();
		pw_field = new TextField();
		pw_field.setEchoChar('*');
		id_field.setBounds(95,25,110,23);
		pw_field.setBounds(95,55,110,23);
		background.add(id_field);
		background.add(pw_field);

		
		login = new JButton("로그인");
		exit = new JButton("종료");
		login.setFont(new Font("Serif",Font.BOLD,11));
		exit.setFont(new Font("Serif",Font.BOLD,11));
		login.setMargin(new Insets(0, 0, 0, 0));
		exit.setMargin(new Insets(0, 0, 0, 0));
		login.setBackground(Color.lightGray);
		exit.setBackground(Color.lightGray);
		login.setBounds(80,110,60,30);
		exit.setBounds(160,110,60,30);
		background.add(login);
		background.add(exit);
		login.addActionListener(this);
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == login) {
			input_id = id_field.getText();
			input_pw = pw_field.getText();
			if(input_id.equalsIgnoreCase("jspid") && input_pw.equalsIgnoreCase("jsppw")) { //id,pw설정
				MainGUI.flag = true;
				dispose();
			}
			else {
				JOptionPane.showMessageDialog(this,"올바른 ID/PW가 아닙니다", "로그인 실패", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
		}
		else {
			System.exit(0);
		}
			
	}//actionperformed

}
