package day0804;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex03FileWriter {
	Scanner sc;
	FileWriter fw;
	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\member.txt";
//	static final String FILENAME = "D:\\bitjava0719\\javawork\\member.txt";
	
	public Ex03FileWriter() {
		sc = new Scanner(System.in);
	}
	
	public void dataWrite() {
		try {
			fw = new FileWriter(FILENAME, true); //true�ϱ� �߰��Ǹ鼭 ������.
			//Scanner�� �Է� �� ����(�̸�,�ּ�,�ڵ���)
			System.out.println("�̸��Է�");
			String name = sc.nextLine();
			System.out.println("�ּ��Է�");
			String add = sc.nextLine();
			System.out.println("�ڵ����Է�");
			String hp = sc.nextLine();
			System.out.println("**��������. ������ Ȯ���ϼ�**");
			
			//���Ͽ� �����߰�
			fw.write("ȸ���� : " + name + "\n");
			fw.write("�� �� : " + add + "\n");
			fw.write("�ڵ��� : " + hp + "\n---------------------\n");
			
			
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
	
	

	public static void main(String[] args) {

		Ex03FileWriter ex = new Ex03FileWriter();
		ex.dataWrite();
	
	
	
	}

}
