import java.awt.*;

import java.awt.event.*;

class Ex12_06_sub extends Frame implements ItemListener{
	
	String[] ��� = {"�ƽþ�", "����", "������ī"};
	String[][] ���� = {
						{"�ѱ�","�Ϻ�","�߱�"},
						{"����","������","������"},
						{"����Ʈ","���","�찣��"}			
					};
					//removeAll �ż��� ����ؼ� �غ���							
	
	Panel p1,p2,p3;
	Label lb,lb2;
	Choice c1,c2;
	int i,j;
	
	Ex12_06_sub(String name){
		super(name);
		//setTitle("����"); 
		setSize(300,200);
		setVisible(true);
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		p1.setBackground(Color.cyan);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.yellow);
		
		lb = new Label("����� ���� �����ϼ���");
//		lb2 = new Label("                                                     ");
		//�̷��� Label�� ��ĭ�� ���� �־� ���̰� ���� �ʰ� �Ϸ���
		lb2 = new Label();
		add("South",lb2);//�� ���� �����̳ʿ� �־���� 
		lb2.setBackground(Color.yellow);
		lb2.setAlignment(Label.CENTER);
		
		p1.add(lb);
//		p3.add(lb2);
		
		add("North",p1);
		add("Center",p2);
//		add("South",p3);
		
		c1 = new Choice();
		c2 = new Choice();

		for(i=0; i<���.length; i++) {
			c1.add(���[i]);
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
			for(i=0; i<����.length; i++) {
				if(c1.getSelectedIndex() == i ) {
					c2.removeAll();
					for(j=0; j<����[i].length; j++) {
						c2.add(����[i][j]);
					}
				}
			}
		}
		else if(obj == c2) {
			lb2.setText("�����Ͻ� �����:" +c1.getSelectedItem() +"-"+c2.getSelectedItem());
		}

	}
	
}


public class Ex12_06_���� {
	public static void main(String[] args) {
		new Ex12_06_sub("����");
		
	}
}
