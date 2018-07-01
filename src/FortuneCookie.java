import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener{
JFrame frame;
JPanel panel;
JButton button;
int ran;


public static void main(String[] args) {
new FortuneCookie().showButton();


}




void showButton() {
frame = new JFrame();	
panel = new JPanel();
button = new JButton();
frame.setVisible(true);
frame.pack();
frame.setSize(150, 75);
frame.add(panel);
panel.add(button);
button.addActionListener(this);

}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		System.out.println("Woohoo!");
		Random r = new Random()
		ran = r.nextInt(5);
		if(ran==0) {
			System.out.println("You might become rich");
		}
		else if(ran==1) {
			System.out.println("You might become poor");
		}
		else if(ran==2) {
			System.out.println("You might own a dog");
		}
		else if(ran==3) {
			System.out.println("You will buy another fortune cookie");
		}
		else if(ran==4) {
			System.out.println("Pick your own destiny!!!!!!");
		}
	}

}































}
