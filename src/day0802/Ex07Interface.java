package day0802;

interface Car{ //interface�� final�� �����Ǿ� �����Ƿ� ī����,���ǵ�� ���!!
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
		System.out.println(myCarName + "�� ���� ���ǵ�� " + mySpeed);
	}

	@Override
	public void speedDown() {
		mySpeed -= 50;
		System.out.println(myCarName + "�� ���� ���ǵ�� " + mySpeed);
	}

	@Override
	public void changeCarName() {
		myCarName = "BMW";
		System.out.println(CARNAME + "�� " + myCarName + "�� ���� ����");
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
