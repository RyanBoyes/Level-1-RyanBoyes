import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{

JFrame frame;
JPanel panel;
JButton add;
JButton sub;
JButton mul;
JButton div;
JTextField tf1;
JTextField tf2;
String S1;
String S2;
int num1;
int num2;



public void add() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   System.out.println(num1 + num2);
}

public void subtract() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   System.out.println(num1 - num2);
}

public void multiply() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
  System.out.println(num1*num2);
}

public void divide() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   System.out.println(num1/num2);
}




void SwingUI() {
frame = new JFrame();
panel = new JPanel();
add = new JButton("Add");
sub = new JButton("Subtract");
mul = new JButton("Multiply");
div = new JButton("Divide");
frame.add(panel);
panel.add(add);
panel.add(sub);
panel.add(mul);
panel.add(div);
frame.setVisible(true);
frame.setSize(200, 450);
add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==add) {
		add();
	}
	else if(e.getSource()==sub) {
		subtract();
	}
	else if(e.getSource()==mul) {
		multiply();
	}
	else if(e.getSource()==div) {
		divide();
	}
}































}
