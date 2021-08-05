package day0804;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex04FileReadWrite {
	
	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\sungjuk.txt";
//	static final String FILENAME = "D:\\bitjava0719\\javawork\\sungjuk.txt";
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	Scanner sc = new Scanner(System.in);
	
	public int getMenu() {
		int num = 0;
		System.out.println("1.추가  2.전체출력  9.종료");
		num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public void sungjukIn() { //정보 입력해서 파일에 저장
		System.out.println("학생명을 입력하세요"); //콘솔에만 뜨는 명령!!!!
		String name = sc.nextLine(); //이름,점수 입력받을거임
		System.out.println("점수를 입력하세요");
		int score = 0;
		//만약 점수 입력 시 NumberFomatException이 발생하면(int가 들어와야 하는데 문자가 들어온 경우) score는 무조선 10으로 저장해보자
		try {
			score = Integer.parseInt(sc.nextLine().trim()); //앞뒤공백 제거 후 int로 변환
		} catch(NumberFormatException e) { //에러 안나면 catch문 실행안되고 다음코드 쭉.
			score = 10; //에러나면 score를 10으로 주겠다!
		}
		
		//파일에 내용추가
		try {
			fw = new FileWriter(FILENAME, true); //추가되면서 저장
			fw.write(name+"\n"); //실제로 sungjuk.txt 파일에 저장되는 내용!!!!!!!!
			fw.write(score+"\n");
			System.out.println("**학생정보가 저장되었어용**");
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
	
	
	public void fileRead() { //파일을 읽어서 계산 후 출력
		System.out.println("\t**학생 정보**");
		System.out.println("번호\t이름\t점수\t학점");
		System.out.println("----------------------------");
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			int num=0;
			while(true) {
				String name = br.readLine();
				if(name==null) {
					break;
				}
				int score = Integer.parseInt(br.readLine());
				char grade = getGrade(score);
				System.out.println(++num + "\t" + name + "\t" + score + "\t" + grade);
			}
			System.out.println("*출력 끝*");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
	
	public char getGrade(int score) {
		char ch;
		switch(score/10) {
		case 10: case 9:
			ch = 'A';
			break;
		case 8:
			ch = 'B';
			break;
		case 7:
			ch = 'C';
			break;
		case 6:
			ch = 'D';
			break;
		default:
			ch = 'F';
		}
		return ch;
	}
	

	public static void main(String[] args) {
		
		Ex04FileReadWrite ex = new Ex04FileReadWrite();
		while(true) {
			int num = ex.getMenu();
			switch(num) {
			case 1:
				System.out.println("학생정보 입력");
				ex.sungjukIn();
				break;
			case 2:
				System.out.println("**전체 학생 정보 출력**");
				ex.fileRead();
				break;
			case 9:
				System.out.println("**프로그램을 종료합니다**");
				System.exit(0);
			default :
				System.out.println("번호를 다시 한 번 확인 후 입력해주세요");
			}
		}
		
	}

}
