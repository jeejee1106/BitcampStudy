package day0726;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11Final_Exe {

	public static void main(String[] args) {
		/*���� 1
		 * 12���� �츦 �迭�� ���� �� �¾ �⵵�� �Է��ϸ� �ش� �⵵�� �Բ� �츦 ����Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String[] ddi = {"������", "��", "��", "����", "��", "��", "ȣ����", 
						"�䳢", "��", "��", "��", "��"};
		
		for(int i = 0; i<ddi.length; i++) {
			if(year%12==i) {
				System.out.println(year + "���� " + ddi[i] + "�� �� �Դϴ�.");
			}
		}



		/*���� 2
		 * int[] Lotto = new int[6];
		 * �� �迭�� 1~45 ������ ������ �߻���Ų �� ������������ �����Ͻÿ�
		 * ��, �ߺ����ڰ� �߻��ϸ� �ٽ� ���ϼ���.
		 * */
		//1. �迭�� ����� �ʱ�ȭ
		int[] Lotto = new int[6];

		//2. ������ 6�� �迭�� ���.
		Loop:
			for(int i = 0; i<Lotto.length; i++) {
				Lotto[i] = (int)(Math.random()*45)+1; //Lotto�迭�� 0,1,2,3,4,5 �ε����� ���� 1~45�� �������� �������̴�. 6���� �������� �̴� ���� �ߺ����� ���� �� �ִ�.
				for(int j = 0; j<i; j++) {		  //3. �ߺ��� ����
					if(Lotto[i]==Lotto[j]) {
						i--;
						continue Loop;
					}
				}
			}								     

		//4. �������� ����
		for(int i = 0; i<Lotto.length-1; i++) {
			for(int j = i+1; j<Lotto.length; j++) {
				if(Lotto[i]>Lotto[j]) {
					int n = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = n;
				}
			}
		}	

		//5. ���
		System.out.println(Arrays.toString(Lotto));




		/*���� 3
		 * int[] alpha = new int[26];
		 * ���� ������ �Է� �� �м��Ͽ� �� ���ĺ��� ������ ���� �� ����Ͻÿ�.
		 * */
		
		
		
		
		
		
		
		
		
		
		

	}

}
