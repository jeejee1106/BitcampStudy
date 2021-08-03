package day0803;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex07FileException_memo1_finally {

	public static void read() {
		
//		String fileName = "C:/Users/PC/Desktop/study/memo1.txt";//파일의 경로를 표시할 때! 슬래시(/)는 한 번, 역슬래시(\\)는 두 번 써줘야한다!
		String fileName = "C:\\Users\\PC\\Desktop\\study\\memo1.txt";//파일의 경로를 표시할 때! 슬래시(/)는 한 번, 역슬래시(\\)는 두 번 써줘야한다!
//		String fileName = "C:\\Users\\PC\\Desktop\\study\\memo1111.txt"; //일부로 없는파일을 생성해봄. 주석처리 지우고 실행하면 오류메세지가 어떻게 뜨는지 보인다.
		BufferedReader br = null;
		FileReader fr = null;
		
		//읽기위해서 파일 열기
		try {
			fr = new FileReader(fileName);
			System.out.println("파일을 열었어요");
			
			br = new BufferedReader(fr);
			while(true) { //여러줄을 읽어야하므로 while문으로!
				String s = br.readLine(); //메모장에서 한줄씩 읽는다
				
				if(s==null) { //마지막줄일 경우 null값을 읽는다
					break;
				} 
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요 : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//exception이 발생하던 안하던 무조건 실행되는 영역
			//finally블록은 옵션임. 생략가능. 예외발생여부와 상관없이 항상 실행할 내용이 있을 경우에만 finally블록을 작성해주면 된다.
			//파일이나 DB처리 자원들 close는 finally에서 주는 게 좋다
			
			try {
				//닫을 땐 생성의 역순으로 닫기
				br.close();
				fr.close();
				System.out.println("파일에 대한 자원들을 모두 닫았어용");
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		read();
		
		System.out.println("**정상종료**");
		
	}

}
