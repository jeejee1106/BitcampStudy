package day0803;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex07FileException_memo1_finally {

	public static void read() {
		
//		String fileName = "C:/Users/PC/Desktop/study/memo1.txt";//������ ��θ� ǥ���� ��! ������(/)�� �� ��, ��������(\\)�� �� �� ������Ѵ�!
		String fileName = "C:\\Users\\PC\\Desktop\\study\\memo1.txt";//������ ��θ� ǥ���� ��! ������(/)�� �� ��, ��������(\\)�� �� �� ������Ѵ�!
//		String fileName = "C:\\Users\\PC\\Desktop\\study\\memo1111.txt"; //�Ϻη� ���������� �����غ�. �ּ�ó�� ����� �����ϸ� �����޼����� ��� �ߴ��� ���δ�.
		BufferedReader br = null;
		FileReader fr = null;
		
		//�б����ؼ� ���� ����
		try {
			fr = new FileReader(fileName);
			System.out.println("������ �������");
			
			br = new BufferedReader(fr);
			while(true) { //�������� �о���ϹǷ� while������!
				String s = br.readLine(); //�޸��忡�� ���پ� �д´�
				
				if(s==null) { //���������� ��� null���� �д´�
					break;
				} 
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ����� : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//exception�� �߻��ϴ� ���ϴ� ������ ����Ǵ� ����
			//finally����� �ɼ���. ��������. ���ܹ߻����ο� ������� �׻� ������ ������ ���� ��쿡�� finally����� �ۼ����ָ� �ȴ�.
			//�����̳� DBó�� �ڿ��� close�� finally���� �ִ� �� ����
			
			try {
				//���� �� ������ �������� �ݱ�
				br.close();
				fr.close();
				System.out.println("���Ͽ� ���� �ڿ����� ��� �ݾҾ��");
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		read();
		
		System.out.println("**��������**");
		
	}

}
