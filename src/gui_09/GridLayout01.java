package gui_09;

import java.awt.*;

import javax.swing.*;

public class GridLayout01 extends JFrame {
	
	public GridLayout01() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		contentPane.setLayout(grid);
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField(""));
		
		setSize(300, 250);
		setVisible(true);
		setResizable(false);
		
	}

	public static void main(String[] args) {
		new GridLayout01();
		
	}

}