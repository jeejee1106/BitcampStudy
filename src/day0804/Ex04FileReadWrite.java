package day0804;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex04FileReadWrite {
	
	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\sungjuk.txt";
//	static final String FILENAME = "D:\\bitjava0719\\javawork\\sungjuk.txt";
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	Scanner sc = new Scanner(System.in);
	
	public int getMenu() {
		int num = 0;
		System.out.println("1.�߰�  2.��ü���  9.����");
		num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public void sungjukIn() { //���� �Է��ؼ� ���Ͽ� ����
		System.out.println("�л����� �Է��ϼ���"); //�ֿܼ��� �ߴ� ���!!!!
		String name = sc.nextLine(); //�̸�,���� �Է¹�������
		System.out.println("������ �Է��ϼ���");
		int score = 0;
		//���� ���� �Է� �� NumberFomatException�� �߻��ϸ�(int�� ���;� �ϴµ� ���ڰ� ���� ���) score�� ������ 10���� �����غ���
		try {
			score = Integer.parseInt(sc.nextLine().trim()); //�յڰ��� ���� �� int�� ��ȯ
		} catch(NumberFormatException e) { //���� �ȳ��� catch�� ����ȵǰ� �����ڵ� ��.
			score = 10; //�������� score�� 10���� �ְڴ�!
		}
		
		//���Ͽ� �����߰�
		try {
			fw = new FileWriter(FILENAME, true); //�߰��Ǹ鼭 ����
			fw.write(name+"\n"); //������ sungjuk.txt ���Ͽ� ����Ǵ� ����!!!!!!!!
			fw.write(score+"\n");
			System.out.println("**�л������� ����Ǿ����**");
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
	
	
	public void fileRead() { //������ �о ��� �� ���
		System.out.println("\t**�л� ����**");
		System.out.println("��ȣ\t�̸�\t����\t����");
		System.out.println("----------------------------");
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			int num=0;
			while(true) {
				String name = br.readLine();
				if(name==null) {
					break;
				}
				int score = Integer.parseInt(br.readLine());
				char grade = getGrade(score);
				System.out.println(++num + "\t" + name + "\t" + score + "\t" + grade);
			}
			System.out.println("*��� ��*");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public char getGrade(int score) {
		char ch;
		switch(score/10) {
		case 10: case 9:
			ch = 'A';
			break;
		case 8:
			ch = 'B';
			break;
		case 7:
			ch = 'C';
			break;
		case 6:
			ch = 'D';
			break;
		default:
			ch = 'F';
		}
		return ch;
	}
	

	public static void main(String[] args) {
		
		Ex04FileReadWrite ex = new Ex04FileReadWrite();
		while(true) {
			int num = ex.getMenu();
			switch(num) {
			case 1:
				System.out.println("�л����� �Է�");
				ex.sungjukIn();
				break;
			case 2:
				System.out.println("**��ü �л� ���� ���**");
				ex.fileRead();
				break;
			case 9:
				System.out.println("**���α׷��� �����մϴ�**");
				System.exit(0);
			default :
				System.out.println("��ȣ�� �ٽ� �� �� Ȯ�� �� �Է����ּ���");
			}
		}
		
	}

}
