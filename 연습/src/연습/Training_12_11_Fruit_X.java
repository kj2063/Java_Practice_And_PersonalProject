package 연습;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

class FruitFrame extends JFrame{
	
	String[] fruitName = {"사과","배","체리"};
	static ImageIcon[] picture = {
							new ImageIcon("images/apple.jpg"),
							new ImageIcon("images/pear.jpg"),
							new ImageIcon("images/cherry.jpg")
							};
	
	Container contentPane;
	JPanel imagePanel,radioPanel;
	static JLabel imageLabel;
	static JRadioButton[] button;
	
	FruitFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		imagePanel = new JPanel();
		radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		imageLabel = new JLabel();
		
		setSize(300,500);
		
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
//		imagePanel.add(imageLabel);
		
		contentPane.add("North",radioPanel);
		contentPane.add("Center",imageLabel);
		
		
		Font font = new Font("궁서",Font.BOLD,30);
		
		button = new JRadioButton[3];
		ButtonGroup group = new ButtonGroup();
		for(int i=0; i<fruitName.length; i++) {
			button[i] = new JRadioButton(fruitName[i]);
			button[i].setFont(font);
			group.add(button[i]);
			radioPanel.add(button[i]);
			button[i].addActionListener(new MyActionListener2());
		}
		
		button[0].setSelected(true);//???? 왜 기본으로 선택되는데 그림이 기본으로 안뜨지?
		
		setVisible(true);
	}
}

class MyActionListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(FruitFrame.button[0].isSelected()) {
			FruitFrame.imageLabel.setIcon(FruitFrame.picture[0]);
		}
		else if(FruitFrame.button[1].isSelected()) {
			FruitFrame.imageLabel.setIcon(FruitFrame.picture[1]);
		}
		else {
			FruitFrame.imageLabel.setIcon(FruitFrame.picture[2]);
		}
	}
	
}


public class Training_12_11_Fruit_X {
	public static void main(String[] args) {
		new FruitFrame();
	}
}
