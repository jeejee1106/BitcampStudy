package day0722;

public class Ex02MultiFor_Break {

	public static void main(String[] args) {
		
		System.out.println("다중 for문 break연습 1");
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.println(i+":"+j);
				if(j==3) {
					break;
				}
			} System.out.println();
		}
		
		
		System.out.println("다중 for문 break연습 2");
		for(int i = 1; i<=3; i++) {
			if(i==3) {
				break;
			}
			for(int j = 1; j<=5; j++) {
				System.out.println(i+":"+j);
			} System.out.println();
		}
		
		
	}

}
