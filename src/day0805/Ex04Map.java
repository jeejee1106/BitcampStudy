package day0805;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex04Map {

	//Map은 key와 value가 쌍으로 저장되는 구조의 컬렉션이다.
	//이 때 key는 set타입이므로 중복을 허락하지 않는다.
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "이영자");
		map.put("name", "유재석"); //key값이 name으로 같다. 이럴 경우 덮어써진다.(유재석만 출력)
		map.put("addr", "강남구");
		map.put("age", "23세");
		map.put("blood", "AB형");
		
		
		System.out.println("이름 : " + map.get("name"));
		System.out.println("주소 : " + map.get("addr"));
		System.out.println("나이 : " + map.get("age"));
		System.out.println("혈액형 : " + map.get("blood"));
		System.out.println("회사명 : " + map.get("emp"));//해당 key값이 없을경우 null값 반환
		System.out.println("사이즈 : " + map.size());
		
		//Map에서 주소 삭제하기
		map.remove("addr");
		System.out.println("삭제 후 사이즈 : " + map.size());
		
		System.out.println();
		
		//자동으로 key값 얻어서 출력하기
		Set<String> keys = map.keySet();
		//순서는 비순차적
		for(String key:keys) {
			String value = map.get(key);
			System.out.println(key + "=>" + value);
		}
		
	}

}
