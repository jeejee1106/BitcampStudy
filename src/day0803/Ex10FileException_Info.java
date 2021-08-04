package day0803;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex10FileException_Info {
	/*
	 * info.txt�� �о ������ ���� ���
	 * �̸�       ����      ����
	 * -----------------
	 * �̿���   ������   34��
	 * */


	public static void fileRead() {
//		String filename = "C:\\Users\\PC\\Desktop\\study\\info.txt"; //���γ�Ʈ�ϰ��
		String filename = "D:\\bitjava0719\\javawork\\info.txt"; //�п�PC���
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(filename);
			//			System.out.println("������ ����");
			br = new BufferedReader(fr);
			
			System.out.println("�̸�\t����\t����");
			System.out.println("---------------------");
			while(true) {
				String s = br.readLine(); //�޸��忡�� ���پ� �д´�
				if(s==null) {
					break;
				}
				String[] data = s.split(",");
//				System.out.println(data[0] + "\t" + data[1] + "\t" + data[2] + "��");
				for(String d:data) {  //�� ���ٰ� ���� �ڵ�. for������ �� ���� �ֶ�
					System.out.print(d+ "\t");
				} System.out.println();
				
				//����� split ��� StringTokenizer�� �غ���
//				StringTokenizer st = new StringTokenizer(s, ",");
//				System.out.println(st.nextToken() + "\t" + st.nextToken() + "\t" + st.nextToken() + "\t");
				

				} 
		} catch (FileNotFoundException e) {
			System.out.println("���Ͼ��� : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}

		//		StringTokenizer st = new StringTokenizer(filename, ",");
		//		while(st.hasMoreTokens()) { 
		//			System.out.println(st.nextToken());
		//		}

	}

	public static void main(String[] args) {
		
		fileRead();

	}

}
