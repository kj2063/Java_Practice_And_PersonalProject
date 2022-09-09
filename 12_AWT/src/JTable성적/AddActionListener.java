package JTable����;

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
//		this.tf = tf;//�迭�� �̷������� �ѱ�� �ȵȴ�.
		for(int i=0; i<tf.length; i++) {
			this.tf[i] = tf[i];
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextField�� �Է��� ���� JTable�� �ø��� �۾�.
		DefaultTableModel model = (DefaultTableModel)table.getModel(); //���ϰ��� DefaultTableModel(TableModel �� �ڽ�) �� �ٿ�ĳ����
		for(int i=0; i<tf.length; i++) {
			str[i] = tf[i].getText();
		}
		model.addRow(str);//DefaultTableModel�� �ִ� �����߰� �޼���(addRow()) ���
		
		for(int i=0; i<tf.length; i++) {
			tf[i].setText("");
		}
	
	}

}
