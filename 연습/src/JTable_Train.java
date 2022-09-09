import java.awt.Container;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Table extends JFrame{
	Container contentPane;
	JButton add,delete,print,exit;
	Vector<String> colName;
	Vector<Vector<String>> data; 
	
	Table(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(700,400);
		
		getData();
		
		JTable table = new JTable(data,colName);
		JScrollPane scroll = new JScrollPane(table);
		
		getData();
		
		
		setVisible(true);
	}
	
	public void getData() {
		
	}
	
}


public class JTable_Train {
	
	public static void main(String[] args) {
		new Table();
	}
}
