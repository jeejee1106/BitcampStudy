package day0803;

public class Ex02Exception_throws {

	public static void process() {

		int[] arr = {2,5,6,7};
		for(int i = 0; i<=arr.length; i++) {
			try {
				System.out.println(arr[i]);
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("오류메세지 : " + e.getMessage());
			}
		}
	}
	//throws : exception처리를 직접 하지 않고 호출하는 곳으로 해당 exception을 던진다
	public static void process2() throws NumberFormatException {
		String a = "12a";
		String b = "30";
		int sum = 0;
		
		sum = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("두 수의 합은 : " + sum);
		}

	public static void main(String[] args) {

		process();
		
		
		try {
			process2();
		} catch(NumberFormatException e) {
			System.out.println("예외처리 여기에서 함. 오류메세지 : " + e.getMessage());
		}
		System.out.println("정상종료");
	}

}
