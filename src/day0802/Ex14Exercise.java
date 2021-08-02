package day0802;

import java.util.Scanner;

class PayOuter{
	
	private String sawonName;
	private int gibonPay, timeSu, familySu;
	
	//방법2 - 내부클래스 선언
	InputInner input = new InputInner();
	SudangInner output = new SudangInner();
	
	public void process() {
		input.inputData(); //데이터 입력
		output.writeData(); //결과 출력
	}
	
	class InputInner{
		
		public void inputData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("사원명 : ");
			sawonName = sc.nextLine();
			System.out.println("기본급 : ");
			gibonPay = sc.nextInt();
			System.out.println("초과시간 : ");
			timeSu = sc.nextInt();
			System.out.println("가족 수 : ");
			familySu = sc.nextInt();
		}
	}
	
	class SudangInner{
		
		public int getTimeSudang() {
			return timeSu*10000;
		}
		
		public int getFamilySudang() {
			if(familySu<=3) {
				return 200000;
			} else {
				return 300000;
			}
		}
		
		public double getTax() {
			return (int)gibonPay*0.03;
		}
		
		public double getPay() {
			return gibonPay + getTimeSudang() + getFamilySudang() - getTax();
		}
		
		public void writeData() {
			System.out.println("사원명\t기본급\t초과시간\t시간수당\t가족수"
					+ "\t가족수당\t세금\t실수령액");
			System.out.println(sawonName + "\t" + gibonPay + "\t" + timeSu + "\t"
					+ getTimeSudang() + "\t" + familySu + "\t" + getFamilySudang()
					+ "\t" + getTax() + "\t" + getPay());
		}
		
	}
	
}



public class Ex14Exercise {

	public static void main(String[] args) {
		
//		방법1
//		PayOuter pay = new PayOuter();
//		PayOuter.InputInner input = pay.new InputInner();
//		input.inputData();//데이터 입력
//		
//		PayOuter.SudangInner output = pay.new SudangInner();
//		output.writeData();//결과 출력
		
//		방법2 //거의 이 방법을 씀
		PayOuter pay = new PayOuter();
		pay.process();
	}

}
