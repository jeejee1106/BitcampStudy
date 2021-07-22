package day0722;

public class Ex07While {

	public static void main(String[] args) {

		System.out.println("<while은 선조건, do-while은 후조건>");
		System.out.println("----while문----");
		int a= 10;
		while(a<10) { //조건 자체가 false인 경우 한 번도 실행 안함
			System.out.println(a++);
		}
		
		System.out.println("----do-while문----");
		int b = 10;
		do {
			System.out.println(b++);
		} while(b<10); //먼저 실행 후 조건을 보기 때문에 한번은 무조건 실행
		
		
		
		
	}

}
