
public class Bean {
	String code;
	String cname;
	int cprice;
	String caddr;
	String pname;
	int pprice;
	
	Bean(String code, String cname, int cprice, String caddr, String Pname, int PPrice){
		setCode(code);
		setCname(cname);
		setCprice(cprice);
		setCaddr(caddr);
		setPname(Pname);
		setPprice(PPrice);
	}
	
	Bean(){
		
	}
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
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
