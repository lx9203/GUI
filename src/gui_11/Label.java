package gui_11;

import java.awt.*;

import javax.swing.*;

public class Label extends JFrame {
	Container contentPane;
	Label(){
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon hreat = new ImageIcon("images/hreat.png");
		JLabel imageLabel = new JLabel(hreat);
		ImageIcon phone = new ImageIcon("images/phone.jpg");
		JLabel label = new JLabel("보고싶으면 전화하세요", phone, SwingConstants.CENTER);
		
		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(label);
		
		setSize(400,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Label();
	}

}
