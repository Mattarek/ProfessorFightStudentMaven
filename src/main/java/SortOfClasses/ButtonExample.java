package SortOfClasses;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
	public static void main(final String[] args) {
		final JFrame frame = new JFrame("Button Example");
		final JButton button = new JButton("Click Me!");

		// Anonymous class
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				System.out.println("Button clicked!");
			}
		});

		frame.setSize(200, 200);
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}