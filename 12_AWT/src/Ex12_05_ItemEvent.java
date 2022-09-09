import java.awt.*;
import java.awt.event.*;

class Ex12_05_sub extends Frame implements ItemListener{
	
	Choice ch;
	Label lb2;
	
	Ex12_05_sub(String name){
		super(name);
		setSize(400,300);
		setVisible(true);

		Panel p1 = new Panel(); //관련 버튼끼리 패널보드에 작성후 컨테이너보드 에 올리기 위해 패널을 만듬
		Panel p2 = new Panel();
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.green);
		
		super.add("North",p1);
		super.add("Center",p2);
		
		Label lb = new Label("꽃을 선택하세요"); // 패널에 글을 쓰기위한 라벨 만듬
		lb.setBackground(Color.pink);
		p1.add(lb); 
		
		String[] flower = {"진달래", "벚꽃", "장미", "국화", "개나리"};
		
		//이벤트가 발생하면 이벤트 객체 생성
		ch = new Choice();// choice 선택 => ItemEvent 발생 => new ItemEvent() 생성
		for(int i=0; i<flower.length; i++) {
			ch.add(flower[i]);	
		}
//		ch.add("장미");
//		ch.add("카네이션");
		p1.add(ch); // 만든 Choice객체를 p1패널에 넣음 
		
		
		lb2 = new Label("           ");
		lb2.setBackground(Color.orange);
		p2.add(lb2);
		
		ch.addItemListener(this);
	}

	
	@Override
	public void itemStateChanged(ItemEvent e) {
//		System.out.println("여기");
		int index  = ch.getSelectedIndex(); //getSelectedIndex() : choice 에서 선택한 위치(index) 번호 return
		String item = ch.getSelectedItem(); //getSelectedItem() : choice 에서 선택한 문자열 return 
		System.out.println(index + "," + item);
		lb2.setText(item);// lb2 라벨에 문자열 넣고 event 발생시 출력 
	}
	
}


public class Ex12_05_ItemEvent {
	public static void main(String[] args) {
		
		new Ex12_05_sub("제목");
		
		
	}
}
