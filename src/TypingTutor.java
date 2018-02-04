import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TypingTutor implements KeyListener {
	

JFrame frame;
JPanel panel;
char currentLetter;
JLabel label;

public void CreateUI() {
	currentLetter = generateRandomLetter(); 
	frame = new JFrame();
	panel = new JPanel();
	label = new JLabel("" + currentLetter);
	frame.add(panel);
	panel.add(label);
	frame.setVisible(true);
	frame.pack();
	frame.setTitle("TypingTutor");
	frame.setSize(1500, 1900);
	label.setFont(label.getFont().deriveFont(15.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	


	
}
public static void main(String[] args) {
	new TypingTutor().CreateUI();
}


char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("You Typed: " + e.getKeyChar());
	if(e.getKeyChar()==currentLetter) {
		System.out.println("Correct");
		panel.setBackground(Color.green);
	}
	else {
		System.out.println("Incorrect");
		panel.setBackground(Color.red);
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter(); 
	label.setText("" + currentLetter);
	
}




















}


