package day0730;

class School{
	public static final String SCHOOLNAME = "강남고등학교";
	private String schoolAddr;
	private int cntS;
	private int cntT;
	
	School(){
//		this.schoolAddr = "강남구";
//		this.cntS = 30;
//		this.cntT = 2;
		this("강남구", 30, 2); //위 세줄과 같은코드
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
		System.out.println("학교주소 : " + schoolAddr);
		System.out.println("학생수 : " + cntS);
		System.out.println("선생님수 : " + cntT);
	}
}

class Student extends School{
	private String Sname;
	private int score;
	
	Student(){
		this.Sname = "유재석";
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
		System.out.println("학교명 : " + SCHOOLNAME);
		super.writeData();
		System.out.println("학생명 : " + Sname);
		System.out.println("점수 : " + score);
	}
}

public class Ex06Inherit {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.writeData();
		System.out.println();
		
		Student st2 = new Student("관악구", 50, 4, "강호동", 50);
		st2.writeData();
		System.out.println();
		
		System.out.println("*첫번째의 학생명과 점수 변경 후 출력*");
		st1.setSname("이영자");
		st1.setScore(85);
		st1.writeData();
	
	}

}
