import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class CircleIcon implements Icon{

	private int width;
	private Color color;
	
	CircleIcon(int width, Color color){
		this.width = width;
		this.color = color;
	}
	
	public int getIconHeight() {
		return width;
	}

	public int getIconWidth() {

		return width;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y){
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, width);
		g2.setColor(color);
		g2.fill(circle);
	}
	
	public void setNewColor(Color color){
		this.color = color;
	}
}
