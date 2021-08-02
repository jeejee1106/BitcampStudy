package day0802;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class MyFrame2 extends JFrame implements MouseListener{
	public MyFrame2() {
		super("마우스 이벤트");
		this.setBounds(300, 100, 300, 300);
		this.addMouseListener(this);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}
}

//////////////////////////////////////////////
public class Ex09FrameInterface {

	public static void main(String[] args) {
		
		MyFrame2 my = new MyFrame2();
//		my.mouseClicked(null);
//		my.mousePressed(null);
//		my.mouseReleased(null);
//		my.mouseEntered(null);
//		my.mouseExited(null);
		
	}

}
