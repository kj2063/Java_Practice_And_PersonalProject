
public class Ex04_01_1���� {
	public static void main(String[] args) {
		//�ϳ��� �������� ���� type�� ���� ���� �� �ִ�
		//int a=10, b=20, c=30, d=40;
		//double x = 1.2;
		//�迭�� �޸𸮴� ���������� ������. ���� �� ���� ��ġ������ �˸� ������ �迭�� ���� ã�� �� �ִ�.
		
		
		int[] arr = {10,20,30,40};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]+"\n");
		
		System.out.println(arr);//arr�� �ּ�
		System.out.println(arr.length + "\n");//arr�� ���� ���
		
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
