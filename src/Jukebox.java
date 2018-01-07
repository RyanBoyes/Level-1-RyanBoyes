// Copyright The League of Amazing Programmers, 2015
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements Runnable, ActionListener {
	public void run() {

		// 3. Find an mp3 on your computer or on the Internet.
		// 4. Create a Song
        	   Song1 = new Song("Song.mp3");
        	   Song2 = new Song("Song2.mp3");
        	   Song3 = new Song("Song3.mp3");
        	   Song4 = new Song("Song4.mp3");
        	   Song5 = new Song("Song5.mp3");
        	   

		// 5. Play the Song
        	  

		/*
		 * 6. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */
	
        	  frame = new JFrame();
        		panel = new JPanel();
        		button1 = new JButton("Meme Song");
        		button2 = new JButton("Unicorn Song");
        		button3 = new JButton("Cat Song");
        		button4 = new JButton("Cool Song");
        		button5 = new JButton("Another Cool Song");
        		button1.addActionListener(this);
        		button2.addActionListener(this);
        		button3.addActionListener(this);
        		button4.addActionListener(this);
        		button5.addActionListener(this);
        		frame.setVisible(true);
        		frame.add(panel);
        		panel.add(button1);
        		panel.add(button2);
        		panel.add(button3);
        		panel.add(button4);
        		panel.add(button5);
        		frame.pack();

	}
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	Song Song1;
	Song Song2;
	Song Song3;
	Song Song4;
	Song Song5;
	
	


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			Song1.play();
		}
		else if(e.getSource()==button2) {
			Song2.play();
		}
		else if(e.getSource()==button3) {
			Song3.play();
		}
		else if(e.getSource()==button4) {
			Song4.play();
		}
		else if(e.getSource()==button5) {
			Song5.play();
		}
	}

          
	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}
}


