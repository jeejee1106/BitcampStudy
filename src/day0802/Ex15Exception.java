package day0802;

public class Ex15Exception {

	public static void main(String[] args) {
		//배열의 예외처리
		
		int[] arr = {4, 6, 2};
		for(int i = 0; i<=arr.length; i++) {
			try {
				System.out.println(arr[i]); //예외가 발생할 경우 catch가 실행
			}catch(ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace(); //에러를 추적해서 라인번호와 메세지를 출력
				System.out.println("오류메세지 : " +e.getMessage()); //예외발생 메세지만 출력
			}
		}
		System.out.println("**정상종료**");
		
	}

}
