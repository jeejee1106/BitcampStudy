package day0804;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Ex01_0803FinalExe_Answer {
	
	public static void fileRead() {
		String fileName = "D:\\bitjava0719\\javawork\\sawon.txt";
		FileReader fr = null;
		BufferedReader br = null;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		NumberFormat nf1 = NumberFormat.getInstance();
		int num = 1;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			//��¥���� ���
			System.out.println("\t" + sdf.format(date));
			System.out.println();
			//����
			System.out.println("\t**��� �޿� ��Ȳ**");
			System.out.println("��ȣ\t�����\t�⺻��\t\t������\t�ʰ��ٹ�\t��������\t�ð�����\t�ѱ޿�");
			System.out.println("----------------------------------------------------------------------------------------------");
			
			while(true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}
				try {
					//���1. StringTokenizer
//					StringTokenizer st = new StringTokenizer(s, ",");
//					String name = st.nextToken();
//					int gibon = Integer.parseInt(st.nextToken().trim()); //trim�� ���ڿ� ������ ������ ������
//					int family = Integer.parseInt(st.nextToken().trim()); //���� ������ �ִµ� trim�� ������ NumberFormatException �߻�
//					int overtime = Integer.parseInt(st.nextToken().trim());
					
					//���2. split
					String[] data = s.split(",");
					String name = data[0];
					int gibon = Integer.parseInt(data[1].trim());
					int family = Integer.parseInt(data[2].trim());
					int overtime = Integer.parseInt(data[3].trim());
					
					int fsudang = family*30000;
					int tsudang = overtime*12000;
					int total = gibon+fsudang+tsudang;
					
					System.out.print(num++ + "\t" + name + "\t" + nf1.format(gibon) + "��\t" );
					System.out.print(family + "\t" + overtime + "\t" + nf1.format(fsudang) + "\t" );
					System.out.println(nf1.format(tsudang) + "\t" + nf1.format(total));
					
				} catch(NoSuchElementException e) { //���ڿ� �и��� StringTokenizer���� ���� �� ���ϳ��� ���� ������ �ִ� ����??
					break; 
				} catch(ArrayIndexOutOfBoundsException e) { //���ڿ� �и��� split���� ���� �� ���ϳ��� ���� ������ �ִ� ����??
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("���Ͼ���� : " + e.getMessage());
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

	public static void main(String[] args) {
		fileRead();
	
	
	}

}
