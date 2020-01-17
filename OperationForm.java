import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// Basic calc example
class OperationForm extends JFrame implements ActionListener
{
	JLabel value1,value2,result;
	JTextField t1,t2,t3;
	JButton addButton, subtractButton, multiplyButton, devideButton, clearButton;

	OperationForm()
	{
		super("Addition");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100,100, 140,350);
		setLayout(new FlowLayout());

		value1 = new JLabel("First Number");
		value2 = new JLabel("Second Number");
		result = new JLabel("Result");

		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);

		addButton = new JButton("+");
		subtractButton = new JButton("-");
		multiplyButton = new JButton("*");
		devideButton = new JButton("/");
		clearButton = new JButton("CE");

		add(value1);
		add(t1);
		add(value2);
		add(t2);
		add(result);
		add(t3);
		add( addButton );
		add( subtractButton );
		add( multiplyButton );
		add( devideButton );
		add( clearButton );

		addButton.addActionListener(this);	
		subtractButton.addActionListener(this);	
		multiplyButton.addActionListener(this);	
		devideButton.addActionListener(this);	
		clearButton.addActionListener(this);		
	}

		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==addButton)
			{
				add();
			}
			else if(e.getSource()==subtractButton)
			{
				subtract();
			}
			else if(e.getSource()==multiplyButton)
			{
				multiply();
			}
			else if(e.getSource()==devideButton)
			{
				devide();
			}
			else
			{
				end();
			}
		}

		public void add()
		{	
		     int a = Integer.parseInt(t1.getText());
       		     int b = Integer.parseInt(t2.getText());
     		     int c =  a + b;
           		     t3.setText(String.valueOf(c));	
		}
		public void subtract()
		{	
		     int a = Integer.parseInt(t1.getText());
       		     int b = Integer.parseInt(t2.getText());
     		     int c =  a - b;
           		     t3.setText(String.valueOf(c));	
		}
		public void multiply()
		{	
		     int a = Integer.parseInt(t1.getText());
       		     int b = Integer.parseInt(t2.getText());
     		     int c =  a * b;
           		     t3.setText(String.valueOf(c));	
		}
		public void devide()
		{	
		     int a = Integer.parseInt(t1.getText());
       		     int b = Integer.parseInt(t2.getText());
     		     int c =  a / b;
           		     t3.setText(String.valueOf(c));	
		}

		public void end()
		{
			
			t1.setText("");		
			t2.setText("");		
			t3.setText("");		
		}
}