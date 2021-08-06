package day0805;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Ex01Set_String {

	//Set 타입은 중복데이타 허용안함, 비순차적으로 들어간다
	public static void main(String[] args) {
		//<E>:제네릭스:타입을 명시(타입을 명시하면 그 이외의 타입이 들어갈경우 오류발생)
		//제네릭스를 명시할경우 나중에 꺼낼때 검증이 필요없다(jdk5 에서 추가)
		//Set<String> set1=new HashSet<String>();
		Set<String> set1=new HashSet<>();//뒷부분의 제네릭스 부분은 생략 가능
		//String 만 가능하다
		set1.add("apple");
		//set1.add(7);//오류:제네릭스로 표시한 타입만 넣을수있다
		set1.add("apple");
		set1.add("apple");
		set1.add("Apple");
		set1.add("바나나");
		set1.add("수박");
		set1.add("바나나");
		set1.add("orange");

		System.out.println("총 갯수:"+set1.size());
		System.out.println("출력 #1");
		for(String s:set1)
			System.out.println(s);
		System.out.println();
		
		
		System.out.println("출력 #2");
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		
		System.out.println("출력 #3");
		Object []ob=set1.toArray();
		for(int i=0;i<ob.length;i++)
			System.out.println(ob[i]);
	}

}
