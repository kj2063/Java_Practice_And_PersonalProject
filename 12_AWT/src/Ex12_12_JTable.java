import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.awt.event.*;

public class Ex12_12_JTable extends JFrame {
	
	Container contentPane;
	String[] colName = {"�̸�","����","����"};
	Object[][] data = {
							{"���ð�","����",33},//{"���ð�","����",new Integer(33)},
							{"�ڸ��","���׸�",78},
							{"�迬��","�����",21},
							{"������","���",56}
					  };
	
	Ex12_12_JTable(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		JTable table = new JTable(data,colName); // JTable�� ���鶧 ()��ȣ �ȿ� (����,����) �̷��� ���ڰ� ����.
		
		JScrollPane scrollPane = new JScrollPane(table); //��ũ�� �ٸ� ���� �гο� table�� �ִ´�.
		contentPane.add(scrollPane);

		setSize(500,200);
		setVisible(true);
	}//������
	
	
	public static void main(String[] args) {
		new Ex12_12_JTable();
		
	}//main
}
