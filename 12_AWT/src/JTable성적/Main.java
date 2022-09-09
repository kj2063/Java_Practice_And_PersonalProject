package JTable����;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
	Vector<String> colName;
	Vector<Vector<String>> data;
	BufferedReader br;
	JTable table;
	JScrollPane scrollPane;
	JButton add,delete,print,exit;
	Container contentPane;
	
	JTextField[] tf = new JTextField[4];
		
	int count=1;
	
	Main(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,300);
		
		colName = new Vector<String>();
		data = new Vector<Vector<String>>();
		
		getFile();
		compose();
		
		setVisible(true);
	}//������
	
	
	
	
	
	private void compose() {
		
		contentPane = getContentPane();
		contentPane.setLayout(null);//Layout ���� �ʰڴ�
		
		table = new JTable(data,colName);
		scrollPane = new JScrollPane(table);
		
//		contentPane.add("Center",scrollPane);//�̰��� ���ð� �Ǵµ�, ������ ȭ�鿡 �ȳ���. �׷� �����?
		contentPane.add(scrollPane);
		
		scrollPane.setBounds(250,30,400,200);//250,30 =>table ���ʻ�� �������� ��ġ  400,300 =>table�� ũ��
		
		String[] colName = {"�̸� :","���� :","���� :","���� :"};
		
		for(int i=0; i<4; i++) {
			JLabel lb = new JLabel();
			lb.setText(colName[i]);
			lb.setBounds(10,(i+1)*30,90,20);
			contentPane.add(lb);
			
			tf[i] = new JTextField();
			tf[i].setBounds(70,(i+1)*30,90,20);
			contentPane.add(tf[i]);
		}
		
		add = new JButton("�߰�");
		delete = new JButton("����");
		print = new JButton("ȭ�����");
		exit = new JButton("����");
		
		add.addActionListener(new AddActionListener(tf,table));
		delete.addActionListener(new RemoveActionListener(table));
		print.addActionListener(new FilePrint(table));
		exit.addActionListener(this);		
		
		add.setBounds(10,160,90,20);
		delete.setBounds(110,160,90,20);
		print.setBounds(10,190,90,20);
		exit.setBounds(110,190,90,20);
		
		contentPane.add(add);
		contentPane.add(delete);
		contentPane.add(print);
		contentPane.add(exit);
	}





	private void getFile() {
		
		try {
			br = new BufferedReader(new FileReader("c:\\sun\\table.txt"));
			
			String line;
			while((line = br.readLine()) != null) {
				JTableMake(line);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//getFile()





	private void JTableMake(String line) {
		
		String[] tokens = line.split("/");
		if(count++==1) {
			for(int i=0; i<tokens.length; i++) {
				colName.add(tokens[i]);
			}
		}
		else {
			Vector<String> one = new Vector<String>();
			for(int i=0; i<tokens.length; i++) {
				one.add(tokens[i]);
			}
			data.add(one);
		}
		
	}//JTableMake()

	



	public static void main(String[] args) {
		new Main("���� ó�� ���α׷�");
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}




