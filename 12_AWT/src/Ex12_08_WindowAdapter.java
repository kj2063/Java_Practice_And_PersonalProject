import java.awt.*;
import java.awt.event.*;

class Ex12_08_sub extends Frame implements WindowListener{
	Ex12_08_sub(){
		setSize(400,500);
		setVisible(true);
		
		//this.addWindowListener( ... );
		addWindowListener(
				new WindowAdapter() {// WindowAdapter() 메서드를 이용하여 필요한 메서드만 구현 //WindowAdapter Interface를 익명(class)구현 [Ex12_09 , Ex07_14 참고]
					public void windowClosing(WindowEvent e) {
						System.out.println("X버튼 클릭함");
						System.exit(0); 
					}//windowClosing
					
					public void windowActivated(WindowEvent e) {
						System.out.println("창이 활성화 됨");
					}
				}// 객체 생성
				
				);

	
	
	}
}


public class Ex12_08_WindowAdapter {

	public static void main(String[] args) {
		new Ex12_08_sub();
		
		
	}

}
