
public class BookBean {
	
	private int no;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String pub_day;
	
	
	
	BookBean(int no, String title, String author, String publisher, int price, String pub_day){
		setNo(no);
		setTitle(title);
		setAuthor(author);
		setPublisher(publisher);
		setPrice(price);
		setPub_day(pub_day);
	}
	
	BookBean(){
		
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPub_day() {
		return pub_day;
	}
	public void setPub_day(String pub_day) {
		this.pub_day = pub_day;
	}
	
	
	
	
}
