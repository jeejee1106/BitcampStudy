package day0721;

import java.util.Scanner;

public class Ex09For_Scanner {

	public static void main(String[] args) {
		
		//���� n�� �Է¹޾� 1~n������ �� ���ϱ�
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=n ;i++) {
			sum+=i;
		} System.out.println(sum);
		
		
		
	}

}
