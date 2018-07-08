import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{

JFrame frame;
JPanel panel;
JLabel label;
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
int num3;


public void add() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   num3 = num1 + num2;
   label.setText(num3 + "");
}

public void subtract() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   num3 = num1 - num2;
   label.setText(num3 + "");
}

public void multiply() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   num3 = num1*num2;
   label.setText(num3 + "");
}

public void divide() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   num3 = num1/num2;
    label.setText(num3 + "");
}




public void SwingUI() {
frame = new JFrame();
panel = new JPanel();
label = new JLabel();
tf1 = new JTextField(10);
tf2 = new JTextField(10);
add = new JButton("Add");
sub = new JButton("Subtract");
mul = new JButton("Multiply");
div = new JButton("Divide");
frame.add(panel);
panel.add(tf1);
panel.add(tf2);
panel.add(add);
panel.add(sub);
panel.add(mul);
panel.add(div);
panel.add(label);
frame.setVisible(true);
frame.pack();
tf1.setSize(50,15);
tf2.setSize(50,15);
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
