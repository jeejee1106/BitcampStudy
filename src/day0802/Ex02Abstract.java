package day0802;

abstract class AbsSuper{
	public void showTitle() {
		System.out.println("�߻�޼��� ������..");
	}
	
	abstract public void dataIn();
}

class MySub extends AbsSuper {
	@Override
	public void dataIn() {
		System.out.println("�ܺηκ��� �����͸� �Է¹޴´�.");
	}
}

public class Ex02Abstract {

	public static void main(String[] args) {
		
		AbsSuper ab = new MySub();
		ab.showTitle();
		ab.dataIn();
		
		
	}

}
