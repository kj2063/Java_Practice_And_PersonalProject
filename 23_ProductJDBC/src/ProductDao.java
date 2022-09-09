import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class ProductDao {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	Connection conn;
	String sql;
	
	ProductDao(){
		try {
			Class.forName(driver);
			System.out.println("����̹� �ε� ����");
			
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB �α��� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB �α��� ����");
		}
	}//ProductDao ������
	
	public void deleteProduct(int id) {
		sql = "delete products where id=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			int count = -1;
			count = ps.executeUpdate();
			
			if(count == -1)
				System.out.println("���� ����");
			else if(count == 0)
				System.out.println("������ �����Ͱ� �����ϴ�");
			else
				System.out.println("���� ����");
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateProduct(ProductBean pb) {
		sql ="update products set name=?,stock=?,price=?,category=?,inputdate=? where id=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,pb.getName());
			ps.setInt(2,pb.getStock());
			ps.setInt(3,pb.getPrice());
			ps.setString(4,pb.getCategory());
			ps.setString(5,pb.getInputdate());
			ps.setInt(6,pb.getId());
			
			int count = -1;
			count = ps.executeUpdate();
			
			if(count == -1)
				System.out.println("���� ����");
			else if(count == 0)
				System.out.println("������ �����Ͱ� �����ϴ�");
			else
				System.out.println("���� ����");
			
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void addProduct(ProductBean pb) {
		
		sql = "insert into products values(prdseq.nextval,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, pb.getName());
			ps.setInt(2, pb.getStock());
			ps.setInt(3, pb.getPrice());
			ps.setString(4, pb.getCategory());
			ps.setString(5, pb.getInputdate());
			
			int count;
			count = ps.executeUpdate();
			
			if(count == 0)
				System.out.println("��ǰ �߰� ����");
			else
				System.out.println("��ǰ �߰� ����");
				
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<ProductBean> showProduct_cat(String category1) {
		ArrayList<ProductBean> arr = new ArrayList<ProductBean>();
		
		sql = "select * from products where category=? order by id";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,category1);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				String inputdate = rs.getString("inputdate");
				
				ProductBean pb = new ProductBean(id,name,stock,price,category,inputdate);
				arr.add(pb);
			}
			
			ps.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arr;
	}
	
	
	
	public ProductBean showProduct_id(int num) {
		ProductBean pb = null;
		
		sql = "select * from products where id=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,num);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				String inputdate = rs.getString("inputdate");
				
				pb = new ProductBean(id,name,stock,price,category,inputdate);
			}
			
			ps.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pb;
	}
	

	public ArrayList<ProductBean> showAllProduct(){
		ArrayList<ProductBean> arr = new ArrayList<ProductBean>();

		sql = "select * from products order by id";
		
		try {

			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				String inputdate = rs.getString("inputdate");
				
				ProductBean pb = new ProductBean(id,name,stock,price,category,inputdate);
				arr.add(pb);
			}
			
			ps.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arr;
	}//showAllProduct

}//Class end
