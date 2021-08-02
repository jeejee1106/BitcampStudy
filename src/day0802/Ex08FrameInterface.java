package day0802;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

class MyFrame extends JFrame implements WindowListener{
	public MyFrame() {
		super("이벤트 연습");
		this.setBounds(300,100,300,300); //시작위치와  크기 지정
		this.addWindowListener(this); //윈도우 이벤트 추가
		this.setVisible(true); //프레임 보이게 하기
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0); //프레임 종료시 호출되는 메서드이므로 프로그램 종료
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}
}
////////////////////////////////////////////
public class Ex08FrameInterface {

	public static void main(String[] args) {
		
		MyFrame my = new MyFrame();
		my.windowOpened(null);
		my.windowClosing(null);
		my.windowClosed(null);
		my.windowIconified(null);
		my.windowDeiconified(null);
		my.windowActivated(null);
		my.windowDeactivated(null);
		
	}

}
