package day0805;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02Set {

	public static void main(String[] args) {

		//Integer �� ������ �ִ�
		Set<Integer> set1=new HashSet<Integer>();
		//��� �÷��� Ÿ���� ������Ʈ�� ������ �ִ�
		//jdk4������ Ŭ������ ��ȯ�� �־�߸� �ߴ�
		set1.add(new Integer(5));
		//jdk5���ʹ� ����ڽ��̶���ؼ� �ڵ����� ������Ʈ�� ��ȯ�Ǽ� ����
		set1.add(5);
		set1.add(11);
		set1.add(13);
		set1.add(22);
		System.out.println("����:"+set1.size());
		System.out.println("��� #1");
		for(int n:set1)
			System.out.printf("%5d",n);
		System.out.println();
		System.out.println("��� #2");
		Iterator<Integer> iter=set1.iterator();
		while(iter.hasNext())
			System.out.printf("%5d",iter.next());
		System.out.println();
		System.out.println("��� #3");
		Object []ob=set1.toArray();
		for(int i=0;i<ob.length;i++)
			System.out.printf("%5d",ob[i]);

	}

}
