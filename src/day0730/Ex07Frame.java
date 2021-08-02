package day0730;

import javax.swing.JFrame;
//스윙은 나중에 배울건데 상속을 받으면 좋은점에 대해서
//한번 보려고 예제 넣음!!!!
public class Ex07Frame extends JFrame{
	public Ex07Frame() {
		super("프레임연습");
		this.setBounds(300, 100, 300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex07Frame ex = new Ex07Frame();
		
		
	}

}
