import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;


public class MainGUI extends JFrame implements ItemListener, ActionListener{
	
	static Bean b = new Bean(null,null,null,null,null,null);
	static Dao dao = new Dao();
	ArrayList<Bean> arr;
	ArrayList<JTextField> textField;
	JLabel[] lb = new JLabel[3];
	ModifyGUI modifyGui;
	
	Container contentPane;
	static JTable table;
	static JTableHeader tableHeader;
	JScrollPane scrollPane;
	
	Choice[] choice = new Choice[3];
	JButton search, modify, delete, exit, showdetail;
	static JButton showall;
	JTextField sta_field;
	static JLabel showsta, showname;
	
	String[] catName = {"음식점","카페","놀거리"};
	String[][] subcatName = {
								{""},
								{"","한식","양식","중식","일식","그 외"},
								{""},
								{"","실내","실외"}
							};
	
//	String[] colNameE = {"cat","sub_cat","sta","name","sign","tel"};
	String[] colName = {"카테고리","세부 카테고리","인근 역","이름","특이사항","전화번호"};
	Object[][] rowData;
	
	static String cat = null;
	static String sub_cat = null;
	static String sta = null;
	static String name = null;
	static String sign = null;
	static String tel = null;
	String sch_cat = null,sch_subcat = null, sch_sta = null;
	
	static boolean flag = false;
	
	MainGUI(){
		contentPane = getContentPane();
		contentPane.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("할 것 제안 프로그램");
		setSize(700,500);
		setLocationRelativeTo(null);
		setResizable(false);
		
		arr = dao.showAll();
		
		filldata();
		compose();
		
		setVisible(true);
	
	}//Main생성자

	
	public void compose() {

		table = new JTable(rowData,colName);
		tableHeader = table.getTableHeader();
		tableHeader.setBackground(Color.lightGray);
		tableHeader.setFont(new Font("Serif",Font.BOLD,12));
		table.setFont(new Font("Serif",Font.PLAIN,12));
		table.addMouseListener(new MouseEventProc());
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10,10,670,300);
		scrollPane.setBackground(Color.lightGray);
		contentPane.add(scrollPane);
		
		for(int i=0; i<lb.length; i++) {
			lb[i] = new JLabel(colName[i]);
			lb[i].setFont(new Font("Serif",Font.BOLD,13));
		}
		
		for(int i=0; i<3; i++) {
			lb[i].setBounds(20,290+30*(i+1),100,20);
			contentPane.add(lb[i]);
		}
		
		for(int i=0; i<choice.length; i++) {
			choice[i] = new Choice();
			choice[i].setBounds(120,290+30*(i+1),130,20);
			choice[i].addItemListener(this);
			contentPane.add(choice[i]);
		}
		
		composeChoice();
		
		sta_field = new JTextField();
		sta_field.setBounds(220,380,85,24);
		contentPane.add(sta_field);
		
		search = new JButton("검색");
		search.addActionListener(this);
		modify = new JButton("추가 및 수정");
		modify.addActionListener(this);
		modify.setMargin(new Insets(0, 0, 0, 0));
		delete = new JButton("삭제");
		delete.addActionListener(this);
		exit = new JButton("종료");
		exit.addActionListener(this);
		showdetail = new JButton("자세히 보기");
		showdetail.addActionListener(this);
		showall = new JButton("전체 보기");
		showall.addActionListener(this);
		search.setMargin(new Insets(0, 0, 0, 0));
		modify.setMargin(new Insets(0, 0, 0, 0));
		delete.setMargin(new Insets(0, 0, 0, 0));
		exit.setMargin(new Insets(0, 0, 0, 0));
		showdetail.setMargin(new Insets(0, 0, 0, 0));
		showall.setMargin(new Insets(0, 0, 0, 0));
		search.setFont(new Font("Serif",Font.BOLD,12));
		modify.setFont(new Font("Serif",Font.BOLD,12));
		delete.setFont(new Font("Serif",Font.BOLD,12));
		exit.setFont(new Font("Serif",Font.BOLD,12));
		showdetail.setFont(new Font("Serif",Font.BOLD,12));
		showall.setFont(new Font("Serif",Font.BOLD,12));
		
		search.setBackground(Color.lightGray);
		modify.setBackground(Color.lightGray);
		delete.setBackground(Color.lightGray);
		exit.setBackground(Color.lightGray);
		showdetail.setBackground(Color.lightGray);
		showall.setBackground(Color.lightGray);
		
		
		search.setBounds(120,412,86,38);
		delete.setBounds(453,412,50,38);		
		modify.setBounds(517,412,86,38);
		exit.setBounds(617,412,50,38);
		showdetail.setBounds(555,320,110,30);
		showall.setBounds(20,412,86,38);
		
		contentPane.add(search);
		contentPane.add(modify);
		contentPane.add(delete);
		contentPane.add(exit);
		contentPane.add(showdetail);
		contentPane.add(showall);
		
		JPanel panel = new JPanel();
		JLabel showtitle = new JLabel("선택된 Data");
		showtitle.setFont(new Font("Serif",Font.BOLD,11));
		showsta = new JLabel("역 이름 : ");
		showsta.setFont(new Font("Serif",Font.PLAIN,9));
		showname = new JLabel("장소 이름 : ");
		showname.setFont(new Font("Serif",Font.PLAIN,9));
		panel.setBounds(453,356,212,48);
		showtitle.setBounds(456,355,160,20);
		showsta.setBounds(458,370,200,20);
		showname.setBounds(458,385,200,20);
		contentPane.add(showtitle);
		contentPane.add(showsta);
		contentPane.add(showname);
		contentPane.add(panel);
		panel.setBackground(Color.white);
		
		cat = null;
		sub_cat = null;
		sta = null;
		name = null;
		sign = null;
		tel = null;
		
	}//compose()
	
////////////////////////////////////////////////
///////////////// 1차 method////////////////////
	public void filldata() {
		int cnt=0;
		
		rowData = new Object[arr.size()][colName.length];
		for(int i=0; i<arr.size(); i++) {
			Bean bb = arr.get(i);
			rowData[i][cnt++] = bb.getCat();
			rowData[i][cnt++] = bb.getSub_cat();
			rowData[i][cnt++] = bb.getSta();
			rowData[i][cnt++] = bb.getName();
			rowData[i][cnt++] = bb.getSign();
			rowData[i][cnt++] = bb.getTel();
			cnt=0;
		}

	}//fillData()
	
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
	}//composeChoice()

///////////////////////////////////////////////////	
////////////////2차 메서드////////////////////
	public void showTable() {
		filldata();
		table = new JTable(rowData,colName);
		tableHeader = table.getTableHeader();
		tableHeader.setBackground(Color.lightGray);
		tableHeader.setFont(new Font("Serif",Font.BOLD,12));
		table.setFont(new Font("Serif",Font.PLAIN,12));
		
		scrollPane.setViewportView(table);
		
	}

	public void return_default() {
		for(int i=0; i<choice.length; i++) {
			choice[i].removeAll();
		}
		sta_field.setText(null);
		composeChoice();
		cat = null;
		sub_cat = null; 
		sta = null;
		name = null;
		sign = null;
		tel = null;
		sch_cat = null;
		sch_subcat = null;
		sch_sta = null;
		b.setCat(null);
		b.setSub_cat(null);
		b.setSta(null);
		b.setName(null);
		b.setSign(null);
		b.setTel(null);
		showsta.setText("역 이름 : ");
		showname.setText("장소 이름 : ");		
	}//retrun_ default()
	

/////////////////////////////////////////////////////
//////////////////최종 메서드///////////////////////////
	
	public void showAll() {
		arr = dao.showAll();
		showTable();
	}//showAll()
	
	public void showSelected() {

		Bean bb = new Bean();
		bb.setCat(sch_cat);
		bb.setSub_cat(sch_subcat);
		bb.setSta(sch_sta);
		
		arr = dao.showSelected(bb);
		showTable();
	}//showSelected()
	
	public void delete() {
		int cnt = dao.delete(b);
		
		if(cnt == -1) {
	    	System.out.println("삭제 실패");
	    	JOptionPane.showMessageDialog(this,"삭제 실패", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    } 
	    else if (cnt == 0) {
	    	System.out.println("삭제할 Data가 없습니다");
	    	JOptionPane.showMessageDialog(this,"삭제할 Data가 없습니다", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else {
	    	System.out.println("삭제 성공");
	    	System.out.println("cnt = " + cnt);
	    }
	}//delete()
	
////////////////////////////////////////////////////
	////////Main 메서드///////////////////
	public static void main(String[] args) {
		new LoginGUI();
		
		while(true) {
			if(flag == false) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				continue;
			}
			else {
				break;
			}
		}
		
		new MainGUI();
	}//main();
	
////////////////////////////////////////////////////////
////////////////여기서 부터 Event 구현//////////////////////
	
	static class MouseEventProc extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			
			int row = table.getSelectedRow();
			
			cat = String.valueOf(table.getValueAt(row, 0));
			sub_cat = String.valueOf(table.getValueAt(row, 1));
			sta = String.valueOf(table.getValueAt(row, 2));
			name = String.valueOf(table.getValueAt(row, 3));
			sign = String.valueOf(table.getValueAt(row, 4));
			tel = String.valueOf(table.getValueAt(row, 5));
			
			b = new Bean(cat, sub_cat, sta, name, sign, tel);
			
			showsta.setText("역 이름 : " + sta);
			showname.setText("장소 이름 : " + name);
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == showall) {
			showAll();
			return_default();
			table.addMouseListener(new MouseEventProc());
		}
		else if(obj == search) {
			String sta_f = sta_field.getText();
			if(!sta_f.equals("")) {
				sch_sta = sta_f;
			}
			if(sch_cat == null && sch_sta == null && sch_subcat == null) {
				JOptionPane.showMessageDialog(this,"값을 입력하지 않았습니다", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			showSelected();
			return_default();
			table.addMouseListener(new MouseEventProc());
			
		}
		else if(obj == modify){
			if(cat == null && sub_cat == null && sta==null && name==null && sign==null && tel ==null) {
				modifyGui = new ModifyGUI();
			}
			else {
				modifyGui = new ModifyGUI(b);
				table.clearSelection();
				return_default();
			}
		}
		else if(obj == delete) {
			delete();
			showAll();
			return_default();
			table.addMouseListener(new MouseEventProc());
		}
		else if(obj == exit) {
			System.exit(0);
		}
		else {//showdetail -자세히 보기 눌려졌을때
			if(sign != null) {
			new ShowDetailGUI(sign);
			table.addMouseListener(new MouseEventProc());
			}
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		
		if(obj == choice[0]) {
			sch_cat = choice[0].getSelectedItem();
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
			sch_subcat = choice[1].getSelectedItem();
		}
		else{
			sch_sta = choice[2].getSelectedItem();
		}
	}
	

}
