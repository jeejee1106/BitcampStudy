package day0802;

abstract class One{
	abstract void write(); 
}

abstract class Two extends One{
	public void show() {
		System.out.println("Two가 가진 메서드");
	}
}

class Three extends Two{
	@Override
	void write() {
		System.out.println("서브- 서브클래스에서 오버라이드");
	}
}


public class EX03Abstract {

	public static void main(String[] args) {

		One a = new Three();
		a.write();
		System.out.println();
		
		Two b = new Three();
		b.show();
		b.write();
		
	}

}
