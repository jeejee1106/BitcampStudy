package day0802;

interface Car{ //interface는 final이 생략되어 있으므로 카네임,스피드는 상수!!
	String CARNAME = "BENZ";
	int SPEED = 100;
	
	public void speedUp();
	public void speedDown();
	public void changeCarName();
}
//////////////////////////////////////
class MyCar implements Car{
	
	String myCarName = CARNAME;
	int mySpeed = SPEED;

	@Override
	public void speedUp() {
		mySpeed += 30;
		System.out.println(myCarName + "의 현재 스피드는 " + mySpeed);
	}

	@Override
	public void speedDown() {
		mySpeed -= 50;
		System.out.println(myCarName + "의 현재 스피드는 " + mySpeed);
	}

	@Override
	public void changeCarName() {
		myCarName = "BMW";
		System.out.println(CARNAME + "를 " + myCarName + "로 차종 변경");
	}
	
}


public class Ex07Interface {
	
	public static void main(String[] args) {
		Car car = new MyCar();
		car.speedUp();
		car.speedDown();
		car.changeCarName();
	}
}
