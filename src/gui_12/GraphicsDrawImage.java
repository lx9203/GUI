package gui_12;

import java.awt.*;

import javax.swing.*;

public class GraphicsDrawImage extends JFrame {
	
	Container contentPane;
	GraphicsDrawImage(){
		setTitle("drawImage 사용 예제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		YourPanel panel = new YourPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	
	class YourPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("images/image0.jpg");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image,20, 20, this);
		}
	}
	

	public static void main(String[] args) {
		new GraphicsDrawImage();
	}

}
