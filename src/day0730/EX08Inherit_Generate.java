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
		System.out.println("내 차는 " + carName + "이고 " + carColor + " 입니다.");
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
		System.out.println("내 차의 가격은 " + price + "원 입니다.");
	}
	
}
public class EX08Inherit_Generate {

	public static void main(String[] args) {
		
		System.out.println("**디폴트로 생성**");
		MyCar m1 = new MyCar();
		m1.writeCar();
		System.out.println();
		
		System.out.println("**매개변수값을 주고 생성**");
		MyCar m2 = new MyCar("BENZ", "검정색", 5000);
		m2.writeCar();
		System.out.println();
		
		System.out.println("**첫번째 Car의 값 수정해보기**");
		m1.setCarName("BMW");
		m1.setCarColor("흰색");
		m1.setPrice(10000);
		m1.writeCar();
		
	}

}
