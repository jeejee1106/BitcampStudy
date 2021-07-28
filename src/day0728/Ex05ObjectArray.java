/*  [문제]
	Student 클래스
	static 멤버 변수명   :  schoolName
	멤버변수명   :  name,java,html
	멤버 메서드 : setter & getter 메서드 구현

	두과목의 합계를 반환하는 메서드  getTotal
	두과목의 평균을 반환하는 메서드  getAverage
	평균에 대해서  90 이상이면 “장학생”
	80 이상이면  “합격”
	나머지는 “불합격” 을 반환하는 메서드   getPungga()

	학교이름 입력받아 schoolName 에 넣기
	인원수 입력받아 인원수만큼 이름,java,html 점수 입력

	출력은
	학교명 : 청담고등학교

	이름    Java  HTML  총점      평균       평가
	이영자   90    81   171   85.5     합격 
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

	//합계
	public int getTotal() {
		return java+html;
	}

	//평균
	public double getAverage() {
		return getTotal()/2.0;
	}

	//평가
	public String getPungga() {
		if(getAverage()>=90)
			return "장학생";
		else if(getAverage()>=80)
			return "합격";
		else
			return "불합격";
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

		System.out.println("입력할 인원수");
		inwon=Integer.parseInt(sc.nextLine());
		System.out.println("학교명");
		schoolName=sc.nextLine();

		Student.setScoolName(schoolName);

		//인원수만큼 Student 배열 할당
		stu=new Student[inwon];

		//인원수만큼 입력
		for(int i=0;i<inwon;i++) {
			System.out.println(i+" 번학생 이름");
			String name=sc.nextLine();
			System.out.println("자바점수와 HTML 점수 입력");
			int java=Integer.parseInt(sc.nextLine());
			int html=Integer.parseInt(sc.nextLine());

			//i번째 Student 생성
			stu[i]=new Student();
			stu[i].setName(name);
			stu[i].setJava(java);
			stu[i].setHtml(html);
		}

		System.out.println("** 결과 출력 **");
		System.out.println("학교명:"+Student.getScoolName());
		System.out.println("학생명\tJava\tHTML\t총점\t평균\t평가");
		System.out.println("-----------------------------------------------------");
		for(Student s:stu)
			writeStudent(s);
	}
}