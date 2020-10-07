/* NAME: Kihyun Jo          GRADE: 10          DATE: 04.18.17
This projects are National Anthem which gives information about
each national anthem of 50 countries. The project is made for Term Project.*/

package TP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Denmark extends JFrame implements ActionListener
{
	//constants declaration
	private final int colorRr = 228;
	private final int colorRg = 95;
	private final int colorRb = 86;
	private final int colorGr = 163;
	private final int colorGg = 211;
	private final int colorGb = 156;
	private final int colorSr = 122;
	private final int colorSg = 204;
	private final int colorSb = 200;
	private final int colorMr = 74;
	private final int colorMg = 170;
	private final int colorMb = 165;
	private final int colorNr = 53;
	private final int colorNg = 64;
	private final int colorNb = 79;
	private final int colorPr = 152;
	private final int colorPg = 35;
	private final int colorPb = 149;
	private final int fontTR = 60;
	private final int fontS = 20;
	private final int musicLine = 5;
	private final int lyricsLine = 3;
	private final int frameX = 180;
	private final int frameY = 10;
	private final int frameWidth = 1020; 
	private final int frameHeight = 680;
	private final int position = 0;

	//JFrame
	private JFrame nationFrame = new JFrame("Denmark");
	
	//JPanel
	private JPanel musicPane = new JPanel(new BorderLayout());
	private JPanel midLeftPane = new JPanel(new BorderLayout());
	private JPanel midRightPane = new JPanel(new BorderLayout());
	private JPanel midCenterPane = new JPanel(new BorderLayout());
	private JPanel centerPane = new JPanel(new FlowLayout());
	private JPanel underPane = new JPanel(new FlowLayout());
	
	//JLabel
	private JLabel titleLabel = new JLabel("Denmark: Der er et yndigt land");
	private	java.net.URL flagPath = getClass().getResource("denmark.png");		
	private JLabel flagLabel = new JLabel(new ImageIcon(flagPath));
	private	java.net.URL firstPath = getClass().getResource("denmark_danish.png");	
	private JLabel firstLyrics = new JLabel(new ImageIcon(firstPath));
	private	java.net.URL secondPath = getClass().getResource("denmark_english.png");	
	private JLabel secondLyrics = new JLabel(new ImageIcon(secondPath));
	private JLabel blank1 = new JLabel("                       ");
	private JLabel blank2 = new JLabel("                                                                        ");
	private JLabel blank3 = new JLabel("                                                                        ");
	private JLabel blank4 = new JLabel("                                                                        ");
	
	//JButton
	private	java.net.URL homePath = getClass().getResource("home.png");
	private JButton homeButton = new JButton(new ImageIcon(homePath));
	private	java.net.URL playPath = getClass().getResource("play.png");
	private JButton playButton = new JButton(new ImageIcon(playPath));
	private	java.net.URL pausePath = getClass().getResource("pause.png");
	private JButton pauseButton = new JButton(new ImageIcon(pausePath));
	private	java.net.URL stopPath = getClass().getResource("stop.png");
	private JButton stopButton = new JButton(new ImageIcon(stopPath));
	
	//Font
	private Font timesRoman = new Font("TimesRoman", Font.BOLD, fontTR);
	private Font serif = new Font("Serif", Font.BOLD, fontS);
	
	//Color
	private Color red = new Color(colorRr,colorRg,colorRb);
	private Color green = new Color(colorGr,colorGg,colorGb);
	private Color sky = new Color(colorSr,colorSg,colorSb);
	private Color mint = new Color(colorMr,colorMg,colorMb);
	private Color navy = new Color(colorNr,colorNg,colorNb);
	private Color purple = new Color(colorPr,colorPg,colorPb);
	
	//Music
	private AudioInputStream myStream;
	private Clip myClip;
	
	//Border
	private Border musicBorder = new LineBorder(green, musicLine);
	private Border firstBorder1 = new LineBorder(purple, lyricsLine);
  private Border firstBorder2 = new TitledBorder(firstBorder1);
	private Border firstBorder = new TitledBorder(firstBorder2, "Danish", TitledBorder.CENTER,
        TitledBorder.TOP, serif);
  private Border secondBorder1 = new LineBorder(purple, lyricsLine);
  private Border secondBorder2 = new TitledBorder(secondBorder1);
	private Border secondBorder = new TitledBorder(secondBorder2, "English", TitledBorder.CENTER,
        TitledBorder.TOP, serif);
  
  //setNationWindow
	public void setNationWindow()
	{
		//Music
		setMusic();
		
		//JFrame
		nationFrame.setBounds(frameX,frameY,frameWidth,frameHeight);
		nationFrame.setLayout(new BorderLayout());
		nationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nationFrame.getContentPane().setBackground(navy);
		nationFrame.add(titleLabel, BorderLayout.NORTH);
		nationFrame.add(centerPane, BorderLayout.CENTER);
		nationFrame.add(underPane, BorderLayout.SOUTH);
		
		//JPanel
		musicPane.add(playButton, BorderLayout.WEST);
		musicPane.add(pauseButton, BorderLayout.CENTER);
		musicPane.add(stopButton, BorderLayout.EAST);
		musicPane.setBorder(musicBorder);
		midLeftPane.add(flagLabel, BorderLayout.NORTH);
		midLeftPane.add(blank1, BorderLayout.CENTER);
		midLeftPane.add(musicPane, BorderLayout.SOUTH);
		midLeftPane.setBackground(mint);
		centerPane.add(midLeftPane);
		centerPane.add(firstLyrics);
		centerPane.add(secondLyrics);
		centerPane.setBackground(mint);
		underPane.add(blank2);
		underPane.add(blank3);
		underPane.add(blank4);
		underPane.add(homeButton);
		underPane.setBackground(sky);
		
		//JLabel
		firstLyrics.setBorder(firstBorder);
		secondLyrics.setBorder(secondBorder);
		titleLabel.setFont(timesRoman);
		titleLabel.setForeground(red);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		blank1.setFont(timesRoman);
		
		//JButton
		homeButton.addActionListener(this);
		homeButton.setActionCommand("home");
		homeButton.setToolTipText("return to main frame");
		playButton.addActionListener(this);
		playButton.setActionCommand("play");
		playButton.setToolTipText("play");
		pauseButton.addActionListener(this);
		pauseButton.setActionCommand("pause");
		pauseButton.setToolTipText("pause");
		stopButton.addActionListener(this);
		stopButton.setActionCommand("stop");
		stopButton.setToolTipText("stop");
		
		nationFrame.setVisible(true);
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
		if (buttonCommand.equals("play"))
			startMusic();
		else if (buttonCommand.equals("stop"))
			stopMusic();
		else if (buttonCommand.equals("pause"))
			pauseMusic();
		else if (buttonCommand.equals("home"))
		{
		  myClip.close();
		  nationFrame.dispose();
		  NationalAnthem reader = new NationalAnthem();
		  reader.setMainWindow();
		}
		else
			System.out.println("Unexpected error!");
	}
	
	//setMusic
	public void setMusic()
	{
		try
		{
			myStream = AudioSystem.getAudioInputStream(
				getClass().getResource("Denmark.wav"));
			myClip = AudioSystem.getClip();
			myClip.open(myStream);
		}
		catch(Exception e)
		{
			System.out.println("Error playing your music!");
		}
	}
	
	//startMusic
	public void startMusic()
	{
		try
		{
			myClip.start();
		}
		catch(Exception e)
		{
			System.out.println("Error playing your music!");
		}
	}
	
	//stopMusic
	public void stopMusic()
	{
		try
		{
			myClip.stop();
			myClip.setFramePosition(position);
		}
		catch(Exception e)
		{
			System.out.println("Error playing your music!");
		}
	}
	
	//pauseMusic
	public void pauseMusic()
	{
		try
		{
			myClip.stop();
		}
		catch(Exception e)
		{
			System.out.println("Error playing your music!");
		}
	}
	
	//mainGui
	public static void main(String[] args)
	{
		Denmark mainGui = new Denmark();
		mainGui.setNationWindow();
	}
}