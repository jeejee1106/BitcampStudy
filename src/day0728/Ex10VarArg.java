package day0728;

public class Ex10VarArg {
	//... :Variable Arguments : ���� ������� �迭Ÿ������ �޴´�
	public void sum(int ...a) {
		System.out.println("���޹��� ������ ����:"+a.length);
		int hap=0;
		for(int n:a) {
			System.out.printf("%4d",n);
			hap+=n;
		}
		System.out.println("\n�� �հ�:"+hap);
		System.out.println();		
	}
	
	public void writeString(String ...str) {
		System.out.println("�� "+str.length+"���� ���ڿ�");
		for(String s:str)
			System.out.print(s+"\t");
		System.out.println();
	}
	public static void main(String[] args) {
		
		Ex10VarArg ex = new Ex10VarArg();
		ex.sum(3,6);
		ex.sum(11,22,33,44);
		ex.sum(4);
		ex.sum(1,5,7,8,100,2);
		
		ex.writeString("��̲�");
		ex.writeString("red","blue","pink");
	}

}