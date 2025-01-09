package Winter_Vacation_Swing_2025;

import java.awt.Container;

import javax.swing.JFrame;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("Contentpane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		setSize(300, 150);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
