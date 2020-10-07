/* NAME: Kihyun Jo          GRADE: 10          DATE: 04.18.17
This projects are National Anthem which gives information about
each national anthem of 50 countries. The project is made for Term Project.*/

package TP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WorldMap extends JFrame implements ActionListener
{
  //constants declaration
  private final int frameX = 950;
  private final int frameY = 0;
  private final int frameWidth = 600; 
  private final int frameHeight = 430;
  private final int colorPr = 155;
  private final int colorPg = 83;
  private final int colorPb = 156;
  
  //JFrame
  private JFrame mapFrame = new JFrame("World Map");
 
  //JPanel
  private JPanel underPane = new JPanel(new FlowLayout());  
  
  //JLabel
  private	java.net.URL mathPath = getClass().getResource("map.gif");		  
  private JLabel map = new JLabel(new ImageIcon(mathPath));
  private JLabel blank1 = new JLabel("                                            ");
  private JLabel blank2 = new JLabel("                                            ");
  private JLabel blank3 = new JLabel("                                            ");
  
  //JButton
  private java.net.URL exitPath = getClass().getResource("exit.png");		
	private	JButton exitButton = new JButton(new ImageIcon(exitPath));
  
  //Color
  private Color purple = new Color(colorPr, colorPg, colorPb);
  
  //setMapWindow
  public void setMapWindow()
	{	
		//JFrame
		mapFrame.setBounds(frameX,frameY,frameWidth,frameHeight);
		mapFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mapFrame.setLayout(new BorderLayout());
		mapFrame.add(map, BorderLayout.NORTH);
		mapFrame.add(underPane, BorderLayout.SOUTH);
		mapFrame.setVisible(true);
		
		//JPanel
		underPane.add(blank1);
		underPane.add(blank2);
		underPane.add(blank3);
		underPane.add(exitButton);
		underPane.setBackground(purple);
		
		//JButton
		exitButton.addActionListener(this);
		exitButton.setActionCommand("exit");
		exitButton.setToolTipText("exit");
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
		if (buttonCommand.equals("exit"))
			mapFrame.dispose();
	}
	
	//mainGui
	public static void main(String[] args)
	{
		WorldMap mainGui = new WorldMap();
		mainGui.setMapWindow();
	}
}
