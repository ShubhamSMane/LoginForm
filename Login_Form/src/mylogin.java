

import java.awt.*;
import javax.swing.*;
 class start extends JFrame {
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	
	//make constructor
	
	start(){
		this.setTitle("login form");
		this.setLayout(null);
		this.setSize(500,300);
		
		l1=new JLabel("Login ID");
		l2=new JLabel("Password");
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("submit");
		b2=new JButton("Reset");
		
		//set all in window
		
		l1.setBounds(10,10,100,30);
		t1.setBounds(120,10,100,30);
		add(l1);add(t1);
		l2.setBounds(10,50,100,30);
		t2.setBounds(120,50,100,30);
		add(l2);add(t2);
		b1.setBounds(100,90,100,30);
		b2.setBounds(210,90,100,30);
		add(b1);
		add(b2);
		this.setVisible(true);
		
		
		
	}

}

public class mylogin{
	public static void main(String[] args) {
		new start();
	}
}

