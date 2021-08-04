package day0803;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex14Final_Exe {
	/*
	 * 가족수당 = 가족수*30000
	 * 시간수당 = 시간수*12000
	 * 출력양식
	 * 2021-08-03 17:50 화요일
	 *  **사원 급여 현황**
	 *  번호     사원명     기본급              가족수     초과근무     가족수당      시간수당        총급여
	 * 
	 *  
	 *  //공백제거
	 *  //Date
	 *  //넘버포맷
	 *  
	 * */
	public static void sawonRead() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		System.out.println(sdf.format(date));

//		String fileName = "C:\\Users\\PC\\Desktop\\study\\sawon.txt"; //개인노트북경로
		String fileName = "D:\\bitjava0719\\javawork\\sawon.txt"; //학원PC경로
		FileReader fr = null;
		BufferedReader br = null;
		System.out.println("**사원 급여 현황**");
		System.out.println("번호\t사원명\t기본급\t\t가족수\t초과근무\t가족수당\t시간수당\t총급여");

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			int a = 0;

			while(true) {
				String s = br.readLine(); //메모장에서 한줄씩 읽는다
				if(s==null) {
					break;
				}
				String[] data = s.split(",");
				String sawonName = data[0];
				int gibon = Integer.parseInt(data[1]);
				int family = Integer.parseInt(data[2]);
				int over = Integer.parseInt(data[3]);
				
				int fsudang = family*30000;
				int tsudang = over*12000;
				int total = gibon+fsudang+tsudang;
				
//				NumberFormat nf1 = NumberFormat.getCurrencyInstance(); //화폐단위와 자릿수콤마 표시
				NumberFormat nf1 = NumberFormat.getInstance(); //자릿수콤마만 표시

				System.out.println(++a + "\t" + sawonName + "\t" + nf1.format(gibon) + "\t" + family + "\t" + over + "\t"
						+ nf1.format(fsudang) + "\t" + nf1.format(tsudang) + "\t" + nf1.format(total));
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


	}




	public static void main(String[] args) {

		sawonRead();


	}

}
