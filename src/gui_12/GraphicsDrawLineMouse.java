package gui_12;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class GraphicsDrawLineMouse extends JFrame {
	Container contentPane;

	GraphicsDrawLineMouse() {
		setTitle("Drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		UnclePanel panel = new UnclePanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GraphicsDrawLineMouse();
	}

	class UnclePanel extends JPanel {
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();

		Point startP = null;
		Point endP = null;

		public UnclePanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
				}

				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint();
					vs.add(startP);
					ve.add(endP);
					repaint();
				}
			});

		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for (int i = 0; i < vs.size(); i++) {
				Point s = vs.elementAt(i);
				Point e = ve.elementAt(i);
				g.drawLine((int) s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
			}

		}
	}

}
