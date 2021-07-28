package day0728;

import java.util.Scanner;

//1번을 선택하면 삼각형의 넓이를 , 2번을 선택하면 사각형의 넓이를
//3번은 원의 넓이, 4번은 종료
public class Ex11ObjectMethod {
	public static void areaSquare(int garo,int sero) {
		System.out.println("가로:"+garo+",세로:"+sero);
		System.out.println("사각형의 넓이="+garo*sero);
	}

	public static void areaTriagle(int garo,int sero) {
		System.out.println("가로:"+garo+",세로:"+sero);
		System.out.println("삼각형의 넓이="+(garo*sero)/2.0);
	}

	public static void areaCircle(int rad) {
		System.out.println("반지름:"+rad);
		System.out.println("원의 넓이="+(rad*rad*Math.PI));
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.사각형  2.삼각형  3.원   4.종료");
			int n=sc.nextInt();
			if(n==4) {
				System.out.println("종료합니다");
				break;
			}
			switch(n) {
			case 1: {
				System.out.println("가로길이와 세로길이를 입력하세요");
				int garo=sc.nextInt();
				int sero=sc.nextInt();
				areaSquare(garo, sero);
				break;
			}
			case 2: {
				System.out.println("가로길이와 세로길이를 입력하세요");
				int garo=sc.nextInt();
				int sero=sc.nextInt();
				areaTriagle(garo, sero);
				break;
			}
			case 3: {
				System.out.println("원의 반지름을 입력하세요");
				int rad=sc.nextInt();
				areaCircle(rad);
				break;
			}
			default:
				System.out.println("없는 번호입니다. 다시 입력하세요");
			}
		}
	}
}