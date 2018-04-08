import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame f;
JPanel p;
JButton Mole;
static Random r = new Random();
static int ran = r.nextInt(16);
int M = 0;
int N = 0;
Date start = new Date();
public void CreateUI(int r) {
	 f = new JFrame();
	 p = new JPanel();
	 Mole = new JButton("MOLE");
	 Mole.addActionListener(this);
	 f.add(p);

	for(int b=0; b<16; b++) {
		JButton a = new JButton();
		a.addActionListener(this);
		if(b==ran) {
			p.add(Mole);
			}
		else {
			p.add(a);
		}
	}	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 f.setSize(350,200);
	f.setVisible(true);
	
}




void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}









public static void main(String[] args) {
	new WhackAMole().CreateUI(ran);

}


private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
}

private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}









@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==Mole) {
		M++;
		playSound("CatYell.wav");
		CreateUI(ran = r.nextInt(16));
		
	}
	
	else {
		N++;
		if(N==1) {
			speak("hahaha wrong");
		}
		else if(N==2) {
			speak("Pathetic");
		}
		else if(N==3) {
			speak("How dumb can a person get");
			}
		else if(N==4) {
			speak("Ok one more and you're done.");
		}
		else if(N==5) {
			speak("Worthless");
			endGame(start, M);
		}
		
		for(int b=0; b<16; b++) {
			CreateUI(ran = r.nextInt(16));
}

}
	
	
}

}























