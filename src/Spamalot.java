import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "l3git.stuffs@gmail.com";
	static final String FAKE_PASSWORD = "GetHacked";
	JFrame frame;
	JPanel panel;
	JTextField textfield1;
	JButton button;
	JButton button2;
	public void CreateUI() {
		frame = new JFrame();
		panel = new JPanel();
		textfield1 = new JTextField(); 
		textfield1.setPreferredSize(new Dimension(300,25));
		button = new JButton("GOOD");	
		button2 = new JButton("BAD");
		frame.add(panel);
		 panel.add(textfield1);
		 panel.add(button);
		 panel.add(button2);
		 frame.pack();
		 frame.setVisible(true);
		 button.addActionListener(this);
		 button2.addActionListener(this);
		 
		 
		 
		 }
	
	
	
	public static void main(String[] args) {
		new Spamalot().CreateUI();
	}
		private boolean sendSpam(String recipient, String subject, String content) {
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
					return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
				}
			});
			try {
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(FAKE_USERNAME));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
				message.setSubject(subject);
				message.setText(content);
				Transport.send(message);
				return true;
			} catch (MessagingException e) {
	e.printStackTrace();
	return false;
			
		}

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) { 
			boolean Spam = false;
			for(int i=0; i<1; i++) {
		 Spam = sendSpam(textfield1.getText(), "You're Great", "Aren't you just the greatest.");
		}
		if(Spam==true) {
			textfield1.setBackground(Color.GREEN);
		}
		else if(Spam==false) {
			textfield1.setBackground(Color.RED);
		}
			}
		else if(e.getSource()==button2) {
			boolean Spam = false;
			for(int i=0; i<40; i++) {
			Spam = sendSpam(textfield1.getText(), "I'm Watching", "Heh I know where you live.");
		}
			if(Spam==true) {
				textfield1.setBackground(Color.GREEN);
			}
			else if(Spam==false) {
				textfield1.setBackground(Color.RED);
		}
	}




















	}
}
