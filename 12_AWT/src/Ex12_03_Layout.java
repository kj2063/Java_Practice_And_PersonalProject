import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

class Ex12_03_sub extends Frame{
	
	Ex12_03_sub(String title){
		super(title);
		setSize(400,300);
		setVisible(true);
		
		Button a = new Button("����"); //��ư �߾ӿ� "����"�� ����
		Button west = new Button("����");
		Button south = new Button("����");
		Button north = new Button("����");
		Button center = new Button("�߾�");
		
		//LayoutManager : � ������� ��ư�� ���ϱ�? (��ư�� �ö󰡴� ����:'�����̳�' /��ư:'������Ʈ')
		//��ġ�������� ����=> FlowLayout , BorderLayout, GridLayout, CardLayout  //��ġ�����ڸ� ���� ���ϸ� �ڵ�(default)���� BorderLayout�� �������� 

//		super.setLayout(new FlowLayout());
		
//		this.add(east);
//		add(west);
//		super.add(south);
//		super.add(north);
//		super.add(new Button("�߾�"));

		//------------------------------
		
//		setLayout(new BorderLayout());// �⺻���� BorderLayout���� �Ǿ������Ƿ� �Ƚᵵ �ȴ�.
		
		//add(��ư��ü, BorderLayout.��ư��ġ(��δ빮��)); ��ġ�� ��ư ����
//		this.add(a, BorderLayout.EAST);
//		add(west, BorderLayout.WEST);
//		super.add(south, BorderLayout.SOUTH);
//		super.add(north, BorderLayout.NORTH);
//		super.add(new Button("�߾�")); //BorderLayout�� ���,  ��ġ�� ������ ���� ������ �߾ӿ� ��ư�� ��������� ������ ��ư 5���� ������ �ִ�. ���������� "�߾�"��ư�� ���� ���� �´�.

		//������ ���� �� ���� �ִ�. add("��ư��ġ(�ձ��ڸ� �빮��)",��ư��ü);
//		add("East",a);
//		add("West",west);
//		add("South",south);
//		add("North",north);
//		add("Center",center);
		
		//-----------------------------------
		
		setLayout(new GridLayout(3,2)); //3��2���� ��ư ��ġ / default�� 1���� ������ ��ư ��ġ
		
		add(a);
		add(west);
		add(south);
		add(north);
		add(center);
	
	}
	
}//

public class Ex12_03_Layout {
	public static void main(String[] args) {
		Ex12_03_sub ex = new Ex12_03_sub("Ex12_03_Layout");
		
		
	}
}
