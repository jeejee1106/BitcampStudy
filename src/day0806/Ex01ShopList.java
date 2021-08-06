package day0806;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex01ShopList {
	static final String FILENAME = "D:\\bitjava0719\\javawork\\Shop0806.txt";
	List<Shop0806> list = new ArrayList<Shop0806>();
	Scanner sc = new Scanner(System.in);

	public Ex01ShopList() {
		shopFileRead();
	}

	//���� �б�
	public void shopFileRead() { 
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while(true) {
				String shop = br.readLine();
				if(shop==null) {
					break;
				}

				String[] d = shop.split(",");

				String sang = d[0];
				int su = Integer.parseInt(d[1]);
				int dan = Integer.parseInt(d[2]);
				int total = su*dan;

				//Shop0806Ŭ������ ����. ���1
//				Shop0806 s = new Shop0806(); //����Ʈ�� ���� ��  setter�� �ִ� ���
//				s.setSangpum(sang);
//				s.setSu(su);
//				s.setDan(dan);
//				s.setTotal(total);

				//Shop0806Ŭ������ ����. ���2
				Shop0806 s = new Shop0806(sang, su, dan); //override�� ������ ������ ��.

				//����Ʈ�� �߰�
				list.add(s);

			}
			System.out.println("���Ͽ��� �� " + list.size() + "���� ��ǰ����� �����Խ��ϴ�.");

		} catch(FileNotFoundException e) {
			System.out.println("����� ��ǰ�� �����ϴ�");
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


	//���� ����
	public void shopFileWrite() {

		FileWriter fw = null;

		try {
			fw = new FileWriter(FILENAME);
			//Shop0806Ŭ������ ������ �� ���
			for(Shop0806 shop : list) {
				String s = shop.getSangpum() + "," + shop.getSu() + "," + shop.getDan() + "\n";
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

	//shop���� �Է�
	public void shopAdd() {
		System.out.println("��ǰ�� �߰����ּ���.");
		String sang = sc.nextLine();
		System.out.println("�߰��� ��ǰ�� ������ �Է����ּ���.");
		int su = Integer.parseInt(sc.nextLine());
		System.out.println("��ǰ�� �ܰ��� �Է����ּ���");
		int dan = Integer.parseInt(sc.nextLine());

		//ShopŬ���� ����
		Shop0806 shop = new Shop0806(sang, su, dan);
		//list�� Shop �߰�
		list.add(shop);
		System.out.println("��ǰ������ �߰��Ǿ����ϴ�.");

	}

	//��ǰã��
	public void shopSearch() {

		System.out.println("ã���� ��ǰ�� �Է����ּ���.");
		String sang = sc.nextLine();
		boolean find = false;
		int num = 1;
		Shop0806 shop = null;
		for(int i = 0; i<list.size(); i++){
			shop = list.get(i);
//			if (shop.getSangpum().equalsIgnoreCase(sang)) { // 1.���� �Է��� ���ڿ��� �Ȱ��� ���ڿ��� ��ǰ�� ���(��ҹ��� ����x)
//			if(shop.getSangpum().startsWith(sang)) { // 2.���� �Է��� ���ڿ��� �����ϴ� ��� ��ǰ�� ���
			if(shop.getSangpum().contains(sang)) { // 3.���� �Է��� ���ڿ��� ���Ե� ��� ��ǰ�� ���
				find = true;
				System.out.println(num++ + "\t" + shop.getSangpum() + "\t" + shop.getSu() + 
						"\t" + shop.getDan() + "\t" + shop.getTotal());
			}
		}
		if(!find) {
			System.out.println("�ش� ��ǰ�� �����ϴ�.");
		}

	}

	//��ǰ����
	public void shopDelete() {
		System.out.println("������ ��ǰ�� �Է��ϼ���");
		String sang = sc.nextLine();

		boolean find = false;

		for(int i = 0; i<list.size(); i++) {
			Shop0806 shop = list.get(i);
			if(shop.getSangpum().equals(sang)) {
				find = true;
				list.remove(i);
				break;
			}
		}

		if(find) {
			System.out.println(sang + "��(��) �����߽��ϴ�.");
		} else {
			System.out.println(sang + "��(��) ��ܿ� �����ϴ�.");
		}

	}

	//��ü���
	public void shopAllDatas() {

		if(list.size()==0) {
			System.out.println("����� ��ǰ�� �����ϴ�.");
			return; //������ ���� �޼��常 ����!!!!!!!!!!!!!!!!!!!!
		}
		System.out.println("\t**��ǰ����**");
		System.out.println("��ȣ\t��ǰ\t����\t�ܰ�\t�ѱݾ�");
		System.out.println("----------------------------------------");

		//
		int num = 1;
		for(Shop0806 s : list) {
			System.out.println(num++ + "\t" + s.getSangpum() + "\t" + s.getSu() + 
					"\t" + s.getDan() + "\t" + s.getTotal());
		}

	}

	//���� ȣ�� �޼���
	public void process() {

		int num = 0;
		while(true) {
			System.out.println("1.��ǰ�߰�  2.��ǰ���  3.��ǰ�˻�  4.��ǰ����  5.����");
			try {
				num = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� �ٽ� �Է¹ٶ�");
				continue;
			}
			if(num==1) {
				this.shopAdd();
			} else if(num==2) {
				this.shopAllDatas();
			} else if(num==3) {
				this.shopSearch();
			} else if(num==4) {
				this.shopDelete();
			} else if(num==5) {
				System.out.println("Shop���� ���� �� �����մϴ�.");
				this.shopFileWrite();
				System.exit(0);
			} else {
				System.out.println("1~5�� �߿� �Է��ϼ���.");
			} System.out.println();

		}
	}

	public static void main(String[] args) {

		Ex01ShopList ex = new Ex01ShopList();
		ex.process();

	}

}
