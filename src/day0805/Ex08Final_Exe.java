package day0805;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex08Final_Exe {
	static final String FILENAME = "D:\\bitjava0719\\javawork\\member0806.txt";
	List<String> list = new Vector<String>();
	Scanner sc = new Scanner(System.in);

	public Ex08Final_Exe() {
		fileRead(); //���� �� ���� �̸��� ����Ʈ�� �ִ´�
	}

	public void nameAdd() {
		System.out.println("�̸��� �Է����ּ���");
		String name = sc.nextLine();
		list.add(name); //�Է��� �̸��� list�� �߰�
		System.out.println("�߰��Ǿ����ϴ�. (���� �� " + list.size() + "��)");
	}

	public void nameDelete() {
		System.out.println("������ �̸��� �Է��ϼ���");
		String name = sc.nextLine(); //���� ���� �̸��� �ִٸ� ���� ���� �̸����� �����ȴ�.

		boolean find = false;

		//���1 - �� ����� �� ���� ��
		for(int i = 0; i<list.size(); i++) {
			String member = list.get(i);
			if(member.equals(name)) {
				find = true;
				list.remove(i);
				break;
			}
		}

		//���2
		//		find = list.remove(name);

		if(find) {
			System.out.println(name + "ȸ������ �����߽��ϴ�.");
		} else {
			System.out.println(name + "ȸ������ ��ܿ� �����ϴ�.");
		}
	}

	public void writeAll() {
		System.out.println("**��üȸ�� ���**");
		if(list.size()==0) {
			System.out.println("���� ȸ���� �����ϴ�.");
		}else {
			for(String n:list) {
				System.out.println(n+"\t");
			}System.out.println();
		}

	}

	public void process() {
		int num = 0;
		while(true) {
			System.out.println("1. �̸��߰�  2. �̸�����  3. ��ü���  4.����");
			try {
				num = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("1~4�� �߿� �������ּ���.");
				continue;
			}

			switch(num) {
			case 1:
				this.nameAdd();
				break;
			case 2:
				this.nameDelete();
				break;
			case 3:
				this.writeAll();
				break;
			case 4:
				System.out.println("�����մϴ�.");
				fileWrite(); //������ �� �ڵ����� �̸��� �����ϱ�
				System.exit(0);
			default:
				System.out.println("��ȣ �ٽ� Ȯ�� �ٶ�!!");
			} System.out.println();


		}
	}

	//ó�� ���� �� ȣ��
	public void fileRead() {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			while(true) {
				String name = br.readLine();
				if(name==null) {
					break;
				}
				list.add(name);
			}
			System.out.println("���Ͽ��� �� " + list.size() + "���� ȸ������� �����Խ��ϴ�.");
			
		} catch(FileNotFoundException e) {
			System.out.println("����� ȸ���� �����ϴ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			}catch(IOException e){

			}
		}
	}

	//���� �� ȣ��
	public void fileWrite() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(FILENAME);
			for(String name:list) {
				fw.write(name + "\n");
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


	public static void main(String[] args) {

		Ex08Final_Exe ex = new Ex08Final_Exe();
		ex.process();




	}

}
