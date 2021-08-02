package day0728;
//0729패키지의 Ex04랑 연결
import java.util.Scanner;

public class Info { //public이 안붙을 경우 접근 제한자가 default가 돼서 패키지0729에서는 사용할 수 없다!!!
	//필드
	Scanner sc; //모든 멤버변수는 객체일 경우 null로 초기화
	String name;
	String blood;
	String hp;
	
	//생성자
	public Info(){
		sc=new Scanner(System.in);
		name = "이효리";
		blood = "a형";
		hp = "010-123-4567";
	}
	
	//메서드
	public void dataIn() {
		System.out.println("이름입력");
		this.name = sc.nextLine();
		System.out.println("혈액형은?");
		blood=sc.nextLine().toUpperCase();
		System.out.println("핸드폰번호는?");
		hp = sc.nextLine();
		
	}
	
	public void dataOut() {
		System.out.println("이름 : " + name);
		System.out.println("혈핵형 : " + blood);
		System.out.println("핸드폰번호 : " + hp);
	}

}
