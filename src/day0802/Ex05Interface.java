package day0802;

interface InterA{
	public void play();
}

interface InterB extends InterA {
	public void show();
}

class MyInter implements InterB{
	@Override
	public void play() {
		System.out.println("play");
	}
	
	@Override
	public void show() {
		System.out.println("show");
	}
}

public class Ex05Interface {

	public static void main(String[] args) {
		
		System.out.println("InterA�� ������ ���");
		InterA a = new MyInter();
		a.play();
		
		System.out.println();
		System.out.println("InterB�� ������ ���");
		InterB b = new MyInter();
		b.play();
		b.show();
	}

}
