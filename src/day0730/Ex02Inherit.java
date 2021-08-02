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
		System.out.println("과일명 : " + this.name);
		System.out.println("가격 : " + this.price);
		System.out.println("색상 : " + this.color);
	}
}

public class Ex02Inherit {

	public static void main(String[] args) {
		
		Apple a1 = new Apple("사과", 1000, "green");
		a1.writData();
		
		
		
	}

}
