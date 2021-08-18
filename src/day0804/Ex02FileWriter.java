package day0804;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Ex02FileWriter {
	
	public static void fileWriter() {
		FileWriter fw = null;
//		String fileName = "C:\\Users\\PC\\Desktop\\study\\test1.txt";
		String fileName = "D:\\bitjava0719\\javawork\\test1.txt";
		try {
			fw = new FileWriter(fileName); //처음 만들었던 파일에 계속 덮어쓰기를 하는 파일타입!!!!!
			//파일에 내용 추가하기
			fw.write("Have a Nice Day!!\n"); //만약 메모장 줄넘김이 안되면 \r\n 쓰면 됌..
			fw.write(new Date().toString()); //Date가 String으로 저장되어야해서 toString씀
			System.out.println("**파일저장성공**");
			
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
	
	public static void fileWriter2() {
		FileWriter fw = null;
		String fileName = "D:\\bitjava0719\\javawork\\test2.txt";
		
		try {
			fw = new FileWriter(fileName, true); //true로 하면 컴파일한 파일 내용이 계속 추가가 된다. 전에 있던 내용들 변하지 않고 그대로~
			//파일에 내용추가
			fw.write("Hello, World!\n");
			fw.write(new Date().toString());
			fw.write("오늘 점심은 냉면 푸하하하하");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		fileWriter();
		fileWriter2();
		
	}

}
