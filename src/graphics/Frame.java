package graphics;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.awt.*;

import javax.swing.*;

public class Frame extends JFrame {
	public Frame() {
		super();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.pack();
		this.validate();
		this.repaint();
	}
	@Override
	public Component add(Component comp) {
		Component comp1 = super.add(comp);
		pack();
		revalidate();
		repaint();
		
		return comp1;
	}
	public void paint(Shape shape) {
		this.getGraphics().drawPolygon((Polygon) shape); 
	}
}
