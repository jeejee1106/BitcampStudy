package day0806;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX02Finla_Test {
//	static final String FILENAME = "D:\\bitjava0719\\javawork\\Test0806.txt";
	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\Member0806.txt";
	List<Member0806> list = new ArrayList<Member0806>();
	Scanner sc = new Scanner(System.in);

	public EX02Finla_Test() {
		memberFileRead();
		
	}

	public void memberFileWrite() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			for(Member0806 member : list) {
				String s = member.getName() + "," + member.getHp() + "," + member.getGender() + "\n";
				fw.write(s);
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

	public void memberFileRead() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while(true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}

				String[] d = s.split(",");
				String name = d[0];
				String hp = d[1];
				String gender = d[2];

				Member0806 t = new Member0806(name, hp, gender);
				list.add(t);

			}
			System.out.println("파일에서 총 " + list.size() + "명의 회원 목록을 가져왔습니다.");



		} catch (FileNotFoundException e) {
			System.out.println("회원 목록이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public void memberAdd() {
		System.out.println("추가할 회원명을 입력해주세요");
		String name = sc.nextLine();
		for(Member0806 ts : list) {
			if(ts.getName().equals(name)) {
				System.out.println("같은 이름이 있습니다. 다른 이름으로 가입해주세요.");
				return;
			}
		}
		
		System.out.println("회원님의 핸드폰 번호를 입력해주세요.");
		String hp = sc.nextLine();
		
		String gender = "";
		while(true) {
			System.out.println("회원님의 성별을 입력해주세요.(남/여)");
			gender = sc.nextLine();
			if(gender.equals("남")|| gender.equals("여"))
				break;
			else if(!gender.equals("남")||!gender.equals("여")) {
				System.out.println("남 또는 여로 입력해주세요");
			}
		}
		
		Member0806 ts = new Member0806(name, hp, gender);
		list.add(ts);
		System.out.println("회원정보가 추가되었습니다.");

	}

	public void memberAllData() {
		int num = 0;
		if(list.size()==0) {
			System.out.println("회원 목록이 없습니다.");
			return;
		}
		System.out.println("전체 회원 목록입니다!");
		System.out.println("번호\t이름\t핸드폰번호\t성별");

		for(Member0806 t :list) {
			System.out.println(++num + "\t" + t.getName() + "\t" + t.getHp() + "\t" + t.getGender());
		}



	}

	public void memberUpdata() {
//		System.out.println("회원명을 입력해주세요.");
//		String name = sc.nextLine();
//		for(Member0806 m : list) {
//			if(!m.getName().equals(name)||) {
//				System.out.println("일치하는 회원이 없습니다. 다시 입력해주세요");
//				continue;
//			}
//			if(m.getName().equals(name)) {
//				
//			}
//		}
		



	}

	public void memberDelete() {
		System.out.println("삭제할 회원명을 입력해주세요.");
		String name = sc.nextLine();

		boolean find = false;

		for(int i = 0; i<list.size(); i++) {
			Member0806 t = list.get(i);
			if(t.getName().equals(name)) {
				find = true;
				list.remove(i);
				break;
			}
		}

		if(find) {
			System.out.println(name + "님을 삭제했습니다.");
		} else {
			System.out.println(name + "님은 명단에 없습니다.");
		}

	}

	public void memberSearchName() {
		System.out.println("검색할 성을 입력해주세요.");
		String fn = sc.nextLine();
		boolean find = false;
		int num = 0;
		Member0806 ts = null;
		for(int i = 0; i<list.size(); i++) {
			ts = list.get(i);
			if(ts.getName().startsWith(fn)) {
				find = true;
				System.out.println(++num + "\t" + ts.getName() + "\t" + ts.getHp() + 
						"\t" + ts.getGender());
			}
		}
		if(!find) {
			System.out.println("해당되는 성은 없습니다.");
		}
	}

	public void memberSearchGender() {
		System.out.println("'남' 또는 '여'를 입력해주세요.");
		String fn = sc.nextLine();
		boolean find = false;
		int num = 0;
		Member0806 ts = null;
		for(int i = 0; i<list.size(); i++) {
			ts = list.get(i);
			if(ts.getGender().startsWith(fn)) {
				find = true;
				System.out.println(++num + "\t" + ts.getName() + "\t" + ts.getHp() + 
						"\t" + ts.getGender());
			}
		}
		if(!find) {
			System.out.println("해당 성별은 xxx");
		}

	}

	public void process() {

		int num = 0;
		while(true) {
			System.out.println("1.회원추가  2. 전체회원출력  3.회원수정  4.회원삭제  5.회원검색(이름)  6. 회원검색(성별)  7.종료");
			try {
				num = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 입력해주세용");
				continue;
			}
			switch(num) {
			case 1:
				memberAdd();
				break;
			case 2:
				memberAllData();
				break;
			case 3:
				memberUpdata();
				break;
			case 4:
				memberDelete();
				break;
			case 5:
				memberSearchName();
				break;
			case 6:
				memberSearchGender();
				break;
			case 7:
				System.out.println("회원정보 저장 후 종료합니다.");
				memberFileWrite();
				System.exit(0);
			default:
				System.out.println("1~7번 중에 선택해주세요.");
			} System.out.println();


		}

	}

	public static void main(String[] args) {

		EX02Finla_Test ft = new EX02Finla_Test();
		ft.process();


	}

}
