package gui_09;

import java.awt.*;

import javax.swing.*;

public class BorderLayout_01 extends JFrame {
	
	public BorderLayout_01() {
		setTitle("빼애애애애애앵");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 250);
		setLocation(200, 300);
		setResizable(false);
		setVisible(true);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(Color.ORANGE);
		contentPane.add(new JButton("위"),BorderLayout.NORTH);
		contentPane.add(new JButton("아래"),BorderLayout.SOUTH);
		contentPane.add(new JButton("우"),BorderLayout.EAST);
		contentPane.add(new JButton("좌"),BorderLayout.WEST);
		contentPane.add(new JButton("중앙"),BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new BorderLayout_01();
		
	}

}