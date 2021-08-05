package day0805;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex06List {

	public static void main(String[] args) {
		//List를 출력하는 여러가지 방법(1,2번을 제일 많이 사용함)
		
		List<String> list = new Vector<String>();
		list.add("orange");
		list.add("orange");
		list.add("apple");
		list.add("mango");
		list.add("apple");
		System.out.println("List 사이즈 : " + list.size());
		System.out.println("** 출력 #1 **");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("** 출력 #2 **");
		for(int i = 0; i<list.size(); i++) {
			String s = list.get(i); //i번지 데이터를 꺼낸다
			System.out.println(i + ":" + s);
		}
		
		System.out.println();
		System.out.println("** 출력 #3 **");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		System.out.println("** 출력 #4 **");
		Object[] obj = list.toArray();
		for(int i = 0; i<obj.length; i++) {
			System.out.println(i + ":" + obj[i]);
		}
		
	}

}
