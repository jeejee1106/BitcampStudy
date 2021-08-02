package day0730;
class Car{
	private String carName;
	private String carColor;
	
	public Car() {
		super();
	}

	public Car(String carName, String carColor) {
		super();
		this.carName = carName;
		this.carColor = carColor;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public void writeCar() {
		System.out.println("�� ���� " + carName + "�̰� " + carColor + " �Դϴ�.");
	}
}
///////////////////////////////////////////
class MyCar extends Car{
	private int price;

	public MyCar() {
		super();
	}

	public MyCar(String carName, String carColor, int price) {
		super(carName, carColor);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public void writeCar() {
		// TODO Auto-generated method stub
		super.writeCar();
		System.out.println("�� ���� ������ " + price + "�� �Դϴ�.");
	}
	
}
public class EX08Inherit_Generate {

	public static void main(String[] args) {
		
		System.out.println("**����Ʈ�� ����**");
		MyCar m1 = new MyCar();
		m1.writeCar();
		System.out.println();
		
		System.out.println("**�Ű��������� �ְ� ����**");
		MyCar m2 = new MyCar("BENZ", "������", 5000);
		m2.writeCar();
		System.out.println();
		
		System.out.println("**ù��° Car�� �� �����غ���**");
		m1.setCarName("BMW");
		m1.setCarColor("���");
		m1.setPrice(10000);
		m1.writeCar();
		
	}

}
