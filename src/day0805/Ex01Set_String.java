package day0805;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Ex01Set_String {

	//Set Ÿ���� �ߺ�����Ÿ ������, ����������� ����
	public static void main(String[] args) {
		//<E>:���׸���:Ÿ���� ���(Ÿ���� ����ϸ� �� �̿��� Ÿ���� ����� �����߻�)
		//���׸����� ����Ұ�� ���߿� ������ ������ �ʿ����(jdk5 ���� �߰�)
		//Set<String> set1=new HashSet<String>();
		Set<String> set1=new HashSet<>();//�޺κ��� ���׸��� �κ��� ���� ����
		//String �� �����ϴ�
		set1.add("apple");
		//set1.add(7);//����:���׸����� ǥ���� Ÿ�Ը� �������ִ�
		set1.add("apple");
		set1.add("apple");
		set1.add("Apple");
		set1.add("�ٳ���");
		set1.add("����");
		set1.add("�ٳ���");
		set1.add("orange");

		System.out.println("�� ����:"+set1.size());
		System.out.println("��� #1");
		for(String s:set1)
			System.out.println(s);
		System.out.println();
		
		
		System.out.println("��� #2");
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		
		System.out.println("��� #3");
		Object []ob=set1.toArray();
		for(int i=0;i<ob.length;i++)
			System.out.println(ob[i]);
	}

}
