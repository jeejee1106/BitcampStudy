package day0804;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex03FileWriter {
	Scanner sc;
	FileWriter fw;
	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\member.txt";
//	static final String FILENAME = "D:\\bitjava0719\\javawork\\member.txt";
	
	public Ex03FileWriter() {
		sc = new Scanner(System.in);
	}
	
	public void dataWrite() {
		try {
			fw = new FileWriter(FILENAME, true); //true니까 추가되면서 생성됨.
			//Scanner로 입력 후 저장(이름,주소,핸드폰)
			System.out.println("이름입력");
			String name = sc.nextLine();
			System.out.println("주소입력");
			String add = sc.nextLine();
			System.out.println("핸드폰입력");
			String hp = sc.nextLine();
			System.out.println("**파일저장. 파일을 확인하셈**");
			
			//파일에 내용추가
			fw.write("회원명 : " + name + "\n");
			fw.write("주 소 : " + add + "\n");
			fw.write("핸드폰 : " + hp + "\n---------------------\n");
			
			
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
	
	

	public static void main(String[] args) {

		Ex03FileWriter ex = new Ex03FileWriter();
		ex.dataWrite();
	
	
	
	}

}
