package day0728;

public class Ex01Object {
	//인스턴스 멤버 변수
		private String sangpum;//private : 같은 객체 내에서만 사용이 가능한 접근지정자
		int su;
		int dan;
		static String SHOPNAME="이마트";


	public static void main(String[] args) {

		Ex01Object ex1=new Ex01Object();
		ex1.sangpum="딸기";
		ex1.su=3;
		ex1.dan=1200;
		
		System.out.println("상점명:"+SHOPNAME);
		System.out.println("상품명:"+ex1.sangpum);
		System.out.println("수량:"+ex1.su);
		System.out.println("단가:"+ex1.dan);

	}

}
