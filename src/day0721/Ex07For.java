package day0721;

public class Ex07For {

	public static void main(String[] args) {

//		for(int i = 1; i<=5; i++) --> i�� for�� �ȿ��� �����߱� ������ for���� ������ �����ʹ� �������.
//		��, for�������� �ڵ忡 i��� ������ ����� �� �ִ�.
//		for���� �ִ� i�� for���� ���� �Ŀ��� ����ϰ� �ʹٸ� ������ for�� �ۿ��� �ϸ� �ȴ�.
		
		//������ for�� �ۿ��� ���� --> �������� �ڵ���� ���� i�� ����� �� ����.
		int i;
		for(i=1; i<=10; i++) {
			System.out.println(i);
		} System.out.println("for���� �������� ���� i�� : "+i);
		
		
		//������ ����� �ʱ�ȭ�� for�� �ۿ��� --> �������� �ڵ���� ���� a�� ����� �� ����.
		int a = 10;
		for(;a<=50;a+=5) {
			System.out.println(a);
		} System.out.println("for���� �������� ���� a��: " + a);
		
		
		//hello�� 5�� ���
		//for(int j = 4; j>=0; j--) �� �Ʒ��� ������ ���� ������� ����Ѵ�.
		for(int j = 0; j<=4; j++) {
			System.out.println("hello");
		}
		
		
		//1~10�� ¦���� ���
		System.out.println("<<1~10�� ¦���� ���>>");
		for(int j = 2; j<=10; j+=2) {
			System.out.println(j);
		}
		
		
		
	}

}
