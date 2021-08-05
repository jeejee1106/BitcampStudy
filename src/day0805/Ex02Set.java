package day0805;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02Set {

	public static void main(String[] args) {

		//Integer 만 넣을수 있다
		Set<Integer> set1=new HashSet<Integer>();
		//모든 컬렉션 타입은 오브젝트만 넣을수 있다
		//jdk4까지는 클래스로 변환후 넣어야만 했다
		set1.add(new Integer(5));
		//jdk5부터는 오토박싱이라고해서 자동으로 오브젝트로 변환되서 들어간다
		set1.add(5);
		set1.add(11);
		set1.add(13);
		set1.add(22);
		System.out.println("갯수:"+set1.size());
		System.out.println("출력 #1");
		for(int n:set1)
			System.out.printf("%5d",n);
		System.out.println();
		System.out.println("출력 #2");
		Iterator<Integer> iter=set1.iterator();
		while(iter.hasNext())
			System.out.printf("%5d",iter.next());
		System.out.println();
		System.out.println("출력 #3");
		Object []ob=set1.toArray();
		for(int i=0;i<ob.length;i++)
			System.out.printf("%5d",ob[i]);

	}

}
