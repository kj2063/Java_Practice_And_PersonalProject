import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;


class Ex12_04_sub extends Frame implements ActionListener { //ActionListener을 사용하려면 구현해야한다.
	
	Button b1;
	Button b2;
	Button b3;
	
	
	Ex12_04_sub(String name){
		super(name);
		setSize(400,300);
		setVisible(true);
		
		b1 = new Button("노란색");
		b2 = new Button("빨간색");
		b3 = new Button("파란색");
				
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		
		//Event Source는 Event가 발생되는 Component(버튼)을 말한다.
		//Event Listener는 Event Source에서 Event가 발생하는지 검사하고 있다가 발생되면 Event를 처리 할 수 있도록 만든 Interface.
		/*
		Event의 종류 : 
		
		ActionEvent - Component(버튼)이 눌리거나 선택되었을때 발생하는 Event
		ItemEvent - checkbox나 list에는 
		*/
		
		b1.addActionListener(this); //b1을 누르면 ActionEvent발생 => new ActionEvent() 객체생성
		// this :현재클래스  =>현재클래스의 actionPerfoermed(ActionEvent e) 메서드로 들어 갈 수 있게 함. (actionPerformed의 위치)
		
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.out.println("X버튼 클릭함");
						System.exit(0);
					}
					
					public void windowActivated (WindowEvent e) {
						System.out.println("창이 활성화 됨");
					}
				}
				
				);
		
		
	}
	
	@Override // 인터페이스 ActionListener 로부터 상속받은 추상메서드 구현
	public void actionPerformed(ActionEvent e) { //ActionEvent e = new ActionEvent() // addActionListener()에 의해 만들어진 객체가 자동으로 여기 들어오게된다.
		//System.out.println("여기");
		Object obj = e.getSource(); // ActionEvent.getSource() : 만들어진 Button의 관리자를 리턴 //b1,b2,b3
		if(obj == b1) {
			System.out.println("노란색 클릭");
			super.setBackground(Color.yellow); // Frame class에 있는 setBackground()메서드 사용
		}
		else if(obj == b2) {
			System.out.println("빨간색 클릭");
			super.setBackground(Color.red); 
		}
		else {
			System.out.println("파란색 클릭");
			super.setBackground(Color.blue);
		}
	}
	
}

public class Ex12_04_ActionEvent {
	public static void main(String[] args) {
		new Ex12_04_sub("제목");
		
	}
}
