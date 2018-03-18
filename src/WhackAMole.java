import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame f;
JPanel p;
JButton Mole;
static Random r = new Random();
static int ran = r.nextInt(16);

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












@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==Mole) {
		
	}
	else {
		speak("hahaahahahhahahahahahahahhahahahaa help hahahaha");
	}
	
}
























}
