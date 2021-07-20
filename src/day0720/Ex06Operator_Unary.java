package day0720;

public class Ex06Operator_Unary {

	public static void main(String[] args) {
		//증감연산자(단항) : ++, --
		
		int m = 5, n = 5;
		++m;
		n++;
		System.out.println(m +"," + n);
		//다른 연산자 없이 사용할 경우에는 전위, 후위 결과가 같다.
		
		int a = ++m; //전위는 먼저 증가 후 변수에 대입
		int b = n++; //후위는 변수에 대입 후 증가
		System.out.println("m = " + m); //7
		System.out.println("n = " + n); //7
		System.out.println("a = " + a); //7
		System.out.println("b = " + b); //6
		
		
		int x = 3;
		System.out.println(x++); //3 : 출력 후 증가
		System.out.println(++x); //5 : 위에서 출력 후 증가가 되서 4가 된 상태. 그리고 또 증가 후 출력이니 5
		int y = 3;
		System.out.println(++y); //4 : 증가 후 출력
		System.out.println(y++); //4 : 출력 후 증가. 지금은 4가 출력 됐지만 현재 y는 5로 저장되어 있다.

		//변수를 지금껏 많이 썼으니 새로 선언하지 않고 다시 초기화
		a=b=m=n=5;
		
		a*=++b-m--*++n;
		System.out.println(a); //-120
		
		
		
		
	}

}
