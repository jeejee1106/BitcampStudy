package day0723;

public class Ex02StringClassAPI {

	public static void main(String[] args) {
		//String ��ü�� ���� ��� �޼��� �����ϱ�
		
		//.length()        :  ���ڿ��� ����(��������)
		//.trim()          :  ���ڿ��� ���� ����
		//.charAt(n)       :  ���ڿ� n��° ��ġ�� ����(��ġ�� 0���� ��)
		//.indexOf(C)      :  ���ڿ� �� ����'C'�� ��ġ
		//.substring(n,m)  :  ���ڿ� n��° ��ġ���� m���� ����
		//.substring(n)    :  ���ڿ� n��° ��ġ���� ������ ����
		//a.equlse(b)        :  ���ڿ��� ���ڿ��� ������ ��. ��ҹ��ڱ��� ���ƾ� true
		//a.equlseIgnoreCass(b) : ���ڿ��� ���ڿ��� ������ ��. ��ҹ��� �������.���縵�� ������ true
		//a.compareTo(b) : a�� b�� ���� ���0, a�� ������� -��, a�� Ŭ��� +��. ù ������ �ƽ�Ű�ڵ� ������. 
		//.startsWith()
		//.endsWith()
		//.split()
		//.toLowerCase()
		//.toUpperCase()
		
		String str1 = "apple";
		String str2 = "Apple";
		String str3 = "Have a Nice Day";
		String str4 = "     Happy day     ";
		
		System.out.println("str3�� ����:" + str3.length());
		System.out.println("str4�� ����:" + str4.length());
		System.out.println("�յ� ���� ���� �� str4�� ����:" + str4.trim().length());
		System.out.println("*"+str4+"*");
		System.out.println("*"+str4.trim()+"*");
		System.out.println("str3�� 0��° ����:" + str3.charAt(0));
		System.out.println("str3�� 7��° ����:" + str3.charAt(7));
		System.out.println("str3�� H�� �ε���:" + str3.indexOf('H'));
		System.out.println("str3�� N�� �ε���:" + str3.indexOf('N'));
		System.out.println("str3���� HAVE ����:" + str3.substring(0,4));
		System.out.println("str3���� Nice ����:" + str3.substring(7,11));
		System.out.println("str3���� Nice���� ������ ����:" + str3.substring(7));

		
		System.out.println("���ڿ���:" + str1.equals(str2));
		System.out.println("���ڿ���:" + str1.equalsIgnoreCase(str2));
		
		
		System.out.println(str1.compareTo(str2)); //32
		//a(97)pple �� A(65)pple ���ؼ� 97-65�� 32�� ����.
		//���ڴ� �߿����� ����. +�� -�İ� �߿�.
		System.out.println(str1.compareTo(str1)); //0
		System.out.println("computer".compareTo("command")); //3
		//com���� ������ p�� m�� ��.
		System.out.println("hello".compareTo("hello")); //0
		System.out.println("apple".compareTo("banana")); //-1
		System.out.println("kiwi".compareTo("orange")); //-4
		
		
		System.out.println("str3�� Have�� �����ϸ� true:" + str3.startsWith("Have"));
		System.out.println("str3�� Have�� �����ϸ� true:" + str3.startsWith("Happy"));
		System.out.println("str3�� Day�� ������ true:" + str3.endsWith("day"));
		System.out.println("str3�� Day�� ������ true:" + str3.endsWith("Day")); //��ҹ��� ����
		
		//���ڿ� �и��ϴ� �޼��� split
		String str5 = "red, blue, green, black, pink";
		System.out.println("str5�� �ĸ��� �и��Ͽ� ����ϱ�");
		String[] arr = str5.split(",");
		System.out.println("�и��� ������ ����:" + arr.length);
		//���
		for(String color:arr) { //�迭�̳� �÷��ǿ��� ����ϴ� for��
			System.out.println(color);
		}
		
		System.out.println("str3�� �ҹ��ڷ� ���:" + str3.toLowerCase());
		System.out.println("str3�� �빮�ڷ� ���:" + str3.toUpperCase());
		
		String a = String.valueOf(100); //int -> String
		String b = String.valueOf(12.3); //double -> Sting
		String a2 = 100+""; //����� String�� ������ ����� String
		String b2 = 12.3+"";
		
		System.out.println("���ڿ��� �Ϻθ� ����");
		System.out.println(str3.replace('a', '*'));
		System.out.println(str3.replace("Nice", "Good"));
		
		
		
		
		
		
		
		
		
	}

}
