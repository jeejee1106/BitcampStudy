package day0803;
//�Ϲ����� exception(�Ϲݿ���)�� �ݵ�� ó���ؾ߸� �Ѵ�.(������ ������ �߻��ϴϱ�!)
public class Ex06Exception_ThreadSleep {

	public static void main(String[] args) {
		
		System.out.println("�ȳ��ϼ���");
		System.out.println("3�� �� �츮 �ۺ��ؿ�");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("�ȳ��� ������");
		
	}

}
