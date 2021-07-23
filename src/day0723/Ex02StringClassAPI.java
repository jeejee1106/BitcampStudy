package day0723;

public class Ex02StringClassAPI {

	public static void main(String[] args) {
		//String 객체에 대한 멤버 메서드 공부하기
		
		//.length()        :  문자열의 길이(공백포함)
		//.trim()          :  문자열의 공백 제거
		//.charAt(n)       :  문자열 n번째 위치의 문자(위치는 0부터 셈)
		//.indexOf(C)      :  문자열 중 문자'C'의 위치
		//.substring(n,m)  :  문자열 n번째 위치부터 m까지 추출
		//.substring(n)    :  문자열 n번째 위치부터 끝까지 추출
		//a.equlse(b)        :  문자열과 문자열이 같은지 비교. 대소문자까지 같아야 true
		//a.equlseIgnoreCass(b) : 문자열과 문자열이 같은지 비교. 대소문자 상관없음.스펠링만 같으면 true
		//a.compareTo(b) : a와 b가 같을 경우0, a가 작을경우 -값, a가 클경우 +값. 첫 글자의 아스키코드 기준임. 
		//.startsWith()
		//.endsWith()
		//.split()
		//.toLowerCase()
		//.toUpperCase()
		
		String str1 = "apple";
		String str2 = "Apple";
		String str3 = "Have a Nice Day";
		String str4 = "     Happy day     ";
		
		System.out.println("str3의 길이:" + str3.length());
		System.out.println("str4의 길이:" + str4.length());
		System.out.println("앞뒤 공백 제거 후 str4의 길이:" + str4.trim().length());
		System.out.println("*"+str4+"*");
		System.out.println("*"+str4.trim()+"*");
		System.out.println("str3의 0번째 문자:" + str3.charAt(0));
		System.out.println("str3의 7번째 문자:" + str3.charAt(7));
		System.out.println("str3의 H의 인덱스:" + str3.indexOf('H'));
		System.out.println("str3의 N의 인덱스:" + str3.indexOf('N'));
		System.out.println("str3에서 HAVE 추출:" + str3.substring(0,4));
		System.out.println("str3에서 Nice 추출:" + str3.substring(7,11));
		System.out.println("str3에서 Nice부터 끝까지 추출:" + str3.substring(7));

		
		System.out.println("문자열비교:" + str1.equals(str2));
		System.out.println("문자열비교:" + str1.equalsIgnoreCase(str2));
		
		
		System.out.println(str1.compareTo(str2)); //32
		//a(97)pple 과 A(65)pple 비교해서 97-65라서 32가 나옴.
		//숫자는 중요하지 않음. +냐 -냐가 중요.
		System.out.println(str1.compareTo(str1)); //0
		System.out.println("computer".compareTo("command")); //3
		//com까지 같으니 p와 m을 비교.
		System.out.println("hello".compareTo("hello")); //0
		System.out.println("apple".compareTo("banana")); //-1
		System.out.println("kiwi".compareTo("orange")); //-4
		
		
		System.out.println("str3가 Have로 시작하면 true:" + str3.startsWith("Have"));
		System.out.println("str3가 Have로 시작하면 true:" + str3.startsWith("Happy"));
		System.out.println("str3가 Day로 끝나면 true:" + str3.endsWith("day"));
		System.out.println("str3가 Day로 끝나면 true:" + str3.endsWith("Day")); //대소문자 구분
		
		//문자열 분리하는 메서드 split
		String str5 = "red, blue, green, black, pink";
		System.out.println("str5를 컴마로 분리하여 출력하기");
		String[] arr = str5.split(",");
		System.out.println("분리된 색상의 갯수:" + arr.length);
		//출력
		for(String color:arr) { //배열이나 컬렉션에서 사용하는 for문
			System.out.println(color);
		}
		
		System.out.println("str3를 소문자로 출력:" + str3.toLowerCase());
		System.out.println("str3를 대문자로 출력:" + str3.toUpperCase());
		
		String a = String.valueOf(100); //int -> String
		String b = String.valueOf(12.3); //double -> Sting
		String a2 = 100+""; //연산시 String이 있으며 결과는 String
		String b2 = 12.3+"";
		
		System.out.println("문자열의 일부를 변경");
		System.out.println(str3.replace('a', '*'));
		System.out.println(str3.replace("Nice", "Good"));
		
		
		
		
		
		
		
		
		
	}

}
