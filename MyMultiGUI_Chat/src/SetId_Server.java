import java.awt.Container;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetId_Server extends JFrame implements ActionListener {
	
	JLabel idLabel, ipLabel;
	JTextField textField_id;
	JButton button;
	String myIp;
	
	SetId_Server(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		setTitle("ID 설정");
		setSize(200,150);
		try {
			InetAddress local = InetAddress.getLocalHost();
			myIp = local.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		ipLabel = new JLabel("My IP : " + myIp);
		ipLabel.setBounds(30,15,180,15);
		contentPane.add(ipLabel);
		
		idLabel = new JLabel("사용할 ID : ");
		idLabel.setBounds(10,40,180,25);
		contentPane.add(idLabel);
		
		textField_id = new JTextField();
		textField_id.setBounds(80,40,100,25);
		contentPane.add(textField_id);
		
		button = new JButton("확인");
		button.setBounds(65,75,60,30);
		contentPane.add(button);
		
		
		button.addActionListener(this);
		
		setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Chat_Server.id = textField_id.getText();
		
		dispose();
	}
	
}
