import java.util.Date;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		////////////////////////////////0721 13번/////////////////////////////////////
		/*
		 * 총 5개의 점수를 입력 받아 합계를 구해보자
		 * 점수가 1보다 작거나 100보다 크면 다시 입력받으시오
		 * ex)
		 * 1번 점수 : 90
		 * 2번 점수 : 120
		 * 	잘못입력했어요
		 * 2번 점수 : 100
		 * 3번 점수 : 50
		 * ...
		 * 
		 */

		//두 번째 풀이
		//		Scanner sc = new Scanner(System.in);
		//		int sum = 0;
		//		int score;
		//		System.out.println("점수입력");
		//		for(int i = 1; i<=5; i++) {
		//			System.out.print(i + "번 과목 : ");
		//			score = sc.nextInt();
		//			if(score<0 || score>100) {
		//				System.out.println("잘못입력");
		//				i--;
		//				continue;
		//			} sum+=score;
		//		} System.out.println("점수의 총합 : " + sum);

		//0724 세 번째 풀이




		///////////////////////////////////달력만들기/////////////////////////////////
		/*
		 *년도와 월을 입력 후 달력 출력하기
		 *
		 * 요구사항
		 * 1. 월이 1~12를 벗어나면 경고메세지와 함께 프로그램 종료
		 * 2. 일요일부터 토요일순으로 출력
		 * 
		 * 힌트 : 달력을 만들기 위해서 알아야 할 사항
		 * 1. 그 년도의 그 월이 며칠까지 있는지
		 * 2. 그 년도의 월의 1일이 무슨 요일인지(Date클래스의 getday를 이용)
		 */

		//		Scanner sc = new Scanner(System.in);
		//		int year, month;
		//		Date date;
		//		int days;//총일수
		//		int week; //요일수
		//		System.out.println("년도 월 입력");
		//		year=sc.nextInt();
		//		month=sc.nextInt();
		//		//1. 월이 1~12를 벗어나면 경고메세지와 함께 프로그램 종료
		//		if (month<1 || month>12) {
		//			System.out.println("잘못입력");
		//			return;
		//		}
		//		
		//		//date생성
		//		date = new  Date(year-1900, month-1, 1);
		//		//요일숫자 구하기
		//		week = date.getDay();
		//		//입력한 년도와 월의 총 일수 구하기
		//		switch(month) {
		//		case 2:
		//			if(year%4==0 && year%100!=0 || year%400==0) {
		//				days = 29;
		//			} else {
		//				days = 28;
		//			} break;
		//		case 4: case 6: case 9: case 11:
		//			days = 30;
		//			break;
		//		default:
		//			days = 31;
		//		}
		//		
		//		System.out.println("\t"+ year + "년" + month + "월\n");
		//		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//		System.out.println("===================================================");
		//		//요일 숫자 만큼 탭 띄우기
		//		for(int i = 1; i<=week; i++) {
		//			System.out.print("\t");
		//		}
		//		//1일부터 출력하기
		//		for(int i = 1; i<=days; i++) {
		//			week++;
		//			System.out.print(i + "\t");
		//			if(week%7==0) { //토요일일 경우 줄넘김
		//				System.out.println();
		//			}
		//		}






		//////////////////////////////////////0723 숙제//////////////////////////////////////
		/*
		 * [문제1]
		 * 숫자 inp를 입력받아 배열의 몇번째에 있는지 출력
		 * 없을경우 "없습니다" 출력
		 * 반복해서 입력하다가 0입력시 종료
		 * 
		 * 예)
		 * 입력값 : 11
		 * 			11은 2번째에 있어요!
		 * 입력값 : 100
		 * 			100은 없습니다.
		 * 입력값 : 0
		 * 			종료합니다.
		 * */













	}

}
