package day0804;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Ex01_0803FinalExe_Answer {
	
	public static void fileRead() {
		String fileName = "D:\\bitjava0719\\javawork\\sawon.txt";
		FileReader fr = null;
		BufferedReader br = null;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		NumberFormat nf1 = NumberFormat.getInstance();
		int num = 1;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			//날짜부터 출력
			System.out.println("\t" + sdf.format(date));
			System.out.println();
			//제목
			System.out.println("\t**사원 급여 현황**");
			System.out.println("번호\t사원명\t기본급\t\t가족수\t초과근무\t가족수당\t시간수당\t총급여");
			System.out.println("----------------------------------------------------------------------------------------------");
			
			while(true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}
				try {
					//방법1. StringTokenizer
//					StringTokenizer st = new StringTokenizer(s, ",");
//					String name = st.nextToken();
//					int gibon = Integer.parseInt(st.nextToken().trim()); //trim은 문자열 사이의 공백을 없애줌
//					int family = Integer.parseInt(st.nextToken().trim()); //만약 공백이 있는데 trim이 없으면 NumberFormatException 발생
//					int overtime = Integer.parseInt(st.nextToken().trim());
					
					//방법2. split
					String[] data = s.split(",");
					String name = data[0];
					int gibon = Integer.parseInt(data[1].trim());
					int family = Integer.parseInt(data[2].trim());
					int overtime = Integer.parseInt(data[3].trim());
					
					int fsudang = family*30000;
					int tsudang = overtime*12000;
					int total = gibon+fsudang+tsudang;
					
					System.out.print(num++ + "\t" + name + "\t" + nf1.format(gibon) + "원\t" );
					System.out.print(family + "\t" + overtime + "\t" + nf1.format(fsudang) + "\t" );
					System.out.println(nf1.format(tsudang) + "\t" + nf1.format(total));
					
				} catch(NoSuchElementException e) { //문자열 분리를 StringTokenizer으로 했을 때 파일끝에 엔터 공백이 있는 예외??
					break; 
				} catch(ArrayIndexOutOfBoundsException e) { //문자열 분리를 split으로 했을 때 파일끝에 엔터 공백이 있는 예외??
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일없어용 : " + e.getMessage());
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

	public static void main(String[] args) {
		fileRead();
	
	
	}

}
