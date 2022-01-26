import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Library implements ActionListener{
	
	int count = 0;
	JLabel label;
	JButton button;
	JFrame frame;
	JPanel panel;
	JTextField username;
	JPasswordField password;
	
	public Library() {
		frame = new JFrame();
		
		button = new JButton("Login");
		button.addActionListener(this);
		
		label = new JLabel("Welcome to Library Mangement System");
		username = new JTextField(1);
		password = new JPasswordField(1);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel.setLayout(new GridLayout(5,6));
		panel.add(label);
		panel.add(username);
		panel.add(password);
		panel.add(button);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Library System");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Library();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		//label.setText("");
	}

}
