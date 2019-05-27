package gui_10;

import java.awt.event.*;

import javax.swing.*;

public class MouseListener01 extends JFrame {
	JLabel la;
	
	MouseListener01(){
		setTitle("mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());
		
		la = new JLabel("Hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);
		
		setSize(200,200);
		setVisible(true);
	}
class MyMouseListener implements MouseListener {
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		la.setLocation(x, y);
	}

	public void mouseClicked(MouseEvent arg0) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
}
	
	
	public static void main(String[] args) {
		new MouseListener01();
	}

}
