package gui_12;

import java.awt.*;

import javax.swing.*;

public class ImageDrawPrectice extends JFrame {

	public static void main(String[] args) {
		new ImageDrawPrectice();
	}
	
	public ImageDrawPrectice() {
		super("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel1());
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel1 extends JPanel {
		ImageIcon icon = new ImageIcon("images/back.jpg");
		Image img = icon.getImage();
		public MyPanel1() {
			setLayout(new FlowLayout());
			add(new JButton("Hello"));
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	

}
