import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.awt.event.*;

public class Ex12_13_JTable extends JFrame {
	
	String[] colName = {"이름", "나이", "성별"};
	Object[][] data = {
						{"김철수",24,'남'},
						{"이순희",21,'여'},
						{"박지영",26,'여'},
						{"손호준",31,'남'}
					};
	
	JButton button;
	Container contentPane;
	Ex12_13_JTable(){
//		JFrame frame = new JFrame("참가자 명단"); //getContentPane(); 메서드를 안쓸거면 이렇게 하면 된다.
//		frame.setSize(400,200);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
		
		contentPane = getContentPane();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		
		JTable table = new JTable(data,colName);
		JScrollPane scrollpane = new JScrollPane(table);
		
		button = new JButton("출력");
		
		contentPane.add("Center",scrollpane);
//		contentPane.add("South",button);
		contentPane.add(button,BorderLayout.SOUTH);
		
		button.addActionListener(new TablePrint(table));
		
		setVisible(true);
	}//생성자
	
	
	class TablePrint implements ActionListener{
		JTable table;
		public TablePrint(JTable table) {
			this.table = table;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("출력");
			int rowCount = table.getRowCount();
			int columnCount = table.getColumnCount();
			System.out.println(rowCount + "," + columnCount);
			
			String columnName = table.getColumnName(0);//배열처럼 행의 제목을 return
			System.out.println(columnName);
			
			Object obj = table.getValueAt(0, 0);//배열처럼 
			System.out.println("obj:" + obj);
			
			for(int i=0; i<columnCount; i++) {
				columnName = table.getColumnName(i);
				System.out.print(columnName + "\t");
			}
			System.out.println();
			
			for(int i=0; i<rowCount; i++) {
				for(int j=0; j<columnCount; j++) {
					obj = table.getValueAt(i, j);
					System.out.print(obj+"\t");
				}
				System.out.println();
			}
			
		}//actionPerformed()
		
	}//TablePrint class
	
	
	
	
	public static void main(String[] args) {
		new Ex12_13_JTable();
		
		
	}




	




}
