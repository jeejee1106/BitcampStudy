package day0721;

public class Ex08For_Exe {

	public static void main(String[] args) {
		
		//1���� 100������ �� ���ϱ�
		int sum = 0;
		for(int i =1; i<=100; i++) {
			sum+=i; //sum=sum+i ��� ��
		} System.out.println(sum);
		
		//1~100 �� ¦���� �հ� Ȧ���� �� ���
		int esum = 0;
		int osum = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				esum+=i;
			} else {
				osum+=i;
			}
		} 
		System.out.println("¦���� �� : " + esum);
		System.out.println("Ȧ���� �� : " + osum);
		
		
	}

}
