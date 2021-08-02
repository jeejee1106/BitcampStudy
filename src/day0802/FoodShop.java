package day0802;

public interface FoodShop {
	//인터페이스에는 상수와 추상메서드만 선언가능하다.
	//final이나 abstract는 생략
	String SHOPNAME = "백반집";
	
	public void order(); //추상메서드들
	public void beadal();
}
