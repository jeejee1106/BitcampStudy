package day0802;

public class Ex15Exception {

	public static void main(String[] args) {
		//�迭�� ����ó��
		
		int[] arr = {4, 6, 2};
		for(int i = 0; i<=arr.length; i++) {
			try {
				System.out.println(arr[i]); //���ܰ� �߻��� ��� catch�� ����
			}catch(ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace(); //������ �����ؼ� ���ι�ȣ�� �޼����� ���
				System.out.println("�����޼��� : " +e.getMessage()); //���ܹ߻� �޼����� ���
			}
		}
		System.out.println("**��������**");
		
	}

}
