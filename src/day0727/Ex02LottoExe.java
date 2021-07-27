package day0727;

import java.util.Scanner;

public class Ex02LottoExe {

	public static void main(String[] args) {
		
		/*
		 * �ݾ��� �Է��ϸ� �ݾ׿� �ش��ϴ� �ζ� ���� �߻�
		 * 1000�� �̸��̸� '�ݾ׺���' ��� �� ���α׷� ����
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		int[] Lotto = new int[6];
		
		System.out.println("�ݾ� �Է�");
		money = sc.nextInt();
		if(money<1000) {
			System.out.println("�ݾ� ����. �����մϴ�.");
			return;
		}
		
		//1. �ζ� �߻� Ƚ�� ���ϱ�
		int cnt = money/1000; //�ζ� �� �� �Ұ���?
		int mod = money%1000; //�Ž�����
		
		System.out.println("�� " + cnt + "ȸ�� �ζ� ����");
		System.out.println("�Ž����� : " + mod + "��");

		//2. ���� �����ϱ�
		for(int i = 1; i<=cnt; i++) {
			for(int j = 0; j<Lotto.length; j++) {
				Lotto[j] = (int)(Math.random()*45)+1; //1~45������ ������ �� ����
				for(int m = 0; m<j; m++) { //�ߺ��� üũ&����
					if(Lotto[j]==Lotto[m]) {
						m--;
						break;
					}
				}
			}
			//3. �������� ����
			for(int n = 0; n<Lotto.length-1; n++) {
				for(int m = n+1; m<Lotto.length; m++) {
					if(Lotto[n]>Lotto[m]) {
						int tmp = Lotto[n];
						Lotto[n] = Lotto[m];
						Lotto[m] = tmp;
					}
				}
			}
			System.out.printf("%2d ȸ : ", i);
			for(int n = 0; n<Lotto.length; n++) {
				System.out.printf("%5d", Lotto[n]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
