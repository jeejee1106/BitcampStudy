package day0803;
//일반적인 exception(일반예외)은 반드시 처리해야만 한다.(컴파일 오류가 발생하니까!)
public class Ex06Exception_ThreadSleep {

	public static void main(String[] args) {
		
		System.out.println("안녕하세요");
		System.out.println("3초 후 우리 작별해요");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("안녕히 가세요");
		
	}

}
