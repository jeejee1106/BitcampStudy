package day0805;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex08Final_Exe {
	static final String FILENAME = "D:\\bitjava0719\\javawork\\member0806.txt";
	List<String> list = new Vector<String>();
	Scanner sc = new Scanner(System.in);

	public Ex08Final_Exe() {
		fileRead(); //생성 시 파일 이름을 리스트에 넣는다
	}

	public void nameAdd() {
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		list.add(name); //입력한 이름을 list에 추가
		System.out.println("추가되었습니다. (현재 총 " + list.size() + "명)");
	}

	public void nameDelete() {
		System.out.println("삭제할 이름을 입력하세요");
		String name = sc.nextLine(); //만약 같은 이름이 있다면 먼저 들어온 이름부터 삭제된다.

		boolean find = false;

		//방법1 - 이 방법을 더 많이 씀
		for(int i = 0; i<list.size(); i++) {
			String member = list.get(i);
			if(member.equals(name)) {
				find = true;
				list.remove(i);
				break;
			}
		}

		//방법2
		//		find = list.remove(name);

		if(find) {
			System.out.println(name + "회원님을 삭제했습니다.");
		} else {
			System.out.println(name + "회원님은 명단에 없습니다.");
		}
	}

	public void writeAll() {
		System.out.println("**전체회원 명단**");
		if(list.size()==0) {
			System.out.println("아직 회원이 없습니다.");
		}else {
			for(String n:list) {
				System.out.println(n+"\t");
			}System.out.println();
		}

	}

	public void process() {
		int num = 0;
		while(true) {
			System.out.println("1. 이름추가  2. 이름삭제  3. 전체출력  4.종료");
			try {
				num = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("1~4번 중에 선택해주세요.");
				continue;
			}

			switch(num) {
			case 1:
				this.nameAdd();
				break;
			case 2:
				this.nameDelete();
				break;
			case 3:
				this.writeAll();
				break;
			case 4:
				System.out.println("종료합니다.");
				fileWrite(); //종료할 때 자동으로 이름들 저장하기
				System.exit(0);
			default:
				System.out.println("번호 다시 확인 바람!!");
			} System.out.println();


		}
	}

	//처음 생성 시 호출
	public void fileRead() {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			while(true) {
				String name = br.readLine();
				if(name==null) {
					break;
				}
				list.add(name);
			}
			System.out.println("파일에서 총 " + list.size() + "명의 회원목록을 가져왔습니다.");
			
		} catch(FileNotFoundException e) {
			System.out.println("저장된 회원이 없습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			}catch(IOException e){

			}
		}
	}

	//종료 시 호출
	public void fileWrite() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(FILENAME);
			for(String name:list) {
				fw.write(name + "\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {

		Ex08Final_Exe ex = new Ex08Final_Exe();
		ex.process();




	}

}
