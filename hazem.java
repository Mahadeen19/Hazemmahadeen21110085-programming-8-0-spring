import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hazem {
	public static void main(String[] args) {
		JFrame frame=new JFrame();

	frame.setSize(300,250);
	
	frame.setLocationRelativeTo(null);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel labelNumber1=new JLabel("First Value");
	final JTextField textNumber1=new JTextField(15);

	JLabel labelNumber2=new JLabel("Second value");
	final JTextField textNumber2=new JTextField(15);
	
	JButton button=new JButton("subtract");
	button.setPreferredSize(new Dimension(250,30));
	
	JLabel labelresult=new JLabel("The answer");
	final JTextField textresult=new JTextField(20);
	textresult.setEditable(false);
	
	JPanel panel=new JPanel();
	panel.add(labelNumber1);
	panel.add(textNumber1);
	
	panel.add(labelNumber2);
	panel.add(textNumber2);
	
	panel.add(button);
	
	panel.add(labelresult);
	panel.add(textresult);
	frame.add(panel);
	
	button.addActionListener((ActionListener) new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			int value1=Integer.parseInt(textNumber1.getText());
			int value2=Integer.parseInt(textNumber2.getText());
			int total=value1-value2;
			textresult.setText(Integer.toString(total));
			
		}
	});
	
	frame.setVisible(true);
	}
	public static void main1(String[] args) {
		Scanner number=new Scanner (System.in);
		System.out.println("Enter the first number:");
		int x=number.nextInt();
		System.out.println("Enter the second number: ");
		int y=number.nextInt();
		summation(x,y);
		subtraction(x,y);
		multiplication(x,y);
		division(x,y);
	}
public static void summation(int x,int y) {
	int z=x+y;
	System.out.println("Summation = "+z);
}
public static void subtraction(int x,int y) {
	int z=x-y;
	System.out.println("Subtraction = "+z);
}
public static void multiplication (int x,int y) {
	int z=x*y;
	System.out.println("Multiplication = "+z);
}
public static void division(int x,int y) {
	int z=x/y;
	System.out.println("Division = "+z);
}
}
