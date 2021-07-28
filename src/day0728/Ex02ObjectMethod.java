package day0728;

//�ϳ��� �ҽ����Ͽ� ���ϸ�� ���� Ŭ���� �ܿ� �ٸ� Ŭ������ �߰��� �����Ұ�� 
//�� Ŭ������ ���� ��Ű���������� ��� ������ Ŭ������ �ȴ�(public ���� ������)
class Apple {
	//��� ��������� private �� �����غ���
	private String name;
	private int age;
	public static final String ADDR="Seoul";

	//�������� ���� �޼��带 setter �޼����� �Ѵ�
	//��Ģ�� setName,setAge
	public void setName(String name) {
		//���������� ����������� ���� ��쿡�� �����ϱ� ���ؼ�
		//��������� �տ� �ν��Ͻ� this�� �ݵ�� �ٿ����Ѵ�
		//���� �̸��� ������쿡�� ������ �����ϴ�
		//this: �ڰ��ڽſ� ���� �ν��Ͻ� ����(�Ϲ� ����������� ����(static����������� ����)
		this.name=name;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public void setData(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//���� ��ȯ�ϱ� ���� �޼��带 getter method ��� �Ѵ�
	//getName,getAge
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}	

	public void write() {
		System.out.println("�̸� : "+this.name+", ���� : "+this.age);
	}
}

public class Ex02ObjectMethod {

	public static void main(String[] args) {
		Apple app=new Apple();
		//app.name="ȫ�浿";//���� ��Ű���� �ٸ� Ŭ������ private ������ ������ �Ұ����ϴ�

		//������
		app.setName("��ȣ��");
		app.setAge(23);

		System.out.println("�̸� 1 :"+app.getName());
		System.out.println("���� 1 :"+app.getAge());

		Apple app2=new Apple();
		app2.setData("�̿���", 35);
		app2.write();
		System.out.println("1�� �л�");
		app.write();		
	}
}
