package day0721;

public class Ex12For_Break_Continue {

	public static void main(String[] args) {

		//�ݺ������� break�� ������ ���� ����� �ݺ����� ����������.
		for(int i = 1; i<=10; i++) {
			if (i%5==0)
				break; //i�� 0���� ���� �������� 0�� �� break!! �ݺ����� �������´�.
			System.out.println(i); //1,2,3,4
		}
		System.out.println();
		
		
		//�ݺ������� continue�� ������ ���������� �̵��Ѵ�.
		// �ش� �κи� ������ �ȵ�!!
		for(int i = 1; i<=10; i++) {
			if (i%5==0)
				continue;
			System.out.println(i);//1,2,3,4,6,7,8,9
		}
		System.out.println();
		
		
		
		
		
		
	}

}
