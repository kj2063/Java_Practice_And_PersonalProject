
public class ProducerBean {
	String pcode;
	String pname;
	int pprice;
	
	ProducerBean(String pcode, String Pname, int PPrice){
		setPcode(pcode);
		setPname(Pname);
		setPprice(PPrice);
	}
	
	ProducerBean(){
		
	}
	
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pode) {
		this.pcode = pode;
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
	
	
}
