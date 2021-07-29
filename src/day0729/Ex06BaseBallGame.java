package day0729;

import java.util.Random;
import java.util.Scanner;

class Baseball{
	//�ʵ�
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int[] comsu = new int[3];
	int[] usersu = new int[3];

	//������
	Baseball() { //����Ʈ ������
		//consu�迭�� 1~9���� ���ڸ� �ִµ� ���� ���ڰ� �߻��ϸ� �ٽ� ���Ͻÿ�
		for(int i = 0; i<comsu.length; i++) { //�ߺ�ó��
			comsu[i] = r.nextInt(9)+1;
			for(int j = 0; j<i; j++) {
				if(comsu[i]==comsu[j]) {
					i--;
					break;
				}
			}
		}

//		System.out.printf("%d %d %d\n", comsu[0], comsu[1], comsu[2]);
	}

	public void process() { //���ڸ��߱� ������ ���� �޼���
		int cnt = 0;
		int strike, ball;
		while(true) {
			System.out.println(++cnt + ":");
			String s = sc.nextLine();
			if(s.length()!=3) {
				System.out.println("\t 3���� ���ڸ� ���������� �Է��ϼ���");
				continue;
			}
			this.input(s);

			strike=ball=0;
			//comsu�� ���Ͽ� �ڸ������� ������ strike ���� ����
			//�ֱ��ѵ� �ڸ����� �ٸ��� ball ���� ����
			//���� for�� �̿��ؼ� ���� ��
			
			//���ڵ�
			for(int i = 0; i<comsu.length; i++) {
				if(comsu[i]==usersu[i]) {
					strike++;
				} 
				for(int j = 0; j<comsu.length; j++) {
					if(comsu[i]!=usersu[i]&&comsu[i]==usersu[j]) {
						ball++;
					}
				}
			}
			
			
			//����� �ڵ�
			for(int i = 0; i<comsu.length; i++) {
				for(int j = 0; j<comsu.length; j++) {
					if(comsu[i]==usersu[j]) {
						if(i==j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			
			
			//���
			System.out.println(strike + "s" + ball + "b");
			if(strike==3) {
				System.out.println("�����Դϴ�.");
				break;
			}
		}
	}

	public void input(String s) { //���ڿ��� �Է��ϸ� �� ���ڸ� �и��Ͽ� �迭�� �־��ֱ� ���� �޼���
		//���ڿ� s�� �и��Ͽ� usersu�迭�� �־����
		for(int i = 0; i<usersu.length; i++) {
			char ch = s.charAt(i);
			usersu[i] = ch-'0'; //���� '1'���� ���� '0'�� ���� ���� 1�� �ȴ�.
		}

		//Ȯ��(�ڵ带 ¥�� �̷��� Ȯ���� ����� ���װ� �ֳ����� �� �� �ִ�)
		//		System.out.printf("%d%d%d\n", usersu[0], usersu[1], usersu[2]);
	}

}

public class Ex06BaseBallGame {

	public static void main(String[] args) {

		Baseball bb= new Baseball();
		bb.process();
		System.out.println("*�����մϴ�.*");


	}

}
