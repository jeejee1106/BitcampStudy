package day0805;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex03Set_Exe {

	public static void main(String[] args) {

		/*
		 * Set,Random 이용하여 문제풀기
		 * 
		 * 1~45 의 서로 다른 난수 6개를구해서 출력하기 
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
		//출력
		for(int n:set)
			System.out.printf("%5d",n);
		System.out.println();
		System.out.println("** 정렬후 출력 **");

		Object []ob=set.toArray(); //여러가지 출력 방법 중 Object 방법!
		Arrays.sort(ob);//배열의 값을 오름차순 정렬순으로 변경해준다
		for(int i=0;i<ob.length;i++) {
			System.out.printf("%5d",ob[i]);
		}
	}
}
