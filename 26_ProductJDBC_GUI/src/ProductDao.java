import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			System.out.println("드라이버 로드 성공");
			
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB 로그인 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 로그인 실패");
		}
	}//ProductDao 생성자
	
	public int deleteProduct(int id) {
		int count = -1;
		PreparedStatement ps = null;
		sql = "delete products where id=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			count = ps.executeUpdate();
			
			if(count == -1)
				System.out.println("삭제 실패");
			else if(count == 0)
				System.out.println("삭제할 데이터가 없습니다");
			else
				System.out.println("삭제 성공");
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return count;
	}
	
	
	public int updateProduct(ProductBean pb) {
		int count = -1;
		PreparedStatement ps = null;
		sql ="update products set name=?,stock=?,price=?,category=?,inputdate=? where id=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,pb.getName());
			ps.setInt(2,pb.getStock());
			ps.setInt(3,pb.getPrice());
			ps.setString(4,pb.getCategory());
			ps.setString(5,pb.getInputdate());
			ps.setInt(6,pb.getId());
			
			
			count = ps.executeUpdate();
			
			if(count == -1)
				System.out.println("수정 실패");
			else if(count == 0)
				System.out.println("수정할 데이터가 없습니다");
			else
				System.out.println("수정 성공");
			
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}
	
	
	public int addProduct(ProductBean pb) {
		int count = -1;
		PreparedStatement ps = null;
		sql = "insert into products values(prdseq.nextval,?,?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, pb.getName());
			ps.setInt(2, pb.getStock());
			ps.setInt(3, pb.getPrice());
			ps.setString(4, pb.getCategory());
			ps.setString(5, pb.getInputdate());
			
			
			count = ps.executeUpdate();
			
			
				
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return count;
	}//addProduct()
	
	
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
	}//showProduct_cat
	
	
	
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
	}//showProdcut_id
	

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
				Date s = rs.getDate("inputdate");
				String inputdate = String.valueOf(s);
				
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

}
