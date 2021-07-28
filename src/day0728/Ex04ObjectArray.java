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

	//�Ǽ��ɾ��� ����ؼ� �����ϴ� �޼��带 ������
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
		System.out.println("ȸ�� �̸� �Է�");
		empName=sc.nextLine();

		//ȸ���̸��� static ��������� ����
		Sawon.setEmpName(empName);

		System.out.println("�� ����� �Է�");
		inwon=Integer.parseInt(sc.nextLine());

		//inwon ����ŭ Sawon �迭�Ҵ�
		sawon=new Sawon[inwon];

		//�Է�
		for(int i=0;i<inwon;i++) {
			sawon[i]=new Sawon();//��ü ����
			System.out.println("����� �Է�");
			String name=sc.nextLine();
			System.out.println("�� �޿� �Է�");
			int pay=Integer.parseInt(sc.nextLine());
			System.out.println("�� ���� �Է�");
			int sudang=Integer.parseInt(sc.nextLine());

			//�����ü�� �� �����ϱ�
			sawon[i].setName(name);
			sawon[i].setPay(pay);
			sawon[i].setSudang(sudang);			
		}
		//���
		System.out.println("ȸ��� : "+Sawon.getEmpName());
		System.out.println("�����\t�⺻��\t����\t�Ǽ���");
		for(Sawon s:sawon)
			writeSawon(s);
	}

}