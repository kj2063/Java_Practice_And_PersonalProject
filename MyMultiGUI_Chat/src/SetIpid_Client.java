import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class  SetIpid_Client extends JFrame implements ActionListener{
	
	JTextField textField_ip, textField_id;
	JLabel titleLabel, ipLabel, idLabel;
	JButton button;
	Container contentPane;

	
	
	SetIpid_Client(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(null);
		setTitle("접속 설정");
		setSize(250,170);

		titleLabel = new JLabel("IP & ID 설정");
		ipLabel = new JLabel("접속할 서버IP :");
		idLabel = new JLabel("사용할 ID :");

		titleLabel.setBounds(90,5,100,20);
		contentPane.add(titleLabel);

		ipLabel.setBounds(10,35,100,25);
		contentPane.add(ipLabel);

		idLabel.setBounds(34,65,100,25);
		contentPane.add(idLabel);

		textField_ip = new JTextField();
		textField_ip.setBounds(105,35,120,25);
		contentPane.add(textField_ip);

		textField_id = new JTextField();
		textField_id.setBounds(105,65,120,25);
		contentPane.add(textField_id);

		button = new JButton("확인");
		button.setBounds(90,95,60,30);
		contentPane.add(button);

		button.addActionListener(this);

		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Chat_Client.ip = textField_ip.getText();
		Chat_Client.id = textField_id.getText();
		
		dispose();
	}

}

