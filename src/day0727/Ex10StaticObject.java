package day0727;

public class Ex10StaticObject {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		Student stu2 = new Student();

		stu1.name = "�̰���";
		stu1.age = 18;
		
		stu2.name = "��⿵";
		stu2.age = 16;
		
		Student.schoolName = "��������б�"; //static��������� Ŭ���� �̸����� ����
		
		System.out.println("**Ŭ���� ����� ���**");
		System.out.println("�б��� : " + Student.schoolName);
		System.out.println("*�л�1�� ����");
		System.out.println("�̸� : " + stu1.name + ", ���� : " + stu1.age);
		System.out.println("*�л�2�� ����");
		System.out.println("�̸� : " + stu2.name + ", ���� : " + stu2.age);
	}

}
