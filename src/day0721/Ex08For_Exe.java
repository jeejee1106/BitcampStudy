package day0721;

public class Ex08For_Exe {

	public static void main(String[] args) {
		
		//1부터 100까지의 합 구하기
		int sum = 0;
		for(int i =1; i<=100; i++) {
			sum+=i; //sum=sum+i 라는 뜻
		} System.out.println(sum);
		
		//1~100 중 짝수의 합과 홀수의 합 출력
		int esum = 0;
		int osum = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				esum+=i;
			} else {
				osum+=i;
			}
		} 
		System.out.println("짝수의 합 : " + esum);
		System.out.println("홀수의 합 : " + osum);
		
		
	}

}
