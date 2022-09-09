
public class MyJDBC_Bean {
	private String id;
	private String pw;
	
	MyJDBC_Bean(){
		
	}
	
	MyJDBC_Bean(String id, String pw){
		setId(id);
		setPw(pw);
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
