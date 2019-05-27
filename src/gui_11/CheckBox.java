package gui_11;

import java.awt.*;

import javax.swing.*;

public class CheckBox extends JFrame {
	Container contentPane;
	CheckBox(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	contentPane = getContentPane();
	contentPane.setLayout(new FlowLayout());
	
	ImageIcon cherryIcon = new ImageIcon("cherry.jpg");
	ImageIcon selectedCherryIcon = 
			new ImageIcon("checkcherry.jpg");
	
	JCheckBox apple = new JCheckBox("사과");
	JCheckBox pear = new JCheckBox("배", true);
	JCheckBox cherry = new JCheckBox("체리", cherryIcon);
	cherry.setBorderPainted(true);
	cherry.setSelectedIcon(selectedCherryIcon);
	
	contentPane.add(apple);
	contentPane.add(pear);
	contentPane.add(cherry);
	
	setSize(250,150);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBox();
	}

}
