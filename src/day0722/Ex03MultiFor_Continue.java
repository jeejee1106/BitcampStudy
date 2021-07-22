package day0722;

public class Ex03MultiFor_Continue {

	public static void main(String[] args) {
		System.out.println("다중 for문 continue연습 1");
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=4; j++) {
				if (j==2) {
					continue;
				} System.out.println(i+":"+j);
			} System.out.println();
		}
		
		
		System.out.println("다중 for문 continue연습 2");
		for(int i = 1; i<=3; i++) {
			if(i==2) {
				continue;
			}
			for(int j = 1; j<=4; j++) {
				System.out.println(i+":"+j);
			} System.out.println();
		}
		
		
		
		
	}

}
