import java.awt.Frame;

class Hello extends Frame{

	Hello(String frameName){
		super(frameName);
	}
	
}

public class Ex12_02_Frame {
	public static void main(String[] args) {
		Hello h = new Hello("이것은 제목");
		h.setSize(300,200);
		h.setVisible(true);
	}
}
