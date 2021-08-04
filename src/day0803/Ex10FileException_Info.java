package day0803;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex10FileException_Info {
	/*
	 * info.txt를 읽어서 다음과 같이 출력
	 * 이름       지역      나이
	 * -----------------
	 * 이영자   영등포   34세
	 * */


	public static void fileRead() {
//		String filename = "C:\\Users\\PC\\Desktop\\study\\info.txt"; //개인노트북경로
		String filename = "D:\\bitjava0719\\javawork\\info.txt"; //학원PC경로
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(filename);
			//			System.out.println("파일을 읽음");
			br = new BufferedReader(fr);
			
			System.out.println("이름\t지역\t나이");
			System.out.println("---------------------");
			while(true) {
				String s = br.readLine(); //메모장에서 한줄씩 읽는다
				if(s==null) {
					break;
				}
				String[] data = s.split(",");
//				System.out.println(data[0] + "\t" + data[1] + "\t" + data[2] + "세");
				for(String d:data) {  //위 한줄과 같은 코드. for문으로 할 수도 있땅
					System.out.print(d+ "\t");
				} System.out.println();
				
				//여기는 split 대신 StringTokenizer로 해보자
//				StringTokenizer st = new StringTokenizer(s, ",");
//				System.out.println(st.nextToken() + "\t" + st.nextToken() + "\t" + st.nextToken() + "\t");
				

				} 
		} catch (FileNotFoundException e) {
			System.out.println("파일없음 : " + e.getMessage());
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

		//		StringTokenizer st = new StringTokenizer(filename, ",");
		//		while(st.hasMoreTokens()) { 
		//			System.out.println(st.nextToken());
		//		}

	}

	public static void main(String[] args) {
		
		fileRead();

	}

}
