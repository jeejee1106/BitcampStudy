package day0802;

//�������̽��� �����ϴ� Ŭ���� ����(���߱�������)
class Food implements FoodShop{

	@Override
	public void order() {
		System.out.println(SHOPNAME);
//		SHOPNAME="�����"  //����ȵ�(final�̶�)
		System.out.println("������ �ֹ��մϴ�");
	}

	@Override
	public void beadal() {
		System.out.println(SHOPNAME);
		System.out.println("�ֹ��� ������ ����մϴ�");
	}

}

public class EX04Interface {

	public static void main(String[] args) {
		 FoodShop f = new Food();
		 f.order();
		 f.beadal();
		
	}

}
