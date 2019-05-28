package gui_12;

import java.awt.*;

import javax.swing.*;

public class GraphicsClip extends JFrame {
	Container contentPane;
	GraphicsClip() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		SisterPanel panel = new SisterPanel();
		contentPane.add(panel,  BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
	class SisterPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(50, 20, 150, 150);
			g.drawImage(img, getWidth(), getHeight(), this);
			g.setColor(Color.BLUE);
			g.setFont(new Font("SanSerif", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);
		}
	}

	public static void main(String[] args) {
		new GraphicsClip();
	}

}
