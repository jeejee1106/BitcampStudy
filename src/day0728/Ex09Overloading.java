package day0728;

class Orange {
	public void write(String a) {
		System.out.println("���ڿ� :"+a);
	}
	
	public void write(int a) {
		System.out.println("����:"+a);
	}
	
	public void write(String a ,int b) {
		System.out.println("���ڿ��� ����:"+a+","+b);
	}
	
	public void write(String a,String b) {
		System.out.println("���ڿ�2 :"+a+","+b);
	}
}

public class Ex09Overloading {

	public static void main(String[] args) {
	
		Orange or = new Orange();
		or.write(7);
		or.write("red");
		or.write("��̲�", 3);
		or.write("�ƹݶ�", "����");
		//or.write(5,7); //����-match�Ǵ� �޼��尡 ����
	}

}