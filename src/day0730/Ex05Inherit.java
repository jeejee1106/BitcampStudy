//멤버변수는 private, 메서드는 public
package day0730;

class Shop {
	private String sangpum;
	private int su;
	
	Shop() {
		this.sangpum = "딸기";
		this.su = 5;
//		this("딸기",5); 위의 두 문장을 하나로 이렇게 줘도 됌!
	}
	
	Shop(String sangpum, int su){
		this.sangpum = sangpum;
		this.su = su;
	}
	
	public void writeShop() {
		System.out.println("상품 : " + sangpum);
		System.out.println("수량 : " + su);
	}
}

/////////////////////////////////

class My2 extends Shop {
	private int price;
	
	My2() {
		//디폴트 생성자에서는 super();가 자동으로 생성되고 동시에 생략되어있다.
		this.price = 1000;
	}
	
	My2(String sangpum, int su, int price) {
		super(sangpum, su); //부모클래스의 필드(멤버변수,인스턴스변수)가 private이기 때문에 this로 필드를 선택할 수 없다.
		this.price = price; //그럴 땐 super로 매개변수(인자,파라미터)를 줘야한다.
	}
	
	@Override
	public void writeShop() {
		System.out.println("단가 : " + price);
		super.writeShop();
	}
}

public class Ex05Inherit {

	public static void main(String[] args) {
		
		My2 my1 = new My2();
		my1.writeShop();
		System.out.println();
		My2 my2 = new My2("수박", 2, 16000);
		my2.writeShop();
		
		
		
	}

}
