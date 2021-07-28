package day0728;

import java.util.Scanner;

//1���� �����ϸ� �ﰢ���� ���̸� , 2���� �����ϸ� �簢���� ���̸�
//3���� ���� ����, 4���� ����
public class Ex11ObjectMethod {
	public static void areaSquare(int garo,int sero) {
		System.out.println("����:"+garo+",����:"+sero);
		System.out.println("�簢���� ����="+garo*sero);
	}

	public static void areaTriagle(int garo,int sero) {
		System.out.println("����:"+garo+",����:"+sero);
		System.out.println("�ﰢ���� ����="+(garo*sero)/2.0);
	}

	public static void areaCircle(int rad) {
		System.out.println("������:"+rad);
		System.out.println("���� ����="+(rad*rad*Math.PI));
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.�簢��  2.�ﰢ��  3.��   4.����");
			int n=sc.nextInt();
			if(n==4) {
				System.out.println("�����մϴ�");
				break;
			}
			switch(n) {
			case 1: {
				System.out.println("���α��̿� ���α��̸� �Է��ϼ���");
				int garo=sc.nextInt();
				int sero=sc.nextInt();
				areaSquare(garo, sero);
				break;
			}
			case 2: {
				System.out.println("���α��̿� ���α��̸� �Է��ϼ���");
				int garo=sc.nextInt();
				int sero=sc.nextInt();
				areaTriagle(garo, sero);
				break;
			}
			case 3: {
				System.out.println("���� �������� �Է��ϼ���");
				int rad=sc.nextInt();
				areaCircle(rad);
				break;
			}
			default:
				System.out.println("���� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���");
			}
		}
	}
}