package day0802;

class Outer{
	
	String name = "�ȼ���";
	int age = 20;
	
	class Inner1{ //����Ŭ����1
		public void disp1() { //����Ŭ���������� �ܺ�Ŭ������ ���� ����� �����ϴ�.
			System.out.println("**Inner1 ����Ŭ����**");
			System.out.println("�̸� : " + name + "���� : " + age);
		}
	}
	
	class Inner2{ //����Ŭ����2
		public void disp2() { //����Ŭ���������� �ܺ�Ŭ������ ���� ����� �����ϴ�.
			System.out.println("**Inner2 ����Ŭ����**");
			System.out.println("�̸� : " + name + "���� : " + age);
		}
	}
	
	//�ܺ�Ŭ������ �޼��� �߰�
	public void disp() {
		//�ܺ�Ŭ������ �޼��忡�� ����Ŭ���� �����ϴ� ���
		Inner1 in1 = new Inner1();
		in1.disp1();
		
		Inner2 in2 = new Inner2();
		in2.disp2();
	}
}

public class Ex10InnerClass {
	
	public static void main(String[] args) {
		Outer out = new Outer();
		out.disp();
		
		//�ٸ� Ŭ�������� �ܺθ� ������ �ʰ����� ���� Ŭ������ �޼ҵ带 ȣ���Ϸ���");
		Outer.Inner1 in1 = new Outer().new Inner1();
		in1.disp1();
		
		Outer.Inner2 in2 = out.new Inner2();  //������ ���� �ڵ�. �������� ����� ����.
		in2.disp2();
		
		
	}
}
