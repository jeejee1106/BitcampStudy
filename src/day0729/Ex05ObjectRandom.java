package day0729;

import java.util.Random;
import java.util.Scanner;

public class Ex05ObjectRandom {
	private int rnd;
	private int su;
	private int cnt;
	Random r;
	Scanner sc;
	
	public Ex05ObjectRandom() { //������ - ������� �ʱ�ȭ
		r = new Random();
		sc = new Scanner(System.in);
		rand();
	}
	
	public void rand() { //�ʱ�ȭ ���ִ� �޼��� ����
		rnd = r.nextInt(100)+1; //1~100���� ���� �߻�
		cnt = 0;
		System.out.println("���ο� ������ �߻��ǰ� ī��Ʈ�� 0���� �ʱ�ȭ ��");
	}
	
	public void process() {
		while(true) {
			System.out.println(++cnt + ":");
			su = sc.nextInt();
			if(su>rnd) {
				System.out.println("\t" + su + "���� �۽��ϴ�.");
			} else if(su<rnd) {
				System.out.println("\t" + su + "���� Ů�ϴ�.");
			} else {
				System.out.println("\t�����Դϴ�.");
//				System.exit(0); //��� �ִ� ������ ���α׷��� ����ȴ�.
				sc.nextLine(); //���͸� �о ����
				System.out.println("��� �Ϸ��� y, �׸��Ϸ��� n �Է�");
				String ans = sc.nextLine();
				if(ans.equalsIgnoreCase("y")){
					System.out.println("*���� �ٽ� ����*");
					rand(); //���� �ٽ� ���ϰ� cnt�� 0���� �ʱ�ȭ
					continue; //ù�ٷ� �̵�
				} else {
					System.out.println("*���� ����*");
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex05ObjectRandom ex = new Ex05ObjectRandom();
		ex.process();
		
		
		
		
	}

}
