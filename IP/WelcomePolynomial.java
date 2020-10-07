/* NAME: Kihyun Jo          GRADE: 10          DATE: 02.12.17
This projects are GraphingPolynomialFunctionGUI, GPICalculation, GPIMain which
show JFrame, JPanel, JLabel, JButton, JCheckBox, JTextBox, Color, Font
, ItemListener, ActionListener, Method, Extends, and If&Else. */
package IP;
import TP.MainWelcome;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePolynomial extends JFrame implements ActionListener, MouseListener
{
	//constants declaration
	private final int frameX = 400;
  private final int frameY = 10;
  private final int frameWidth = 600; 
  private final int frameHeight = 600;
  private final int fontT1 = 42;
  private final int fontT2 = 40;
  private final int fontS = 28;
  private final int colorGr = 68;
  private final int colorGg = 45;
  private final int colorGb = 101;
  private final int colorPr = 119;
  private final int colorPg = 91;
  private final int colorPb = 163;
  private final int colorMr = 145;
  private final int colorMg = 197;
  private final int colorMb = 169;
  private final int colorCr = 248;
  private final int colorCg = 225;
  private final int colorCb = 180;
  private final int colorOr = 249;
  private final int colorOg = 138;
  private final int colorOb = 95;
  
  //JFrame
  private JFrame welcomeFrame = new JFrame("Welcome Graphing Polynomial Function");
  
  //JPanel
  private JPanel topPane = new JPanel();
  private JPanel centerPane = new JPanel();
  private JPanel underPane = new JPanel();
  
  //JLabel
  private JLabel title = new JLabel("Graphing Polynomial Fuction");
  private JLabel direction = new JLabel(": Calculating the graph of polynomial function");
  private java.net.URL mathPath = getClass().getResource("mathHeart.jpeg");
  private JLabel math = new JLabel(new ImageIcon(mathPath));
  private JLabel blank = new JLabel("                            By Kihyun Jo                 ");
	
  //JButton
  private JButton startButton = new JButton("START");
  private java.net.URL backPath = getClass().getResource("back.png");
  private JButton backButton = new JButton(new ImageIcon(backPath));
  
  //JMenuBar
	private JMenuBar mainBar = new JMenuBar();
	
	//JMenu
  private JMenu helpMenu = new JMenu("Help");
  
  //JMenuItem
  private JMenuItem chart = new JMenuItem("End Behavior Chart");
  private JMenuItem word = new JMenuItem("Word Book");
  
  //Color
  private Color grape = new Color(colorGr,colorGg,colorGb);
  private Color purple = new Color(colorPr,colorPg,colorPb);
  private Color mint = new Color(colorMr,colorMg,colorMb);
  private Color creme = new Color(colorCr,colorCg,colorCb);
  private Color orange = new Color(colorOr,colorOg,colorOb);
  
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
		topPane.setBackground(creme);
		centerPane.setLayout(new BorderLayout());
		centerPane.add(math, BorderLayout.NORTH);
		centerPane.add(startButton, BorderLayout.CENTER);
		underPane.setLayout(new FlowLayout());
		underPane.add(blank);
		underPane.add(backButton);
		underPane.setBackground(purple);
		
		//JLabel
		title.setFont(timesRoman1);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setForeground(orange);
		direction.setFont(serif);
		direction.setHorizontalAlignment(JLabel.CENTER);
		direction.setForeground(mint);
		blank.setFont(serif);
		blank.setForeground(grape);
		math.addMouseListener(this);
		math.setToolTipText("start the graphing polynomial function");
		
		//JButton
		startButton.addActionListener(this);
		startButton.setToolTipText("start the graphing polynomial function");
		startButton.setFont(timesRoman2);
		startButton.setBackground(grape);
		startButton.setForeground(purple);
		startButton.setOpaque(true);
		startButton.setBorderPainted(false);
		backButton.addActionListener(this);
		backButton.setActionCommand("back");
		backButton.setToolTipText("return to main welcome frame");
		
		//JMenuBar
		mainBar.add(helpMenu);
		
		//JMenu
		helpMenu.add(chart);
		helpMenu.add(word);
		helpMenu.setToolTipText("click here if you need help");
		
		//JMenuItem
		chart.addActionListener(this);
		chart.setToolTipText("see end behavior chart");
		word.addActionListener(this);
		word.setToolTipText("see word Book");
		
		welcomeFrame.setVisible(true);
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
		if(buttonCommand.equals("End Behavior Chart"))
		{
			GraphingPolynomialFunctionGUI reader = new GraphingPolynomialFunctionGUI();
			reader.setChartWindow();
		}
		else if(buttonCommand.equals("Word Book"))
		{
      GraphingPolynomialFunctionGUI reader = new GraphingPolynomialFunctionGUI();
      reader.setWordWindow();
		}
		else if(buttonCommand.equals("START"))
		{
			welcomeFrame.dispose();
			GraphingPolynomialFunctionGUI reader = new GraphingPolynomialFunctionGUI();
			reader.setMainWindow();
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
		if(myCommand == math)
		{
			welcomeFrame.dispose();
			GraphingPolynomialFunctionGUI reader = new GraphingPolynomialFunctionGUI();
			reader.setMainWindow();
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
		WelcomePolynomial mainGui = new WelcomePolynomial();
		mainGui.setWelcomeWindow();
	}
}