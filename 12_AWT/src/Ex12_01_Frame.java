import java.awt.Frame;

public class Ex12_01_Frame {
	public static void main(String[] args) {
		/*
		CUI : ��ɾ ���� �Է��ؾ� �ϴ� ��� ex)terminal
		GUI : ��ɾ� ���ְ� �ƴ� �������� ���� ��ȭ���
		//�����ӿ� ��ư�� ����� ��ȭ
		*/
		
		Frame f = new Frame("Frame �����"); //Frame(String frameName)
		f.setSize(400,300); // ���δ� 400, ���δ� 300�� ũ���� frame�� ���� 
		f.setVisible(true);
		f.setLocation(100,300); //frame������ frame�� ���� ����� ������ ��ġ / ȭ���� ���� �� ���� 0,0�ε� ���η� 100, ���η�(�Ʒ���)300 ��ġ�Ѱ��� Frame ����
		
	
	
	
	}
}
