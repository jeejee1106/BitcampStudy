package day0730;

class Parent { //�ʵ�
	private String name;
	private int age;
	
	Parent(){ //������
		System.out.println("�θ� ����Ʈ ������");
		this.name = "����";
		this.age = 10;
	}
	
	Parent(String name, int age){ //������ �����ε�
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
////////////////////////////////////
class Child extends Parent{
	private String hp;
	
	Child() {
//		super(); //�갡 �ڵ� �����Ǿ�����. ����Ʈ�϶��� ��������. �θ��� �ٸ� �����ڿ� ȣ���� �����ȵ�.
		System.out.println("�ڽ� ����Ʈ ������");
		this.hp = "010-1234-5678";
	}
	
	Child(String name, int age, String hp) {
		super(name, age); //�����ȵ�. ������ �θ����Ʈ�� ȣ��, �ݵ�� ù��
		this.hp = hp;
	}
	
	public void writeData() {
		System.out.println("�̸� : " + this.getName());
		System.out.println("���� : " + this.getAge());
		System.out.println("�ڵ��� : " + hp);
		System.out.println();
	}
}

public class Ex03Inherit {

	public static void main(String[] args) {
		
		Child ch1 = new Child();
		ch1.writeData();
		
		Child ch2 = new Child("��ȣ��", 30, "011-345-6789");
		ch2.writeData();
		
		
		
		
		
		
		
		
	}
	
}
