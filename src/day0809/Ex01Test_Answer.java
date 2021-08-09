package day0809;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex01Test_Answer {
	Scanner sc = new Scanner(System.in);
	List<Member0809> list= new Vector<Member0809>();
	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\Member0809.txt";
	
	public Ex01Test_Answer() {
		fileRead();
	}
	
	public int getMenu() throws NumberFormatException{
		int n = 0;
		System.out.println("**�޴�**");
		System.out.println("1. ȸ�� �߰�");
		System.out.println("2. ��üȸ�����");
		System.out.println("3. ȸ������");
		System.out.println("4. ȸ������");
		System.out.println("5. ȸ���˻�(�̸�)");
		System.out.println("6. ȸ���˻�(����)");
		System.out.println("7. ����");
		n=Integer.parseInt(sc.nextLine());
		return n;
	}
	
	
	public void fileRead() {
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
				Member0809 m = new Member0809();
				m.setName(d[0]);
				m.setHp(d[1]);
				m.setGender(d[2]);
				
				list.add(m);	
			}
		} catch (FileNotFoundException e) {
			System.out.println("���Ͼ���");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public int getSearchName(String name) {
		int idx = -1;
		for(int i = 0; i<list.size(); i++) {
			Member0809 m = list.get(i);
			if(m.getName().equals(name)) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	public void memberAdd() {
		String name = "";
		do {
		System.out.println("�߰� �� ȸ���� �̸� �Է�");
		name = sc.nextLine();
		int idx = this.getSearchName(name);
		if(idx>=0) {
			System.out.println("������ ȸ���� �ֽ��ϴ�. �ٸ� �̸����� �������ּ���");
			continue;
		}break;
		}while(true);
		
		System.out.println("�߰� �� ȸ���� �ڵ��� �Է�");
		String hp = sc.nextLine();
		System.out.println("�߰� �� ȸ���� ���� �Է�");
		String gender = sc.nextLine();
		
		Member0809 m =new Member0809(name, hp, gender);
		list.add(m);
		System.out.println("**�߰��Ǿ����ϴ�.**");
	}
	
	public void memberFileWrite() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			for(Member0809 m:list) {
				String s = m.getName() + "," + m.getHp() + "," + m.getGender() + "\n";
				fw.write(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null) fw.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public void memberAllWrite() {
		System.out.println("**��üȸ�� ���**");
		System.out.println();
		System.out.println("��ȣ\t�̸�\t�ڵ�����ȣ\t����");
		
		for(int i = 0; i<list.size(); i++) {
			Member0809 m = list.get(i);
			System.out.println((i+1)+"\t"+m.getName()+"\t"+m.getHp()+"\t"+m.getGender());
		} System.out.println();
		
	}
	
	public void memberUpdate() {
		System.out.println("���� �� ȸ������ �̸� �Է�");
		String name = sc.nextLine();
		int idx = this.getSearchName(name);
		if(idx==-1) {
			System.out.println("ȸ������ �������� �ʽ��ϴ�.");
		} else {
			System.out.println("������ ȸ������ �ڵ��� �Է�");
			String hp = sc.nextLine();
			System.out.println("������ ȸ������ ���� �Է�");
			String gender = sc.nextLine();
			
			//idx��°�� ���Ŭ������ ��´�
			//���۷��� Ÿ���̶� �ּҸ� ���ؼ� ������
			Member0809 m = list.get(idx);
			m.setHp(hp);
			m.setGender(gender);
			System.out.println("�����Ǿ����ϴ�.");
		}
		
	}
	
	public void memberDelete() {
		System.out.println("������ ȸ���� �̸� �Է�");
		String name = sc.nextLine();
		int idx = this.getSearchName(name);
		if(idx==-1) {
			System.out.println(name + "���� �������� �ʴ� ȸ���Դϴ�.");
		} else {
			list.remove(idx);
			System.out.println(name + "ȸ���� ������ �����Ͽ����ϴ�.");
		}
	}
	
	public void memberSearchName() {
		System.out.println("�˻��� ����� ���̳� ��ü�̸� �Է�");
		String name = sc.nextLine();
		
		System.out.println("**�˻���� ���**");
		System.out.println();
		System.out.println("��ȣ\t�̸�\t�ڵ�����ȣ\t����");
		
		for(int i = 0; i<list.size(); i++) {
			Member0809 m = list.get(i);
			if(m.getName().startsWith(name)) {
				System.out.println(i+"\t"+m.getName()+"\t"+m.getHp()+"\t"+m.getGender());
			}
		} System.out.println();
	}
	
	public void memberSearchGender() {
		System.out.println("�˻��� ����� ���� �Է�");
		String gender = sc.nextLine();
		
		System.out.println("**�˻���� ���**");
		System.out.println();
		System.out.println("��ȣ\t�̸�\t�ڵ�����ȣ\t����");
		
		for(int i = 0; i<list.size(); i++) {
			Member0809 m = list.get(i);
			if(m.getGender().startsWith(gender)) {
				System.out.println(i+"\t"+m.getName()+"\t"+m.getHp()+"\t"+m.getGender());
			}
		} System.out.println();
		
	}
	
	public void process() {
		while(true) {
			int n=0;
			try {
				n = this.getMenu();
			} catch(NumberFormatException e){
				System.out.println("�޴� ��ȣ�� �ٽ� �Է����ּ���");
				continue;
			}
			
			switch(n) {
			case 1:
				this.memberAdd();
				break;
			case 2:
				this.memberAllWrite();
				break;
			case 3:
				this.memberUpdate();
				break;
			case 4:
				this.memberDelete();
				break;
			case 5:
				this.memberSearchName();
				break;
			case 6:
				this.memberSearchGender();
				break;
			case 7:
				this.memberFileWrite();
				System.out.println("**������ ���� �� �����մϴ�.**");
				System.exit(0);;
			default:
				System.out.println("**��ȣ�� �ٽ� Ȯ�����ּ���**");
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Ex01Test_Answer ex = new Ex01Test_Answer();
		ex.process();
	}

}
