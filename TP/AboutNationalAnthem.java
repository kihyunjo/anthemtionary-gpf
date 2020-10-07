/* NAME: Kihyun Jo          GRADE: 10          DATE: 04.18.17
This projects are National Anthem which gives information about
each national anthem of 50 countries. The project is made for Term Project.*/

package TP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class AboutNationalAnthem extends JFrame implements ActionListener
{
	//constants declaration
	private final int frameX = 0;
  private final int frameY = 0;
  private final int frameWidth = 500; 
  private final int frameHeight = 390;
  private final int colorGr = 88;
  private final int colorGg = 140;
  private final int colorGb = 115;
  private final int colorYr = 242;
  private final int colorYg = 227;
  private final int colorYb = 148;
  private final int colorPr = 217;
  private final int colorPg = 100;
  private final int colorPb = 89;
  private final int infoLine = 5;

  //JFrame
  private JFrame infoFrame = new JFrame("About National Anthem");
  
  //JLabel
  private	java.net.URL definitionPath = getClass().getResource("definition.png");		
  private JLabel definition = new JLabel(new ImageIcon(definitionPath));
  private	java.net.URL usagePath = getClass().getResource("usage.png");		
  private JLabel usage = new JLabel(new ImageIcon(usagePath));
  private JLabel blank1 = new JLabel("                                                ");
  private JLabel blank2 = new JLabel("                                                ");

  //JPanel
  private JPanel infoPane = new JPanel(new FlowLayout());
  private JPanel underPane = new JPanel(new FlowLayout());
  
  //JButton
	private java.net.URL exitPath = getClass().getResource("exit.png");		
  private JButton exitButton = new JButton(new ImageIcon(exitPath));
  
  //JRadioButton
  private JRadioButton definitionButton = new JRadioButton("Definition", true);
  private JRadioButton usageButton = new JRadioButton("Usage");
  
  //ButtonGroup
  private ButtonGroup infoGroup = new ButtonGroup();
  
  //Color
  private Color green = new Color(colorGr, colorGg, colorGb);
  private Color yellow = new Color(colorYr, colorYg, colorYb);
  private Color pink = new Color(colorPr, colorPg, colorPb);
  
  //Border
  private Border infoBorder = new LineBorder(pink, infoLine);
  
  //setInfoWindow
  public void setInfoWindow()
	{	
		//JFrame
		infoFrame.setBounds(frameX,frameY,frameWidth,frameHeight);
		infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		infoFrame.setLayout(new BorderLayout());
		infoFrame.add(infoPane, BorderLayout.NORTH);
		infoFrame.add(definition, BorderLayout.CENTER);
		infoFrame.add(underPane, BorderLayout.SOUTH);
		
		//JButton
    exitButton.addActionListener(this);
    exitButton.setActionCommand("exit");
		exitButton.setToolTipText("exit");
    
		//JRadioButton
		definitionButton.addActionListener(this);
		definitionButton.setToolTipText("see definition of national anthem");
		usageButton.addActionListener(this);
		usageButton.setToolTipText("see usage of national anthem");
		
		//ButtonGroup
		infoGroup.add(definitionButton);
		infoGroup.add(usageButton);
		
		//JPanel
		infoPane.add(definitionButton);
		infoPane.add(usageButton);
		infoPane.setBackground(green);
		infoPane.setBorder(infoBorder);
		underPane.add(blank1);
		underPane.add(blank2);
		underPane.add(exitButton);
		underPane.setBackground(yellow);
		
		infoFrame.setVisible(true);
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
		if (buttonCommand.equals("exit"))
			infoFrame.dispose();
		else if (buttonCommand.equals("Definition"))
		{
			infoFrame.remove(usage);
			infoFrame.add(definition, BorderLayout.CENTER);
		}
		else if (buttonCommand.equals("Usage"))
		{
			infoFrame.remove(definition);
			infoFrame.add(usage, BorderLayout.CENTER);
		}
		infoFrame.validate();
		infoFrame.repaint();
	}
	
	//mainGui
	public static void main(String[] args)
	{
		AboutNationalAnthem mainGui = new AboutNationalAnthem();
		mainGui.setInfoWindow();
	}
}
