package day0729;

class Apple{
	
	Apple(){  //�⺻������ - �Ű������� ���� ������
		System.out.println("����Ʈ ������");
	}
	Apple(String name){ //�������� �����ε�
		System.out.println("�̸� " + name + "���� ���ڷ� �޴� ������");
	}
	Apple(int age){  //�������� �����ε�
		System.out.println("���� " + age  + "�� ���ڷ� �޴� ������");
	}
}

class Orange{
	String name;
	int age;
	
	Orange(){
		this("�̿���",20); //���ڰ� �´� �����ڰ� ȣ��ȴ�. �ݵ�� ù��
	}
	Orange(String name){
		this(name,20);
	}
	Orange(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void write() {
		System.out.println("name : " + name + ", age : " + age);
	}
}

public class Ex02Constructor {

	public static void main(String[] args) {
		//�����ڴ� ��ü ������ �ڵ� ȣ��ȴ�.
		Apple a1 = new Apple();
		Apple a2 = new Apple("����");
		Apple a3 = new Apple(20);
		System.out.println("----------------");
		
		Orange o1 = new Orange();
		o1.write();
		Orange o2 = new Orange("ĵ��");
		o2.write();
		Orange o3 = new Orange("���缮", 30);
		o3.write();
		
		
		
		
		
		
		
	}

}
