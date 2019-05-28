package gui_12;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PlusMinusImageFrame extends JFrame {

	public static void main(String[] args) {
		new PlusMinusImageFrame();
	}
	
	public PlusMinusImageFrame() {
		super("dd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel3());
		setSize(300, 300);
		setVisible(true);
		getContentPane().requestFocus();
	}
	
	class MyPanel3 extends JPanel {
		ImageIcon icon = new ImageIcon("images/apple.jpg");
		Image img = icon.getImage();
		int width;
		int height;
		
		public MyPanel3() {
			width = img.getWidth(this);
			height = img.getHeight(this);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if (e.getKeyChar() == '+') {
						width = (int)(width*1.1+1);
						height = (int)(height*1.1+1);
						repaint();
						System.out.println("현재크기 :"+ width*height);
					}
					else if (e.getKeyChar() == '-') {
						width = (int)(width*0.9+5);
						height = (int)(height*0.9+5);
						repaint();
						System.out.println("현재크기 :"+ width*height);
					}
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}
	}

}
