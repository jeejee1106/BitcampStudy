package day0722;

public class Ex09While_Alphabet {

	public static void main(String[] args) {
		
		System.out.println("<<�پ��� ������� ���ĺ� �빮�� ����ϱ�>>");
		
		//ASCII�ڵ�
		int a = 65;
		while(a<=90) {
			System.out.print((char)a++);
		}
		
		System.out.println();
		
		//���ǽĿ� true�� �ְ� break �ɱ�
		a = 65;
		while(true) {
			System.out.print((char)a++);
			if(a==91) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
