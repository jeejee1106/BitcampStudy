package day0802;

class Outer2{

	int a= 10;
	static int b = 20;

	class Orange{
		int c = 30;
		//		static int d = 40; //����Ŭ���������� static������ ����� �� ����.

		public void disp() {
			System.out.println("**�ܺ�Ŭ��������**");
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("**����Ŭ��������**");
			System.out.println("c = " + c);
			//			System.out.println("d = " + d);
		}
	}

	//static ���� Ŭ���� ����
	//�ܺ�Ŭ������ �ν��Ͻ��ʵ�(�������) ���� �Ұ���.
	static class Kiwi{
		int c = 30;
		static int d = 40;

		public void disp() {
			System.out.println("**�ܺ�Ŭ��������**");
//			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("**����Ŭ��������**");
			System.out.println("c = " + c);
			System.out.println("d = " + d);
		}
	}
	
	public void show() {
		Orange or = new Orange();
		or.disp();
		Kiwi ki = new Kiwi();
		ki.disp();
	}
	
}

public class Ex11InnerClass {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		out.show();
		
	}

}
