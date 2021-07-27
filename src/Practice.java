import java.util.Arrays;
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
		
		
//		int[] arr = {10,20,30,40,50}; 
//		int[] arr2 = Arrays.copyOf(arr,arr.length); //arr의 길이만큼 복사
//		int[] arr3 = Arrays.copyOf(arr,3); //arr의 길이 3개값만 복사
//		int[] arr4 = Arrays.copyOf(arr,7); //arr의 길이 7개값 복사. 빈자리는 0으로 채움
//		int[] arr5 = Arrays.copyOfRange(arr, 1, 4); //arr의 index[1]부터 [4]까지 복사. [4]는 포함하지 않음
//		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); //arr의 index[0]부터 [7]까지 복사. [7]은 포함하지 않음
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr3));
//		System.out.println(Arrays.toString(arr4));
//		System.out.println(Arrays.toString(arr5));
//		System.out.println(Arrays.toString(arr6));
		
		
		
//		int[] arr = {35, 100, 10, 50, 75, 65};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		
//		int[] Lotto = {80,61,4,5,79,50,155,031};
//		
//		for(int i = 0; i<Lotto.length-1; i++) {
//			for(int j = i+1; j<Lotto.length; j++) {
//				if(Lotto[i]>Lotto[j]) {
//					int n = Lotto[i];
//					Lotto[i] = Lotto[j];
//					Lotto[j] = n;
//				}
//			}
//		}	
//		
//		System.out.println(Arrays.toString(Lotto));
		
		
		//내림차순
		int[] arr = {35, 100, 10, 50, 75, 65};

		for(int n = 0; n<arr.length-1; n++) {
			for(int m = n+1; m<arr.length; m++) {
				if(arr[n]<arr[m]) {
					int tmp = arr[n];
					arr[n] = arr[m];
					arr[m] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		



	}

}
