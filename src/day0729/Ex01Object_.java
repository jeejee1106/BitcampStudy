package day0729;

import java.util.Scanner;

class Emp{
	private String name;
	private int pay;
	private int famsu;
	private int timesu;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getFamsu() {
		return famsu;
	}
	public void setFamsu(int famsu) {
		this.famsu = famsu;
	}
	public int getTimesu() {
		return timesu;
	}
	public void setTimesu(int timesu) {
		this.timesu = timesu;
	}
	
	public int getFamilySudang() {
		int n = 0;
		if(famsu>=4) {
			n=200000;
		} else {
			n=famsu*50000;
		} return n;
	}
	
	public int getTimeSudang() {
		int n = 0;
		if(timesu>=5) {
			n=150000;
		} else {
			n = timesu*30000;
		} return n;
	}
	
	public int getTotalpay() {
		return pay+this.getFamilySudang() + this.getTimeSudang();
	}
	
	public static void showTitle() {
		System.out.println("**�츮ȸ�� ���� �޿� ��Ȳ**");
		System.out.println();
		System.out.println("�����\t�޿�\t������\t�ʰ��ð�\t��������\t�ð�����\t�ѱ޿�");
		System.out.println("------------------------------------------------------------");
		
	}
	
}

public class Ex01Object_ {
	public static void writeEmp(Emp[] emp) {
		//������� ���
		Emp.showTitle();
		for(Emp e:emp) {
			System.out.println(e.getName() + "\t" + e.getPay() + "\t" + e.getFamsu()
			+ "\t" + e.getTimesu() + "\t" + e.getFamilySudang() + "\t" + e.getTimeSudang()
			+ "\t" + e.getTotalpay());
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inwon;
		Emp[] emp;
		System.out.println("�Է��� ��������?");
		inwon = Integer.parseInt(sc.nextLine());
		//�迭�Ҵ�
		emp = new Emp[inwon];
		//�ο�����ŭ ������ �Է�
		for(int i = 0; i<inwon; i++) {
			//emp����
			emp[i] = new Emp();
			System.out.println("�̸�");
			String name = sc.nextLine();
			System.out.println("�޿�");
			int pay = Integer.parseInt(sc.nextLine());
			System.out.println("���� �� �Է�");
			int fs = Integer.parseInt(sc.nextLine());
			System.out.println("�ʰ� �ٹ� �ð�");
			int ts = Integer.parseInt(sc.nextLine());
			
			//setter�� emp Ŭ������ ������ �ֱ�
			emp[i].setName(name);
			emp[i].setPay(pay);
			emp[i].setFamsu(fs);
			emp[i].setTimesu(ts);
			System.out.println();
		}
		
	}

}
