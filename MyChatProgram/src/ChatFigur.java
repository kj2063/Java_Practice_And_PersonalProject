import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class FigureChat extends JFrame implements ActionListener {
	
	
	JTextField textField;
	JScrollPane scrollPane;
	JTextArea textArea;
	JButton button;
	
	
	FigureChat(){
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
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
			
			if(!text.equalsIgnoreCase("quit")) {
				textField.setText("");
				textArea.append(text + "\n");
				ChatFigur.pw.println(text);
			}
			else {
				try {
					ChatFigur.cs.close();
					ChatFigur.ss.close();
					ChatFigur.pw.close();
					//						br.close();
					ChatFigur.keyboard.close();
					textArea.append("채팅 프로그램을 종료합니다");
					System.exit(0);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		else {
			
		}
		
	}//actionPerformed()
		
	
}//FigureChat

public class ChatFigur {
	static ServerSocket ss;
	static Socket cs;
	static BufferedReader br;
	static PrintWriter pw;
	static BufferedReader keyboard;
	


	public static void main(String[] args) {
			
		try {
			FigureChat fc = new FigureChat();

			Thread chatAccepter = new Thread(new Runnable() {

				@Override
				public void run() {
					String acceptedM;

					try {
						while(true) {
							acceptedM = ChatFigur.br.readLine();
							if(acceptedM == null) {
								Thread.sleep(200);
								continue;
							}
							else if(acceptedM.equalsIgnoreCase("quit")){
								fc.textArea.append("상대방과 연결이 끊겼습니다");
								//							break;
								System.exit(0);
							}	
							else {
								fc.textArea.append("상대방 : "+ acceptedM);
							}
						}
					} catch (Exception e) {
						fc.textArea.append("에러발생!!");
						fc.textArea.append(e.getMessage());
					}



				}
			}
					);
			
			chatAccepter.setDaemon(true);


			ss = new ServerSocket(1000);
			fc.textArea.append("접속자 기다리는 중...\n");
			Socket cs = ss.accept();
			fc.textArea.append("접속자와 연결 되었습니다.");

			chatAccepter.start();
			
			pw = new PrintWriter(cs.getOutputStream(),true);
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			
			chatAccepter.start();
			

		}//try
		catch (IOException e) {
			System.out.println("IOException 에러발생");
		}//catch

	}
}
