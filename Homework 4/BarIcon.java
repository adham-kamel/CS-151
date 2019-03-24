package hw4;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class BarIcon implements Icon{

	private int width;
	private int height;
	private Color color;
	
	BarIcon(int width){
		this.width = width;
		this.height = 25;
		this.color = Color.RED;
	}

	public int getIconHeight() {
		return height;
	}

	public int getIconWidth() {
		return width;
	}

	public void setIconWidth(int newWidth){
		width = newWidth;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, width, height);
		g2.setColor(color);
		g2.fill(rectangle);
		
	}
	
	public void setNewColor(Color color){
		this.color = color;
	}

}
