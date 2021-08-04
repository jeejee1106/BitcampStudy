package day0804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex05FileReadWrite {

	Scanner sc =new Scanner(System.in);
	static final String FILENAME = "D:\\bitjava0719\\javawork\\super.txt";
	FileReader fr;
	FileWriter fw;
	BufferedReader br;

	public int getMenu() throws NumberFormatException {
		int num = 0;
		System.out.println("**�޴�**");
		System.out.println("1. ��ǰ�߰�");
		System.out.println("2. ��ü��ǰ ���");
		System.out.println("3. ���ϻ���");
		System.out.println("4. ����");
		num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void sangpumAdd() {
		try {
			fw = new FileWriter(FILENAME, true);
			String sangpum;
			int su=0;
			int dan=0;

			/*
			 * ��ǰ��� ���� �ܰ��� �Է¹޾� ����,4,2000 �̷������� ���Ͽ� ����
			 * ��, ����,�ܰ��� ���� �Է½� su=1, dan=1000���� �ϰ� �����ϱ�
			 * */
			System.out.println("�߰��� ��ǰ�� �Է����ּ���");
			sangpum = sc.nextLine();

			try {
				System.out.println("������ �Է����ּ���");
				su = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				su = 1;
			}

			try {	
				System.out.println("�ܰ��� �Է����ּ���");
				dan = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				//				System.out.println(e.getMessage());
				//				e.printStackTrace();
				dan = 1000;
			}

			fw.write(sangpum + ",");
			fw.write(su + ",");
			fw.write(dan+"\n");
			//fw.write(sangpum + "," + su + "," + dan + "\n"); //�� ���ٰ� ���� �ڵ�
			System.out.println("��ǰ�� �߰��Ǿ����ϴ�.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileAllDatas() {
		NumberFormat nf = NumberFormat.getInstance();
		int total=0;
		int num = 0;

		System.out.println("**��ǰ ����**");
		System.out.println("��ȣ\t��ǰ��\t����\t�ܰ�\t�ݾ�");
		System.out.println("--------------------------------------");

		try {
			fr = new FileReader(FILENAME);  //���⼭ br,fr�� ���� try�ȿ� �־��� ������ ������ ������
			br = new BufferedReader(fr);	//br�� ������� ���ϰ� catch�� �Ѿ��. �׷�NullPointerException�� �߻��Ѵ�.

			while(true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}
				String[] d = s.split(",");
				String sangpum = d[0];
				int su = Integer.parseInt(d[1]);
				int dan = Integer.parseInt(d[2]);
				int sum = su*dan;
				
				total+=sum;
				System.out.println(++num + "\t" + sangpum + "\t" + su + "\t" 
				+ nf.format(dan) + "\t" + nf.format(sum));
			}
			System.out.println();
			System.out.println("\t�� �ݾ� = " + nf.format(total) + "��");

		} catch (FileNotFoundException e) {
			System.out.println("������ �����. �ٽ� �߰��ϼ���!!" + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) {  //���� �� �����ϰ� źź�� �ڵ�. 
					br.close();  //���� ������ ���µ� br�� �������� �Ѵٸ� NullPointerException�� �߻��Ѵ�.(br�� ������� ���ߴµ� ���������ؼ�)
				}				 //�׷��� br,fr�� null�� �ƴҶ���(��, ���� ������ ���� ����) �ݴ´�. ��� ������ ��!
				if(fr!=null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void deleteSangpum() {
		//���� ����
		//File ��ü ����
		File file = new File(FILENAME);
		//���� ������ �����Ѵٸ� �����Ѵ�.
		if(file.exists()) {
			file.delete();
		}
	}
	
	
	//getMenu�� main���� ȣ������ �ʰ� ���� �޼��带 ���� ���⼭ ����ó���� �ϰ� main������ process()�޼��常 ȣ�����ָ� �ȴ�.
	public void process() {
		
		while(true) {
			int num = 0;
			try {
				num =this.getMenu();
			}catch(NumberFormatException e) {
				//num=2; //��� ���ڰ� �Էµ� �� ������ 2���� �Է��� �� ó�� �۵�
				System.out.println("���ڸ� �Է��� �� �ֽ��ϴ�."); //��� ���ڰ� �Էµ� �� �ٽ� ���ڸ� �����ϰ� �۵�
				continue;
			}

			switch(num) {
			case 1 :
				System.out.println("��ǰ ������ �߰��մϴ�.");
				sangpumAdd();
				break;
			case 2:
				System.out.println("��ü ��ǰ�� ����մϴ�.");
				fileAllDatas();
				break;
			case 3:
				System.out.println("��� �����͸� �����մϴ�.");
				deleteSangpum();
				break;
			case 4:
				System.out.println("**���α׷��� �����մϴ�.**");
				System.exit(0);
			default:
				System.out.println("1~4���� �Է��� �� �ֽ��ϴ�.");
			} 

			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		Ex05FileReadWrite ex = new Ex05FileReadWrite();
		
		ex.process();

//		while(true) {
//			int num = 0;
//			try {
//				num =ex.getMenu();
//			}catch(NumberFormatException e) {
//				//num=2; //��� ���ڰ� �Էµ� �� ������ 2���� �Է��� �� ó�� �۵�
//				System.out.println("���ڸ� �Է��� �� �ֽ��ϴ�."); //��� ���ڰ� �Էµ� �� �ٽ� ���ڸ� �����ϰ� �۵�
//				continue;
//			}
//
//			switch(num) {
//			case 1 :
//				System.out.println("��ǰ ������ �߰��մϴ�.");
//				ex.sangpumAdd();
//				break;
//			case 2:
//				System.out.println("��ü ��ǰ�� ����մϴ�.");
//				ex.fileAllDatas();
//				break;
//			case 3:
//				System.out.println("��� �����͸� �����մϴ�.");
//				ex.deleteSangpum();
//				break;
//			case 4:
//				System.out.println("**���α׷��� �����մϴ�.**");
//				System.exit(0);
//			default:
//				System.out.println("1~4���� �Է��� �� �ֽ��ϴ�.");
//			} 
//
//			System.out.println();
//		}
	}
}


