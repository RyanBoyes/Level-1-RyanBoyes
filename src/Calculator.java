import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

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
int addFinal;
int subFinal;
int mulFinal;
int divFinal;


public void add() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   addFinal = num1 + num2;
}

public void subtract() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   subFinal = num1 - num2;
}

public void multiply() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   mulFinal = num1*num2;
}

public void divide() {
	S1 = tf1.getText();
	S2 = tf2.getText();
   num1 = Integer.parseInt(S1);
   num2 = Integer.parseInt(S2);
   divFinal = num1/num2;
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
}































}
