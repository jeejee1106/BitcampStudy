package day0730;

import day0729.Person;

class My extends Person{ //�θ�Ŭ������ �ٸ� ��Ű���� ���� ��� protected�� ������ �����ϴ�
	
	int age;
	
	My(String name, String buseo, int age) {
		this.name = name; 
		this.buseo = buseo;
		this.age = age;
	}
	
	public void write() {
		System.out.println("����� : " + this.name);
		System.out.println("�μ� : " + this.buseo);
		System.out.println("���� : " + this.age);
	}
	
	//�������̵� �޼��� ����(�޼����� ���ڴ� ���ƾ��ϰ� ���������ڴ� ������ �����͸� ����)
	@Override //����� ������ ������̼��̶�� �Ѵ�. �������̵� �������ִ� ���� ��.(�ڵ��ϼ��ϸ� ����)
	public void display() {
		super.display(); //�θ��� �޼��� ȣ��, ������ �������
		System.out.println("���� : " + this.age);
	}
	
}


public class Ex04Inherit_overriding {

	public static void main(String[] args) {
		
		My my1 = new My("���缮", "������", 30);
		my1.write();
		System.out.println();
		
		System.out.println("**�������̵� �޼��带 ���� ����غ���**");
		my1.display(); //My�� display�� ȣ��, ���� My�� display�� ������� �ڵ����� �θ���� ȣ��ȴ�.
		
		
		
		
	}

}
