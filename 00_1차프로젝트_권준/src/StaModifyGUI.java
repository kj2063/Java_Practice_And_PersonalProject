import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class StaModifyGUI extends JFrame implements ActionListener, ItemListener {
	
	Dao dao = MainGUI.dao;
	
	Container contentPane;
	Choice showAllSta;
	JTextField staField;
	JButton insert, delete, cancel;
	JLabel lb, lb2;
	
	String staName = null;
	
	StaModifyGUI(){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(null);
		setTitle("역 수정");
		setSize(200,200);
		setLocationRelativeTo(null);
		setResizable(false);
		
		compose();
		
		setVisible(true);
	}
	
	public void compose() {
		
		lb = new JLabel("현재 존재하는 역");
		lb2 = new JLabel("추가/삭제할 역");
		lb.setBounds(10,10,160,20);
		lb2.setBounds(10,60,160,20);
		lb.setFont(new Font("Serif",Font.BOLD,12));
		lb2.setFont(new Font("Serif",Font.BOLD,12));
		contentPane.add(lb);
		contentPane.add(lb2);
		
		showAllSta = new Choice();
		staField = new JTextField();
		showAllSta.setBounds(10,30,155,20);
		staField.setBounds(10,80,105,25);
		contentPane.add(showAllSta);
		contentPane.add(staField);
		showAllSta.addItemListener(this);
		
		insert = new JButton("추가");
		delete = new JButton("삭제");
		cancel = new JButton("취소");
		insert.setFont(new Font("Serif",Font.BOLD,12));
		delete.setFont(new Font("Serif",Font.BOLD,12));
		cancel.setFont(new Font("Serif",Font.BOLD,12));
		insert.setBackground(Color.lightGray);
		delete.setBackground(Color.lightGray);
		cancel.setBackground(Color.lightGray);
		insert.setBounds(10,114,47,40);
		delete.setBounds(70,114,47,40);
		cancel.setBounds(130,114,47,40);
		insert.setMargin(new Insets(0, 0, 0, 0));
		delete.setMargin(new Insets(0, 0, 0, 0));
		cancel.setMargin(new Insets(0, 0, 0, 0));
		contentPane.add(insert);
		contentPane.add(delete);
		contentPane.add(cancel);
		insert.addActionListener(this);
		delete.addActionListener(this);
		cancel.addActionListener(this);
		
		compose_Sta();
	}
	
	public void compose_Sta() {
		ArrayList<String> arr = dao.showStation();
		showAllSta.add("");
		for(String str : arr) {
			showAllSta.add(str);
		}
	}//compose_Sta()
	
	public void return_default() {
		showAllSta.removeAll();
		compose_Sta();
		staField.setText("");
		staName = null;
	}
	
	public void compose_modgui_sta() {
		ArrayList<String> arr = dao.showStation();
		Choice[] choice = ModifyGUI.choice;
		choice[2].removeAll();
		choice[2].add("");
		for(String str : arr) {
			choice[2].add(str);
		}
	}
	
	/////////////////////////////////////////////////////////////////
	public void insert_sta() {
		
		int cnt = dao.insert_Sta(staName);
		
		if(cnt == -1) {
	    	System.out.println("삽입 실패");
	    	JOptionPane.showMessageDialog(this,"삽입 실패", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    } 
	    else if (cnt == 0) {
	    	System.out.println("삽입할 Data가 없습니다");
	    	JOptionPane.showMessageDialog(this,"삽입할 Data가 존재하지 않습니다", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else {
	    	System.out.println("삽입 성공");
	    	System.out.println("cnt = " + cnt);
	    }
	}//insert_sta()
	
	public void delete_Sta() {
		int cnt = dao.delete_Sta(staName);
		
		if(cnt == -1) {
	    	System.out.println("삭제 실패");
	    	JOptionPane.showMessageDialog(this,"삭제 실패", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    } 
	    else if (cnt == 0) {
	    	System.out.println("삭제할 Data가 없습니다");
	    	JOptionPane.showMessageDialog(this,"삭제할 Data가 존재하지 않습니다\n'역'을 포함한 역 이름을 입력해 주세요", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else {
	    	System.out.println("삭제 성공");
	    	System.out.println("cnt = " + cnt);
	    }
	}//delete_Sta()
	
	
/////////////////////////////////////////////////////////////
	@Override
	public void itemStateChanged(ItemEvent e) {
		staName = showAllSta.getSelectedItem();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == insert) {
			if(!staField.getText().equals("")) {
				String str = staField.getText();
				if(str.substring(str.length()-1).equals("역")) {
					staName = str;
				}
				else {
					staName = str+"역";
				}
			}
//			staName = staField.getText();
			if((staName == null || staName.equals(""))) {
				JOptionPane.showMessageDialog(this,"추가할 역 이름을 입력해 주세요", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			insert_sta();
			compose_modgui_sta();
			return_default();
		}
		else if(obj == delete) {
			String sta_f = staField.getText();
			if(!sta_f.equals("")) {
				staName = sta_f;
			}
			System.out.println("staName : " + staName);
			delete_Sta();
			compose_modgui_sta();
			return_default();
			MainGUI.showall.doClick();
		}
		else {
			dispose();
		}
	}
	
}//end class
