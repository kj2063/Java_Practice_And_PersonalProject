import java.awt.*;
import java.awt.event.*;

class Ex12_05_sub extends Frame implements ItemListener{
	
	Choice ch;
	Label lb2;
	
	Ex12_05_sub(String name){
		super(name);
		setSize(400,300);
		setVisible(true);

		Panel p1 = new Panel(); //���� ��ư���� �гκ��忡 �ۼ��� �����̳ʺ��� �� �ø��� ���� �г��� ����
		Panel p2 = new Panel();
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.green);
		
		super.add("North",p1);
		super.add("Center",p2);
		
		Label lb = new Label("���� �����ϼ���"); // �гο� ���� �������� �� ����
		lb.setBackground(Color.pink);
		p1.add(lb); 
		
		String[] flower = {"���޷�", "����", "���", "��ȭ", "������"};
		
		//�̺�Ʈ�� �߻��ϸ� �̺�Ʈ ��ü ����
		ch = new Choice();// choice ���� => ItemEvent �߻� => new ItemEvent() ����
		for(int i=0; i<flower.length; i++) {
			ch.add(flower[i]);	
		}
//		ch.add("���");
//		ch.add("ī���̼�");
		p1.add(ch); // ���� Choice��ü�� p1�гο� ���� 
		
		
		lb2 = new Label("           ");
		lb2.setBackground(Color.orange);
		p2.add(lb2);
		
		ch.addItemListener(this);
	}

	
	@Override
	public void itemStateChanged(ItemEvent e) {
//		System.out.println("����");
		int index  = ch.getSelectedIndex(); //getSelectedIndex() : choice ���� ������ ��ġ(index) ��ȣ return
		String item = ch.getSelectedItem(); //getSelectedItem() : choice ���� ������ ���ڿ� return 
		System.out.println(index + "," + item);
		lb2.setText(item);// lb2 �󺧿� ���ڿ� �ְ� event �߻��� ��� 
	}
	
}


public class Ex12_05_ItemEvent {
	public static void main(String[] args) {
		
		new Ex12_05_sub("����");
		
		
	}
}
