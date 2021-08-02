package day0802;

interface Sawon{
	public void addSawon();
	public void deleteSawon();
	public void listSawon();
}

public class Ex13Anonymous {

	//위의 Sawon 인터페이스를 익명 내부클래스 형식으로 선언 후
	//메인에서 각 메소드를 호출해보세요

	Sawon s = new Sawon() {

		@Override
		public void addSawon() {
			System.out.println("신입사원");
		}

		@Override
		public void deleteSawon() {
			System.out.println("퇴사 사원");
		}

		@Override
		public void listSawon() {
			System.out.println("사원 목록");
		}
	};


	public static void main(String[] args) {

		Ex13Anonymous ex = new Ex13Anonymous();
		ex.s.addSawon();
		ex.s.deleteSawon();
		ex.s.listSawon();



	}

}
