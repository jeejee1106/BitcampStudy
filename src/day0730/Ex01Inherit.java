package day0730;

class SuperObj{
	private void dispA() {
		System.out.println("super-private");
	}
	public void dispB() {
		System.out.println("super-public");
	}
}
//////////////////////////////////////////////////
class SubObj extends SuperObj{
	
}
/////////////////////////////////////////////////
public class Ex01Inherit {

	public static void main(String[] args) {
	
		System.out.println("**�θ�Ŭ������ �����**");
		SuperObj s1 = new SuperObj();
//		s1.dispA(); //private�� ���� Ŭ���� �������� ȣ�� �����ϱ� ������ ����.
		s1.dispB();
		
		System.out.println("**�ڽ�Ŭ������ �����**");
		SubObj s2 =new SubObj();
//		s2.dispA(); //���� ���������� �ٸ�Ŭ�����̱⵵ �ϰ� ���ʿ� ����� ���� ���߱� ������ ����.
		s2.dispB();
		
		
	}

}
