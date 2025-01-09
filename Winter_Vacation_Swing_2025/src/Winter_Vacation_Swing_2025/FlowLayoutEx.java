package Winter_Vacation_Swing_2025;

import java.awt.Container;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
public FlowLayoutEx() {
	setTitle("FlowLayout Sample");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	
	c.add(new JButton("add"));
	c.add(new JButton("sub"));
	c.add(new JButton("mul"));
	c.add(new JButton("div"));
	c.add(new JButton("calculate"));
	
	setSize(300,200);
	setVisible(true);
	
}
	
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
