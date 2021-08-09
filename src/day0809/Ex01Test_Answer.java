package day0809;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex01Test_Answer {
	Scanner sc = new Scanner(System.in);
	List<Member0809> list= new Vector<Member0809>();
	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\Member0809.txt";
	
	public Ex01Test_Answer() {
		fileRead();
	}
	
	public int getMenu() throws NumberFormatException{
		int n = 0;
		System.out.println("**메뉴**");
		System.out.println("1. 회원 추가");
		System.out.println("2. 전체회원출력");
		System.out.println("3. 회원수정");
		System.out.println("4. 회원삭제");
		System.out.println("5. 회원검색(이름)");
		System.out.println("6. 회원검색(성별)");
		System.out.println("7. 종료");
		n=Integer.parseInt(sc.nextLine());
		return n;
	}
	
	
	public void fileRead() {
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
				Member0809 m = new Member0809();
				m.setName(d[0]);
				m.setHp(d[1]);
				m.setGender(d[2]);
				
				list.add(m);	
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일없음");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public int getSearchName(String name) {
		int idx = -1;
		for(int i = 0; i<list.size(); i++) {
			Member0809 m = list.get(i);
			if(m.getName().equals(name)) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	public void memberAdd() {
		String name = "";
		do {
		System.out.println("추가 할 회원의 이름 입력");
		name = sc.nextLine();
		int idx = this.getSearchName(name);
		if(idx>=0) {
			System.out.println("동일한 회원이 있습니다. 다른 이름으로 가입해주세여");
			continue;
		}break;
		}while(true);
		
		System.out.println("추가 할 회원의 핸드폰 입력");
		String hp = sc.nextLine();
		System.out.println("추가 할 회원의 성별 입력");
		String gender = sc.nextLine();
		
		Member0809 m =new Member0809(name, hp, gender);
		list.add(m);
		System.out.println("**추가되었습니다.**");
	}
	
	public void memberFileWrite() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			for(Member0809 m:list) {
				String s = m.getName() + "," + m.getHp() + "," + m.getGender() + "\n";
				fw.write(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null) fw.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public void memberAllWrite() {
		System.out.println("**전체회원 출력**");
		System.out.println();
		System.out.println("번호\t이름\t핸드폰번호\t성별");
		
		for(int i = 0; i<list.size(); i++) {
			Member0809 m = list.get(i);
			System.out.println((i+1)+"\t"+m.getName()+"\t"+m.getHp()+"\t"+m.getGender());
		} System.out.println();
		
	}
	
	public void memberUpdate() {
		System.out.println("수정 할 회원님의 이름 입력");
		String name = sc.nextLine();
		int idx = this.getSearchName(name);
		if(idx==-1) {
			System.out.println("회원님이 존재하지 않습니다.");
		} else {
			System.out.println("수정할 회원님의 핸드폰 입력");
			String hp = sc.nextLine();
			System.out.println("수정할 회원님의 성별 입력");
			String gender = sc.nextLine();
			
			//idx번째의 멤버클래스를 얻는다
			//레퍼런스 타입이라 주소를 통해서 수정됨
			Member0809 m = list.get(idx);
			m.setHp(hp);
			m.setGender(gender);
			System.out.println("수정되었습니다.");
		}
		
	}
	
	public void memberDelete() {
		System.out.println("삭제할 회원의 이름 입력");
		String name = sc.nextLine();
		int idx = this.getSearchName(name);
		if(idx==-1) {
			System.out.println(name + "님은 존재하지 않는 회원입니다.");
		} else {
			list.remove(idx);
			System.out.println(name + "회원님 정보를 삭제하였습니다.");
		}
	}
	
	public void memberSearchName() {
		System.out.println("검색할 사람의 성이나 전체이름 입력");
		String name = sc.nextLine();
		
		System.out.println("**검색결과 출력**");
		System.out.println();
		System.out.println("번호\t이름\t핸드폰번호\t성별");
		
		for(int i = 0; i<list.size(); i++) {
			Member0809 m = list.get(i);
			if(m.getName().startsWith(name)) {
				System.out.println(i+"\t"+m.getName()+"\t"+m.getHp()+"\t"+m.getGender());
			}
		} System.out.println();
	}
	
	public void memberSearchGender() {
		System.out.println("검색할 사람의 성별 입력");
		String gender = sc.nextLine();
		
		System.out.println("**검색결과 출력**");
		System.out.println();
		System.out.println("번호\t이름\t핸드폰번호\t성별");
		
		for(int i = 0; i<list.size(); i++) {
			Member0809 m = list.get(i);
			if(m.getGender().startsWith(gender)) {
				System.out.println(i+"\t"+m.getName()+"\t"+m.getHp()+"\t"+m.getGender());
			}
		} System.out.println();
		
	}
	
	public void process() {
		while(true) {
			int n=0;
			try {
				n = this.getMenu();
			} catch(NumberFormatException e){
				System.out.println("메뉴 번호를 다시 입력해주세요");
				continue;
			}
			
			switch(n) {
			case 1:
				this.memberAdd();
				break;
			case 2:
				this.memberAllWrite();
				break;
			case 3:
				this.memberUpdate();
				break;
			case 4:
				this.memberDelete();
				break;
			case 5:
				this.memberSearchName();
				break;
			case 6:
				this.memberSearchGender();
				break;
			case 7:
				this.memberFileWrite();
				System.out.println("**데이터 저장 후 종료합니다.**");
				System.exit(0);;
			default:
				System.out.println("**번호를 다시 확인해주세요**");
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Ex01Test_Answer ex = new Ex01Test_Answer();
		ex.process();
	}

}
