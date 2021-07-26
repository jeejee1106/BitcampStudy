package day0726;

public class Ex05Array_Rank_Exe {

	public static void main(String[] args) {
		//등수 구하기!!!!!!!!
		
		String[] name = {"이상아", "박수홍", "김민지", "하하"};
		int[] java = {90, 100, 89, 90};
		int[] oracle = {78, 100, 90, 85};
		int[] tot = new int[4];
		double[] avg = new double[4];
		int[] rank = new int[4];
		
		/*
		 * 각 학생들의 점수에 대한 총점,평균,등수를 구하여 출력하시오
		 * 
		 * 출력양식
		 * 번호	이름         자바	오라클	총점	평균	등수
		 * 1	이상아	90	 78	    168	84	4
		 * */
		
		//1. 총점, 평균구하기
		for(int i = 0; i < name.length; i++) {
			tot[i] = java[i] + oracle[i];
			avg[i] = tot[i]/2.0;
		}
		
		//2. 등수구하기
		for(int i = 0; i<name.length; i++) {
			rank[i] = 1;
			for(int j = 0; j<name.length; j++) {
				if(avg[i]<avg[j]) {
					rank[i]++;
				}
			}
		}
		
		//3. 출력
		System.out.println("번호\t이름\t자바\t오라클\t총점\t평균\t등수");
		System.out.println("===============================================");
		
		for(int i = 0; i<name.length; i++) {
		System.out.println(i+1 + "\t" + name[i] + "\t" + java[i] + "\t" + oracle[i]
				+ "\t" + tot[i] + "\t" + avg[i] + "\t" + rank[i]);
		}
		
		
		
		
	}

}
