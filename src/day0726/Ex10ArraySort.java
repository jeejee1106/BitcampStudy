package day0726;

public class Ex10ArraySort {

	public static void main(String[] args) {
		/*
		 * 이름의 오름차순으로 출력
		 * 정렬for문을 사용
		 * 이름을 정렬할 때 나이도 같이 바꿔야함
		 * */

		String[] names = {"이효리", "강호동", "유재석", "진"};
		int[] ages = {33, 43, 45, 28};


		for(int i=0;i<names.length-1;i++) {
			for(int j=i+1;j<names.length;j++) {
				//a.compareTo(b) :a 가 더 크면 양수값
				if(names[i].compareTo(names[j])>0) {
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;

					//이름행 변경시 나이도 같이 변경
					int n=ages[i];
					ages[i]=ages[j];
					ages[j]=n;
				}
			}
		}

		//출력
		System.out.println("번호\t이름\t나이");
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+"\t"+names[i]+"\t"+ages[i]);
		}




	}

}
