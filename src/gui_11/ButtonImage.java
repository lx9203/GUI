package gui_11;

import java.awt.*;

import javax.swing.*;

public class ButtonImage extends JFrame {
	Container contentPane;
	ButtonImage(){
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout()); 
		
		ImageIcon normalIcon = new ImageIcon("phone.jpg");
		ImageIcon rolloverIcon  = new ImageIcon("phone2.jpg");
		ImageIcon pressedIcon  = new ImageIcon("phone3.jpg");
		
		JButton btn = new JButton("Call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);
		
		setSize(250,200);
		setVisible(true);

	}
	
	
	public static void main(String[] args) {
		new ButtonImage();
	}

}
