package day0806;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex01ShopList {
	static final String FILENAME = "D:\\bitjava0719\\javawork\\Shop0806.txt";
	List<Shop0806> list = new ArrayList<Shop0806>();
	Scanner sc = new Scanner(System.in);

	public Ex01ShopList() {
		shopFileRead();
	}

	//파일 읽기
	public void shopFileRead() { 
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while(true) {
				String shop = br.readLine();
				if(shop==null) {
					break;
				}

				String[] d = shop.split(",");

				String sang = d[0];
				int su = Integer.parseInt(d[1]);
				int dan = Integer.parseInt(d[2]);
				int total = su*dan;

				//Shop0806클래스에 저장. 방법1
//				Shop0806 s = new Shop0806(); //디폴트로 생성 후  setter로 넣는 방법
//				s.setSangpum(sang);
//				s.setSu(su);
//				s.setDan(dan);
//				s.setTotal(total);

				//Shop0806클래스에 저장. 방법2
				Shop0806 s = new Shop0806(sang, su, dan); //override된 생성자 가져온 것.

				//리스트에 추가
				list.add(s);

			}
			System.out.println("파일에서 총 " + list.size() + "개의 상품목록을 가져왔습니다.");

		} catch(FileNotFoundException e) {
			System.out.println("저장된 상품이 없습니다");
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


	//파일 쓰기
	public void shopFileWrite() {

		FileWriter fw = null;

		try {
			fw = new FileWriter(FILENAME);
			//Shop0806클래스의 내용을 얻어서 출력
			for(Shop0806 shop : list) {
				String s = shop.getSangpum() + "," + shop.getSu() + "," + shop.getDan() + "\n";
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

	//shop정보 입력
	public void shopAdd() {
		System.out.println("상품을 추가해주세요.");
		String sang = sc.nextLine();
		System.out.println("추가할 상품의 수량을 입력해주세요.");
		int su = Integer.parseInt(sc.nextLine());
		System.out.println("상품의 단가를 입력해주세요");
		int dan = Integer.parseInt(sc.nextLine());

		//Shop클래스 생성
		Shop0806 shop = new Shop0806(sang, su, dan);
		//list에 Shop 추가
		list.add(shop);
		System.out.println("상품정보가 추가되었습니다.");

	}

	//상품찾기
	public void shopSearch() {

		System.out.println("찾으실 상품을 입력해주세요.");
		String sang = sc.nextLine();
		boolean find = false;
		int num = 1;
		Shop0806 shop = null;
		for(int i = 0; i<list.size(); i++){
			shop = list.get(i);
//			if (shop.getSangpum().equalsIgnoreCase(sang)) { // 1.내가 입력한 문자열과 똑같은 문자열의 상품만 출력(대소문자 구분x)
//			if(shop.getSangpum().startsWith(sang)) { // 2.내가 입력한 문자열로 시작하는 모든 상품이 출력
			if(shop.getSangpum().contains(sang)) { // 3.내가 입력한 문자열이 포함된 모든 상품이 출력
				find = true;
				System.out.println(num++ + "\t" + shop.getSangpum() + "\t" + shop.getSu() + 
						"\t" + shop.getDan() + "\t" + shop.getTotal());
			}
		}
		if(!find) {
			System.out.println("해당 상품은 없습니다.");
		}

	}

	//상품삭제
	public void shopDelete() {
		System.out.println("삭제할 상품을 입력하세요");
		String sang = sc.nextLine();

		boolean find = false;

		for(int i = 0; i<list.size(); i++) {
			Shop0806 shop = list.get(i);
			if(shop.getSangpum().equals(sang)) {
				find = true;
				list.remove(i);
				break;
			}
		}

		if(find) {
			System.out.println(sang + "을(를) 삭제했습니다.");
		} else {
			System.out.println(sang + "은(는) 명단에 없습니다.");
		}

	}

	//전체출력
	public void shopAllDatas() {

		if(list.size()==0) {
			System.out.println("출력할 상품이 없습니다.");
			return; //리턴은 현재 메서드만 종료!!!!!!!!!!!!!!!!!!!!
		}
		System.out.println("\t**상품정보**");
		System.out.println("번호\t상품\t수량\t단가\t총금액");
		System.out.println("----------------------------------------");

		//
		int num = 1;
		for(Shop0806 s : list) {
			System.out.println(num++ + "\t" + s.getSangpum() + "\t" + s.getSu() + 
					"\t" + s.getDan() + "\t" + s.getTotal());
		}

	}

	//실제 호출 메서드
	public void process() {

		int num = 0;
		while(true) {
			System.out.println("1.상품추가  2.상품출력  3.상품검색  4.상품삭제  5.종료");
			try {
				num = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자로 다시 입력바람");
				continue;
			}
			if(num==1) {
				this.shopAdd();
			} else if(num==2) {
				this.shopAllDatas();
			} else if(num==3) {
				this.shopSearch();
			} else if(num==4) {
				this.shopDelete();
			} else if(num==5) {
				System.out.println("Shop정보 저장 후 종료합니다.");
				this.shopFileWrite();
				System.exit(0);
			} else {
				System.out.println("1~5번 중에 입력하세요.");
			} System.out.println();

		}
	}

	public static void main(String[] args) {

		Ex01ShopList ex = new Ex01ShopList();
		ex.process();

	}

}
