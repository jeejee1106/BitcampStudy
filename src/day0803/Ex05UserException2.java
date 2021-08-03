package day0803;

import java.util.Scanner;

class User extends Exception{
	public User(String name) {
		super(name + "님은 가입할 수 없습니다."); //getMessage()에 들어갈 예외 메세지를 직접 입력해준다!
	}
}

public class Ex05UserException2 {
	public static void process() throws User{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해라");
		String name = sc.nextLine();
		if(name.equals("송혜교")||name.equals("김태희")||name.equals("송승헌")) {
			throw new User(name);
		} else {
			System.out.println(name + "님은 회원가입 되었습니다.");
		}
		
		
		/*
		 * 이름을 입력받아 송혜교, 김태희, 송승헌일 경우
		 * "송혜교님은 가입할 수 없습니다" 라고 메세지 등록(강제 exception발생)
		 * 그 이외의 이름일 경우
		 * xxx님은 회원가입 되었습니다 라고 출력
		 * */
	}

	public static void main(String[] args) {
		
		//process호출 후 exception처리
		try {
			process();
		} catch (User e) {
			System.out.println("오류메세지 : " + e.getMessage());
		}
		System.out.println("**정상종료**");
	}

}
