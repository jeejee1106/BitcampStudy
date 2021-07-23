package day0722;

import java.util.Scanner;

public class Ex10While_Exe {

	public static void main(String[] args) {
		
		/*
		 * 1. 나이를 반복해서 입력받는다
		 * 2. 0이 입력되먄 빠져나와서 출력
		 * 3. 나이가 50이상일 경우 a변수 증가
		 *    30 이상일 경우 b변수 증가
		 *    그 나머지는 c변수 증가
		 * 4. 빠져나온 후 출력내용
		 *    50세 이상 : 3명
		 *    30세 이상 : 2명
		 *    그 이외 : 1명
		 * */
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("나이 입력");
		while(true) {
			int age = sc.nextInt();
			if(age<=0) {
				break;
			} else if(age>=50) {
				a++;
			} else if(age>=30) {
				b++;
			} else {
				c++;
			}
		}
		System.out.println("50세 이상 : " + a);
		System.out.println("30세 이상 : " + b);
		System.out.println("그 이외 : " + c);
		
		
		System.out.println();
		
		sc.nextLine();
		
		/*
		 *   점수를 반복해서 입력하다가 q 나 Q 를 입력하면 
		 *   while문을 빠져나온후 총 갯수, 총점,평균을 구해서 출력하시오
		 */
		int sum=0, cnt=0;
		double avg;
		while(true) {
			System.out.println("점수입력");
			String score = sc.nextLine();	/////////따로 돌리면 에러가 없는데 위 예제랑 같이 돌리면 에러가 나는 이유를 모르겠음!!!!!!!
			//이제 알겠음... 27번째 줄에서 nextInt를 넣었으니 55번째 줄에서 nextLine을 넣었을 때 실행이 안된다.
			//nextInt 다음 nextLine을 넣었을 때 에러가 나는 경우를 다시 공부하자.
			//해결방안으로 45번째 줄에 nextLine을넣어주었더니 잘 작동한다.
			if(score.charAt(0)=='q'||score.charAt(0)=='Q') { 
				break;
			} 
			cnt++;
			sum+=Integer.parseInt(score);
		}
		avg = (double)sum/cnt;
		System.out.println("**결과출력**");
		System.out.println("점수 갯수 : " + cnt);
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		
		
		//강사님 코드
//		String score;
//		int sum=0,cnt=0;
//		double avg;
//		
//		while(true)
//		{
//			System.out.println("점수 입력");
//			score=sc.nextLine();
//			//입력한 문자열의 첫글자가 q거나 Q면 반복문 빠져나가기
//			if(score.charAt(0)=='q' || score.charAt(0)=='Q')
//				break;
//			cnt++;//갯수 증가
//			sum+=Integer.parseInt(score);//정수로 변환후 합계변수에 더하기
//		}
//		//평균은 총점을 갯수로 한번만 나누면 되므로 나와서 계산해도 된다
//		avg=(double)sum/cnt;//둘다 정수타입이므로 정확히 나오게 하기위해서 double로 형변환
//		System.out.println("** 결과 출력 **");
//		System.out.println("점수 갯수:"+cnt);
//		System.out.println("총점 :"+sum);
//		System.out.printf("평균 : %.1f\n",avg);
		

	}

}
