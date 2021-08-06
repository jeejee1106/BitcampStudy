package day0805;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex03Set_Exe {

	public static void main(String[] args) {

		/*
		 * Set,Random �̿��Ͽ� ����Ǯ��
		 * 
		 * 1~45 �� ���� �ٸ� ���� 6�������ؼ� ����ϱ� 
		 */
		Random r=new Random();
		Set<Integer> set=new HashSet<Integer>();
		while(true)
		{
			int n=r.nextInt(45)+1;
			set.add(n);
			if(set.size()==6)
				break;
		}
		//���
		for(int n:set)
			System.out.printf("%5d",n);
		System.out.println();
		System.out.println("** ������ ��� **");

		Object []ob=set.toArray(); //�������� ��� ��� �� Object ���!
		Arrays.sort(ob);//�迭�� ���� �������� ���ļ����� �������ش�
		for(int i=0;i<ob.length;i++) {
			System.out.printf("%5d",ob[i]);
		}
	}
}
