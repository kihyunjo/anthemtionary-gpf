/* NAME: Kihyun Jo          GRADE: 10          DATE: 02.12.17
This projects are GraphingPolynomialFunctionGUI, GPICalculation, GPIMain which
show JFrame, JPanel, JLabel, JButton, JCheckBox, JTextBox, Color, Font
, ItemListener, ActionListener, Method, Extends, and If&Else. */
package IP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphingPolynomialFunctionGUI extends PolynomialComputation implements ActionListener
{	
	//constants declaration
	private final int colorBer = 218;
	private final int colorBeg = 242;
	private final int colorBeb = 217;
	private final int colorYr = 255;
	private final int colorYg = 235;
	private final int colorYb = 136;
	private final int colorGnr = 101;
	private final int colorGng = 166;
	private final int colorGnb = 159;
	private final int colorPr = 194;
	private final int colorPg = 105;
	private final int colorPb = 169;
	private final int colorGyr = 93;
	private final int colorGyg = 96;
	private final int colorGyb = 89;
	private final int colorBlr = 38;
	private final int colorBlg = 99;
	private final int colorBlb = 164;	
	private final int colorRr = 252;
	private final int colorRg = 61;
	private final int colorRb = 66;
	private final int colorNr = 8;
	private final int colorNg = 37;
	private final int colorNb = 103; 
	private final int fontTR = 40;
	private final int fontMTR = 31;
	private final int fontSTR = 20;
	private final int mainX = 10;
	private final int mainY = 30;
	private final int mainWidth = 710;
	private final int mainHeight = 600;
	private final int chartX = 760;
	private final int chartY = 0;
	private final int chartWidth = 500;
	private final int chartHeight = 440;
	private final int wordX = 10;
	private final int wordY = 400;
	private final int wordWidth = 560;
	private final int wordHeight = 300;
	private final int input1 = 2;
	private final int input2 = 2;
	private final int input3 = 10;
	private final int input4 = 50;
	private final int output1 = 4;
	private final int output2 = 2;
	private final int output3 = 10;
	private final int output4 = 50;
	
	//JFrame declaration
	private JFrame mainFrame = new JFrame("Graphing Polynomial Function");
	private JFrame chartFrame = new JFrame("End Behavior Chart");
	private JFrame wordFrame = new JFrame("Word Book");
	
	//JPanel declaration
	private JPanel inputGrid = new JPanel(new GridLayout(input1,input2,input3,input4));
	private JPanel outputGrid = new JPanel(new GridLayout(output1,output2,output3,output4));
	private JPanel mainAbovePanel = new JPanel(new BorderLayout());
	private JPanel mainCenterPanel = new JPanel(new BorderLayout());
	private JPanel backPanel = new JPanel(new FlowLayout());
	private JPanel buttonPanel = new JPanel(new BorderLayout());

	//JLabel declaration
	private JLabel mainTitleLabel = new JLabel("Graphing Polynomial Function");
	private JLabel chartTitleLabel = new JLabel("End Behavior Chart");
	private JLabel wordTitleLabel = new JLabel("     Word Book     ");
	private JLabel degreeLabel = new JLabel("Degree : ");
	private JLabel inLeadingCoefficientLabel = new JLabel("Leading Coefficient : ");
	private JLabel functionLabel = new JLabel("Function:");
	private JLabel outLeadingCoefficientLabel = new JLabel("Leading Coefficient : ");
	private JLabel endBehaviorLabel = new JLabel("End Behavior : ");
	private JLabel numberOfZeroLabel = new JLabel("Number of Zero : "); 
	private JLabel blank1 = new JLabel("                                              ");
	private JLabel blank2 = new JLabel("                                              ");
	private JLabel blank3 = new JLabel("                                              ");

	//making path of Image and use it
	private java.net.URL filePath1 = getClass().getResource("endbehavior.gif");
	private java.net.URL filePath2 = getClass().getResource("definition.png");
	private JLabel endBehaviorChartLabel = new JLabel(new ImageIcon(filePath1));
	private JLabel definition = new JLabel(new ImageIcon(filePath2));
	
	//JButton declaration
	private JButton removeButton = new JButton("REMOVE");
	private JButton okButton = new JButton("OK");
  private java.net.URL backPath = getClass().getResource("back.png");
  private JButton backButton = new JButton(new ImageIcon(backPath));
  
	//Color declaration
	private Color yellow = new Color(colorYr,colorYg,colorYb);
	private Color beige = new Color(colorBer,colorBeg,colorBeb);
	private Color green = new Color(colorGnr,colorGng,colorGnb);
	private Color purple = new Color(colorPr,colorPg,colorPb);
	private Color grey = new Color(colorGyr,colorGyg,colorGyb);
	private Color blue = new Color(colorBlr,colorBlg,colorBlb);
	private Color red = new Color(colorRr,colorRg,colorRb);
	private Color navy = new Color(colorNr,colorNg,colorNb);
	
	//Font declaration
	private Font timesRoman = new Font("TimesRoman", Font.BOLD, fontTR);
  private Font midTimesRoman = new Font("TimesRoman", Font.BOLD, fontMTR);
	private Font smallTimesRoman = new Font("TimesRoman", Font.BOLD, fontSTR);

	//JMenuBar declaration
	private JMenuBar mainBar = new JMenuBar();
	
	//JMenu declarationprivate final JLabel sin = new JLabel("y=asin(b(x-c))");
    private final JLabel cos = new JLabel("y=acos(b(x-c))");
    private final JLabel tan = new JLabel("y=atan(b(x-c))");
  private JMenu helpMenu = new JMenu("Help");
  
  //JMenuItem declaration
  private JMenuItem chart = new JMenuItem("End Behavior Chart");
  private JMenuItem word = new JMenuItem("Word Book");
    
	//setMainWindow
	public void setMainWindow()
	{
		//JFrame
		mainFrame.setBounds(mainX,mainY,mainWidth,mainHeight);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setBackground(green);
		mainFrame.add(mainAbovePanel, BorderLayout.NORTH);
		mainFrame.add(mainCenterPanel, BorderLayout.CENTER);
		mainFrame.setVisible(true);
			
		//JPanel
		inputGrid.add(degreeLabel);
		inputGrid.add(super.degreeText);
		inputGrid.add(inLeadingCoefficientLabel);
		inputGrid.add(super.inLeadingCoefficientText);
		inputGrid.setBackground(beige);
		outputGrid.add(functionLabel);
		outputGrid.add(super.functionText);
		outputGrid.add(outLeadingCoefficientLabel);
		outputGrid.add(super.outLeadingCoefficientText);
		outputGrid.add(endBehaviorLabel);
		outputGrid.add(super.endBehaviorText);
		outputGrid.add(numberOfZeroLabel);
		outputGrid.add(super.numberOfZeroText);
		outputGrid.setBackground(beige);
		mainAbovePanel.add(mainBar, BorderLayout.NORTH);
		mainAbovePanel.add(mainTitleLabel, BorderLayout.CENTER);
		mainAbovePanel.add(inputGrid, BorderLayout.SOUTH);
		mainAbovePanel.setBackground(green);
		buttonPanel.add(removeButton, BorderLayout.EAST);
		buttonPanel.add(okButton, BorderLayout.CENTER);
		buttonPanel.setBackground(purple);
		backPanel.add(blank1);
		backPanel.add(blank2);
		backPanel.add(blank3);		
		backPanel.add(backButton);
		backPanel.setBackground(green);
		mainCenterPanel.add(buttonPanel, BorderLayout.NORTH);
		mainCenterPanel.add(outputGrid, BorderLayout.CENTER);
		mainCenterPanel.add(backPanel, BorderLayout.SOUTH);
		
		//JLabel
		mainTitleLabel.setFont(timesRoman);
		mainTitleLabel.setForeground(yellow);
		mainTitleLabel.setHorizontalAlignment(JLabel.CENTER);
		degreeLabel.setFont(smallTimesRoman);
		degreeLabel.setForeground(grey);
		inLeadingCoefficientLabel.setFont(smallTimesRoman);
		inLeadingCoefficientLabel.setForeground(grey);
		functionLabel.setFont(smallTimesRoman);
		functionLabel.setForeground(grey);
		outLeadingCoefficientLabel.setFont(smallTimesRoman);
		outLeadingCoefficientLabel.setForeground(grey);
		endBehaviorLabel.setFont(smallTimesRoman);
		endBehaviorLabel.setForeground(grey);
		numberOfZeroLabel.setFont(smallTimesRoman);
		numberOfZeroLabel.setForeground(grey);
		
		//JTextBox
		super.degreeText.setFont(smallTimesRoman);
		super.degreeText.setForeground(Color.BLACK);
		super.degreeText.setToolTipText("Write the degree of your polynomial function");
		super.inLeadingCoefficientText.setFont(smallTimesRoman);
		super.inLeadingCoefficientText.setForeground(Color.BLACK);
		super.inLeadingCoefficientText.setToolTipText("Write the leading coefficient of your polynomial function");
		super.functionText.setFont(smallTimesRoman);
		super.functionText.setForeground(Color.BLACK);
		super.functionText.setEditable(false);
		super.outLeadingCoefficientText.setFont(smallTimesRoman);
		super.outLeadingCoefficientText.setForeground(Color.BLACK);
		super.outLeadingCoefficientText.setEditable(false);
		super.endBehaviorText.setFont(smallTimesRoman);
		super.endBehaviorText.setForeground(Color.BLACK);
		super.endBehaviorText.setEditable(false);
		super.numberOfZeroText.setFont(smallTimesRoman);
		super.numberOfZeroText.setForeground(Color.BLACK);
		super.numberOfZeroText.setEditable(false);
		
		//JButton
		okButton.addActionListener(this);
		okButton.setToolTipText("Click this button to calculate");
		removeButton.addActionListener(this);
		removeButton.setToolTipText("Click this button to remove all the inputs");
		backButton.addActionListener(this);
		backButton.setActionCommand("back");
		backButton.setToolTipText("return to main graphing polynomial function frame");	
		
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
	}
	
	//setChartWindow
	public void setChartWindow()
	{
		//Declaration
	  java.net.URL exitPath = getClass().getResource("exit.png");		
		JButton exitButton = new JButton(new ImageIcon(exitPath));
		JLabel blank1 = new JLabel("                                                ");
    JLabel blank2 = new JLabel("                                                ");
    JPanel underPane = new JPanel(new FlowLayout());
    
		//JButton
    exitButton.addActionListener(this);
    exitButton.setActionCommand("exit1");
		exitButton.setToolTipText("exit");
		
		//JFrame
		chartFrame.setBounds(chartX,chartY,chartWidth,chartHeight);
		chartFrame.setLayout(new BorderLayout());
		chartFrame.add(chartTitleLabel, BorderLayout.NORTH);
		chartFrame.add(endBehaviorChartLabel, BorderLayout.CENTER);
		chartFrame.add(underPane, BorderLayout.SOUTH);
		chartFrame.getContentPane().setBackground(purple);
		chartFrame.setVisible(true);

		//JLabel
		chartTitleLabel.setFont(timesRoman);
		chartTitleLabel.setForeground(yellow);
		chartTitleLabel.setBackground(blue);
		chartTitleLabel.setOpaque(true);
		
		//JPanel
		underPane.add(blank1);
		underPane.add(blank2);
		underPane.add(exitButton);
		underPane.setBackground(purple);
	}
	
	//setWordWindow
	public void setWordWindow()
	{
		//Declaration
	  java.net.URL exitPath = getClass().getResource("exit.png");		
		JButton exitButton = new JButton(new ImageIcon(exitPath));		
		JLabel blank1 = new JLabel("                                                ");
    JLabel blank2 = new JLabel("                                                ");
    JPanel underPane = new JPanel(new FlowLayout());
    
		//JButton
    exitButton.addActionListener(this);
    exitButton.setActionCommand("exit2");
		exitButton.setToolTipText("exit");
		
		//JFrame
		wordFrame.setBounds(wordX,wordY,wordWidth,wordHeight);
		wordFrame.setLayout(new FlowLayout());
		wordFrame.add(wordTitleLabel, BorderLayout.NORTH);
		wordFrame.add(definition, BorderLayout.CENTER);
		wordFrame.add(underPane, BorderLayout.SOUTH);
	  wordFrame.getContentPane().setBackground(blue);
		wordFrame.setVisible(true);

		//JLabel
		wordTitleLabel.setFont(midTimesRoman);
		wordTitleLabel.setForeground(Color.WHITE);
		wordTitleLabel.setBackground(red);
		wordTitleLabel.setOpaque(true);	
		
		//JPanel
		underPane.add(blank1);
		underPane.add(blank2);
		underPane.add(exitButton);
		underPane.setBackground(blue);
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String action = e.getActionCommand();
		if(action.equals("End Behavior Chart"))
		{
			GraphingPolynomialFunctionGUI reader = new GraphingPolynomialFunctionGUI();
			reader.setChartWindow();
		}
		else if(action.equals("Word Book"))
		{
      GraphingPolynomialFunctionGUI reader = new GraphingPolynomialFunctionGUI();
      reader.setWordWindow();
		}
		else if(action.equals("REMOVE"))
			remove();
		else if(action.equals("OK"))
			computation();
		else if(action.equals("back"))
		{
			mainFrame.dispose();
			WelcomePolynomial reader = new WelcomePolynomial();
			reader.setWelcomeWindow();
		}
		else if(action.equals("exit1"))
			chartFrame.dispose();
		else if(action.equals("exit2"))
			wordFrame.dispose();
		mainFrame.validate();
		mainFrame.repaint();
	 }
	 
	//mainGui
	public static void main(String[] args)
	{
		GraphingPolynomialFunctionGUI mainGui = new GraphingPolynomialFunctionGUI();
		mainGui.setMainWindow();
	}
}