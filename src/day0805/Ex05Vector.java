package day0805;

import java.util.Vector;

public class Ex05Vector {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>(); //기본 10개 할당. 부족할 경우 2배 증가
		Vector<String> v2 = new Vector<String>(5); //기본 5개 할당. 부족할 경우 2배증가
		Vector<String> v3 = new Vector<String>(3,2); //기본 3개할당인데 부족할 때 2개씩 증가. 몇개씩 늘어날건지 안써주면 기본 2배로 늘어난다
		
		System.out.println("**기본 할당 크기 알아보기**");
		System.out.println("v1 = " + v1.capacity());
		System.out.println("v2 = " + v2.capacity());
		System.out.println("v3 = " + v3.capacity());
		
		v3.add("red");
		v3.add("yellow");
		v3.add("pink");
		System.out.println("v3 할당 크기 : " + v3.capacity());
		v3.add("gray"); //크기가 3인데 부족해져서 2개가 늘어났다.
		System.out.println("v3 할당 크기 : " + v3.capacity()); //그래서 할당크기 5
		System.out.println("v3 실제 사이즈 : " + v3.size());
		
		
	}

}
