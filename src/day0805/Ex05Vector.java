package day0805;

import java.util.Vector;

public class Ex05Vector {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>(); //�⺻ 10�� �Ҵ�. ������ ��� 2�� ����
		Vector<String> v2 = new Vector<String>(5); //�⺻ 5�� �Ҵ�. ������ ��� 2������
		Vector<String> v3 = new Vector<String>(3,2); //�⺻ 3���Ҵ��ε� ������ �� 2���� ����. ��� �þ���� �Ƚ��ָ� �⺻ 2��� �þ��
		
		System.out.println("**�⺻ �Ҵ� ũ�� �˾ƺ���**");
		System.out.println("v1 = " + v1.capacity());
		System.out.println("v2 = " + v2.capacity());
		System.out.println("v3 = " + v3.capacity());
		
		v3.add("red");
		v3.add("yellow");
		v3.add("pink");
		System.out.println("v3 �Ҵ� ũ�� : " + v3.capacity());
		v3.add("gray"); //ũ�Ⱑ 3�ε� ���������� 2���� �þ��.
		System.out.println("v3 �Ҵ� ũ�� : " + v3.capacity()); //�׷��� �Ҵ�ũ�� 5
		System.out.println("v3 ���� ������ : " + v3.size());
		
		
	}

}
