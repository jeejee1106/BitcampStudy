package day0720;

public class Ex06Operator_Unary {

	public static void main(String[] args) {
		//����������(����) : ++, --
		
		int m = 5, n = 5;
		++m;
		n++;
		System.out.println(m +"," + n);
		//�ٸ� ������ ���� ����� ��쿡�� ����, ���� ����� ����.
		
		int a = ++m; //������ ���� ���� �� ������ ����
		int b = n++; //������ ������ ���� �� ����
		System.out.println("m = " + m); //7
		System.out.println("n = " + n); //7
		System.out.println("a = " + a); //7
		System.out.println("b = " + b); //6
		
		
		int x = 3;
		System.out.println(x++); //3 : ��� �� ����
		System.out.println(++x); //5 : ������ ��� �� ������ �Ǽ� 4�� �� ����. �׸��� �� ���� �� ����̴� 5
		int y = 3;
		System.out.println(++y); //4 : ���� �� ���
		System.out.println(y++); //4 : ��� �� ����. ������ 4�� ��� ������ ���� y�� 5�� ����Ǿ� �ִ�.

		//������ ���ݲ� ���� ������ ���� �������� �ʰ� �ٽ� �ʱ�ȭ
		a=b=m=n=5;
		
		a*=++b-m--*++n;
		System.out.println(a); //-120
		
		
		
		
	}

}
