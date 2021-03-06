package gui_12;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Sinhodeung extends JFrame {

	public static void main(String[] args) {
		new Sinhodeung();
	}
	
	public Sinhodeung() {
		add(new MyMyPanel());
		setSize(300, 500);
		setVisible(true);
	}
	
	class MyMyPanel extends JPanel implements ActionListener {
		boolean flag = false;
		private int light_number = 0;
		
		public MyMyPanel() {
			setLayout(new BorderLayout());
			JButton b = new JButton("traffic light turn on");
			b.addActionListener(this);
			add(b, BorderLayout.SOUTH);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawOval(100, 100, 100, 100);
			g.drawOval(100, 200, 100, 100);
			g.drawOval(100, 300, 100, 100);
			if(light_number == 0) {
				g.setColor(Color.RED);
				g.fillOval(100, 100, 100, 100);
			} else if (light_number == 1) {
				g.setColor(Color.GREEN);
				g.fillOval(100, 200, 100, 100);
			} else {
				g.setColor(Color.YELLOW);
			g.fillOval(100, 300, 100, 100);};
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("light_number : " + light_number);
			if(++light_number >= 3) {
				light_number = 0;
			}
			repaint();
		}

		
	}

}
