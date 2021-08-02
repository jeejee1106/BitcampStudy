package day0730;

class Work{
	public void process() {
		System.out.println("�� ������ �ƹ��ϵ� ���ؿ�");
	}
}
//////////////////////////////////
class Food extends Work {
	@Override
	public void process() {
		System.out.println("**���� ���**");
	}
}
///////////////////////////////////
class Clean extends Work {
	@Override
	public void process() {
		System.out.println("**û�� ���**");
	}
}

public class Ex10Inherit_Polymorphism {

	public static void main(String[] args) {
		
		Work work = null; //null�� �ʱ�ȭ
		
		work = new Work(); //�θ����-�θ�ȣ��, �θ� Ŭ������ process()�޼��� ȣ��
		work.process();
		System.out.println();
		
		work = new Food(); //�θ����-�ڽ�ȣ��, �ڽ� Ŭ������ process()�޼��� ȣ��
		work.process();
		System.out.println();
		
		work = new Clean(); //�θ����-�ڽ�ȣ��, �ڽ� Ŭ������ process()�޼��� ȣ��
		work.process();
		
		/*
		 * �θ�Ŭ������ ���� �� ���� �����Ǿ����Ŀ� ���� �ڽ� Ŭ������ �������̵� �޼��尡 ȣ���.
		 * �׷��� �ϳ��� ������ ȣ�� �� ���� �����Ǿ��ִ��Ŀ� ���� �� ����� �޶����µ�,
		 * �� ����� ������ �̶�� �Ѵ�!!!!!!!!!
		 * */
	}

}
