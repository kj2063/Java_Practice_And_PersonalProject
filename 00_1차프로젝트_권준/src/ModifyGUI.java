import java.awt.Choice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ModifyGUI extends JFrame implements ActionListener, ItemListener {
	
	Bean b = new Bean(), b_after;
	String b_cat, b_sta, b_name;
	Dao dao = MainGUI.dao;
	JLabel[] lb = new JLabel[6];
	String[] catName = {"음식점","카페","놀거리"};
	String[][] subcatName = {
								{""},
								{"","한식","양식","중식","일식","그 외"},
								{""},
								{"","실내","실외"}
							};
	
	String[] colName = {"카테고리","세부 카테고리","인근 역","이름","특이 사항(선택)","전화 번호(선택)"};
	
	static Choice[] choice = new Choice[3];
	
	JButton insert, modify, cancel, sta_modify, reset;
	Container contentPane;
	
	JTextArea textArea;
	JTextField name_field, tel_field;
	
	String cat,sub_cat,sta,name,sign,tel;
	
	
	StaModifyGUI staGui;
	
	
	ModifyGUI(){
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(null);
		setTitle("추가 및 수정");
		setSize(550,200);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		for(int i=0; i<lb.length; i++) {
			lb[i] = new JLabel(colName[i]);
			lb[i].setFont(new Font("Serif",Font.BOLD,12));
		}	
		
			lb[0].setBounds(30,10,80,20);
			lb[1].setBounds(121,10,80,20);
			lb[2].setBounds(242,10,80,20);
			lb[3].setBounds(355,10,80,20);
			lb[5].setBounds(435,10,120,20);
			lb[4].setBounds(10,65,120,20);
			
		for(int i=0; i<lb.length; i++) {
			contentPane.add(lb[i]);
		}
		
		for(int i=0; i<choice.length; i++) {
			choice[i] = new Choice();
		}
		
			choice[0].setBounds(10,30,130,20);
			choice[1].setBounds(115,30,130,20);
			choice[2].setBounds(220,30,130,20);
		
		for(int i=0; i<choice.length; i++) {
			contentPane.add(choice[i]);
			choice[i].addItemListener(this);
		}
		
		name_field = new JTextField();
		tel_field = new JTextField();
		name_field.setBounds(325,30,93,25);
		tel_field.setBounds(433,30,93,25);
		contentPane.add(name_field);
		contentPane.add(tel_field);
		name_field.addActionListener(this);
		tel_field.addActionListener(this);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10,85,315,70);
		contentPane.add(scrollPane);
		
		textArea.setBackground(Color.white);
		
		sta_modify = new JButton("역 수정");
		sta_modify.setFont(new Font("Serif",Font.BOLD,10));
		sta_modify.setMargin(new Insets(0, 0, 0, 0));
		sta_modify.setBounds(220,55,40,25);
		sta_modify.setBackground(Color.lightGray);
		contentPane.add(sta_modify);
		sta_modify.addActionListener(this);
		
		insert = new JButton("추가");
		modify = new JButton("수정");
		cancel = new JButton("취소");
		insert.setMargin(new Insets(0, 0, 0, 0));
		modify.setMargin(new Insets(0, 0, 0, 0));
		cancel.setMargin(new Insets(0, 0, 0, 0));
		insert.setFont(new Font("Serif",Font.BOLD,12));
		modify.setFont(new Font("Serif",Font.BOLD,12));
		cancel.setFont(new Font("Serif",Font.BOLD,12));
		insert.setBackground(Color.lightGray);
		modify.setBackground(Color.lightGray);
		cancel.setBackground(Color.lightGray);
		insert.setBounds(340,112,55,40);
		modify.setBounds(405,112,55,40);
		cancel.setBounds(470,112,55,40);
		contentPane.add(insert);
		contentPane.add(modify);
		contentPane.add(cancel);
		insert.addActionListener(this);
		modify.addActionListener(this);
		cancel.addActionListener(this);
		reset = new JButton("Reset");
		reset.setMargin(new Insets(0, 0, 0, 0));
		reset.setFont(new Font("Serif",Font.BOLD,11));
		reset.setBackground(Color.pink);
		reset.setBounds(484,85,40,20);
		reset.addActionListener(this);
		contentPane.add(reset);
		
		composeChoice();
		
		setVisible(true);
	
	}
	
	ModifyGUI(Bean b){
		
		this();
		
//		this.b = b;
		this.b.setCat(b.getCat());
		this.b.setSub_cat(b.getSub_cat());
		this.b.setSta(b.getSta());
		this.b.setName(b.getName());
		this.b.setSign(b.getSign());
		this.b.setTel(b.getTel());
		
		choice[0].select(b.getCat());
		
		if(b.getCat().equals("음식점")) {
			for(int i=0; i<subcatName[1].length; i++) {
				choice[1].add(subcatName[1][i]);
			}
		}else if (b.getCat().equals("놀거리")) {
			for(int i=0; i<subcatName[3].length; i++) {
				choice[1].add(subcatName[3][i]);
			}
		}
		
		choice[1].select(b.getSub_cat());
		choice[2].select(b.getSta());
		name_field.setText(b.getName());
		if(b.getTel().equals("null")) {
			tel_field.setText("");		
		}else {
			tel_field.setText(b.getTel());
		}
		if(b.getSign().equals("null")) {
			textArea.setText("");
		}else {
			textArea.setText(b.getSign());
		}
		
	}
	//////////////////////////////////////////////////////////////////
	public void composeChoice() {
		choice[0].add("");
		for(int i=0; i<catName.length; i++) {
			choice[0].add(catName[i]);
		}
		
		ArrayList<String> arr = dao.showStation();
		choice[2].add("");
		for(String str : arr) {
			choice[2].add(str);
		}
	}
	
	public void return_default() {
		name_field.setText("");
		tel_field.setText("");
		textArea.setText("");
		for(int i=0; i<choice.length; i++) {
			choice[i].removeAll();
		}
		composeChoice();
		cat = null;
		sub_cat = null;
		sta = null;
		name = null;
		sign = null;
		tel = null;
	}
	
	public void insert() {
		
		Bean bb = new Bean(cat, sub_cat, sta, name, sign, tel);
		
	    int cnt = dao.insert(bb);
	    
	    if(cnt == -1) {
	    	System.out.println("삽입 실패");
	    	JOptionPane.showMessageDialog(this,"삽입 실패", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    } 
	    else if (cnt == 0) {
	    	System.out.println("삽입할 Data가 없습니다");
	    	JOptionPane.showMessageDialog(this,"삽입할 Data가 없습니다", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else {
	    	System.out.println("삽입 성공");
	    	System.out.println("cnt = " + cnt);
	    }
	    
	    
	}//insert()
	
	public void update() {
		
		b_after = new Bean(cat, sub_cat, sta, name, sign, tel);
		
		int cnt = dao.update(b,b_after);
		
		if(cnt == -1) {
	    	System.out.println("수정 실패");
	    	JOptionPane.showMessageDialog(this,"수정 실패", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    } 
	    else if (cnt == 0) {
	    	System.out.println("수정할 Data가 없습니다");
	    	JOptionPane.showMessageDialog(this,"수정할 Data가 존재하지 않습니다", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else {
	    	System.out.println("수정 성공");
	    	System.out.println("cnt = " + cnt);
	    }
		
		
	}//update()
	
	///////////////////////////////////////////////////////////////
	////////////////event 구현//////////////////////////////////////
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		
		if(obj == choice[0]) {
			cat = choice[0].getSelectedItem();
			for(int i=0; i<4; i++) {
				if(choice[0].getSelectedIndex() == i) {
					choice[1].removeAll();
					for(int j=0; j<subcatName[i].length; j++) {
						choice[1].add(subcatName[i][j]);
					}
				}
			}
		}
		else if(obj == choice[1]) {
			sub_cat = choice[1].getSelectedItem();
		}
		else {//choice[2]
			sta = choice[2].getSelectedItem();
		}
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
	
		if(obj == sta_modify) {
			staGui = new StaModifyGUI();
			
		}
		else if(obj == insert) {
			cat = choice[0].getSelectedItem();
			sub_cat = choice[1].getSelectedItem();
			sta = choice[2].getSelectedItem();
			name = name_field.getText();
			tel = tel_field.getText();
			sign = textArea.getText();
			
			if((sta == null || sta.equals("")) || (cat == null || cat.equals("")) || (name == null||name.equals(""))) {
				JOptionPane.showMessageDialog(this,"입력되지 않은 값이 있습니다", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			insert();
			dispose();
			MainGUI.showall.doClick();
			MainGUI.table.addMouseListener(new MainGUI.MouseEventProc());
		}
		else if(obj == modify) {
			cat = choice[0].getSelectedItem();
			sub_cat = choice[1].getSelectedItem();
			sta = choice[2].getSelectedItem();
			name = name_field.getText();
			tel = tel_field.getText();
			sign = textArea.getText();
			
			if((sta == null || sta.equals("")) || (cat == null || cat.equals("")) || (name == null||name.equals(""))) {
				JOptionPane.showMessageDialog(this,"입력되지 않은 값이 있습니다", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			update();
			dispose();
			MainGUI.showall.doClick();
			MainGUI.table.addMouseListener(new MainGUI.MouseEventProc());
		}
		else if(obj == reset) {
			return_default();
		}
		else {//cancel
			dispose();
		}
		
	}


}
