/* NAME: Kihyun Jo          GRADE: 10          DATE: 02.12.17
This projects are GraphingPolynomialFunctionGUI, GPICalculation, GPIMain which
show JFrame, JPanel, JLabel, JButton, JCheckBox, JTextBox, Color, Font
, ItemListener, ActionListener, Method, Extends, and If&Else. */
package IP;
import javax.swing.*;
public class PolynomialComputation extends JFrame
{
	//Constants Declaration
	private final String error = new String("Error");
	private final String even = new String("Even");
	private final String odd = new String("Odd");
	private final String positive = new String("Positive");
	private final String negative = new String("Negative");
	private final String endBehavior1 = new String("as x→+∞, f(x)→+∞ / as x→-∞, f(x)→+∞");
	private final String endBehavior2 = new String("as x→+∞, f(x)→-∞ / as x→-∞, f(x)→-∞");
	private final String endBehavior3 = new String("as x→+∞, f(x)→+∞ / as x→-∞, f(x)→-∞");
	private final String endBehavior4 = new String("as x→+∞, f(x)→-∞ / as x→-∞, f(x)→+∞");
	private final int text = 20;
	private String degree;
	private String leadingCoefficient;
	
	//JTextField
	JTextField degreeText = new JTextField(text);
	JTextField inLeadingCoefficientText = new JTextField(text);
	JTextField functionText = new JTextField(text);
	JTextField outLeadingCoefficientText = new JTextField(text);
	JTextField endBehaviorText = new JTextField(text);
	JTextField numberOfZeroText = new JTextField(text);	
	
	//inputDegree
	public String inputDegree()
	{
		degree = degreeText.getText();
		return degree;
	}
	
	//inputLeadingCoefficient
	public String inputLeadingCoefficient()
	{
		leadingCoefficient = inLeadingCoefficientText.getText();
		return leadingCoefficient;
	}
	
	//outputWrong
	public void outputWrong()
	{
		functionText.setText(error);
		outLeadingCoefficientText.setText(error);
		endBehaviorText.setText(error);
		numberOfZeroText.setText(error);
	}
	
	//outputEvenPositiveFunction
	public void outputEvenPositiveFunction(String degree1)
	{
		functionText.setText(even);
		outLeadingCoefficientText.setText(positive);
		endBehaviorText.setText(endBehavior1);
		numberOfZeroText.setText(degree1);
	}
		
	//outputEvenNegativeFunction
	public void outputEvenNegativeFunction(String degree2)
	{
		functionText.setText(even);
		outLeadingCoefficientText.setText(negative);
		endBehaviorText.setText(endBehavior2);
		numberOfZeroText.setText(degree2);
	}
	
	//outputOddPositiveFunction
	public void outputOddPositiveFunction(String degree3)
	{
		functionText.setText(odd);
		outLeadingCoefficientText.setText(positive);
		endBehaviorText.setText(endBehavior3);
		numberOfZeroText.setText(degree3);
	}
	
	//outputOddNegativeFunction
	public void outputOddNegativeFunction(String degree4)
	{
		functionText.setText(odd);
		outLeadingCoefficientText.setText(negative);
		endBehaviorText.setText(endBehavior4);
		numberOfZeroText.setText(degree4);
	}
	
	//remove
	public void remove()
	{
		degreeText.setText("");
		inLeadingCoefficientText.setText("");
	}
	
	//computation
	public void computation()
	{
		String methodDegree, methodLeadingCoefficient;
		final int ONE_NUMBER=1;
		final int ZERO_NUMBER=0;
		final int DIVIDING_NUMBER=2;
		
		//reading input
		methodDegree=inputDegree();
		methodLeadingCoefficient=inputLeadingCoefficient(); 
		
		//if&else clauses
		if(Integer.parseInt(methodDegree)<ONE_NUMBER || Integer.parseInt(methodLeadingCoefficient)==ZERO_NUMBER)
		{
			outputWrong();
			ErrorPolynomial reader = new ErrorPolynomial();
			reader.setErrorWindow();
		}
		else
		{
			if((Integer.parseInt(methodDegree)%DIVIDING_NUMBER)==ZERO_NUMBER)
			{
				if(Integer.parseInt(methodLeadingCoefficient)>ZERO_NUMBER)
				{
					outputEvenPositiveFunction(methodDegree);
				}
				else
				{
					outputEvenNegativeFunction(methodDegree);
				}
			}
			else
			{
				if(Integer.parseInt(methodLeadingCoefficient)>ZERO_NUMBER)
				{
					outputOddPositiveFunction(methodDegree);
				}
				else
				{
					outputOddNegativeFunction(methodDegree);
				}
			}
		}
	}
}