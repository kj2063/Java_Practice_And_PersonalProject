import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;


class Ex12_04_sub extends Frame implements ActionListener { //ActionListener�� ����Ϸ��� �����ؾ��Ѵ�.
	
	Button b1;
	Button b2;
	Button b3;
	
	
	Ex12_04_sub(String name){
		super(name);
		setSize(400,300);
		setVisible(true);
		
		b1 = new Button("�����");
		b2 = new Button("������");
		b3 = new Button("�Ķ���");
				
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		
		//Event Source�� Event�� �߻��Ǵ� Component(��ư)�� ���Ѵ�.
		//Event Listener�� Event Source���� Event�� �߻��ϴ��� �˻��ϰ� �ִٰ� �߻��Ǹ� Event�� ó�� �� �� �ֵ��� ���� Interface.
		/*
		Event�� ���� : 
		
		ActionEvent - Component(��ư)�� �����ų� ���õǾ����� �߻��ϴ� Event
		ItemEvent - checkbox�� list���� 
		*/
		
		b1.addActionListener(this); //b1�� ������ ActionEvent�߻� => new ActionEvent() ��ü����
		// this :����Ŭ����  =>����Ŭ������ actionPerfoermed(ActionEvent e) �޼���� ��� �� �� �ְ� ��. (actionPerformed�� ��ġ)
		
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.out.println("X��ư Ŭ����");
						System.exit(0);
					}
					
					public void windowActivated (WindowEvent e) {
						System.out.println("â�� Ȱ��ȭ ��");
					}
				}
				
				);
		
		
	}
	
	@Override // �������̽� ActionListener �κ��� ��ӹ��� �߻�޼��� ����
	public void actionPerformed(ActionEvent e) { //ActionEvent e = new ActionEvent() // addActionListener()�� ���� ������� ��ü�� �ڵ����� ���� �����Եȴ�.
		//System.out.println("����");
		Object obj = e.getSource(); // ActionEvent.getSource() : ������� Button�� �����ڸ� ���� //b1,b2,b3
		if(obj == b1) {
			System.out.println("����� Ŭ��");
			super.setBackground(Color.yellow); // Frame class�� �ִ� setBackground()�޼��� ���
		}
		else if(obj == b2) {
			System.out.println("������ Ŭ��");
			super.setBackground(Color.red); 
		}
		else {
			System.out.println("�Ķ��� Ŭ��");
			super.setBackground(Color.blue);
		}
	}
	
}

public class Ex12_04_ActionEvent {
	public static void main(String[] args) {
		new Ex12_04_sub("����");
		
	}
}
