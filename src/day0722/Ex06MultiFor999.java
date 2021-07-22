package day0722;

public class Ex06MultiFor999 {

	public static void main(String[] args) {
		
		System.out.println("구구단 세로 출력");
		for(int i = 2; i<=9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			} System.out.println();
		} 
		
		System.out.println();
		
		System.out.println("구구단 가로 출력");
		for(int i = 2; i<=9; i++) {
			System.out.print("[" + i + "단]\t");
		}
		System.out.println();
		for(int i=1; i<=9;i++) {
			for(int j = 2; j<=9; j++) {
				System.out.print(j + "x" + i + "=" + (i*j)+"\t");
			} System.out.println();
		}
		
		//강사님 코드
		for(int dan = 2; dan<=9; dan++) {
			System.out.print("[" + dan + "단]\t");
		}
		System.out.println();
		for(int i = 1; i<=9; i++) {
			for(int dan = 2; dan<=9; dan++) {
				System.out.print(dan + "x" + i + "=" + dan*i + "\t");
			} System.out.println();
		}
		
		
		
		
	}

}
