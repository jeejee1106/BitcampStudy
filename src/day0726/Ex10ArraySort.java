package day0726;

public class Ex10ArraySort {

	public static void main(String[] args) {
		/*
		 * �̸��� ������������ ���
		 * ����for���� ���
		 * �̸��� ������ �� ���̵� ���� �ٲ����
		 * */

		String[] names = {"��ȿ��", "��ȣ��", "���缮", "��"};
		int[] ages = {33, 43, 45, 28};


		for(int i=0;i<names.length-1;i++) {
			for(int j=i+1;j<names.length;j++) {
				//a.compareTo(b) :a �� �� ũ�� �����
				if(names[i].compareTo(names[j])>0) {
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;

					//�̸��� ����� ���̵� ���� ����
					int n=ages[i];
					ages[i]=ages[j];
					ages[j]=n;
				}
			}
		}

		//���
		System.out.println("��ȣ\t�̸�\t����");
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+"\t"+names[i]+"\t"+ages[i]);
		}




	}

}
