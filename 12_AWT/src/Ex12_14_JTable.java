import java.awt.BorderLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex12_14_JTable extends JFrame{

	int count=1;
	Vector<String> colName;
	Vector<Vector<String>> data;
	JTable table;
	JScrollPane scrollPane;
	Container contentPane;
	
	Ex12_14_JTable(){
		/*
		String[] colName = {"이름","나이","성별"};
		Object[][] data = {
				{"김철수",24,'남'},
				{"이순희",21,'여'},
				{"박지영",26,'여'},
				{"손호준",31,'남'}
		};
		JTable table = new JTable(data,colName);
		 */

		colName = new Vector<String>();
		data = new Vector<Vector<String>>();

		getFile();
		compose();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200);
		setVisible(true);
	}//

	private void compose() {
		table = new JTable(data,colName);
		scrollPane = new JScrollPane(table);
		contentPane = getContentPane();
		contentPane.add(scrollPane,BorderLayout.CENTER);
		
		JButton button = new JButton("출력");
		contentPane.add(button,BorderLayout.SOUTH);

	}

	public void getFile(){

		try {
			FileReader fr = new FileReader("c:\\sun\\table.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while( (line = br.readLine()) != null) {
				//System.out.println(line);
				JtableMake(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//getFile()

	public void JtableMake(String line){
		//line:이름/국어/영어/수학
		//line:써니/33/44/55

		String[] item = line.split("/");
		if(count++==1) { // 2
			for(int i=0;i<item.length;i++) {
				colName.add(item[i]);
			}
		}
		else {
			Vector<String> one = new Vector<String>();
			for(int i=0;i<item.length;i++) {
				one.add(item[i]);
			}
			data.add(one);
		}
	}//JtableMake

	public static void main(String[] args) {
		new Ex12_14_JTable();
	}
}//

class TableDisplay{
	//메서드에서 콘솔창에 테이블 출력
}







