package day0728;

class MyCar {
	String carName;
	int carPrice;
	String carColor;
}
////////////////////////////
public class Ex07CallBy {
	public static void dataIn(MyCar car) {
		car.carName="�ҳ�Ÿ";
		car.carPrice=5600;
		car.carColor="���ֻ�";
	}
	
	public static void dataOut(MyCar car) {
		System.out.println("������:"+car.carName);
		System.out.println("���ܰ�:"+car.carPrice);
		System.out.println("�� �� :"+car.carColor);
	}
	public static void main(String[] args) {
	
		MyCar car=new MyCar();
		//�� �޼��� �� �ּҰ� ���޵ǹǷ� �ᱹ ������ car ������ ����Ÿ�� ���� ��µȴ�
		dataIn(car);
		dataOut(car);
	}

}