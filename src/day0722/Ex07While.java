package day0722;

public class Ex07While {

	public static void main(String[] args) {

		System.out.println("<while�� ������, do-while�� ������>");
		System.out.println("----while��----");
		int a= 10;
		while(a<10) { //���� ��ü�� false�� ��� �� ���� ���� ����
			System.out.println(a++);
		}
		
		System.out.println("----do-while��----");
		int b = 10;
		do {
			System.out.println(b++);
		} while(b<10); //���� ���� �� ������ ���� ������ �ѹ��� ������ ����
		
		
		
		
	}

}
