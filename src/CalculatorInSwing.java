import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorInSwing extends JPanel implements ActionListener
{
	public JButton button1, button2, button3, button4,
		button5, button6, button7, button8, button9, 
		button10, button11, button12, button13, button14, button15;
	public JTextField textField1, textField2, textField3;
	public JLabel text1, text2, text3;
	
	public CalculatorInSwing()
	{
		GridLayout lej = new GridLayout(6, 3);
		setLayout(lej);
		
		button1 = new JButton("Add");
		button1.addActionListener(this::actionPerformed);
		button2 = new JButton("Subtract");
		button2.addActionListener(this::actionPerformed);
		button3 = new JButton("Multiply");
		button3.addActionListener(this::actionPerformed);
		button4 = new JButton("Divide");
		button4.addActionListener(this::actionPerformed);
		button5 = new JButton("Modulo");
		button5.addActionListener(this::actionPerformed);
		button6 = new JButton("Raise to power");
		button6.addActionListener(this::actionPerformed);
		button7 = new JButton("Max");
		button7.addActionListener(this::actionPerformed);
		button8 = new JButton("Min");
		button8.addActionListener(this::actionPerformed);
		button9 = new JButton("Round");
		button9.addActionListener(this::actionPerformed);
		button10 = new JButton("Square root");
		button10.addActionListener(this::actionPerformed);
		button11 = new JButton("The absolute value");
		button11.addActionListener(this::actionPerformed);
		button12 = new JButton("Sine");
		button12.addActionListener(this::actionPerformed);
		button13 = new JButton("Cosine");
		button13.addActionListener(this::actionPerformed);
		button14 = new JButton("Tangent");
		button14.addActionListener(this::actionPerformed);
		button15 = new JButton("Cotangent");
		button15.addActionListener(this::actionPerformed);
		textField1 = new JTextField();
		textField2 = new JTextField("");
		textField3 = new JTextField("");
		text1 = new JLabel("What do you want to do?");
		text2 = new JLabel();
		text3 = new JLabel();
		add(text1); add(text2); add(textField1);
		add(button1);add(button2); add(button3); add(button4); add(button5);
		add(button6); add(button7); add(button8); add(button9); add(button10); 
		add(button11); add(button12); add(button13); add(button14); add(button15);
		
//		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		//JOptionPane nowe okienko wyskakuje
		try
		{
			if(o == button1) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type 1st number");
					String b = JOptionPane.showInputDialog("Type 2nd number");
				
					double valueOf = Double.parseDouble(a);
					double valueOf2 = Double.parseDouble(b);
					
					if(Double.parseDouble(a) == valueOf && Double.parseDouble(b) == valueOf2)
					{
						double r = Double.sum(valueOf, valueOf2);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The result of adding "+valueOf2+" to "+ valueOf+" is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}
			}
			else if(o == button2)
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type 1st number");
					String b = JOptionPane.showInputDialog("Type 2nd number");
				
					double valueOf = Double.parseDouble(a);
					double valueOf2 = Double.parseDouble(b);
					
					if(Double.parseDouble(a) == valueOf && Double.parseDouble(b) == valueOf2)
					{
						double r = valueOf - valueOf2;
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The result of subtraction "+valueOf2+" from " +valueOf+" is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button3) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type 1st number");
					String b = JOptionPane.showInputDialog("Type 2nd number");
				
					double valueOf = Double.parseDouble(a);
					double valueOf2 = Double.parseDouble(b);
					
					if(Double.parseDouble(a) == valueOf && Double.parseDouble(b) == valueOf2)
					{
						double r = valueOf * valueOf2;
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The result of multiplying "+valueOf+" and "+valueOf2+" is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button4) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type 1st number");
					String b = JOptionPane.showInputDialog("Type 2nd number");
				
					double valueOf = Double.parseDouble(a);
					double valueOf2 = Double.parseDouble(b);
					
					if(Double.parseDouble(a) == valueOf && Double.parseDouble(b) == valueOf2)
					{
						if(valueOf2 != 0) 
						{				
							double r = valueOf / valueOf2;
							String result = String.format("%.2f", r);
							JOptionPane.showMessageDialog(null, "The result of quotient "+valueOf+" and "+valueOf2+" is: " + result);
							textField1.setText("The result is: " + result);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Error, cannot divide by 0!");
						}
						break;
					}
				}	
			}
			else if(o == button5) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type 1st number");
					String b = JOptionPane.showInputDialog("Type 2nd number");
				
					double valueOf = Double.parseDouble(a);
					double valueOf2 = Double.parseDouble(b);
					
					if(Double.parseDouble(a) == valueOf && Double.parseDouble(b) == valueOf2)
					{
						if(valueOf2 != 0) 
						{				
							double r = valueOf % valueOf2;
							String result = String.format("%.2f", r);
							JOptionPane.showMessageDialog(null, "The result of "+valueOf+" modulo "+valueOf2+" is: " + result);
							textField1.setText("The result is: " + result);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Error, cannot divide by 0!");
						}
						break;
					}
				}	
			}
			else if(o == button6) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type 1st number");
					String b = JOptionPane.showInputDialog("Type the power");
				
					double valueOf = Double.parseDouble(a);
					double valueOf2 = Double.parseDouble(b);
					
					if(Double.parseDouble(a) == valueOf && Double.parseDouble(b) == valueOf2)
					{
						double r = Math.pow(valueOf, valueOf2);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The result of raising "+valueOf+" to the power of " + valueOf2 + " is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button7) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type 1st number");
					String b = JOptionPane.showInputDialog("Type 2nd number");
				
					double valueOf = Double.parseDouble(a);
					double valueOf2 = Double.parseDouble(b);
					
					if(Double.parseDouble(a) == valueOf && Double.parseDouble(b) == valueOf2)
					{
						double r = Math.max(valueOf, valueOf2);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The maximum value is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button8) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type 1st number");
					String b = JOptionPane.showInputDialog("Type 2nd number");
				
					double valueOf = Double.parseDouble(a);
					double valueOf2 = Double.parseDouble(b);
					
					if(Double.parseDouble(a) == valueOf && Double.parseDouble(b) == valueOf2)
					{
						double r = Math.min(valueOf, valueOf2);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The minimum value is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button9) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type the number");
				
					double valueOf = Double.parseDouble(a);
					
					if(Double.parseDouble(a) == valueOf)
					{
						double r = Math.round(valueOf);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The rounding of " + valueOf + " is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button10) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type the number");
				
					double valueOf = Double.parseDouble(a);
					
					if(Double.parseDouble(a) == valueOf)
					{
						double r = Math.sqrt(valueOf);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The square root of " + valueOf + " is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button11) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type the number");
				
					double valueOf = Double.parseDouble(a);
					
					if(Double.parseDouble(a) == valueOf)
					{
						double r = Math.abs(valueOf);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The absolute value of " + valueOf + " is: " + result);
						textField1.setText("The result is: " + result);	
						break;
					}
				}	
			}
			else if(o == button12) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type the number");
				
					double valueOf = Double.parseDouble(a);
					
					if(Double.parseDouble(a) == valueOf)
					{
						double r = Math.sin(valueOf);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The sine value of " + valueOf + " is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button13) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type the number");
				
					double valueOf = Double.parseDouble(a);
					
					if(Double.parseDouble(a) == valueOf)
					{
						double r = Math.cos(valueOf);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The cosine value of " + valueOf + " is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button14) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type the number");
				
					double valueOf = Double.parseDouble(a);
					
					if(Double.parseDouble(a) == valueOf)
					{
						double r = Math.tan(valueOf);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The tangent value of " + valueOf + " is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
			else if(o == button15) 
			{
				while(true) 
				{
					String a = JOptionPane.showInputDialog("Type the number");
				
					double valueOf = Double.parseDouble(a);
					
					if(Double.parseDouble(a) == valueOf)
					{
						double r = 1/Math.tan(valueOf);
						String result = String.format("%.2f", r);
						JOptionPane.showMessageDialog(null, "The cotangent value of " + valueOf + " is: " + result);
						textField1.setText("The result is: " + result);
						break;
					}
				}	
			}
		}
		catch(NumberFormatException ex)
		{
			System.err.println("Wyst¹pi³ jakiœ problem!\nSpróbuj ponownie!");
		}
		catch(NullPointerException ex1)
		{
			System.err.println("Wyst¹pi³ jakiœ problem!\nSpróbuj ponownie!");
		}
	}
}
