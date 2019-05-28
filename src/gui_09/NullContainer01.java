package gui_09;

import java.awt.*;

import javax.swing.*;

public class NullContainer01 extends JFrame {
	public NullContainer01() {
		setTitle("NullContainer Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200, 20);
		contentPane.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			contentPane.add(b);
		}
		
		setSize(400, 250);
		setVisible(true);
		//setResizable(false);
		
	}

	public static void main(String[] args) {
		new NullContainer01();
		
	}
}
