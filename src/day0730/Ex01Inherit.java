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
	
		System.out.println("**부모클래스로 선언시**");
		SuperObj s1 = new SuperObj();
//		s1.dispA(); //private은 같은 클래스 내에서만 호출 가능하기 때문에 에러.
		s1.dispB();
		
		System.out.println("**자식클래스로 선언시**");
		SubObj s2 =new SubObj();
//		s2.dispA(); //위와 마찬가지로 다른클래스이기도 하고 애초에 상속을 받지 못했기 때문에 에러.
		s2.dispB();
		
		
	}

}
