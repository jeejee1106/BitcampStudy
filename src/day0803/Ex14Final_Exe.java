package day0803;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex14Final_Exe {
	/*
	 * �������� = ������*30000
	 * �ð����� = �ð���*12000
	 * ��¾��
	 * 2021-08-03 17:50 ȭ����
	 *  **��� �޿� ��Ȳ**
	 *  ��ȣ     �����     �⺻��              ������     �ʰ��ٹ�     ��������      �ð�����        �ѱ޿�
	 * 
	 *  
	 *  //��������
	 *  //Date
	 *  //�ѹ�����
	 *  
	 * */
	public static void sawonRead() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		System.out.println(sdf.format(date));

//		String fileName = "C:\\Users\\PC\\Desktop\\study\\sawon.txt"; //���γ�Ʈ�ϰ��
		String fileName = "D:\\bitjava0719\\javawork\\sawon.txt"; //�п�PC���
		FileReader fr = null;
		BufferedReader br = null;
		System.out.println("**��� �޿� ��Ȳ**");
		System.out.println("��ȣ\t�����\t�⺻��\t\t������\t�ʰ��ٹ�\t��������\t�ð�����\t�ѱ޿�");

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			int a = 0;

			while(true) {
				String s = br.readLine(); //�޸��忡�� ���پ� �д´�
				if(s==null) {
					break;
				}
				String[] data = s.split(",");
				String sawonName = data[0];
				int gibon = Integer.parseInt(data[1]);
				int family = Integer.parseInt(data[2]);
				int over = Integer.parseInt(data[3]);
				
				int fsudang = family*30000;
				int tsudang = over*12000;
				int total = gibon+fsudang+tsudang;
				
//				NumberFormat nf1 = NumberFormat.getCurrencyInstance(); //ȭ������� �ڸ����޸� ǥ��
				NumberFormat nf1 = NumberFormat.getInstance(); //�ڸ����޸��� ǥ��

				System.out.println(++a + "\t" + sawonName + "\t" + nf1.format(gibon) + "\t" + family + "\t" + over + "\t"
						+ nf1.format(fsudang) + "\t" + nf1.format(tsudang) + "\t" + nf1.format(total));
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


	}




	public static void main(String[] args) {

		sawonRead();


	}

}
