package day0803;

import java.util.Scanner;

public class Ex01exception_Try_Catch_Basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		while(true) { //1~4가 반복되면서 Exception이 발생하지 않는다면 catch문은 실행되지 않고 정상적으로 코드가 출력된다.
			try {
				System.out.println("첫 번째 숫자를 입력(종료0)");
				num1 = Integer.parseInt(sc.nextLine()); //1. 여기서 이셉션이 발견되면 밑의 코드는 실행되지않고 캐치로 이동
				if(num1==0) {							//만약 숫자가 아닌 문자or문자열을 입력한다면?? Exception발생.
					break;
				}
				System.out.println("두 번째 숫자를 입력");
				num2 = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e){ //2. 여기!여기로 이동! 여기로 와서 오류메세지를 출력하고 밑의 코드들 실행
				System.out.println("메세지 : " + e.getMessage()); //3. 메세지 : For input string: "내가 잘못입력한 값(이를테면 문자)"
				continue; //4. 다시 와일문의 조건문으로.
			}
			System.out.println("두 숫자의 합은 " + (num1+num2)+ "입니다.");
			System.out.println();
		}
		System.out.println("정상종료");
	}

}
