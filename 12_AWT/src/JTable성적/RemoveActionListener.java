package JTable¼ºÀû;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener {
	JTable table;
	
	RemoveActionListener(JTable table) {
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		System.out.println("row:" + row);

		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row);
		
	}
	
	
}
