package day0803;

import java.util.StringTokenizer;

import sun.util.locale.StringTokenIterator;

public class Ex09Split_Token {

	public static void main(String[] args) {
		
		String str = "red, blue, yellow, orange, gray";
		System.out.println("String ��ü�� split�� �̿��� ���ڿ� �и�");
		String[] arr = str.split(","); //split�� ���ڿ��� �и��ϴ� �޼���. ��ȯŸ���� ��Ʈ���迭!
		System.out.println("�� "+ arr.length + "��");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i + ":" + arr[i]);
		}
		
		System.out.println("StringTokenizer�� �̿��� ���ڿ� �и�" );
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("�� ��ū�� : " + st.countTokens());
		while(st.hasMoreTokens()) { //��� �ڿ� �� ��ū�� �ֳ� Ȯ���ϴ� �޼���
			System.out.println(st.nextToken()); //���� ��ū ���
		}
		
	}

}
