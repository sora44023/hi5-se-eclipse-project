package guitest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIStones implements ActionListener {
	private JFrame frame = new JFrame();
	private int stoneCount = 12;

	GUIStones() {
		JPanel panel = new JPanel();

		// stone label
		JLabel labelStones = new JLabel();
		String s = "Stones: ";
		for (int i = 0; i < stoneCount; i++)
			s = s + "●";
		labelStones.setText(s);
		panel.add(labelStones);

		// combo-box
		Integer[] items = { 1, 2, 3 };
		JComboBox<Integer> combo = new JComboBox<Integer>(items);
		panel.add(combo);
		combo.addActionListener(this);

		// button
		JButton button = new JButton("take");
		button.addActionListener(this);
		panel.add(button);

		// set up the frame and display it
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("StoneGame");
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
	}

	public static void main(String[] args) {
		new GUIStones();
	}
}
