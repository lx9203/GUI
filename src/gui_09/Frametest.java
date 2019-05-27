package gui_09;

import java.awt.*;

import javax.swing.*;

public class Frametest extends JFrame {
	
	public Frametest() {
		setTitle("빼애애애애애앵");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 150);
		setLocation(200, 300);
		setResizable(false);
		setVisible(true);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
	}

	public static void main(String[] args) {
		new Frametest();
		
	}

}
