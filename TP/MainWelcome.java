/* NAME: Kihyun Jo          GRADE: 10          DATE: 02.12.17
This projects are GraphingPolynomialFunctionGUI, GPICalculation, GPIMain which
show JFrame, JPanel, JLabel, JButton, JCheckBox, JTextBox, Color, Font
, ItemListener, ActionListener, Method, Extends, and If&Else. */

package TP;
import IP.WelcomePolynomial;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWelcome extends JFrame implements ActionListener, MouseListener
{
	//constants declaration
	private final int frameX = 300;
  private final int frameY = 10;
  private final int frameWidth = 715; 
  private final int frameHeight = 590;
  private final int fontT1 = 38;
  private final int fontT2 = 40;
  private final int fontS = 28;
  private final int colorPr = 87;
  private final int colorPg = 16;
  private final int colorPb = 44;
  private final int colorBr = 170;
  private final int colorBg = 33;
  private final int colorBb = 89;
  private final int colorGr = 0;
  private final int colorGg = 157;
  private final int colorGb = 151;
  private final int colorMr = 126;
  private final int colorMg = 194;
  private final int colorMb = 170;
  private final int colorLr = 188;
  private final int colorLg = 199;
  private final int colorLb = 71;
  
  //JFrame
  private JFrame mainWelcomeFrame = new JFrame("Interdisciplinary Programs - Kihyun Jo");
  
  //JPanel
  private JPanel leftPane = new JPanel();
  private JPanel rightPane = new JPanel();
  private JPanel leftTopPane = new JPanel();
  private JPanel rightTopPane = new JPanel();
  
  //JLabel
  private JLabel title = new JLabel("Interdisciplinary Programs - By Kihyun Jo");
  private JLabel mathTitle = new JLabel("Pre Calculus");
  private JLabel mathSub = new JLabel("Graphing Polynomial Function");
  private JLabel musicTitle = new JLabel("Diversity");
  private JLabel musicSub = new JLabel("National Anthem");
  private	java.net.URL mathPath = getClass().getResource("math.jpeg");	
  private JLabel math = new JLabel(new ImageIcon(mathPath));
  private java.net.URL musicPath = getClass().getResource("music.jpeg");
  private JLabel music = new JLabel(new ImageIcon(musicPath));
	
  //JButton
  private JButton start1Button = new JButton("START MATH");
  private JButton start2Button = new JButton("START MUSIC");
  
  //Color
  private Color burgundy = new Color(colorBr,colorBg,colorBb);
  private Color purple = new Color(colorPr,colorPg,colorPb);
  private Color green = new Color(colorGr,colorGg,colorGb);
  private Color mint = new Color(colorMr,colorMg,colorMb);
  private Color lime = new Color(colorLr,colorLg,colorLb);
  
  //Font
  private Font timesRoman1 = new Font("TimesRoman", Font.BOLD, fontT1);
  private Font timesRoman2 = new Font("TimesRoman", Font.BOLD, fontT2);
  private Font serif = new Font("Serif", Font.BOLD, fontS);
  
  //setWelcomeWindow
  public void setMainWelcomeWindow()
	{	
		//JFrame
	  mainWelcomeFrame.setBounds(frameX,frameY,frameWidth,frameHeight);
		mainWelcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWelcomeFrame.setLayout(new BorderLayout());
		mainWelcomeFrame.add(title, BorderLayout.NORTH);
		mainWelcomeFrame.add(leftPane, BorderLayout.WEST);
		mainWelcomeFrame.add(rightPane, BorderLayout.EAST);
		mainWelcomeFrame.getContentPane().setBackground(burgundy);
		
		//JPanel
		leftTopPane.setLayout(new BorderLayout());
		leftTopPane.add(mathTitle, BorderLayout.NORTH);
		leftTopPane.add(mathSub, BorderLayout.CENTER);
		leftTopPane.setBackground(green);
		leftPane.setLayout(new BorderLayout());
		leftPane.add(leftTopPane, BorderLayout.NORTH);
		leftPane.add(math, BorderLayout.CENTER);
		leftPane.add(start1Button, BorderLayout.SOUTH);
		rightTopPane.setLayout(new BorderLayout());
		rightTopPane.add(musicTitle, BorderLayout.NORTH);
		rightTopPane.add(musicSub, BorderLayout.CENTER);
		rightTopPane.setBackground(green);
		rightPane.setLayout(new BorderLayout());
		rightPane.add(rightTopPane, BorderLayout.NORTH);
		rightPane.add(music, BorderLayout.CENTER);
		rightPane.add(start2Button, BorderLayout.SOUTH);
		
		//JLabel
		title.setFont(timesRoman1);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setForeground(purple);
		musicTitle.setFont(timesRoman2);
		musicTitle.setForeground(mint);
		musicTitle.setHorizontalAlignment(JLabel.CENTER);	
		musicSub.setFont(serif);
		musicSub.setForeground(mint);
		musicSub.setHorizontalAlignment(JLabel.CENTER);	
		mathTitle.setFont(timesRoman2);
		mathTitle.setForeground(mint);
		mathTitle.setHorizontalAlignment(JLabel.CENTER);	
		mathSub.setFont(serif);
		mathSub.setForeground(mint);
		mathSub.setHorizontalAlignment(JLabel.CENTER);	
		math.addMouseListener(this);
		math.setToolTipText("start the PreCalculus program");
		music.addMouseListener(this);
		music.setToolTipText("start the Diversity program");
		
		//JButton
		start1Button.addActionListener(this);
		start1Button.setToolTipText("start the PreCalculus program");
		start1Button.setFont(timesRoman2);
		start1Button.setBackground(lime);
		start1Button.setOpaque(true);
		start1Button.setBorderPainted(false);
		start2Button.addActionListener(this);
		start2Button.setToolTipText("start the Diversity program");
		start2Button.setFont(timesRoman2);
		start2Button.setBackground(lime);
		start2Button.setOpaque(true);
		start2Button.setBorderPainted(false);
		
		mainWelcomeFrame.setVisible(true);
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
		Object myCommand = e.getSource();
		if(buttonCommand.equals("START MATH"))
		{
			mainWelcomeFrame.dispose();
			WelcomePolynomial reader = new WelcomePolynomial();
			reader.setWelcomeWindow();
		}
		else if(buttonCommand.equals("START MUSIC"))
		{
			mainWelcomeFrame.dispose();
      WelcomeAnthem reader = new WelcomeAnthem();
      reader.setWelcomeWindow();
		}
	}
	
	public void mouseClicked(MouseEvent e)
	{
		Object myCommand = e.getSource();
		if(myCommand == math)
		{
			mainWelcomeFrame.dispose();
			WelcomePolynomial reader = new WelcomePolynomial();
			reader.setWelcomeWindow();
		}
		else if(myCommand == music)
		{
			mainWelcomeFrame.dispose();
      WelcomeAnthem reader = new WelcomeAnthem();
      reader.setWelcomeWindow();
		}
	}
	
	public void mouseEntered(MouseEvent e)
	{
	}
	
	public void mouseExited(MouseEvent e)
	{
	}
	
	public void mousePressed(MouseEvent e)
	{
	}
	
	public void mouseReleased(MouseEvent e)
	{
	}	
}