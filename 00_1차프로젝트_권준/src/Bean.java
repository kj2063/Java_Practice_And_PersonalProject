
public class Bean {
	String cat;
	String sub_cat;
	String sta;
	String name;
	String sign;
	String tel;
	
	public Bean(String cat, String sub_cat, String sta, String name, String sign, String tel) {
		this.cat = cat;
		this.sub_cat = sub_cat;
		this.sta = sta;
		this.name = name;
		this.sign = sign;
		this.tel = tel;
	}
	
	Bean(){
		
	}
	
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getSub_cat() {
		return sub_cat;
	}
	public void setSub_cat(String sub_cat) {
		this.sub_cat = sub_cat;
	}
	public String getSta() {
		return sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
