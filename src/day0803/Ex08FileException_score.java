package day0803;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08FileException_score {
	/*
	 * score.txt �� �а� ������ �� ����� ���ϰ� ������ ���� ������ ��� ���ؼ� ���
	 * */
	public static void scoreRead() throws IOException, FileNotFoundException {
		String fileName = "C:\\Users\\PC\\Desktop\\study\\score.txt";
		FileReader fr = null; //������ ����� �� ��ο� �ִ���, �� �������� Ȯ���ϴ�(?)�ڵ�
		BufferedReader br = null; //������ ������ ������ �д� �ڵ�?
		int cnt = 0; //������ ����
		int total = 0; //������ �� ��
		double avg = 0; //������ ���
		
		//�����б�
		fr = new FileReader(fileName);
		System.out.println("���� ���������� ����");
		
		br = new BufferedReader(fr);
		while(true) {
			String s = br.readLine(); 
			//�� �̻� ���� ������ ����
			if(s==null) {
				break;
			}
			cnt++; //���� ����
			total += Integer.parseInt(s); // ���� ���� �հ�
		}
		
		//��ձ��ϱ�
		avg = (double)total/cnt;
		System.out.println("�� ���� : " + cnt);
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		
		//�ڿ��� �ݱ�
		br.close();
		fr.close();
		
	}

	public static void main(String[] args) {
		
		try {
			scoreRead();
		} catch (FileNotFoundException e) {
			System.out.println("���Ͼ��� : " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("**���� ����**");
	}

}
