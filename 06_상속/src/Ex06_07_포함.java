class Member{
	private String name;
	private int age;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String getName(){
		return name;
	}
	
	int getAge() {
		return age;
	}
}

class Idol{
	private String team;
	private int inwon;
	Member mb;
	
	Idol (String team, int inwon,String name, int age){
		this.team = team;
		this.inwon = inwon;
		mb = new Member(name,age);
	}
	
	/*
	void display() {
		System.out.println(team + " " + inwon + " " + mb.getName() + " " + mb.getAge());
	}
	*/
	
	String getTeam() {
		return team;
	}
	
	int getInwon() {
		return inwon;
	}
}


public class Ex06_07_포함 {
	public static void main(String[] args) {
		Idol i = new Idol("소녀시대",9,"효현",42);

//		i.display();
		System.out.println(i.getTeam() + " " + i.getInwon() + " " + i.mb.getName() +" "+ i.mb.getAge());
	}
}
