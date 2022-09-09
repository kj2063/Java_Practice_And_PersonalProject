package ����;

enum Week {  //public enum(class X) ����Ÿ���̸� { ...} //����Ÿ���� �����ϱ� ���� Ű����
	������,			//����Ÿ���̸��� �ҽ� ���ϸ�� ��ҹ��ڰ� ��� ��ġ�ؾ� �Ѵ�.	   	
	ȭ����,						   
	������,
	�����,
	�ݿ���,			//���� ���� ����� ���� �ܾ�� ������ ��쿡�� �ܾ� ���̸� ���ٷ� �����ϴ°��� �����̴�.
	�����,			//ex) ������_ȭ����
	�Ͽ���
}

/*
class Fruit {
	public Static final Fruit APPLE = new Fruit();
	public Static final Fruit PEACH = new Fruit();
	public Static final Fruit BANANA = new Fruit();
}
*/
// enum�� ���� ������ ���� �����ϰ� ��Ÿ �� �� �ִ�. + �߰� ���� ����
enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	public String color;
	Fruit(String color){
		System.out.println("Call constructor " + this); // enum�� ��ǻ� class, ������(constructor)�� ���� �� �ִ�.
		this.color = color;								// �����ڴ� Fruit ������ ����ǰ� �ʱ�ȭ �ɶ� ���Ż���� �� ��ŭ ����ȴ�.
	}													// �غôµ� ���� �Ҷ��� ������ �ȵȴ�.
}	

public class p171_����Ÿ�� {
	public static void main(String[] args) {
		//enumeration type(enum) ����Ÿ��
		//����: ��ȭ���������  ����:�����������ܿ�
		//�̿Ͱ��� ������ ������ ���� ������ Ÿ���� ����Ÿ���̶�� �Ѵ�.
		
		//�������� ����� => enum Week ����.
		//�ٸ� �ҽ� ������ ����� enum�� �����Ҷ��� public enum Week{...} ��� ����. 
		//�׸��� ���� package ���� ���Ͼȿ� �����Ҷ� public enum ~���� ���� �ϸ� ������ �ߴµ�
		//?? �� ���� ��Ű���� �ִµ� public�� ���ٰ� ������ ����? ���� �� �𸣰ڴ�.
		
		
		Week today = Week.������;
		// ���� Ÿ���� class�� �ٸ��� new�� ����Ͽ� ���� ���� �ʳ�?
		Week[] weekarr = Week.values(); // .values()�� ����ϸ� �̷��� array�� ���� ����� ������ �� �ִ�.
		
		
		System.out.println(today); //������
		
		for(int i=0; i<weekarr.length;i++) 
			System.out.print(weekarr[i] + " ");
		
		//=============================================
		System.out.println("\n======================");
		
		for(Fruit type : Fruit.values()) {
			switch(type) {
			case APPLE:
				System.out.println("����� = " + Fruit.APPLE.color);
				break;
			case PEACH:
				System.out.println("�����ƻ� = " + Fruit.PEACH.color);
				break;
			case BANANA:
				System.out.println("�ٳ����� = " + Fruit.BANANA.color);
				break;
			default:
				System.out.println("�־��� ������ �ƴմϴ�.");
			}
		}
		
		System.out.println("======================");
		System.out.println("�׿��� ���� ����_mthod");
		
		System.out.println("Fruit.APPLE.name() : " + Fruit.APPLE.name());  // .name() �� ���� ����Ÿ���� ���� �Ҷ� ����� ��� �̸��� ����
		System.out.println("Week.�ݿ���.ordinal() : " + Week.�ݿ���.ordinal()); //��ü ���� ��ü �� ���° ���� ��ü���� �˷��ش� 
		
		Week �� = Week.������;
		Week �� = Week.������;
		int result1 = ��.compareTo(��);
		int result2 = ��.compareTo(��);
		System.out.println("��.compareTo(��) : " + result1 ); //�Ű� ������ �־��� ���� ��ü�� �������� �� �ķ� ���° ��ġ�ϴ��� ��.
		System.out.println("��.compareTo(��) : " + result2 );
		
		Week weekday = Week.valueOf("ȭ����");
		System.out.println("Week.valueof(\"ȭ����\") : " + weekday ); // �Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� ����.
																	// Week ���� ���� ��ü�� �����Ͽ� ���
		
		
	}
}
