package day0728;

public class Ex01Object {
	//�ν��Ͻ� ��� ����
		private String sangpum;//private : ���� ��ü �������� ����� ������ ����������
		int su;
		int dan;
		static String SHOPNAME="�̸�Ʈ";


	public static void main(String[] args) {

		Ex01Object ex1=new Ex01Object();
		ex1.sangpum="����";
		ex1.su=3;
		ex1.dan=1200;
		
		System.out.println("������:"+SHOPNAME);
		System.out.println("��ǰ��:"+ex1.sangpum);
		System.out.println("����:"+ex1.su);
		System.out.println("�ܰ�:"+ex1.dan);

	}

}
