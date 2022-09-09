
public class ConsumerBean {
	String code;
	String cname;
	int cprice;
	String caddr;
	
	ConsumerBean(String code, String cname, int cprice, String caddr){
		setCode(code);
		setCname(cname);
		setCprice(cprice);
		setCaddr(caddr);
	}
	
	ConsumerBean(){
		
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
}
