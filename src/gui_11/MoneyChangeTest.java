package gui_11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MoneyChangeTest extends JFrame {
	Container contentPane;

	MoneyChangeTest() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		int[] unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
		String[] text = { "오만원", "만원", "오천원", "천원", "오백원", "백원", "오십원", "십원", "일원" };
		JTextField source;
		JTextField[] tf = new JTextField[9];

		MyPanel() {
			setBackground(Color.PINK);
			setLayout(null);

			// 금액 레이블
			JLabel la = new JLabel("금액");
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(20, 20);
			add(la);

			// 금액 계산용 JTextField
			source = new JTextField(30);
			source.setSize(100, 20);
			source.setLocation(100, 20);
			add(source);

			// 계산 버튼
			JButton calcBtn = new JButton("계산");
			calcBtn.setSize(70, 20);
			calcBtn.setLocation(210, 20);
			add(calcBtn);

			// 액수별 돈의 갯수
			for (int i = 0; i < text.length; i++) {
				la = new JLabel(text[i]);
				la.setHorizontalAlignment(JLabel.RIGHT);
				la.setSize(50, 20);
				la.setLocation(50, 50 + i * 20);
				add(la);
				tf[i] = new JTextField(30);
				tf[i].setHorizontalAlignment(JTextField.CENTER);
				tf[i].setSize(70, 20);
				tf[i].setLocation(120, 50 + i * 20);
				add(tf[i]);
			}

			// 계산 버튼 Action Listener
			calcBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = source.getText();
					if (str.length() == 0)
						return;

					int money = Integer.parseInt(str);
					int res;
					for (int i = 0; i < unit.length; i++) {
						res = money / unit[i];
						tf[i].setText(Integer.toString(res));
						if (res > 0)
							money = money % unit[i];
					}
				}
			});

		}
	}

	public static void main(String[] args) {
		new MoneyChangeTest();
	}

}
