package day0726;

public class Ex09SelectSort_String {

	public static void main(String[] args) {

		//���ڿ� �������� ����!!!!
		String[] colors = {"green", "blue", "yellow", "red", "gray", "white"};


		for(int i=0;i<colors.length-1;i++) {
			for(int j=i+1;j<colors.length;j++)
			{
				//a.compareTo(b) :a �� �� ũ�� �����
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
