package day0802;

class Apple{
	
	public void dataIn() {
		System.out.println("dataIn");
	}
}
//////////////////////////////////
interface Hello{
	public void process();
}

interface Kitty{
	public void study();
}
////////////////////////////////
class Today extends Apple implements Hello,Kitty{

	@Override
	public void process() {
		System.out.println("process");
	}
	
	@Override
	public void study() {
		System.out.println("study");
	}
	
}

public class Ex06Interface {

	public static void main(String[] args) {
		
		System.out.println("Today�� �����");
		Today t = new Today();
		t.dataIn();
		t.process();
		t.study();
		System.out.println();
		
		System.out.println("Apple�� �����");
		Apple a = new Today();
		a.dataIn();
		System.out.println();
		
		System.out.println("Hello�� �����");
		Hello h = new Today();
		h.process();
		System.out.println();
		
		System.out.println("Kitty�� �����");
		Kitty k = new Today();
		k.study();
				
		
		
		
		
		
		
		
		
		
	}
}
