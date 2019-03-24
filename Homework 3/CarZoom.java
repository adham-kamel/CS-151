import java.awt.*;

import javax.swing.*;

public class CarZoom {

	public static void main(String[] args){
		JFrame frame = new JFrame();
		JButton zoomIn = new JButton("Zoom In");
		JButton zoomOut = new JButton("Zoom Out");
		CarIcon car = new CarIcon(100);
		JLabel carLabel = new JLabel(car);
		carLabel.setBounds(200, 200, car.getIconWidth(), car.getIconHeight());
		
		zoomIn.addActionListener(event -> {
			car.zoomIconIn();
			carLabel.setPreferredSize(new Dimension(car.getIconWidth() * 2, car.getIconHeight()*2));
			carLabel.repaint();
		});
		zoomOut.addActionListener(event -> {
			car.zoomIconOut();
			carLabel.repaint();
		});
		
		frame.setLayout(new GridLayout());
		frame.add(zoomIn);
		frame.add(zoomOut);
		frame.add(carLabel);
		frame.setVisible(true);
	}
}
