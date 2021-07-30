package day0730;

class School{
	public static final String SCHOOLNAME = "��������б�";
	private String schoolAddr;
	private int cntS;
	private int cntT;
	
	School(){
//		this.schoolAddr = "������";
//		this.cntS = 30;
//		this.cntT = 2;
		this("������", 30, 2); //�� ���ٰ� �����ڵ�
	}
	
	School(String schoolAddr, int cntS, int cntT){
		this.schoolAddr = schoolAddr;
		this.cntS = cntS;
		this.cntT = cntT;
	}
	
	public String getSchoolAddr() {
		return schoolAddr;
	}

	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}

	public int getCntS() {
		return cntS;
	}

	public void setCntS(int cntS) {
		this.cntS = cntS;
	}

	public int getCntT() {
		return cntT;
	}

	public void setCntT(int cntT) {
		this.cntT = cntT;
	}

	public static String getSchoolname() {
		return SCHOOLNAME;
	}

	public void writeData() {
		System.out.println("�б��ּ� : " + schoolAddr);
		System.out.println("�л��� : " + cntS);
		System.out.println("�����Լ� : " + cntT);
	}
}

class Student extends School{
	private String Sname;
	private int score;
	
	Student(){
		this.Sname = "���缮";
		this.score = 100;
	}
	
	Student(String schoolAddr, int cntS, int cntT, 
			String Sname,int score){
		super(schoolAddr, cntS, cntT);
		this.Sname = Sname;
		this.score = score;
	}
	
	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public void writeData() {
		// TODO Auto-generated method stub
		System.out.println("�б��� : " + SCHOOLNAME);
		super.writeData();
		System.out.println("�л��� : " + Sname);
		System.out.println("���� : " + score);
	}
}

public class Ex06Inherit {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.writeData();
		System.out.println();
		
		Student st2 = new Student("���Ǳ�", 50, 4, "��ȣ��", 50);
		st2.writeData();
		System.out.println();
		
		System.out.println("*ù��°�� �л���� ���� ���� �� ���*");
		st1.setSname("�̿���");
		st1.setScore(85);
		st1.writeData();
	
	}

}
