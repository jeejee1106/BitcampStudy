package day0721;

public class Ex12For_Break_Continue {

	public static void main(String[] args) {

		//반복문에서 break를 만나면 제일 가까운 반복문을 빠져나간다.
		for(int i = 1; i<=10; i++) {
			if (i%5==0)
				break; //i를 0으로 나눈 나머지가 0일 때 break!! 반복문을 빠져나온다.
			System.out.println(i); //1,2,3,4
		}
		System.out.println();
		
		
		//반복문에서 continue를 만나면 증감식으로 이동한다.
		// 해당 부분만 실행이 안됨!!
		for(int i = 1; i<=10; i++) {
			if (i%5==0)
				continue;
			System.out.println(i);//1,2,3,4,6,7,8,9
		}
		System.out.println();
		
		
		
		
		
		
	}

}
