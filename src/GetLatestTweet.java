import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetLatestTweet implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField textfield;
	
	public void CreateUI() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Search The Twitterverse");
		textfield = new JTextField();
		frame.add(panel);
		panel.add(button);
		panel.add(textfield);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	












}
