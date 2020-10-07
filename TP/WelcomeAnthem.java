/* NAME: Kihyun Jo          GRADE: 10          DATE: 04.18.17
This projects are National Anthem which gives information about
each national anthem of 50 countries. The project is made for Term Project.*/

package TP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeAnthem extends JFrame implements ActionListener, MouseListener
{
	//constants declaration
	private final int frameX = 400;
  private final int frameY = 10;
  private final int frameWidth = 600; 
  private final int frameHeight = 600;
  private final int fontT1 = 70;
  private final int fontT2 = 40;
  private final int fontS = 30;
  private final int colorGr = 40;
  private final int colorGg = 190;
  private final int colorGb = 155;
  private final int colorSr = 146;
  private final int colorSg = 220;
  private final int colorSb = 224;
  private final int colorNr = 96;
  private final int colorNg = 145;
  private final int colorNb = 148;
  private final int colorOr = 239;
  private final int colorOg = 153;
  private final int colorOb = 80;
  private final int colorPr = 215;
  private final int colorPg = 156;
  private final int colorPb = 140;
  
  //JFrame
  private JFrame welcomeFrame = new JFrame("Welcome National Anthem");
  
  //JPanel
  private JPanel topPane = new JPanel();
  private JPanel centerPane = new JPanel();
  private JPanel underPane = new JPanel();
  
  //JLabel
  private JLabel title = new JLabel("National Anthem");
  private JLabel direction = new JLabel(": Learning 50 countries national anthems");
  private	java.net.URL globalPath = getClass().getResource("global.jpeg");		
  private JLabel global = new JLabel(new ImageIcon(globalPath));
  private JLabel blank = new JLabel("                        By Kihyun Jo                   ");
	
  //JButton
  private JButton startButton = new JButton("START");
  private java.net.URL backPath = getClass().getResource("back.png");
  private JButton backButton = new JButton(new ImageIcon(backPath));  
  //JMenuBar
	private JMenuBar mainBar = new JMenuBar();
	
	//JMenu
	private JMenu helpMenu = new JMenu("Help");
  private JMenu toolMenu = new JMenu("Tool");
  
  //JMenuItem
  private JMenuItem info = new JMenuItem("About National Anthem");
  private JMenuItem name = new JMenuItem("Names of National Anthem");
  private JMenuItem map = new JMenuItem("World Map");
  
  //Color
  private Color green = new Color(colorGr,colorGg,colorGb);
  private Color sky = new Color(colorSr,colorSg,colorSb);
  private Color navy = new Color(colorNr,colorNg,colorNb);
  private Color orange = new Color(colorOr,colorOg,colorOb);
  private Color pink = new Color(colorPr,colorPg,colorPb);
  
  //Font
  private Font timesRoman1 = new Font("TimesRoman", Font.BOLD, fontT1);
  private Font timesRoman2 = new Font("TimesRoman", Font.BOLD, fontT2);
  private Font serif = new Font("Serif", Font.BOLD, fontS);
  
  //setWelcomeWindow
  public void setWelcomeWindow()
	{	
		//JFrame
	  welcomeFrame.setBounds(frameX,frameY,frameWidth,frameHeight);
		welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcomeFrame.setLayout(new BorderLayout());
		welcomeFrame.add(topPane, BorderLayout.NORTH);
		welcomeFrame.add(centerPane, BorderLayout.CENTER);
		welcomeFrame.add(underPane, BorderLayout.SOUTH);
		
		//JPanel
		topPane.setLayout(new BorderLayout());
		topPane.add(mainBar, BorderLayout.NORTH);
		topPane.add(title, BorderLayout.CENTER);
		topPane.add(direction, BorderLayout.SOUTH);
		topPane.setBackground(navy);
		centerPane.setLayout(new BorderLayout());
		centerPane.add(global, BorderLayout.NORTH);
		centerPane.add(startButton, BorderLayout.CENTER);
		underPane.setLayout(new FlowLayout());
		underPane.add(blank);
		underPane.add(backButton);
		underPane.setBackground(sky);
		
		//JLabel
		title.setFont(timesRoman1);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setForeground(orange);
		direction.setFont(serif);
		direction.setHorizontalAlignment(JLabel.CENTER);
		direction.setForeground(pink);
		blank.setFont(serif);
		blank.setForeground(green);
		global.addMouseListener(this);
		global.setToolTipText("start the national anthem");

		//JMenuBar
		mainBar.add(helpMenu);
		mainBar.add(toolMenu);
		
		//JMenu
		helpMenu.add(info);
	  helpMenu.setToolTipText("click here if you need help");
		toolMenu.add(name);
		toolMenu.add(map);
		toolMenu.setToolTipText("click here if you need tool");
		
		//JMenuItem
		info.addActionListener(this);
		info.setToolTipText("see definition of national anthem");
		name.addActionListener(this);
		name.setToolTipText("see name of each country's national anthem");
		map.addActionListener(this);
		map.setToolTipText("see world map");
		
		//JButton
		startButton.addActionListener(this);
		startButton.setToolTipText("start the national anthem");
		startButton.setFont(timesRoman2);
		startButton.setBackground(green);
		startButton.setOpaque(true);
		startButton.setBorderPainted(false);
		startButton.setForeground(sky);
		backButton.addActionListener(this);
		backButton.setActionCommand("back");
		backButton.setToolTipText("return to main welcome frame");
		
		welcomeFrame.setVisible(true);
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
		if(buttonCommand.equals("About National Anthem"))
		{
			AboutNationalAnthem infoReader = new AboutNationalAnthem();
			infoReader.setInfoWindow();
		}
		else if(buttonCommand.equals("Names of National Anthem"))
		{
			NamesOfNationalAnthem nameReader = new NamesOfNationalAnthem();
			nameReader.setNameWindow();
		}
		else if(buttonCommand.equals("World Map"))
		{
			WorldMap mapReader = new WorldMap();
			mapReader.setMapWindow();
		}
		else if(buttonCommand.equals("START"))
		{
			welcomeFrame.dispose();
			NationalAnthem mainReader = new NationalAnthem();
			mainReader.setMainWindow();
		}
		else if(buttonCommand.equals("back"))
		{
			welcomeFrame.dispose();
			MainWelcome welcomeReader = new MainWelcome();
			welcomeReader.setMainWelcomeWindow();
		}
	}
	
	public void mouseClicked(MouseEvent e)
	{
		Object myCommand = e.getSource();
		if(myCommand == global)
		{
			welcomeFrame.dispose();
			NationalAnthem mainReader = new NationalAnthem();
			mainReader.setMainWindow();
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
	
	//mainGui
	public static void main(String[] args)
	{
		WelcomeAnthem mainGui = new WelcomeAnthem();
		mainGui.setWelcomeWindow();
	}
}
