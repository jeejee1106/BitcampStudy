package day0728;

class Orange {
	public void write(String a) {
		System.out.println("문자열 :"+a);
	}
	
	public void write(int a) {
		System.out.println("정수:"+a);
	}
	
	public void write(String a ,int b) {
		System.out.println("문자열과 정수:"+a+","+b);
	}
	
	public void write(String a,String b) {
		System.out.println("문자열2 :"+a+","+b);
	}
}

public class Ex09Overloading {

	public static void main(String[] args) {
	
		Orange or = new Orange();
		or.write(7);
		or.write("red");
		or.write("장미꽃", 3);
		or.write("아반떼", "벤츠");
		//or.write(5,7); //오류-match되는 메서드가 없음
	}

}