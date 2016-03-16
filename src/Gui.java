import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Gui {
	private JFrame gui;
	private Workspace workspace;
	private int width = 400;
	private int height = 600;
	
	public Gui() {
		gui = new JFrame();
		
		gui.setSize(width, height);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		workspace = new Workspace();
		
		gui.setContentPane(workspace.window);
		
		gui.setVisible(true);
	}
}
