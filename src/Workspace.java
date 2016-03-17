import java.awt.BorderLayout;
import java.awt.Color;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Workspace {
	public JPanel window;
	public JTextField text;
	public JButton newProjectButton;
	
	public Workspace() {
		window = new JPanel();
		
		window.setLayout(new BorderLayout());
		
		newProjectButton = new JButton("New project");
		

		
		text = new JTextField("hakuna matata");
		
		window.add(text, BorderLayout.NORTH);
		window.add(newProjectButton,BorderLayout.SOUTH);
		
		window.setBackground(Color.GRAY);
	}
	
}
