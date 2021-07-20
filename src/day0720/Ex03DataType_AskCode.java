package day0720;

public class Ex03DataType_AskCode {

	public static void main(String[] args) {
		char a = 'A';
		int b = 98;
		System.out.println(a); //A
		System.out.println((int)a); //아스키코드로 변형된A = 65
		System.out.println(b); //98
		System.out.println((char)b); //아스키코드로 변형된98 = b
		System.out.println(a+3); // 아스키코드로 변형된A(=65) + 3 = 68
		System.out.println((char)(a+3)); //a+3을 아스키코드로 출력한 후 다시 그 숫자를 아스키코드로 변형시킨 문자가 나옴
		System.out.println(b+2); //100
		System.out.println((char)(b+2)); //?
		
		//아스키코드로 Hello 출력하기
		System.out.printf("%c %c %c %c %c\n", 72, 101, 108, 108, 111);
		
		//main parameter값으로 3과목의 점수를 읽어서 총점과 평균(소숫점 2자리 이하)로 출력
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int mat = Integer.parseInt(args[2]);
		int total = kor + eng + mat;
		int count = 3; //세 과목을 의미하는 변수값
		double avg1 = total/count;
		double avg2 = (double)total/count;
		System.out.printf("국어=%d, 영어=%d, 수학=%d\n", kor, eng, mat);
		System.out.println("총점 = " + total);
		System.out.println("평균1 = " + avg1);
		System.out.println("평균2 = " + avg2);
		System.out.printf("평균3 + %.2f\n", avg2);
		
		
		
		

	}

}
