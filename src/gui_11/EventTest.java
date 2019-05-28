package gui_11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EventTest extends JFrame {
	Container contentPane;
	JLabel la;
	JButton btn = new JButton("test Button");

	public EventTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		JCheckBox a = new JCheckBox("버튼 비활성화");
		JCheckBox b = new JCheckBox("버튼 감추기");

		add(a);
		add(b);
		add(btn);

		a.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		b.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventTest();
	}

}
