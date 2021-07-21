package day0721;

public class Ex07For {

	public static void main(String[] args) {

//		for(int i = 1; i<=5; i++) --> i는 for문 안에서 선언했기 때문에 for문이 끝나면 데이터는 사라진다.
//		즉, for문이후의 코드에 i라는 변수를 사용할 수 있다.
//		for문에 있는 i를 for문이 끝난 후에도 사용하고 싶다면 선언은 for문 밖에서 하면 된다.
		
		//변수를 for문 밖에서 선언 --> 앞으로의 코드들은 변수 i를 사용할 수 없다.
		int i;
		for(i=1; i<=10; i++) {
			System.out.println(i);
		} System.out.println("for문을 빠져나온 후의 i값 : "+i);
		
		
		//변수의 선언과 초기화를 for문 밖에서 --> 앞으로의 코드들은 변수 a를 사용할 수 없다.
		int a = 10;
		for(;a<=50;a+=5) {
			System.out.println(a);
		} System.out.println("for문을 빠져나온 후의 a값: " + a);
		
		
		//hello를 5번 출력
		//for(int j = 4; j>=0; j--) 도 아래와 완전히 같은 결과값을 출력한다.
		for(int j = 0; j<=4; j++) {
			System.out.println("hello");
		}
		
		
		//1~10중 짝수만 출력
		System.out.println("<<1~10중 짝수만 출력>>");
		for(int j = 2; j<=10; j+=2) {
			System.out.println(j);
		}
		
		
		
	}

}
