package day0802;

abstract class AbsSuper{
	public void showTitle() {
		System.out.println("추상메서드 공부중..");
	}
	
	abstract public void dataIn();
}

class MySub extends AbsSuper {
	@Override
	public void dataIn() {
		System.out.println("외부로부터 데이터를 입력받는다.");
	}
}

public class Ex02Abstract {

	public static void main(String[] args) {
		
		AbsSuper ab = new MySub();
		ab.showTitle();
		ab.dataIn();
		
		
	}

}
