package day0723;

public class Ex08Array {

	public static void main(String[] args) {

		char[] ch; //�迭�� ����
		ch = new char[5]; //�迭�� ����, �ڵ� �ʱ�ȭ
		
		System.out.println("�迭�� ũ�� : " + ch.length);
		
		//�ڵ����� �ʱ�ȭ�� �ʱⰪ�� ����غ���
		for(int i = 0; i<ch.length; i++) {
			System.out.println(i + ":" + (int)ch[i]);
		}
		
		System.out.println();
		
		
		
		//�迭�� �� �ֱ�
		ch[0] = 'A';
		ch[1] = 66;
		ch[2] = 97;
		ch[3] = 'X';
		ch[4] = 49;
		for(int i=0; i<ch.length; i++) {
			System.out.println(i + ":" + ch[i]);
		}
		
		System.out.println();
		
		
		
		//�ٷ� �� �ڵ�� ���� ���� ����ϴ� �ڵ���
		for(char a:ch) {
			System.out.println(a);
		}
		
		
	}

}
