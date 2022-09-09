package JTable¼ºÀû;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTable;

public class FilePrint implements ActionListener {
	JTable table;
	BufferedWriter bw;
	BufferedReader br;
	String line;
	String[] text;
	
	FilePrint(JTable table) {
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			bw = new BufferedWriter(new FileWriter("c:\\sun\\table.txt"));
			
			int columnCount = table.getColumnCount();
			int rowCount = table.getRowCount();
			
			for(int i=0; i<columnCount; i++) {
				String colName = table.getColumnName(i);
				System.out.print(colName + "\t");
				
				if(i != columnCount-1) {
					bw.write(colName);
					bw.write("/");
				}
				else {
					bw.write(colName);
					bw.newLine();
				}
			}//for
			System.out.println();
			for(int i=0; i<rowCount; i++) {
				for(int j=0; j<columnCount; j++) {
					Object obj = table.getValueAt(i, j);
					System.out.print(obj + "\t");
					
					if(j != columnCount-1) {
						bw.write((String)obj);
						bw.write("/");
					}
					else {
						bw.write((String)obj);
						bw.newLine();
					}
				}
				System.out.println();
			}	
			
//			br = new BufferedReader(new FileReader("c:\\sun\\table.txt"));
//			while((line = br.readLine()) != null) {
//				text = line.split("/");
//				for(int i=0; i<text.length; i++)
//					System.out.print(text[i]);
//			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
