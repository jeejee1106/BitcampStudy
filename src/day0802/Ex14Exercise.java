package day0802;

import java.util.Scanner;

class PayOuter{
	
	private String sawonName;
	private int gibonPay, timeSu, familySu;
	
	//���2 - ����Ŭ���� ����
	InputInner input = new InputInner();
	SudangInner output = new SudangInner();
	
	public void process() {
		input.inputData(); //������ �Է�
		output.writeData(); //��� ���
	}
	
	class InputInner{
		
		public void inputData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("����� : ");
			sawonName = sc.nextLine();
			System.out.println("�⺻�� : ");
			gibonPay = sc.nextInt();
			System.out.println("�ʰ��ð� : ");
			timeSu = sc.nextInt();
			System.out.println("���� �� : ");
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
			System.out.println("�����\t�⺻��\t�ʰ��ð�\t�ð�����\t������"
					+ "\t��������\t����\t�Ǽ��ɾ�");
			System.out.println(sawonName + "\t" + gibonPay + "\t" + timeSu + "\t"
					+ getTimeSudang() + "\t" + familySu + "\t" + getFamilySudang()
					+ "\t" + getTax() + "\t" + getPay());
		}
		
	}
	
}



public class Ex14Exercise {

	public static void main(String[] args) {
		
//		���1
//		PayOuter pay = new PayOuter();
//		PayOuter.InputInner input = pay.new InputInner();
//		input.inputData();//������ �Է�
//		
//		PayOuter.SudangInner output = pay.new SudangInner();
//		output.writeData();//��� ���
		
//		���2 //���� �� ����� ��
		PayOuter pay = new PayOuter();
		pay.process();
	}

}
