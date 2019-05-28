package gui_12;

import java.awt.*;

import javax.swing.*;

public class GraphicsDrawImage2 extends JFrame {
	
	Container contentPane;
	GraphicsDrawImage2() {
		setTitle("drawImage 사용  예제 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MomPanel panel = new MomPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}

	class MomPanel extends JPanel {
		ImageIcon imageIcon = new  ImageIcon("images/image0.jpg");
		Image image = imageIcon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
			System.out.println("으아아앗 코어가 녹는다앙아ㅏㅇ아");
		}
	}


	public static void main(String[] args) {
		new GraphicsDrawImage2();
	}

}
