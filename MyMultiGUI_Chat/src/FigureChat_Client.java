import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class FigureChat_Client extends JFrame implements ActionListener {
	
	
	JTextField textField;
	JScrollPane scrollPane;
	JTextArea textArea;
	JButton button;
	
	
	FigureChat_Client(){
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		setTitle("채팅 프로그램 : Client");
		setSize(350,500);
		
		textField = new JTextField();
		textField.setBounds(18,432,250,25);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(18, 15, 300, 410);
		
		button = new JButton("   ");
		button.setBounds(280,432,38,25);

		
		contentPane.setBackground(Color.lightGray);
		textField.setBackground(Color.white);
		textArea.setBackground(Color.white);
		
		contentPane.add(textField);
		contentPane.add(scrollPane);
		contentPane.add(button);
		
		textField.addActionListener(this);
		button.addActionListener(this);
		
		
		
		setVisible(true);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == textField) {
			
			String text = textField.getText();
			
			textField.setText("");
			textArea.append(Chat_Client.id + " : " + text + "\n");
			Chat_Client.pw.println(Chat_Client.id+"#"+text);
			
		}
		else {
			
		}
		
	}//actionPerformed()
	
}//FigureChat
