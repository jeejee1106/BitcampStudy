package day0728;
/*
 * �⺻������ ���� �޼��尡 �ٵ��� ���� ���޹޴´�
 * ���۷���Ÿ���� �ּҸ� ���޹����Ƿ� �ٸ� �޼����� ������̳� �迭���� 
 * �����Ҽ� �ִ�
 */
class Test {
	String name;
	String hp;
}
public class Ex06CallBy {
	//�⺻���� ���� ���޹����� �ּҰ� ���� �ٸ��⶧����
	//���⼭ ������ ���� ������ n�� �ݿ����� �ʴ´�
	public static void changeInt(int n) {
		n=200;
	}
	
	//���ڿ� �ִ� t�� ������ t�� �ּҰ� ����.
	//�׷��Ƿ� �޼��忡�� ����� ������ t���� ����ȴ�
	public static void changeTest(Test t) {
		//�ڵ����� ����
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
		t.name="ĵ��";
		t.hp="019-888-9999";
		
		changeTest(t);//��üŸ���� �ּҰ� ���޵�
		System.out.println("�̸�:"+t.name+",�ڵ���:"+t.hp);
		
		int []arr= {2,5,7};//�迭�� Ÿ�� ������� ������ ��ü�̴�(���۷���Ÿ��)
		changeArray(arr);//�ּҰ� ����
		for(int a:arr) {
			System.out.print(a+"\t");
		}
		System.out.println();
	}

}
