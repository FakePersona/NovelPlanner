import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Workspace {
	public JPanel window;
	public JButton newProjectButton;
	
	public Workspace() {
		window = new JPanel();
		
		window.setLayout(new BorderLayout());
		
		newProjectButton = new JButton("New project");
		
		window.add(newProjectButton,BorderLayout.SOUTH);
		
		window.setBackground(Color.GRAY);
	}
	
}
