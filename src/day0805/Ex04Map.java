package day0805;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex04Map {

	//Map�� key�� value�� ������ ����Ǵ� ������ �÷����̴�.
	//�� �� key�� setŸ���̹Ƿ� �ߺ��� ������� �ʴ´�.
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "�̿���");
		map.put("name", "���缮"); //key���� name���� ����. �̷� ��� ���������.(���缮�� ���)
		map.put("addr", "������");
		map.put("age", "23��");
		map.put("blood", "AB��");
		
		
		System.out.println("�̸� : " + map.get("name"));
		System.out.println("�ּ� : " + map.get("addr"));
		System.out.println("���� : " + map.get("age"));
		System.out.println("������ : " + map.get("blood"));
		System.out.println("ȸ��� : " + map.get("emp"));//�ش� key���� ������� null�� ��ȯ
		System.out.println("������ : " + map.size());
		
		//Map���� �ּ� �����ϱ�
		map.remove("addr");
		System.out.println("���� �� ������ : " + map.size());
		
		System.out.println();
		
		//�ڵ����� key�� �� ����ϱ�
		Set<String> keys = map.keySet();
		//������ �������
		for(String key:keys) {
			String value = map.get(key);
			System.out.println(key + "=>" + value);
		}
		
	}

}
