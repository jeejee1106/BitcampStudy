package day0802;

//인터페이스를 구현하는 클래스 정의(다중구현가능)
class Food implements FoodShop{

	@Override
	public void order() {
		System.out.println(SHOPNAME);
//		SHOPNAME="돈까스집"  //변경안됨(final이라)
		System.out.println("음식을 주문합니다");
	}

	@Override
	public void beadal() {
		System.out.println(SHOPNAME);
		System.out.println("주문한 음식을 배달합니다");
	}

}

public class EX04Interface {

	public static void main(String[] args) {
		 FoodShop f = new Food();
		 f.order();
		 f.beadal();
		
	}

}
