package day0728;

class Manggo {
	private String writer;
	private String subject;
	private static String mes="Happy";
	
	//setter method
	public void setWriter(String writer) {
		this.writer=writer;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	//getter method
	public static String getMes() {
		return mes;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public String getSubject() {
		return subject;
	}	
}
public class Ex03ObjectMethod {

	//Manggo 클래스의 변수값을 출력하기 위한 메서드
	public static void writeManggo(Manggo m) {
		System.out.println("** 망고 클래스 출력 **");
		System.out.println("작성자:"+m.getWriter());
		System.out.println("제목:"+m.getSubject());
	}
	
	public static void main(String[] args) {
		System.out.println("망고클래스의 메세지 출력");
		System.out.println(Manggo.getMes()); //static 메서드도 static 변수와같이 클래스명으로 호출한다
		
		Manggo m1=new Manggo();
		m1.setWriter("캐서린");
		m1.setSubject("오늘은 수요일");
		
		Manggo m2=new Manggo();
		m2.setWriter("마이클");
		m2.setSubject("안녕하세요");
		
		writeManggo(m1); //같은 클래스내의 static 메서드 호출은 클래스명 생략가능하다
		writeManggo(m2);
	}

}