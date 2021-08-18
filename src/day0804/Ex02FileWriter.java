package day0804;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Ex02FileWriter {
	
	public static void fileWriter() {
		FileWriter fw = null;
//		String fileName = "C:\\Users\\PC\\Desktop\\study\\test1.txt";
		String fileName = "D:\\bitjava0719\\javawork\\test1.txt";
		try {
			fw = new FileWriter(fileName); //ó�� ������� ���Ͽ� ��� ����⸦ �ϴ� ����Ÿ��!!!!!
			//���Ͽ� ���� �߰��ϱ�
			fw.write("Have a Nice Day!!\n"); //���� �޸��� �ٳѱ��� �ȵǸ� \r\n ���� ��..
			fw.write(new Date().toString()); //Date�� String���� ����Ǿ���ؼ� toString��
			System.out.println("**�������强��**");
			
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
	
	public static void fileWriter2() {
		FileWriter fw = null;
		String fileName = "D:\\bitjava0719\\javawork\\test2.txt";
		
		try {
			fw = new FileWriter(fileName, true); //true�� �ϸ� �������� ���� ������ ��� �߰��� �ȴ�. ���� �ִ� ����� ������ �ʰ� �״��~
			//���Ͽ� �����߰�
			fw.write("Hello, World!\n");
			fw.write(new Date().toString());
			fw.write("���� ������ �ø� Ǫ��������");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		fileWriter();
		fileWriter2();
		
	}

}
