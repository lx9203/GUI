package gui_12;

import java.awt.*;

import javax.swing.*;

public class GraphicsDrawImage3 extends JFrame {
	
	Container contentPane;
	GraphicsDrawImage3(){
		setTitle("drawImage 사용 예제 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		BroPanel panel = new BroPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	
	class BroPanel extends JPanel {
		ImageIcon imageIcon = new  ImageIcon("images/image0.jpg");
		Image image = imageIcon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20,20,250,100,100,50,200,200, this);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImage3();
	}

}
