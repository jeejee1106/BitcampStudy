package day0804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex05FileReadWrite {

	Scanner sc =new Scanner(System.in);
	static final String FILENAME = "D:\\bitjava0719\\javawork\\super.txt";
	FileReader fr;
	FileWriter fw;
	BufferedReader br;

	public int getMenu() throws NumberFormatException {
		int num = 0;
		System.out.println("**메뉴**");
		System.out.println("1. 상품추가");
		System.out.println("2. 전체상품 출력");
		System.out.println("3. 파일삭제");
		System.out.println("4. 종료");
		num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void sangpumAdd() {
		try {
			fw = new FileWriter(FILENAME, true);
			String sangpum;
			int su=0;
			int dan=0;

			/*
			 * 상품명과 수량 단가를 입력받아 딸기,4,2000 이런식으로 파일에 저장
			 * 단, 수량,단가에 문자 입력시 su=1, dan=1000으로 일괄 저장하기
			 * */
			System.out.println("추가할 상품을 입력해주세요");
			sangpum = sc.nextLine();

			try {
				System.out.println("수량을 입력해주세요");
				su = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				su = 1;
			}

			try {	
				System.out.println("단가를 입력해주세요");
				dan = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				//				System.out.println(e.getMessage());
				//				e.printStackTrace();
				dan = 1000;
			}

			fw.write(sangpum + ",");
			fw.write(su + ",");
			fw.write(dan+"\n");
			//fw.write(sangpum + "," + su + "," + dan + "\n"); //위 세줄과 같은 코드
			System.out.println("상품이 추가되었습니다.");

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

	public void fileAllDatas() {
		NumberFormat nf = NumberFormat.getInstance();
		int total=0;
		int num = 0;

		System.out.println("**상품 정보**");
		System.out.println("번호\t상품명\t수량\t단가\t금액");
		System.out.println("--------------------------------------");

		try {
			fr = new FileReader(FILENAME);  //여기서 br,fr을 같이 try안에 넣었기 때문에 파일이 없으면
			br = new BufferedReader(fr);	//br은 실행되지 못하고 catch로 넘어간다. 그럼NullPointerException이 발생한다.

			while(true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}
				String[] d = s.split(",");
				String sangpum = d[0];
				int su = Integer.parseInt(d[1]);
				int dan = Integer.parseInt(d[2]);
				int sum = su*dan;
				
				total+=sum;
				System.out.println(++num + "\t" + sangpum + "\t" + su + "\t" 
				+ nf.format(dan) + "\t" + nf.format(sum));
			}
			System.out.println();
			System.out.println("\t총 금액 = " + nf.format(total) + "원");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요. 다시 추가하세요!!" + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) {  //조금 더 안전하고 탄탄한 코드. 
					br.close();  //만약 파일이 없는데 br을 닫으려고 한다면 NullPointerException이 발생한다.(br은 실행되지 못했는데 닫으려고해서)
				}				 //그래서 br,fr이 null이 아닐때만(즉, 닫을 파일이 있을 때만) 닫는다. 라고 적어준 것!
				if(fr!=null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void deleteSangpum() {
		//파일 삭제
		//File 객체 생성
		File file = new File(FILENAME);
		//만약 파일이 존재한다면 삭제한다.
		if(file.exists()) {
			file.delete();
		}
	}
	
	
	//getMenu를 main에서 호출하지 않고 따로 메서드를 만들어서 여기서 예외처리를 하고 main에서는 process()메서드만 호출해주면 된다.
	public void process() {
		
		while(true) {
			int num = 0;
			try {
				num =this.getMenu();
			}catch(NumberFormatException e) {
				//num=2; //얘는 문자가 입력될 시 무조건 2번을 입력한 것 처럼 작동
				System.out.println("숫자만 입력할 수 있습니다."); //얘는 문자가 입력될 시 다시 숫자를 선택하게 작동
				continue;
			}

			switch(num) {
			case 1 :
				System.out.println("상품 정보를 추가합니다.");
				sangpumAdd();
				break;
			case 2:
				System.out.println("전체 상품을 출력합니다.");
				fileAllDatas();
				break;
			case 3:
				System.out.println("모든 데이터를 삭제합니다.");
				deleteSangpum();
				break;
			case 4:
				System.out.println("**프로그램을 종료합니다.**");
				System.exit(0);
			default:
				System.out.println("1~4번만 입력할 수 있습니다.");
			} 

			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		Ex05FileReadWrite ex = new Ex05FileReadWrite();
		
		ex.process();

//		while(true) {
//			int num = 0;
//			try {
//				num =ex.getMenu();
//			}catch(NumberFormatException e) {
//				//num=2; //얘는 문자가 입력될 시 무조건 2번을 입력한 것 처럼 작동
//				System.out.println("숫자만 입력할 수 있습니다."); //얘는 문자가 입력될 시 다시 숫자를 선택하게 작동
//				continue;
//			}
//
//			switch(num) {
//			case 1 :
//				System.out.println("상품 정보를 추가합니다.");
//				ex.sangpumAdd();
//				break;
//			case 2:
//				System.out.println("전체 상품을 출력합니다.");
//				ex.fileAllDatas();
//				break;
//			case 3:
//				System.out.println("모든 데이터를 삭제합니다.");
//				ex.deleteSangpum();
//				break;
//			case 4:
//				System.out.println("**프로그램을 종료합니다.**");
//				System.exit(0);
//			default:
//				System.out.println("1~4번만 입력할 수 있습니다.");
//			} 
//
//			System.out.println();
//		}
	}
}


