package day0730;

class Color {
	public void hello() {
		System.out.println("�ٵ� �ȳ��Ͻʴϱ�������!");
	}
}

class Red extends Color {
	public void process() {
		System.out.println("���� ��� ���� ���������� ĥ�ϴ� ���� �Ұ�~");
	}
}

class White extends Color {
	public void process() {
		System.out.println("���� ��� ���� �Ͼ������ ĥ�ϴ� ���� �Ұ�~");
	}
}


public class Ex09Inherit_Polymorphism {

	public static void main(String[] args) {
		
		System.out.println("Red�� �����ϰ� Red�� ������ ���");
		Red red = new Red();
		red.hello();
		red.process();
		System.out.println();
		
		System.out.println("White�� �����ϰ� White�� ������ ���");
		White wh = new White();
		wh.hello();
		wh.process();
		System.out.println();
		
		System.out.println("Color�� �����ϰ� Red�� ������ ���");
		Color c1 = new Red();
		c1.hello();
//		c1.process(); 
		/* @@�θ�� �����ϰ� �ڽ� Ŭ������ �����ϴ� ���?@@
		 * �θ� ������ �ִ� �޼��� ȣ�� ok
		 * �޼��尡 �������̵� �� ��� ȣ�� ok
		 * �θ����� ���� �ڽĸ� ������ �ִ� �޼���� ȣ�� xxx!!!		
		 */
		
	}

}
