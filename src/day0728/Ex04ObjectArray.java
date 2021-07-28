package day0728;

import java.util.Scanner;

class Sawon {
	private static String empName;
	private String name;
	private int pay;
	private int sudang;

	public static void setEmpName(String empName) {
		Sawon.empName=empName;
	}

	public static String getEmpName() {
		return empName;
	}

	//setter method
	public void setName(String name) {
		this.name = name;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public void setSudang(int sudang) {
		this.sudang = sudang;
	}

	//getter method	
	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}

	public int getSudang() {
		return sudang;
	}

	//실수령액을 계산해서 리턴하는 메서드를 만들어보자
	public int getNetPay() {
		int money=(int)((pay+sudang)*0.9);
		return money;
	}

}
public class Ex04ObjectArray {

	public static void writeSawon(Sawon s) {
		System.out.println(s.getName()+"\t"+s.getPay()+"\t"+s.getSudang()
		+"\t"+s.getNetPay());
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int inwon;
		String empName;
		Sawon []sawon;
		System.out.println("회사 이름 입력");
		empName=sc.nextLine();

		//회사이름을 static 멤버변수에 저장
		Sawon.setEmpName(empName);

		System.out.println("총 사원수 입력");
		inwon=Integer.parseInt(sc.nextLine());

		//inwon 수만큼 Sawon 배열할당
		sawon=new Sawon[inwon];

		//입력
		for(int i=0;i<inwon;i++) {
			sawon[i]=new Sawon();//객체 생성
			System.out.println("사원명 입력");
			String name=sc.nextLine();
			System.out.println("월 급여 입력");
			int pay=Integer.parseInt(sc.nextLine());
			System.out.println("월 수당 입력");
			int sudang=Integer.parseInt(sc.nextLine());

			//사원객체에 값 저장하기
			sawon[i].setName(name);
			sawon[i].setPay(pay);
			sawon[i].setSudang(sudang);			
		}
		//출력
		System.out.println("회사명 : "+Sawon.getEmpName());
		System.out.println("사원명\t기본급\t수당\t실수령");
		for(Sawon s:sawon)
			writeSawon(s);
	}

}