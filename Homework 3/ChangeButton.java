import java.awt.*;
import javax.swing.*;

public class ChangeButton {

	public static void main(String[] args){
		JFrame frame = new JFrame();
		JButton red = new JButton("Red");
		JButton green = new JButton("Green");
		JButton blue = new JButton("Blue");
		CircleIcon circle = new CircleIcon(50, Color.RED);
		JLabel label = new JLabel(circle);
		
		
		red.addActionListener(event -> {
			circle.setNewColor(Color.RED);
			label.repaint();
		});
		green.addActionListener(event -> {
			circle.setNewColor(Color.GREEN);
			label.repaint();
		});
		blue.addActionListener(event -> {
			circle.setNewColor(Color.BLUE);
			label.repaint();
		});
		
		frame.setLayout(new FlowLayout());
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		frame.add(label);
		frame.setVisible(true);
	}
}
