package day0726;

public class Ex05Array_Rank_Exe {

	public static void main(String[] args) {
		//��� ���ϱ�!!!!!!!!
		
		String[] name = {"�̻��", "�ڼ�ȫ", "�����", "����"};
		int[] java = {90, 100, 89, 90};
		int[] oracle = {78, 100, 90, 85};
		int[] tot = new int[4];
		double[] avg = new double[4];
		int[] rank = new int[4];
		
		/*
		 * �� �л����� ������ ���� ����,���,����� ���Ͽ� ����Ͻÿ�
		 * 
		 * ��¾��
		 * ��ȣ	�̸�         �ڹ�	����Ŭ	����	���	���
		 * 1	�̻��	90	 78	    168	84	4
		 * */
		
		//1. ����, ��ձ��ϱ�
		for(int i = 0; i < name.length; i++) {
			tot[i] = java[i] + oracle[i];
			avg[i] = tot[i]/2.0;
		}
		
		//2. ������ϱ�
		for(int i = 0; i<name.length; i++) {
			rank[i] = 1;
			for(int j = 0; j<name.length; j++) {
				if(avg[i]<avg[j]) {
					rank[i]++;
				}
			}
		}
		
		//3. ���
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\t����\t���\t���");
		System.out.println("===============================================");
		
		for(int i = 0; i<name.length; i++) {
		System.out.println(i+1 + "\t" + name[i] + "\t" + java[i] + "\t" + oracle[i]
				+ "\t" + tot[i] + "\t" + avg[i] + "\t" + rank[i]);
		}
		
		
		
		
	}

}
