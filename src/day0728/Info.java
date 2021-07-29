package day0728;

import java.util.Scanner;

public class Info {
	Scanner sc; //모든 멤버변수는 객체일 경울 null로 초기화
	String name;
	String blood;
	String hp;
	
	public Info(){
		sc=new Scanner(System.in);
		name = "이효리";
		blood = "a형";
		hp = "010-123-4567";
	}
	
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
