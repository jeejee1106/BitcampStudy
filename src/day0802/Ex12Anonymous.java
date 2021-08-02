package day0802;

abstract class AbstEx1 {
	abstract public void dataAdd();
	abstract public void dataList();
}

class SubAbst extends AbstEx1 {

	@Override
	public void dataAdd() {
		System.out.println("ȸ�� �߰�");
	}

	@Override
	public void dataList() {
		System.out.println("ȸ�� ��� ���");
	}

}

public class Ex12Anonymous {

	//�͸� ���� Ŭ���� ����
	AbstEx1 ab1 = new AbstEx1() {

		@Override
		public void dataList() {
			System.out.println("�����͸� ����մϴ�.");
		}

		@Override
		public void dataAdd() {
			System.out.println("�����͸� �߰��մϴ�.");
		}
	};

	SubAbst sub = new SubAbst();

	public static void main(String[] args) {

		Ex12Anonymous ex = new Ex12Anonymous();
		//�͸� ���� �ܺ�Ŭ����
		ex.ab1.dataAdd();
		
		ex.ab1.dataList();
		System.out.println();

		//��ӹ��� Ŭ������ ��������� ����
		ex.sub.dataAdd();
		ex.sub.dataList();


	}

}
