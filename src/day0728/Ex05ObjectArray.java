/*  [����]
	Student Ŭ����
	static ��� ������   :  schoolName
	���������   :  name,java,html
	��� �޼��� : setter & getter �޼��� ����

	�ΰ����� �հ踦 ��ȯ�ϴ� �޼���  getTotal
	�ΰ����� ����� ��ȯ�ϴ� �޼���  getAverage
	��տ� ���ؼ�  90 �̻��̸� �����л���
	80 �̻��̸�  ���հݡ�
	�������� �����հݡ� �� ��ȯ�ϴ� �޼���   getPungga()

	�б��̸� �Է¹޾� schoolName �� �ֱ�
	�ο��� �Է¹޾� �ο�����ŭ �̸�,java,html ���� �Է�

	�����
	�б��� : û�����б�

	�̸�    Java  HTML  ����      ���       ��
	�̿���   90    81   171   85.5     �հ� 
 */

package day0728;

import java.util.Scanner;

class Student {
	private static String schoolName;
	private String name;
	private int java,html;

	public static void setScoolName(String schoolName) {
		Student.schoolName=schoolName;
	}

	public static String getScoolName() {
		return schoolName;
	}

	//setter & getter
	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setJava(int java) {
		this.java=java;
	}

	public int getJava() {
		return java;
	}

	public void setHtml(int html) {
		this.html=html;
	}

	public int getHtml() {
		return html;
	}

	//�հ�
	public int getTotal() {
		return java+html;
	}

	//���
	public double getAverage() {
		return getTotal()/2.0;
	}

	//��
	public String getPungga() {
		if(getAverage()>=90)
			return "���л�";
		else if(getAverage()>=80)
			return "�հ�";
		else
			return "���հ�";
	}
}
public class Ex05ObjectArray {
	public static void writeStudent(Student s) {
		System.out.println(s.getName()+"\t"+s.getJava()+"\t"+s.getHtml()+"\t"+
				s.getTotal()+"\t"+s.getAverage()+"\t"+s.getPungga());
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int inwon;
		Student []stu;
		String schoolName;

		System.out.println("�Է��� �ο���");
		inwon=Integer.parseInt(sc.nextLine());
		System.out.println("�б���");
		schoolName=sc.nextLine();

		Student.setScoolName(schoolName);

		//�ο�����ŭ Student �迭 �Ҵ�
		stu=new Student[inwon];

		//�ο�����ŭ �Է�
		for(int i=0;i<inwon;i++) {
			System.out.println(i+" ���л� �̸�");
			String name=sc.nextLine();
			System.out.println("�ڹ������� HTML ���� �Է�");
			int java=Integer.parseInt(sc.nextLine());
			int html=Integer.parseInt(sc.nextLine());

			//i��° Student ����
			stu[i]=new Student();
			stu[i].setName(name);
			stu[i].setJava(java);
			stu[i].setHtml(html);
		}

		System.out.println("** ��� ��� **");
		System.out.println("�б���:"+Student.getScoolName());
		System.out.println("�л���\tJava\tHTML\t����\t���\t��");
		System.out.println("-----------------------------------------------------");
		for(Student s:stu)
			writeStudent(s);
	}
}