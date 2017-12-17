import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JPanel panel;
	JFrame frame;
	JButton button1;
	JButton button2;
	JButton button3;
	public void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Ducks");
		button2 = new JButton("Frogs");
		button3 = new JButton("Unicorns");

		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	public static void main(String[] args) {
		new CutenessTV().createUI();
	}
		
	
void showDucks() {
	playVideo("Drirjl5K9Yk");
}
void showFrog() {
	playVideo("aSjCb-FfxhI");
}

void showFluffyUnicorns() {
	playVideo("qRC4Vk6kisY");
}

void playVideo(String videoID) {
	try {
URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
		playVideo("Drirjl5K9Yk");
	}
	else if(e.getSource()==button2) {
		playVideo("aSjCb-FfxhI");
	}
	else if(e.getSource()==button3) {
		playVideo("qRC4Vk6kisY");
	}
	
}



	
























}
