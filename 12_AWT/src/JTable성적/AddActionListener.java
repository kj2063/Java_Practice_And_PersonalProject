package JTable성적;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AddActionListener implements ActionListener {
	JTable table;
	JTextField[] tf = new JTextField[4];
	String[] str = new String[4];
	
	public AddActionListener(JTextField[] tf, JTable table) {
		this.table = table;
//		this.tf = tf;//배열은 이런식으로 넘기면 안된다.
		for(int i=0; i<tf.length; i++) {
			this.tf[i] = tf[i];
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextField에 입력한 값을 JTable에 올리는 작업.
		DefaultTableModel model = (DefaultTableModel)table.getModel(); //리턴값을 DefaultTableModel(TableModel 의 자식) 로 다운캐스팅
		for(int i=0; i<tf.length; i++) {
			str[i] = tf[i].getText();
		}
		model.addRow(str);//DefaultTableModel에 있는 한줄추가 메서드(addRow()) 사용
		
		for(int i=0; i<tf.length; i++) {
			tf[i].setText("");
		}
	
	}

}
