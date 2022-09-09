import java.awt.Color;

import java.awt.Container;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ProductMain extends JFrame implements ActionListener/*, MouseListener*/{
	
	String[] colName = {"아이디","이름","입고수량","단가","카테고리","입고일자"};
	Object[][] rowData; //문자열,숫자 모두 담기 위해 Object로 타입 지정
	ProductDao pdao = new ProductDao();
	JTable table = null;
	JScrollPane scrollPane = null;
	
	ArrayList<ProductBean> lists = null;
	
	String[] title = {"등록", "수정", "삭제", "종료"};
	JButton[] button = new JButton[title.length];
	
	JTextField[] textField = new JTextField[6];
	
	
	ProductMain(String title){
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,650);
		setResizable(false);//크기조절 못하게 함
		
		lists = pdao.showAllProduct();
//		rowData = new Object[lists.size()][colName.length];
		
		fillData();
		compose();
		
		setVisible(true);
	}//ProductMain 생성자
	
	public void compose() {
		Container contentPane = getContentPane();
		table = new JTable(rowData,colName);
		table.addMouseListener(new MouseEventProc());
		scrollPane = new JScrollPane(table);
		contentPane.add("North",scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);
		contentPane.add("Center",panel);
		
		JLabel lbId = new JLabel("아이디");
		JLabel lbName = new JLabel("이름");
		JLabel lbStock = new JLabel("입고수량");
		JLabel lbPrice = new JLabel("단가");
		JLabel lbCategory = new JLabel("카테고리");
		JLabel lbInputdate = new JLabel("입고일자(yyyy/mm/dd)");
		
		panel.setLayout(null);
		
		lbId.setBounds(15,20,80,15);
		lbName.setBounds(15,40,80,15);
		lbStock.setBounds(15,60,80,15);
		lbPrice.setBounds(15,80,80,15);
		lbCategory.setBounds(15,100,80,15);
		lbInputdate.setBounds(15,120,160,15);
		
		
		for(int i=0; i<textField.length; i++) {
			textField[i] = new JTextField();
		
			textField[i].setBounds(160,20*(i+1),100,18);
			panel.add(textField[i]);
		}
		textField[0].setText("자동입력");
		textField[0].setEnabled(false);
		
		panel.add(lbId);
		panel.add(lbName);
		panel.add(lbStock);
		panel.add(lbPrice);
		panel.add(lbCategory);
		panel.add(lbInputdate);
		
		JPanel spanel = new JPanel();
		spanel.setLayout(new GridLayout(1,4));
		contentPane.add("South",spanel);
		
		for(int i=0; i<title.length; i++) {
			button[i] = new JButton(title[i]);
			button[i].addActionListener(this);
			spanel.add(button[i]);
		}
		
	}//compose()
	
	class MouseEventProc extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
//			System.out.println("마우스 클릭됨");
			
			int row = table.getSelectedRow();// 선택된 행의 index번호를 row변수에 넣음.
//			System.out.println("row : " + row);
			for(int i=0; i<textField.length; i++) {
				textField[i].setText(String.valueOf(table.getValueAt(row, i)));  
			}
		}
	}
	
	public void fillData() {//Jtable 내용 채우는 메서드
		
		int cnt = 0;
		
		rowData = new Object[lists.size()][colName.length];
		for(int i=0; i<lists.size(); i++) {
			ProductBean bean = lists.get(i);
			rowData[i][cnt++] = bean.getId();
			rowData[i][cnt++] = bean.getName();
			rowData[i][cnt++] = bean.getStock();
			rowData[i][cnt++] = bean.getPrice();
			rowData[i][cnt++] = bean.getCategory();
			rowData[i][cnt++] = bean.getInputdate();
			cnt = 0;
		}
		
	}//fillData
	
	public static void main(String[] args) {
		new ProductMain("상품 관리 프로그램");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("actionPerformed");
		Object obj = e.getSource();
		if(obj == button[0]) {//등록
			insertData();
			clearTextField();
			table.addMouseListener(new MouseEventProc());
		}
		else if (obj == button[1]) {//수정
			updateData();
			clearTextField();
			table.addMouseListener(new MouseEventProc());
		}
		else if (obj == button[2]) {//삭제
			deleteData();
			clearTextField();
			table.addMouseListener(new MouseEventProc());
		}
		else {//종료
			System.exit(0);
		}

	}//actionPerformed
	
	public void deleteData() {
		int row = table.getSelectedRow();

		if(row==-1) {
			JOptionPane.showMessageDialog(this,"삭제할 행을 선택하세요", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		int id = (Integer)table.getValueAt(row, 0);
		int cnt = pdao.deleteProduct(id);
		
		
		if(cnt == -1) {
			System.out.println("삭제 실패");
		}else if(cnt == 0){
			System.out.println("삭제할 Data가 없습니다.");
		}else {
			System.out.println("삭제 성공");
			getAllProducts();
		}
		
	}//deleteData()
	
	public void updateData() {
		String id = textField[0].getText();
		String name = textField[1].getText();
		String stock = textField[2].getText();
		String price = textField[3].getText();
		String category = textField[4].getText();
		String inputdate = textField[5].getText();
		
		ProductBean bean = new ProductBean();
		bean.setId(Integer.parseInt(id));
		bean.setName(name);
		bean.setStock(Integer.parseInt(stock));
		bean.setCategory(category);
		bean.setPrice(Integer.parseInt(price));
		bean.setInputdate(inputdate);
		
		int cnt = pdao.updateProduct(bean);
		
		if(cnt == -1) {
			System.out.println("삽입 실패");
			
		}else if(cnt == 0){
			System.out.println("삽입할 Data가 없습니다.");
		}else {
			System.out.println("삽입 성공");
			getAllProducts();

		}
	}
	
	public void insertData() {
		
		checkData();
		String id = textField[0].getText();
		String name = textField[1].getText();
		String stock = textField[2].getText();
		String price = textField[3].getText();
		String category = textField[4].getText();
		String inputdate = textField[5].getText();
		
		ProductBean bean = new ProductBean();
		bean.setName(name);
		bean.setStock(Integer.parseInt(stock));
		bean.setCategory(category);
		bean.setPrice(Integer.parseInt(price));
		bean.setInputdate(inputdate);
		
		int cnt = pdao.addProduct(bean);
		
		if(cnt == -1) {
			System.out.println("삽입 실패");
		}else {
			System.out.println("삽입 성공");
			getAllProducts();
		}
	}//insertData()
	
	public void checkData() {
		if(textField[1].getText().length() == 0) {
			JOptionPane.showMessageDialog(this,"상품명을 입력하세요", "에러 발생", JOptionPane.INFORMATION_MESSAGE);
			textField[1].requestFocus();
			return;
		}
		if(textField[2].getText().length() == 0) {
			JOptionPane.showMessageDialog(this,"입고수량을 입력하세요", "에러 발생", JOptionPane.ERROR_MESSAGE);
			textField[2].requestFocus();
		}
	}
	
	public void clearTextField() {
		for(int i=0; i<textField.length; i++) {
			textField[i].setText("");
		}
	}//clearTextField()
	
	public void getAllProducts() {
		lists = pdao.showAllProduct();
		
		fillData();
		table = new JTable(rowData,colName);
		
//		scrollPane.remove(table);
//		table.revalidate();
//		table.repaint();
		scrollPane.setViewportView(table);//이미 scrollPane에 올라가 있는 table을 다른 table로 바꿈
	
	}//getAllProducts
	
	/*
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	*/
	
}//end class
