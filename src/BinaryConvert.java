import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConvert implements ActionListener {
JFrame frame;
JPanel panel;
JTextField textfield1;
JButton button;
JTextField textfield2;
String convert(String binary) {
  	 int asciiValue = Integer.parseInt(binary, 2);
  	 char theLetter = (char) asciiValue;
  	 return "" + asciiValue;
   }

public void CreateUI() {
	frame = new JFrame();
	panel = new JPanel();
	textfield1 = new JTextField(); 
	textfield1.setPreferredSize(new Dimension(100,25));
	button = new JButton("Convert");
	textfield2 = new JTextField(); 
	textfield2.setPreferredSize(new Dimension(100,25));
	 frame.add(panel);
	 panel.add(textfield1);
	 panel.add(button);
	 panel.add(textfield2);
	 frame.pack();
	 frame.setVisible(true);
	 button.addActionListener(this);
	 
}
public static void main(String[] args) {
	new BinaryConvert().CreateUI();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		String binary = textfield1.getText();
		textfield2.setText(convert(binary));
	}
	
}











}
