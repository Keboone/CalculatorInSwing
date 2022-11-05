import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Frame extends JFrame
{
	public Frame()
	{
		setTitle("Calculator");
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		
		initGUI();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void initGUI()
	{
		setLayout(new BorderLayout());
		
		JTabbedPane tabPane = new JTabbedPane();
		tabPane.addTab("Calculator", new CalculatorInSwing());
		
		add(tabPane);//, BorderLayout.CENTER);	
	}
}
