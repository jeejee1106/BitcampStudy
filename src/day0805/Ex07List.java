package day0805;

import java.util.List;
import java.util.Vector;

public class Ex07List {
	
	public static void write(String title, List<String> list) {
		System.out.println("** " + title + " **");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String[] data = {"장미", "안개", "국화"};
		//배열의 데이타를  list에 넣기
		List<String> list = new Vector<String>();
		for(String d:data) {
			list.add(d);
		}
		write("초기데이터 출력", list);
		System.out.println("1번 인덱스 삭제하기");
		list.remove(1); //인덱스로 지우기
		write("삭제 후 결과", list);
		
		System.out.println("백합추가하기");
		list.add("백합");
		write("추가 후 결과", list);
		
		System.out.println("1번 인덱스의 국화꽃을 채송화로 변경");
		list.set(1, "채송화");
		write("변경 후 출력", list);
		
		System.out.println("채송화와(1번인덱스) 백합(2번인덱스) 사이에 프리지아 집어넣기");
		((Vector<String>)list).insertElementAt("후리지아",2);
		write("중간에 값넣은후", list);
		
		System.out.println("전체 삭제하기");
		list.clear();
		System.out.println("사이즈 : " + list.size());
	}

}
