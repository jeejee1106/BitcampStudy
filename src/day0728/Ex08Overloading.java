package day0728;
//�޼��� �����ε� ����
public class Ex08Overloading {
	public static int sum(int a,int b) {
		System.out.println("1��° �Լ� ȣ��");
		return a+b;
	}
	
	public static double sum(int a,double b) {
		System.out.println("2��° �Լ� ȣ��");
		return a+b;
	}
	
	public static double sum(double a,int b) {
		System.out.println("3��° �Լ� ȣ��");
		return a+b;
	}
	
	public static double sum(double a,double b) {
		System.out.println("4��° �Լ� ȣ��");
		return a+b;
	}
	public static void main(String[] args) {
		
		//����Ÿ�Կ� ���� �ڵ����� �ߺ��Լ��� ȣ��ȴ�
		System.out.println(sum(3,4));
		System.out.println(sum(3.5,4));
		System.out.println(sum(3,4.4));
		System.out.println(sum(3.1,4.3));		
	}

}