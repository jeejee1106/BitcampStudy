package day0726;

public class Ex01Array_String {

	public static void main(String[] args) {
		
		String[] arr = {"�ε鷹", "��̲�", "ī���̼�", "�Ȱ���", "����ȭ"};
		String[] arr2 = new String[5];
		arr2[0] = "������";
		arr2[1] = "��Ȳ��";
		arr2[2] = "�����";
		arr2[3] = "�ʷϻ�";
		arr2[4] = "�Ķ���";
		
		//���(���� i�� �̿��ؼ� ���)
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//���2(for���� �̿��ؼ� ���)
		for(String s:arr) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		//arr2�� ���� ���� ������� ����غ���
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		for(String s:arr2) {
			System.out.print(s + " ");
		}
		
		
		
		
		
	}

}
