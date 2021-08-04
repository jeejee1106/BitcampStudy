package day0804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex06Final_Exe {
	
	static final String FILENAME = "D:\\bitjava0719\\javawork\\student.txt";
	Scanner sc = new Scanner(System.in);
	FileWriter fw;
	FileReader fr;
	BufferedReader br;
	
	public int getMenu() throws NumberFormatException {
		System.out.println("**�л����� �޴�~~**");
		System.out.println("1. �л����� �߰�");
		System.out.println("2. ��ü�л����� ���");
		System.out.println("3. �л� ���� ��� ����");
		System.out.println("4. ����");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public void stuWrite() {
		try {
			fw = new FileWriter(FILENAME, true);
			String name;
			int java = 0;
			int oracle = 0;
			
			System.out.println("�л� �̸��� �Է����ּ���");
			name = sc.nextLine();
			
			try {
			System.out.println("JAVA ������ �Է����ּ���.");
			java = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է����ּ���.");
			}
			
			try {
			System.out.println("Oracle ������ �Է����ּ���.");
			oracle = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է����ּ���.");
			}
			
			fw.write(name + "," + java + "," + oracle + "\n");
			
			System.out.println("�л� ������ �ԷµǾ����ϴ�.");
			
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
	
	public void stuRead() {
		
		int num=0;
		double avg = 0;
		double javg=0;
		double oavg = 0;
		int jsum=0;
		int osum=0;
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			System.out.println("**��ü�л� ����**");
			System.out.println("��ȣ\t�л���\tJAVA\tOracle\t����\t���");
			
			while(true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}
				String[] d = s.split(",");
				String name = d[0];
				int java = Integer.parseInt(d[1]);
				int oracle = Integer.parseInt(d[2]);
				int sum = java+oracle;
				avg = sum/2.0;
				
				jsum +=java;
				osum += oracle;
				
				
				System.out.println(++num + "\t" + name + "\t" + java + "\t"
						+ oracle + "\t" + sum + "\t" + avg);
			} 
			javg = (double)jsum/num;
			oavg = (double)osum/num;
			System.out.println("�ڹ���� : " + javg);
			System.out.println("����Ŭ ��� : " + oavg);
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�. ������ �߰����ּ���." + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) {
					br.close();
				}
				if(fr!=null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void stuDelete() {
		
		File file = new File(FILENAME);
		if(file.exists()) {
			file.delete();
		}
		
	}
	
	public void process() {
		while(true) {
			int num=0;
			try {
				num = this.getMenu();
				switch(num) {
				case 1:
					System.out.println("�л� ������ �߰����ּ���.");
					stuWrite();
					break;
				case 2:
					System.out.println("��ü �л� ������ ����մϴ�.");
					stuRead();
					break;
				case 3:
					System.out.println("��ü �л� ������ �����մϴ�.");
					stuDelete();
					break;
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				default:
					System.out.println("1~4�� �߿� �������ּ���.");
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է°����մϴ�.");
			}
			System.out.println();
		} 
	}

	public static void main(String[] args) {
		
		Ex06Final_Exe ex = new Ex06Final_Exe();
		ex.process();
		
		

	}

}
