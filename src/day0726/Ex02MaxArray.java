package day0726;

public class Ex02MaxArray {

	public static void main(String[] args) {
		
		//�迭�� �̿��� �ִ�, �ּڰ� ���ϱ�
		
		int[] data = {50, 80, 100, 69, 16, -5, 1, 428, -61, 31};
		int max, min;
		max = data[0];
		min = data[0];
		
		for(int i = 1; i<data.length; i++) { //������ max,min���� data[0]�� ��� ������ �ڱ� �ڽŰ��� ���� �ʿ䰡 �����Ƿ� i�� 1����.
			if(max<data[i]) { //���� data[0]�� data[1]���� ���ʴ�� ��
				max = data[i]; //data[i]���� �� ũ�� �װ� max���� �����鼭 �ݺ��� ����.
			}
			if(min>data[i]) { //�ּڰ��� ��������
				min = data[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
		
		
		
		
		
		
		
	}

}
