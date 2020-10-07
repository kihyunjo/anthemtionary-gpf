/* NAME: Kihyun Jo          GRADE: 10          DATE: 02.12.17
This projects are GraphingPolynomialFunctionGUI, GPICalculation, GPIMain which
show JFrame, JPanel, JLabel, JButton, JCheckBox, JTextBox, Color, Font
, ItemListener, ActionListener, Method, Extends, and If&Else. */
package IP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ErrorPolynomial extends JFrame implements ActionListener
{
	//constants declaration
	private final int frameX = 450;
  private final int frameY = 250;
  private final int frameWidth = 450; 
  private final int frameHeight = 120;
  private final int fontA = 15;
  private final int colorLr = 196;
  private final int colorLg = 212;
  private final int colorLb = 175;
  private final int colorGr = 173;
  private final int colorGg = 196;
  private final int colorGb = 204;
  
  //JFrame
  private JFrame error = new JFrame("Error");
  
  //JLabel
  private JLabel warning = new JLabel("Degree can't be smaller than 1, and leading coefficient can't be 0.");
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
		ErrorPolynomial mainGui = new ErrorPolynomial();
		mainGui.setErrorWindow();
	}
}