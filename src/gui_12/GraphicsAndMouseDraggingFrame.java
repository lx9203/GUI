package gui_12;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GraphicsAndMouseDraggingFrame extends JFrame {
	public GraphicsAndMouseDraggingFrame() {
		super("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel2());
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel2 extends JPanel {
		ImageIcon icon = new ImageIcon("images/back.jpg");
		Image img = icon.getImage();
		int ovalX = 100, ovalY = 100;

		public MyPanel2() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, 20, 20);
		}
	}

	public static void main(String[] args) {
		new GraphicsAndMouseDraggingFrame();
	}

}
