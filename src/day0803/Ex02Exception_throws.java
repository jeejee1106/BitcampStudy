package day0803;

public class Ex02Exception_throws {

	public static void process() {

		int[] arr = {2,5,6,7};
		for(int i = 0; i<=arr.length; i++) {
			try {
				System.out.println(arr[i]);
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�����޼��� : " + e.getMessage());
			}
		}
	}
	//throws : exceptionó���� ���� ���� �ʰ� ȣ���ϴ� ������ �ش� exception�� ������
	public static void process2() throws NumberFormatException {
		String a = "12a";
		String b = "30";
		int sum = 0;
		
		sum = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("�� ���� ���� : " + sum);
		}

	public static void main(String[] args) {

		process();
		
		
		try {
			process2();
		} catch(NumberFormatException e) {
			System.out.println("����ó�� ���⿡�� ��. �����޼��� : " + e.getMessage());
		}
		System.out.println("��������");
	}

}
