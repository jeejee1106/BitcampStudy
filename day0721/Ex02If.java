package day0721;

import java.util.Scanner;

public class Ex02If {

	public static void main(String[] args) {
		
		/*
		 * 3과목의 점수를 입력 후 평균을 구하고
		 * 평균이 60이상이고 각 과목이 모구 40이상이면
		 * "당신은 합격입니다" 라고 출력
		 * 아닐경우 "당신은 불합격입니다"출력
		 * 3과목 점수와 평균(소수점1자리)도 출력
		 * if문으로 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		double avg;
		
		System.out.println("점수를 입력하세요");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		avg = (double)(kor+eng+mat)/3; //Q. avg를 더블형으로 줬는데 왜 또 3.0이라고 써야하는지 모르겠다.
		//A. 우항의 (kor+eng+mat)/3 모두 int형으로 작성되어 있다.
		//예를들어 (100+100+35/3)을 하면 78.333이다.
		//그러나 우항이 모두 int이기 때문에 78이출력되고! 그 후 78이 더블형인 avg로 들어가기 때문에
		//78이 더블형으로 변환되어 78.0이 된다.
		//그렇기 때문에 우항에서 먼저 더블형을 만들어줘야 소수점이 제대로 출력이 된다!!!
		
		System.out.println("kor : " + kor + " eng : " + eng + " mat : " + mat );
		System.out.println("avg : " + (avg)); //더블형으로만 출력
		System.out.printf("avg : %.1f\n", avg); //소수점1자리까지 출력
		
		if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
			System.out.println("당신은 합격입니다.");
		} else {
			System.out.println("당신은 불합격입니다.");
		}
		
		
	}

}
