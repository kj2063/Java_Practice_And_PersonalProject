import java.awt.*;
import java.awt.event.*;


import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Ex12_11_Fruit_ItemEvent extends JFrame {
	
	Container contentPane;
	String[] text = {"사과","배","체리"};
	ImageIcon[] image = {
				new ImageIcon("images/apple.jpg"),
				new ImageIcon("images/pear.jpg"),
				new ImageIcon("images/cherry.jpg")
						};
	JLabel imageLabel = new JLabel();
	JRadioButton[] radio = new JRadioButton[3];
	
	Ex12_11_Fruit_ItemEvent(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이 코드가 없으면 X버튼을 누를때 창만 닫히고 프로그램은 종료되지 않지만, 이코드가 있으면 창이 닫히면 프로그램이 종료된다.
		
		contentPane = getContentPane();
		setSize(350,400);
		
		JPanel radioPanel = new JPanel();
		
		Font font = new Font("궁서",Font.BOLD,30);
		
		ButtonGroup group = new ButtonGroup(); // 버튼을 누르면 누적되어 모두 눌리지 않도록(하나가 눌리면 나머지는 해제되도록) 그룹으로 묶기 위한 객체 생성.
		for(int i=0; i<text.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			radio[i].setFont(font); //폰트 설정
			radioPanel.add(radio[i]); //패널에 버튼을 넣음
			group.add(radio[i]);//그룹에 넣음
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[0].setSelected(true);//아무것도 선택안되도 기본으로 사과를 선택.
		
		radioPanel.setBackground(Color.GRAY);
		contentPane.add("North",radioPanel);
		contentPane.add("Center",imageLabel);
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);//imageLabel에 넣을것 중간에 나오도록 설정
		
		setVisible(true);
	
	}//생성자
	
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
//			System.out.println("여기");
//			Object obj = e.getSource(); //사과:radio[0], 배:radio[1]
			if(radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);//이미지를 set함. 문자는 setText
			}
			else if(radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			}
			else {
				imageLabel.setIcon(image[2]);
			}
			
		}
		
	}//MyItemListener
	
	public static void main(String[] args) {
		new Ex12_11_Fruit_ItemEvent();
		
		
	}
}
