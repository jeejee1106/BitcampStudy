package day0721;

public class Ex11For_Alphabet {

	public static void main(String[] args) {

		System.out.println("<<�پ��� ������� ���ĺ� �빮�� ����ϱ�>>");
		//1�� - ASCII �ڵ�
		for(int i = 65; i<=90; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		
		//2�� - printf (�����ڵ�)
		for(int i = 65; i<=90; i++) {
			System.out.printf("%c",i);
		}
		System.out.println();
		
		//3�� - ���ڸ� for����?!
		for(char a='A'; a<='Z'; a++) {
			System.out.print(a);
		}
		System.out.println();
		
		
		
	}

}
