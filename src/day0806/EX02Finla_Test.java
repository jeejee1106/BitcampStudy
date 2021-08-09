package day0806;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX02Finla_Test {
//	static final String FILENAME = "D:\\bitjava0719\\javawork\\Test0806.txt";
	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\Member0806.txt";
	List<Member0806> list = new ArrayList<Member0806>();
	Scanner sc = new Scanner(System.in);

	public EX02Finla_Test() {
		memberFileRead();
		
	}

	public void memberFileWrite() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			for(Member0806 member : list) {
				String s = member.getName() + "," + member.getHp() + "," + member.getGender() + "\n";
				fw.write(s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void memberFileRead() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while(true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}

				String[] d = s.split(",");
				String name = d[0];
				String hp = d[1];
				String gender = d[2];

				Member0806 t = new Member0806(name, hp, gender);
				list.add(t);

			}
			System.out.println("���Ͽ��� �� " + list.size() + "���� ȸ�� ����� �����Խ��ϴ�.");



		} catch (FileNotFoundException e) {
			System.out.println("ȸ�� ����� �����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public void memberAdd() {
		System.out.println("�߰��� ȸ������ �Է����ּ���");
		String name = sc.nextLine();
		for(Member0806 ts : list) {
			if(ts.getName().equals(name)) {
				System.out.println("���� �̸��� �ֽ��ϴ�. �ٸ� �̸����� �������ּ���.");
				return;
			}
		}
		
		System.out.println("ȸ������ �ڵ��� ��ȣ�� �Է����ּ���.");
		String hp = sc.nextLine();
		
		String gender = "";
		while(true) {
			System.out.println("ȸ������ ������ �Է����ּ���.(��/��)");
			gender = sc.nextLine();
			if(gender.equals("��")|| gender.equals("��"))
				break;
			else if(!gender.equals("��")||!gender.equals("��")) {
				System.out.println("�� �Ǵ� ���� �Է����ּ���");
			}
		}
		
		Member0806 ts = new Member0806(name, hp, gender);
		list.add(ts);
		System.out.println("ȸ�������� �߰��Ǿ����ϴ�.");

	}

	public void memberAllData() {
		int num = 0;
		if(list.size()==0) {
			System.out.println("ȸ�� ����� �����ϴ�.");
			return;
		}
		System.out.println("��ü ȸ�� ����Դϴ�!");
		System.out.println("��ȣ\t�̸�\t�ڵ�����ȣ\t����");

		for(Member0806 t :list) {
			System.out.println(++num + "\t" + t.getName() + "\t" + t.getHp() + "\t" + t.getGender());
		}



	}

	public void memberUpdata() {
//		System.out.println("ȸ������ �Է����ּ���.");
//		String name = sc.nextLine();
//		for(Member0806 m : list) {
//			if(!m.getName().equals(name)||) {
//				System.out.println("��ġ�ϴ� ȸ���� �����ϴ�. �ٽ� �Է����ּ���");
//				continue;
//			}
//			if(m.getName().equals(name)) {
//				
//			}
//		}
		



	}

	public void memberDelete() {
		System.out.println("������ ȸ������ �Է����ּ���.");
		String name = sc.nextLine();

		boolean find = false;

		for(int i = 0; i<list.size(); i++) {
			Member0806 t = list.get(i);
			if(t.getName().equals(name)) {
				find = true;
				list.remove(i);
				break;
			}
		}

		if(find) {
			System.out.println(name + "���� �����߽��ϴ�.");
		} else {
			System.out.println(name + "���� ��ܿ� �����ϴ�.");
		}

	}

	public void memberSearchName() {
		System.out.println("�˻��� ���� �Է����ּ���.");
		String fn = sc.nextLine();
		boolean find = false;
		int num = 0;
		Member0806 ts = null;
		for(int i = 0; i<list.size(); i++) {
			ts = list.get(i);
			if(ts.getName().startsWith(fn)) {
				find = true;
				System.out.println(++num + "\t" + ts.getName() + "\t" + ts.getHp() + 
						"\t" + ts.getGender());
			}
		}
		if(!find) {
			System.out.println("�ش�Ǵ� ���� �����ϴ�.");
		}
	}

	public void memberSearchGender() {
		System.out.println("'��' �Ǵ� '��'�� �Է����ּ���.");
		String fn = sc.nextLine();
		boolean find = false;
		int num = 0;
		Member0806 ts = null;
		for(int i = 0; i<list.size(); i++) {
			ts = list.get(i);
			if(ts.getGender().startsWith(fn)) {
				find = true;
				System.out.println(++num + "\t" + ts.getName() + "\t" + ts.getHp() + 
						"\t" + ts.getGender());
			}
		}
		if(!find) {
			System.out.println("�ش� ������ xxx");
		}

	}

	public void process() {

		int num = 0;
		while(true) {
			System.out.println("1.ȸ���߰�  2. ��üȸ�����  3.ȸ������  4.ȸ������  5.ȸ���˻�(�̸�)  6. ȸ���˻�(����)  7.����");
			try {
				num = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("���ڷ� �Է����ּ���");
				continue;
			}
			switch(num) {
			case 1:
				memberAdd();
				break;
			case 2:
				memberAllData();
				break;
			case 3:
				memberUpdata();
				break;
			case 4:
				memberDelete();
				break;
			case 5:
				memberSearchName();
				break;
			case 6:
				memberSearchGender();
				break;
			case 7:
				System.out.println("ȸ������ ���� �� �����մϴ�.");
				memberFileWrite();
				System.exit(0);
			default:
				System.out.println("1~7�� �߿� �������ּ���.");
			} System.out.println();


		}

	}

	public static void main(String[] args) {

		EX02Finla_Test ft = new EX02Finla_Test();
		ft.process();


	}

}
