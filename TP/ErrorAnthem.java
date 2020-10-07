/* NAME: Kihyun Jo          GRADE: 10          DATE: 04.18.17
This projects are National Anthem which gives information about
each national anthem of 50 countries. The project is made for Term Project.*/

package TP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ErrorAnthem extends JFrame implements ActionListener
{
	//constants declaration
	private final int frameX = 450;
  private final int frameY = 250;
  private final int frameWidth = 450; 
  private final int frameHeight = 115;
  private final int fontA = 18;
  private final int colorLr = 196;
  private final int colorLg = 212;
  private final int colorLb = 175;
  private final int colorGr = 173;
  private final int colorGg = 196;
  private final int colorGb = 204;
  
  //JFrame
  private JFrame error = new JFrame("Error");
  
  //JLabel
  private JLabel warning = new JLabel("Please input the name in the list or check your spelling.");
	private java.net.URL errorPath = getClass().getResource("error.png");
  private JLabel symbol = new JLabel(new ImageIcon(errorPath));	
  
	//JButton
	private JButton ok = new JButton("OK");
	
	//Font
  private Font arial = new Font("Arial", Font.PLAIN, fontA);
	
  //Color
  private Color lightGreen = new Color(colorLr,colorLg,colorLb);
  private Color gray = new Color(colorGr,colorGg,colorGb);

  //setErrorWindow
	public void setErrorWindow()
	{	
		//JFrame
		error.setBounds(frameX,frameY,frameWidth,frameHeight);
		error.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		error.setLayout(new FlowLayout());
		error.getContentPane().setBackground(lightGreen);
		error.add(symbol);
		error.add(warning);
		error.add(ok);
		
		//JLabel
	  warning.setFont(arial);
		
		//JButton
		ok.addActionListener(this);
		ok.setBackground(gray);
		ok.setOpaque(true);
		ok.setBorderPainted(false);
		
		error.setVisible(true);
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
		if(buttonCommand.equals("OK"))
		{
			error.dispose();
		}
		else
			System.out.println("Unexpected error");
	}
	
	//mainGui
	public static void main(String[] args)
	{
		ErrorAnthem mainGui = new ErrorAnthem();
		mainGui.setErrorWindow();
	}
}