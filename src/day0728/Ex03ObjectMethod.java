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

	//Manggo Ŭ������ �������� ����ϱ� ���� �޼���
	public static void writeManggo(Manggo m) {
		System.out.println("** ���� Ŭ���� ��� **");
		System.out.println("�ۼ���:"+m.getWriter());
		System.out.println("����:"+m.getSubject());
	}
	
	public static void main(String[] args) {
		System.out.println("����Ŭ������ �޼��� ���");
		System.out.println(Manggo.getMes()); //static �޼��嵵 static �����Ͱ��� Ŭ���������� ȣ���Ѵ�
		
		Manggo m1=new Manggo();
		m1.setWriter("ĳ����");
		m1.setSubject("������ ������");
		
		Manggo m2=new Manggo();
		m2.setWriter("����Ŭ");
		m2.setSubject("�ȳ��ϼ���");
		
		writeManggo(m1); //���� Ŭ�������� static �޼��� ȣ���� Ŭ������ ���������ϴ�
		writeManggo(m2);
	}

}