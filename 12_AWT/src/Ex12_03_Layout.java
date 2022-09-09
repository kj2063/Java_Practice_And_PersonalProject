import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

class Ex12_03_sub extends Frame{
	
	Ex12_03_sub(String title){
		super(title);
		setSize(400,300);
		setVisible(true);
		
		Button a = new Button("동쪽"); //버튼 중앙에 "동쪽"이 써짐
		Button west = new Button("서쪽");
		Button south = new Button("남쪽");
		Button north = new Button("북쪽");
		Button center = new Button("중앙");
		
		//LayoutManager : 어떤 방식으로 버튼을 붙일까? (버튼이 올라가는 보드:'컨테이너' /버튼:'컴포넌트')
		//배치관리자의 종류=> FlowLayout , BorderLayout, GridLayout, CardLayout  //배치관리자를 지정 안하면 자동(default)으로 BorderLayout을 배정받음 

//		super.setLayout(new FlowLayout());
		
//		this.add(east);
//		add(west);
//		super.add(south);
//		super.add(north);
//		super.add(new Button("중앙"));

		//------------------------------
		
//		setLayout(new BorderLayout());// 기본으로 BorderLayout으로 되어있으므로 안써도 된다.
		
		//add(버튼객체, BorderLayout.버튼위치(모두대문자)); 위치별 버튼 생성
//		this.add(a, BorderLayout.EAST);
//		add(west, BorderLayout.WEST);
//		super.add(south, BorderLayout.SOUTH);
//		super.add(north, BorderLayout.NORTH);
//		super.add(new Button("중앙")); //BorderLayout의 경우,  위치를 지정해 주지 않으면 중앙에 버튼이 만들어지기 때문에 버튼 5개가 포개져 있다. 마지막에쓴 "중앙"버튼이 제일 위로 온다.

		//다음과 같이 쓸 수도 있다. add("버튼위치(앞글자만 대문자)",버튼객체);
//		add("East",a);
//		add("West",west);
//		add("South",south);
//		add("North",north);
//		add("Center",center);
		
		//-----------------------------------
		
		setLayout(new GridLayout(3,2)); //3행2열로 버튼 배치 / default는 1행의 나열로 버튼 배치
		
		add(a);
		add(west);
		add(south);
		add(north);
		add(center);
	
	}
	
}//

public class Ex12_03_Layout {
	public static void main(String[] args) {
		Ex12_03_sub ex = new Ex12_03_sub("Ex12_03_Layout");
		
		
	}
}
