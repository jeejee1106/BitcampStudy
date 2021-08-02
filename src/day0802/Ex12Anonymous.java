package day0802;

abstract class AbstEx1 {
	abstract public void dataAdd();
	abstract public void dataList();
}

class SubAbst extends AbstEx1 {

	@Override
	public void dataAdd() {
		System.out.println("회원 추가");
	}

	@Override
	public void dataList() {
		System.out.println("회원 목록 출력");
	}

}

public class Ex12Anonymous {

	//익명 내부 클래스 형태
	AbstEx1 ab1 = new AbstEx1() {

		@Override
		public void dataList() {
			System.out.println("데이터를 출력합니다.");
		}

		@Override
		public void dataAdd() {
			System.out.println("데이터를 추가합니다.");
		}
	};

	SubAbst sub = new SubAbst();

	public static void main(String[] args) {

		Ex12Anonymous ex = new Ex12Anonymous();
		//익명 내부 외부클래스
		ex.ab1.dataAdd();
		
		ex.ab1.dataList();
		System.out.println();

		//상속받은 클래스를 멤버변수로 선언
		ex.sub.dataAdd();
		ex.sub.dataList();


	}

}
