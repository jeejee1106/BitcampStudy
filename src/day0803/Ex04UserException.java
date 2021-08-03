package day0803;

import java.util.Scanner;

//사용자exception
//실제로는 예외가 발생할 상황이 아니지만
//어떤 조건에 맞지 않을 경우 강제로 예외를 발생시키고자 할 경우 구현
//throw : 강제로 예외 발생
class UserException extends Exception{
	public UserException(String msg) {
		super(msg); //Exception클래스 생성자를 통해서 정식 에러 메세지로 등록 getMessage를 호출하면 나타나는 메세지를 직접 등록!
	}
}

public class Ex04UserException {
	public static void process() throws UserException { 
		Scanner sc = new Scanner(System.in);
		int age = 0;
		System.out.println("나이를 입력해주세요");
		age = sc.nextInt();
		if(age<10||age>=60) {
			throw new UserException("멤버연령은 10~59세 입니다."); //강제 예외 발생
		} else {
			System.out.println("당신은 " + age + "세 이므로 정식 멤버입니다.");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			process();
		} catch (UserException e) {
			System.out.println("오류메세지 : " + e.getMessage());
		}
		System.out.println("**정상종료**");
	}

}
