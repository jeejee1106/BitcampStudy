package day0728;
//0729��Ű���� Ex04�� ����
import java.util.Scanner;

public class Info { //public�� �Ⱥ��� ��� ���� �����ڰ� default�� �ż� ��Ű��0729������ ����� �� ����!!!
	//�ʵ�
	Scanner sc; //��� ��������� ��ü�� ��� null�� �ʱ�ȭ
	String name;
	String blood;
	String hp;
	
	//������
	public Info(){
		sc=new Scanner(System.in);
		name = "��ȿ��";
		blood = "a��";
		hp = "010-123-4567";
	}
	
	//�޼���
	public void dataIn() {
		System.out.println("�̸��Է�");
		this.name = sc.nextLine();
		System.out.println("��������?");
		blood=sc.nextLine().toUpperCase();
		System.out.println("�ڵ�����ȣ��?");
		hp = sc.nextLine();
		
	}
	
	public void dataOut() {
		System.out.println("�̸� : " + name);
		System.out.println("������ : " + blood);
		System.out.println("�ڵ�����ȣ : " + hp);
	}

}
