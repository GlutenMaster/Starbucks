package graphics;

import javax.swing.*;

public class Panel extends JPanel {
	public Panel() {
		super();
	}
	public void pack() {
		SwingUtilities.getWindowAncestor(this).pack();
	}
}
