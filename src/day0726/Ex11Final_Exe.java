package day0726;

import java.util.Scanner;

public class Ex11Final_Exe {

	public static void main(String[] args) {
		/*���� 1
		 * 12���� �츦 �迭�� ���� �� �¾ �⵵�� �Է��ϸ� �ش� �⵵�� �Բ� �츦 ����Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		
//		String[] ddi = {~~~};
		
		
		
		/*���� 2
		 * int[] Lotto = new int[6];
		 * �� �迭�� 1~45 ������ ������ �߻���Ų �� ������������ �����Ͻÿ�
		 * ��, �ߺ����ڰ� �߻��ϸ� �ٽ� ���ϼ���.
		 * */
		int[] Lotto = new int[6];
		
		Loop:
		for(int i = 0; i<Lotto.length; i++) {
			int n = (int)(Math.random()*45)+1;
			Lotto[i] = n;
			for(int j = i+1; j<Lotto.length; j++) {
				if(Lotto[i]==Lotto[j]) {
					i--;
					continue Loop;
				}
				if(Lotto[i]>Lotto[j]) {
					int tmp = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i<Lotto.length; i++) {
			System.out.println("Lotto" + "[" + i + "] = " + Lotto[i] + "\t");
		}
		
		
		
		
		/*���� 3
		 * int[] alpha = new int[26];
		 * ���� ������ �Է� �� �м��Ͽ� �� ���ĺ��� ������ ���� �� ����Ͻÿ�.
		 * */
		
	}

}
