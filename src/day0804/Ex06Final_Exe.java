package day0804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex06Final_Exe {

	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\student11.txt"; //개인노트북
//	static final String FILENAME = "D:\\bitjava0719\\javawork\\student.txt"; //학원pc
	Scanner sc = new Scanner(System.in);
	FileWriter fw;
	FileReader fr;
	BufferedReader br;

	public int getMenu() throws NumberFormatException {
		System.out.println("**학생정보 메뉴~~**");
		System.out.println("1. 학생정보 추가");
		System.out.println("2. 전체학생정보 출력");
		System.out.println("3. 학생 정보 모두 삭제");
		System.out.println("4. 종료");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void stuWrite() {
		try {
			fw = new FileWriter(FILENAME, true);
			String name;
			int java = 0;
			int oracle = 0;

			System.out.println("학생 이름을 입력해주세요");
			name = sc.nextLine();

			while(true) {
				try {
					System.out.println("JAVA 점수를 입력해주세요.");
					java = Integer.parseInt(sc.nextLine());
				} catch(NumberFormatException e) {
					System.out.println("숫자를 입력해주세요.");
					continue;
				} break;
			}

			while(true) {
				try {
					System.out.println("Oracle 점수를 입력해주세요.");
					oracle = Integer.parseInt(sc.nextLine());
				} catch(NumberFormatException e) {
					System.out.println("숫자를 입력해주세요.");
					continue;
				} break;
			}
			fw.write(name + "," + java + "," + oracle + "\n");

			System.out.println("학생 정보가 입력되었습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void stuRead() {

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2); //소수점 2자리로 지정
		int num=0;
		double avg = 0;
		double javg=0;
		double oavg = 0;
		int jsum=0;
		int osum=0;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			System.out.println("**전체학생 정보**");
			System.out.println("번호\t학생명\tJAVA\tOracle\t총점\t평균");

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
			System.out.println("자바평균 : " + nf.format(javg));
			System.out.println("오라클 평균 : " + nf.format(oavg));
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다. 파일을 추가해주세요." + e.getMessage());
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
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("해당 파일이 존재하지 않습니다.");
		}

	}

	public void process() {
		while(true) {
			int num=0;
			try {
				num = this.getMenu();
				switch(num) {
				case 1:
					System.out.println("학생 정보를 추가해주세요.");
					stuWrite();
					break;
				case 2:
					System.out.println("전체 학생 정보를 출력합니다.");
					stuRead();
					break;
				case 3:
					System.out.println("전체 학생 정보를 삭제합니다.");
					stuDelete();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("1~4번 중에 선택해주세요.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력가능합니다.");
			}
			System.out.println();
		} 
	}

	public static void main(String[] args) {

		Ex06Final_Exe ex = new Ex06Final_Exe();
		ex.process();



	}

}
