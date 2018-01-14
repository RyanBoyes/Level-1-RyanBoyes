import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton button;
	public void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Candyman");
		
		frame.add(panel);
		panel.add(button);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
		
		
	}
	public static void main(String[] args) {
		new Candyman().createUI();
	}
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		}
	static final int CREEPY = 0;
	static final int SCREAM = 1;
	
public void playSound(int whichSound) {
	AudioClip sound = null;
   	 if (whichSound == CREEPY)
   		 sound = JApplet.newAudioClip(getClass().getResource("Song3.mp3"));
   	 else if (whichSound == SCREAM)
   		 sound = JApplet.newAudioClip(getClass().getResource("Song4.mp3"));
   	sound.play(); try {
   		 
   		 Thread.sleep(3400);
   	 } catch (Exception ex) {
   		 ex.printStackTrace();
   	 }
    }
    

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			playSound(0);
		}
		
	}
}
