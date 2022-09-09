
public class Student_kj extends Person_kj {
	
	
	private int java;
	private int jsp;
	
	Student_kj(String name, int age, int java, int jsp){
		super(name,age);
		this.java = java;
		this.jsp = jsp;
	}
	
	public String toString() {
		return super.getName() + "," + super.getAge() + "," + java + "," + jsp;
	}
	
	public String toString2() {
		return super.getAge() + "/" + java + "/" + jsp;
	}

	public int getJava() {
		return java;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	
	
}
