package ����;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class JTable_Train extends JFrame{
	String[] colName = {"�̸�","����","����"};
	Object[][] data = {
							{"���ð�","����",33},//{"���ð�","����",new Integer(33)},
							{"�ڸ��","���׸�",78},
							{"�迬��","�����",21},
							{"������","���",56}
					  };
	
	Container contentPane;
	
	public JTable_Train() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(500,300);
		
		JTable table = new JTable(data,colName);
		JScrollPane scroll = new JScrollPane(table);
		
		contentPane.add(scroll);
		
		
		
		setVisible(true);
	}
	
	
}



public class Training_12_12_JTable {

	public static void main(String[] args) {
		new JTable_Train();
	}

}
