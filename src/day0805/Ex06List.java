package day0805;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex06List {

	public static void main(String[] args) {
		//List�� ����ϴ� �������� ���(1,2���� ���� ���� �����)
		
		List<String> list = new Vector<String>();
		list.add("orange");
		list.add("orange");
		list.add("apple");
		list.add("mango");
		list.add("apple");
		System.out.println("List ������ : " + list.size());
		System.out.println("** ��� #1 **");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("** ��� #2 **");
		for(int i = 0; i<list.size(); i++) {
			String s = list.get(i); //i���� �����͸� ������
			System.out.println(i + ":" + s);
		}
		
		System.out.println();
		System.out.println("** ��� #3 **");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		System.out.println("** ��� #4 **");
		Object[] obj = list.toArray();
		for(int i = 0; i<obj.length; i++) {
			System.out.println(i + ":" + obj[i]);
		}
		
	}

}
