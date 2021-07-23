package day0723;

public class Ex09Array {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; //0으로 초기값이 자동으로 들어갔음
		arr1[1] = 10;
		arr1[4] = 34;
		for(int n:arr1) {
			System.out.println(n); 
			//1,4 를 제외한 나머지 데이터엔 값을 주지 않았으므로 나머지는 0으로 출력
		}
		
		
		System.out.println();
		
		
		//배열을 선언하고 직접 값 생성
		int[] arr2 = {23,11,56,77,12,9};
		System.out.println("배열갯수 : " + arr2.length);
		
		//출력1
		for(int i = 0; i<arr2.length; i++) {
			System.out.printf("%5d", arr2[i]);
		}
		
		
		System.out.println();
		
		
		//출력2
		for(int n:arr2) {
			System.out.printf("%5d", n);
		}
		
		

	}

}
