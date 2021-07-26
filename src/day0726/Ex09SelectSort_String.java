package day0726;

public class Ex09SelectSort_String {

	public static void main(String[] args) {

		//문자열 오름차순 정렬!!!!
		String[] colors = {"green", "blue", "yellow", "red", "gray", "white"};


		for(int i=0;i<colors.length-1;i++) {
			for(int j=i+1;j<colors.length;j++)
			{
				//a.compareTo(b) :a 가 더 크면 양수값
				if(colors[i].compareTo(colors[j])>0) {
					String temp=colors[i];
					colors[i]=colors[j];
					colors[j]=temp;
				}
			}
		}

		for(int i=0;i<colors.length;i++) {
			System.out.println(i+"=>"+colors[i]);
		}







	}

}
