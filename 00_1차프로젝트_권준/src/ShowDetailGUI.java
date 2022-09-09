import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ShowDetailGUI extends JFrame implements ActionListener {
	
	Container contentPane;
	JLabel lb;
	JTextArea textArea;
	JScrollPane scrollPane;
	JButton cancel;
	
	ShowDetailGUI(String sign){

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(null);
		setTitle("특이 사항");
		setSize(400,200);
		setLocationRelativeTo(null);
		setResizable(false);
		
		lb = new JLabel("특이 사항");
		lb.setFont(new Font("Serif",Font.BOLD,11));
		lb.setBounds(10,5,100,20);
		contentPane.add(lb);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10,25,320,130);
		textArea.setText(sign);
		
		contentPane.add(scrollPane);
		
		cancel = new JButton("취소");
		cancel.setFont(new Font("Serif",Font.BOLD,12));
		cancel.setMargin(new Insets(0, 0, 0, 0));
		cancel.setBackground(Color.lightGray);
		cancel.setBounds(335,125,43,28);
		contentPane.add(cancel);
		cancel.addActionListener(this);
		
		setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}
}
