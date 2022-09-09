import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.awt.event.*;

public class Ex12_12_JTable extends JFrame {
	
	Container contentPane;
	String[] colName = {"이름","직업","나이"};
	Object[][] data = {
							{"성시경","가수",33},//{"성시경","가수",new Integer(33)},
							{"박명수","개그맨",78},
							{"김연아","운동선수",21},
							{"전지현","배우",56}
					  };
	
	Ex12_12_JTable(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		JTable table = new JTable(data,colName); // JTable을 만들때 ()괄호 안에 (내용,제목) 이렇게 인자가 들어간다.
		
		JScrollPane scrollPane = new JScrollPane(table); //스크롤 바를 갖는 패널에 table을 넣는다.
		contentPane.add(scrollPane);

		setSize(500,200);
		setVisible(true);
	}//생성자
	
	
	public static void main(String[] args) {
		new Ex12_12_JTable();
		
	}//main
}
