package day0730;

class Fruit {
	String name;
	int price;
}

class Apple extends Fruit{
	String color;
	
	Apple(String name, int price, String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	public void writData() {
		System.out.println("���ϸ� : " + this.name);
		System.out.println("���� : " + this.price);
		System.out.println("���� : " + this.color);
	}
}

public class Ex02Inherit {

	public static void main(String[] args) {
		
		Apple a1 = new Apple("���", 1000, "green");
		a1.writData();
		
		
		
	}

}
