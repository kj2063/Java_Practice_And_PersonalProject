import java.awt.Frame;

public class Ex12_01_Frame {
	public static void main(String[] args) {
		/*
		CUI : 명령어를 직접 입력해야 하는 방식 ex)terminal
		GUI : 명령어 위주가 아닌 아이콘을 통한 대화방식
		//프레임에 버튼을 만들어 대화
		*/
		
		Frame f = new Frame("Frame 만들기"); //Frame(String frameName)
		f.setSize(400,300); // 가로는 400, 세로는 300의 크기의 frame을 만듬 
		f.setVisible(true);
		f.setLocation(100,300); //frame생성시 frame의 왼쪽 상단의 꼭지점 위치 / 화면의 왼쪽 위 끝이 0,0인데 가로로 100, 세로로(아래로)300 위치한곳에 Frame 생성
		
	
	
	
	}
}
