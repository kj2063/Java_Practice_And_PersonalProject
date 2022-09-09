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
	String[] text = {"���","��","ü��"};
	ImageIcon[] image = {
				new ImageIcon("images/apple.jpg"),
				new ImageIcon("images/pear.jpg"),
				new ImageIcon("images/cherry.jpg")
						};
	JLabel imageLabel = new JLabel();
	JRadioButton[] radio = new JRadioButton[3];
	
	Ex12_11_Fruit_ItemEvent(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �� �ڵ尡 ������ X��ư�� ������ â�� ������ ���α׷��� ������� ������, ���ڵ尡 ������ â�� ������ ���α׷��� ����ȴ�.
		
		contentPane = getContentPane();
		setSize(350,400);
		
		JPanel radioPanel = new JPanel();
		
		Font font = new Font("�ü�",Font.BOLD,30);
		
		ButtonGroup group = new ButtonGroup(); // ��ư�� ������ �����Ǿ� ��� ������ �ʵ���(�ϳ��� ������ �������� �����ǵ���) �׷����� ���� ���� ��ü ����.
		for(int i=0; i<text.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			radio[i].setFont(font); //��Ʈ ����
			radioPanel.add(radio[i]); //�гο� ��ư�� ����
			group.add(radio[i]);//�׷쿡 ����
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[0].setSelected(true);//�ƹ��͵� ���þȵǵ� �⺻���� ����� ����.
		
		radioPanel.setBackground(Color.GRAY);
		contentPane.add("North",radioPanel);
		contentPane.add("Center",imageLabel);
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);//imageLabel�� ������ �߰��� �������� ����
		
		setVisible(true);
	
	}//������
	
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
//			System.out.println("����");
//			Object obj = e.getSource(); //���:radio[0], ��:radio[1]
			if(radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);//�̹����� set��. ���ڴ� setText
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
