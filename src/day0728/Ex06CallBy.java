package day0728;
/*
 * 기본형같은 경우는 메서드가 다들경우 값만 전달받는다
 * 레퍼런스타입은 주소를 전달받으므로 다른 메서드의 멤버값이나 배열값을 
 * 변경할수 있다
 */
class Test {
	String name;
	String hp;
}
public class Ex06CallBy {
	//기본형은 값만 전달받을뿐 주소가 서로 다르기때문에
	//여기서 변경한 것은 메인의 n에 반영되지 않는다
	public static void changeInt(int n) {
		n=200;
	}
	
	//인자에 있는 t와 메인의 t는 주소가 같다.
	//그러므로 메서드에서 변경시 메인의 t값도 변경된다
	public static void changeTest(Test t) {
		//핸드폰만 변경
		t.hp="010-111-2323";
	}
	
	public static void changeArray(int []arr) {
		arr[1]=300;
	}
	public static void main(String[] args) {
		
		int n=100;
		changeInt(n);
		System.out.println("n:"+n);
		
		Test t=new Test();
		t.name="캔디";
		t.hp="019-888-9999";
		
		changeTest(t);//객체타입은 주소가 전달됨
		System.out.println("이름:"+t.name+",핸드폰:"+t.hp);
		
		int []arr= {2,5,7};//배열은 타입 상관없이 무조건 객체이다(레퍼런스타입)
		changeArray(arr);//주소가 전달
		for(int a:arr) {
			System.out.print(a+"\t");
		}
		System.out.println();
	}

}
