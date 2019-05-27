package gui_09;

import java.awt.*;

import javax.swing.*;

public class FrameTest02 extends JFrame {
	
	public FrameTest02() {
		setTitle("빼애애애애애앵");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 250);
		setLocation(200, 300);
		setResizable(false);
		setVisible(true);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		contentPane.setBackground(Color.ORANGE);
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("추가버튼"));
		contentPane.add(new JButton("추가버튼2"));
	}

	public static void main(String[] args) {
		new FlowLayout();
		
	}

}