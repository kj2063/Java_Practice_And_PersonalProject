package 연습;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class JTable_Train extends JFrame{
	String[] colName = {"이름","직업","나이"};
	Object[][] data = {
							{"성시경","가수",33},//{"성시경","가수",new Integer(33)},
							{"박명수","개그맨",78},
							{"김연아","운동선수",21},
							{"전지현","배우",56}
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
