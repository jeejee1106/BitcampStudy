package day0805;

import java.util.List;
import java.util.Vector;

public class Ex07List {
	
	public static void write(String title, List<String> list) {
		System.out.println("** " + title + " **");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String[] data = {"���", "�Ȱ�", "��ȭ"};
		//�迭�� ����Ÿ��  list�� �ֱ�
		List<String> list = new Vector<String>();
		for(String d:data) {
			list.add(d);
		}
		write("�ʱⵥ���� ���", list);
		System.out.println("1�� �ε��� �����ϱ�");
		list.remove(1); //�ε����� �����
		write("���� �� ���", list);
		
		System.out.println("�����߰��ϱ�");
		list.add("����");
		write("�߰� �� ���", list);
		
		System.out.println("1�� �ε����� ��ȭ���� ä��ȭ�� ����");
		list.set(1, "ä��ȭ");
		write("���� �� ���", list);
		
		System.out.println("ä��ȭ��(1���ε���) ����(2���ε���) ���̿� �������� ����ֱ�");
		((Vector<String>)list).insertElementAt("�ĸ�����",2);
		write("�߰��� ��������", list);
		
		System.out.println("��ü �����ϱ�");
		list.clear();
		System.out.println("������ : " + list.size());
	}

}
