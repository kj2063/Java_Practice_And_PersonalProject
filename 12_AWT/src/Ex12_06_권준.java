import java.awt.*;

import java.awt.event.*;

class Ex12_06_sub extends Frame implements ItemListener{
	
	String[] 대륙 = {"아시아", "유럽", "아프리카"};
	String[][] 나라 = {
						{"한국","일본","중국"},
						{"영국","스위스","프랑스"},
						{"이집트","콩고","우간다"}			
					};
					//removeAll 매서드 사용해서 해보기							
	
	Panel p1,p2,p3;
	Label lb,lb2;
	Choice c1,c2;
	int i,j;
	
	Ex12_06_sub(String name){
		super(name);
		//setTitle("제목"); 
		setSize(300,200);
		setVisible(true);
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		p1.setBackground(Color.cyan);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.yellow);
		
		lb = new Label("대륙과 나라를 선택하세요");
//		lb2 = new Label("                                                     ");
		//이렇게 Label에 빈칸을 많이 주어 보이게 하지 않고 하려면
		lb2 = new Label();
		add("South",lb2);//로 직접 컨테이너에 넣어놓고 
		lb2.setBackground(Color.yellow);
		lb2.setAlignment(Label.CENTER);
		
		p1.add(lb);
//		p3.add(lb2);
		
		add("North",p1);
		add("Center",p2);
//		add("South",p3);
		
		c1 = new Choice();
		c2 = new Choice();

		for(i=0; i<대륙.length; i++) {
			c1.add(대륙[i]);
		}
		c2.add("      ");
		p2.add(c1);
		p2.add(c2);

		c1.addItemListener(this);	
		c2.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		
		if(obj == c1) {
			for(i=0; i<나라.length; i++) {
				if(c1.getSelectedIndex() == i ) {
					c2.removeAll();
					for(j=0; j<나라[i].length; j++) {
						c2.add(나라[i][j]);
					}
				}
			}
		}
		else if(obj == c2) {
			lb2.setText("선택하신 나라는:" +c1.getSelectedItem() +"-"+c2.getSelectedItem());
		}

	}
	
}


public class Ex12_06_권준 {
	public static void main(String[] args) {
		new Ex12_06_sub("제목");
		
	}
}
