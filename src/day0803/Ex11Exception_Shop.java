package day0803;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex11Exception_Shop {

	public static void payRead() {
		String fileName = "C:\\Users\\PC\\Desktop\\study\\shop.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			System.out.println("��ȣ\t��ǰ\t����\t�ܰ�\t�ѱݾ�");
			System.out.println("---------------------------------------");
			int a = 0;
			
			while(true) {
				String s = br.readLine(); //�޸��忡�� ���پ� �д´�
				if(s==null) {
					break;
				}
				
				//�и���� 1(��ũ������)
//				StringTokenizer st = new StringTokenizer(s, ",");
//				String sang = st.nextToken();
//				int su = Integer.parseInt(st.nextToken());
//				int dan = Integer.parseInt(st.nextToken());
//				int total = su*dan;
				
				//�и����2
				String[] data = s.split(",");
				String sang = data[0];
				int su = Integer.parseInt(data[1]);
				int dan = Integer.parseInt(data[2]);
				int total = su*dan;
				
				System.out.println(++a + "\t" + sang + "\t" + su + "\t" + dan + "\t" + total);
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

		payRead();
	}

}
