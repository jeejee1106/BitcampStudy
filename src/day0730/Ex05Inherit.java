//��������� private, �޼���� public
package day0730;

class Shop {
	private String sangpum;
	private int su;
	
	Shop() {
		this.sangpum = "����";
		this.su = 5;
//		this("����",5); ���� �� ������ �ϳ��� �̷��� �൵ ��!
	}
	
	Shop(String sangpum, int su){
		this.sangpum = sangpum;
		this.su = su;
	}
	
	public void writeShop() {
		System.out.println("��ǰ : " + sangpum);
		System.out.println("���� : " + su);
	}
}

/////////////////////////////////

class My2 extends Shop {
	private int price;
	
	My2() {
		//����Ʈ �����ڿ����� super();�� �ڵ����� �����ǰ� ���ÿ� �����Ǿ��ִ�.
		this.price = 1000;
	}
	
	My2(String sangpum, int su, int price) {
		super(sangpum, su); //�θ�Ŭ������ �ʵ�(�������,�ν��Ͻ�����)�� private�̱� ������ this�� �ʵ带 ������ �� ����.
		this.price = price; //�׷� �� super�� �Ű�����(����,�Ķ����)�� ����Ѵ�.
	}
	
	@Override
	public void writeShop() {
		System.out.println("�ܰ� : " + price);
		super.writeShop();
	}
}

public class Ex05Inherit {

	public static void main(String[] args) {
		
		My2 my1 = new My2();
		my1.writeShop();
		System.out.println();
		My2 my2 = new My2("����", 2, 16000);
		my2.writeShop();
		
		
		
	}

}
