package day0729; //0730 ����Ŭ����

public class Person {
	//�θ�Ŭ������ �ٸ� ��Ű���� ���� ��� protected�� ������ �����ϴ�
	protected String name;
	protected String buseo;
	
	public void display() {
		System.out.println("**�θ� ���� ���**");
		System.out.println("�̸� : " + this.name);
		System.out.println("�μ� : " + this.buseo);
			
	}
}
