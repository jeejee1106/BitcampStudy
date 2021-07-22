package day0722;

public class Ex04MultiFor_Label {

	public static void main(String[] args) {

		System.out.println("Label을 이용한 break");
		Exit: //레이블 이름은 자기 맘대로(공백없이)
			for(int i = 1; i<=3; i++) {
				for(int j = 1; j<=4; j++) {
					System.out.println(i+":"+j);
					if(j==3) {
						break Exit;
					}
				}
			}
		
		
		System.out.println("다중 for문 Label을 이용한 continue");
		Loop:
			for(int i = 1; i<=3; i++) {
				for(int j = 1; j<=4; j++) {
					if(j==3) {
						continue Loop;
					} System.out.println(i+":"+j);
				} System.out.println();
			}
		
		
		
		
		
		
		
		
	}

}
