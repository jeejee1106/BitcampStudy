package day0726;

public class Ex02MaxArray {

	public static void main(String[] args) {
		
		//배열을 이용해 최댓값, 최솟값 구하기
		
		int[] data = {50, 80, 100, 69, 16, -5, 1, 428, -61, 31};
		int max, min;
		max = data[0];
		min = data[0];
		
		for(int i = 1; i<data.length; i++) { //위에서 max,min값에 data[0]을 줬기 때문에 자기 자신과는 비교할 필요가 없으므로 i는 1부터.
			if(max<data[i]) { //위의 data[0]과 data[1]부터 차례대로 비교
				max = data[i]; //data[i]값이 더 크면 그걸 max값에 넣으면서 반복문 진행.
			}
			if(min>data[i]) { //최솟값도 마찬가지
				min = data[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
		
		
		
		
		
		
		
	}

}
