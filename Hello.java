import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class Hello extends JFrame implements ActionListener
{
	JLabel lblname;
	JTextField txtname;
	JButton btnsubmit;
	Hello()
	{
		setLayout(new FlowLayout());		
		
		lblname = new JLabel("Name");
		add(lblname);
		txtname = new JTextField(10);
		add(txtname);
		btnsubmit = new JButton("Submit");
		btnsubmit.addActionListener(this);
		add(btnsubmit);
		
		setSize(200,200);
		setLocation(100,100);
		setVisible(true);
	}	
	public void actionPerformed(ActionEvent ae)
	{
		if(btnsubmit == ae.getSource())
		{	
			txtname.setText("Devendra");
		}
	}	

	public static void main(String[] args)
	{
		new Hello();		
		System.out.println("\n Hello!!!!");
	}
}
