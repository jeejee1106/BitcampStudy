package day0802;

interface Sawon{
	public void addSawon();
	public void deleteSawon();
	public void listSawon();
}

public class Ex13Anonymous {

	//���� Sawon �������̽��� �͸� ����Ŭ���� �������� ���� ��
	//���ο��� �� �޼ҵ带 ȣ���غ�����

	Sawon s = new Sawon() {

		@Override
		public void addSawon() {
			System.out.println("���Ի��");
		}

		@Override
		public void deleteSawon() {
			System.out.println("��� ���");
		}

		@Override
		public void listSawon() {
			System.out.println("��� ���");
		}
	};


	public static void main(String[] args) {

		Ex13Anonymous ex = new Ex13Anonymous();
		ex.s.addSawon();
		ex.s.deleteSawon();
		ex.s.listSawon();



	}

}
