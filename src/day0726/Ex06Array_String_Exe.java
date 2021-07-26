package day0726;

import java.util.Scanner;

public class Ex06Array_String_Exe {

	public static void main(String[] args) {

		/*
		 * 성을 입렷 ㅣ그 성씨를 가진 사람과 총 인원수 출력
		 * 종료라고 입력시 프로그램 종료
		 * */
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"최원준", "김선빈", "김태진", "최형우", "류지혁", "이창진",
				"김민식", "김호령", "박찬호"};
		String search;
		
		System.out.println("성을 입력하세요.");
		while(true) {
			int cnt=0; //검색할 때 마다 0으로 초기화 해야하기 때문에 while문 안에 넣어야함
			search = sc.nextLine();
			if(search.equals("종료")) {
				System.out.println("프로그램 종료");
				break;
			}
			for(int i = 0; i<name.length; i++) {
				if(name[i].startsWith(search)) {
					System.out.println(name[i]);
					cnt++;
				}		
			} System.out.println(search + "씨 성을 가진 사람은 총" + cnt + "명 입니다.");
			
		}  
		
		
		
		////
//		boolean find=false;
//		cnt=0;//검색할때마다 0으로 초기화가 필요함
//		for(int i=0;i<names.length;i++)
//		{
//			if(names[i].startsWith(search))
//			{
//				cnt++;
//				System.out.println(i+":"+names[i]);
//				find=true;
//			}
//		}
//		if(find)
//			System.out.println("\t총"+cnt+"명 검색");
//		else
//			System.out.println(search+"씨성을 가진사람은 없습니다");
//		System.out.println();
//	}

		
		
		
		
		
		
		
	}

}
