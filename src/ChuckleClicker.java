import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

JPanel panel;
JFrame frame;
JButton button;
JButton button2;

public void createUI() {
frame = new JFrame();
panel = new JPanel();
button = new JButton("Joke");
button2 = new JButton("Punchline");
frame.setVisible(true);
frame.add(panel);
panel.add(button);
panel.add(button2);
frame.pack();
button.addActionListener(this);
button2.addActionListener(this);
}

public static void main(String[] args) {
	new ChuckleClicker().createUI();
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		JOptionPane.showMessageDialog(null, "What does a nosey pepper do?");
	}
	else if (e.getSource()==button2){
		JOptionPane.showMessageDialog(null, "Get jalapeno buisness.");
	}









}




















}




























