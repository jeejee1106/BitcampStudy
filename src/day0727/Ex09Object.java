package day0727;

public class Ex09Object {
	//instance ��� ���� ���� - �ν��Ͻ� �����θ� ȣ�Ⱑ��
	//�Ϲ� �ν��Ͻ� ��������� ��ü���� �� ���� �ٸ� ���� ���� �� �ִ�.
	String name;
	//static ��������� �ַ� ����� ���� �� �� ����ϸ� �ν��Ͻ���������
	//Ŭ���������� ���� �����ϴ�(��, ���� Ŭ������������ Ŭ������ ��������)
	//���� ��ü�� ���� ���� ������ �� ��� �ַ� static���� �����Ѵ�.
	static final String MESSAGE = "Happy Day!";

	public static void main(String[] args) {
		
		System.out.println("static ��������� new�� ���� ���� ȣ�Ⱑ��");
		System.out.println(Ex09Object.MESSAGE);
		System.out.println(MESSAGE); //���� Ŭ���� ���� �޼��忡���� Ŭ������ ��������
//		MESSAGE="Nice!!"; //���� - final�̶� �� ���� �ȵ�
		
		Ex09Object yh = new Ex09Object(); //��ü����, yh������ �ν��Ͻ� ��������Ѵ�.
		Ex09Object cs = new Ex09Object(); 
		Ex09Object mj = new Ex09Object();
		
		yh.name = "�̿���";
		cs.name = "��ö��";
		mj.name = "�չ���";
		
		System.out.println(yh.name);
		System.out.println(cs.name);
		System.out.println(mj.name);
		System.out.println("�ٰ��� ����ϴ� �޼��� : " + MESSAGE);
		
		
		
		
		
	}

}
