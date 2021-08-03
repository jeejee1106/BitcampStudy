package day0803;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08FileException_score {
	/*
	 * score.txt 를 읽고 점수가 총 몇개인지 구하고 점수에 대한 총점과 평균 구해서 출력
	 * */
	public static void scoreRead() throws IOException, FileNotFoundException {
		String fileName = "C:\\Users\\PC\\Desktop\\study\\score.txt";
		FileReader fr = null; //파일이 제대로 된 경로에 있는지, 잘 열리는지 확인하는(?)코드
		BufferedReader br = null; //실제로 파일의 내용을 읽는 코드?
		int cnt = 0; //점수의 갯수
		int total = 0; //점수의 총 합
		double avg = 0; //점수의 평균
		
		//파읽읽기
		fr = new FileReader(fileName);
		System.out.println("파일 정상적으로 읽음");
		
		br = new BufferedReader(fr);
		while(true) {
			String s = br.readLine(); 
			//더 이상 값이 없으면 종료
			if(s==null) {
				break;
			}
			cnt++; //읽은 갯수
			total += Integer.parseInt(s); // 점수 갯수 합계
		}
		
		//평균구하기
		avg = (double)total/cnt;
		System.out.println("총 갯수 : " + cnt);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		//자원들 닫기
		br.close();
		fr.close();
		
	}

	public static void main(String[] args) {
		
		try {
			scoreRead();
		} catch (FileNotFoundException e) {
			System.out.println("파일없음 : " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("**정상 종료**");
	}

}
