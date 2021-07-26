package day0726;

public class Ex01Array_String {

	public static void main(String[] args) {
		
		String[] arr = {"민들레", "장미꽃", "카네이션", "안개꽃", "무궁화"};
		String[] arr2 = new String[5];
		arr2[0] = "빨강색";
		arr2[1] = "주황색";
		arr2[2] = "노랑색";
		arr2[3] = "초록색";
		arr2[4] = "파랑색";
		
		//출력(변수 i를 이용해서 출력)
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//출력2(for문을 이용해서 출력)
		for(String s:arr) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		//arr2도 위와 같은 방법으로 출력해보기
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		for(String s:arr2) {
			System.out.print(s + " ");
		}
		
		
		
		
		
	}

}
