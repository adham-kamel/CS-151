package hw4;
import java.awt.*;

import javax.swing.*;

public class Numbers {

	static BarIcon drawBar1;
	static BarIcon drawBar2;
	static BarIcon drawBar3;
	static BarIcon drawBar4;
	static BarIcon drawBar5;

	static JLabel bar1 = new JLabel();
	static JLabel bar2 = new JLabel();
	static JLabel bar3 = new JLabel();
	static JLabel bar4 = new JLabel();
	static JLabel bar5 = new JLabel();

	private static int count1 = 0;
	private static int count2 = 0;
	private static int count3 = 0;
	private static int count4 = 0;
	private static int count5 = 0;

	public static void main(String[] args) {
		JFrame numberFrame = new JFrame("Numbers");
		JTextField t1 = new JTextField(50);
		JTextField t2 = new JTextField(50);
		JTextField t3 = new JTextField(50);
		JTextField t4 = new JTextField(50);
		JTextField t5 = new JTextField(50);
		numberFrame.add(t1);
		numberFrame.add(t2);
		numberFrame.add(t3);
		numberFrame.add(t4);
		numberFrame.add(t5);
		numberFrame.setLayout(new FlowLayout());
		numberFrame.setBounds(100, 100, 800, 600);
		numberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		numberFrame.setVisible(true);

		JFrame graph = new JFrame("Graph");

		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.add(bar1);
		container.add(bar2);
		container.add(bar3);
		container.add(bar4);
		container.add(bar5);
		
		graph.setLayout(new BoxLayout(graph.getContentPane(), BoxLayout.Y_AXIS));
		graph.setBounds(900, 100, 800, 600);
		graph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graph.setVisible(true);

		t1.addActionListener(event -> {
			String s1 = t1.getText();
			int i1 = Integer.parseInt(s1);
			if (count1 == 0) {
				drawBar1 = new BarIcon(i1);
				bar1 = new JLabel(drawBar1);

			} 
			else {
				drawBar1.setIconWidth(i1);
			}
			container.removeAll();
			container.add(bar1);
			container.add(bar2);
			container.add(bar3);
			container.add(bar4);
			container.add(bar5);
			graph.add(container);
			bar1.repaint();
			bar1.updateUI();
			count1++;
		});

		t2.addActionListener(event -> {
			String s2 = t2.getText();
			int i2 = Integer.parseInt(s2);
			if (count2 == 0) {
				drawBar2 = new BarIcon(i2);
				bar2 = new JLabel(drawBar2);
			} 
			else {
				drawBar2.setIconWidth(i2);
			}
			container.removeAll();
			container.add(bar1);
			container.add(bar2);
			container.add(bar3);
			container.add(bar4);
			container.add(bar5);
			graph.add(container);
			bar2.repaint();
			bar2.updateUI();
			count2++;
		});

		t3.addActionListener(event -> {
			String s3 = t3.getText();
			int i3 = Integer.parseInt(s3);
			if (count3 == 0) {
				drawBar3 = new BarIcon(i3);
				bar3 = new JLabel(drawBar3);
			} else {
				drawBar3.setIconWidth(i3);
			}
			container.removeAll();
			container.add(bar1);
			container.add(bar2);
			container.add(bar3);
			container.add(bar4);
			container.add(bar5);
			graph.add(container);
			bar3.repaint();
			bar3.updateUI();
			count3++;
		});

		t4.addActionListener(event -> {
			String s4 = t4.getText();
			int i4 = Integer.parseInt(s4);
			if (count4 == 0) {
				drawBar4 = new BarIcon(i4);
				bar4 = new JLabel(drawBar4);
			} 
			else {
				drawBar4.setIconWidth(i4);
			}
			container.removeAll();
			container.add(bar1);
			container.add(bar2);
			container.add(bar3);
			container.add(bar4);
			container.add(bar5);
			graph.add(container);
			bar4.repaint();
			bar4.updateUI();
			count4++;
		});

		t5.addActionListener(event -> {
			String s5 = t5.getText();
			int i5 = Integer.parseInt(s5);
			if (count5 == 0) {
				drawBar5 = new BarIcon(i5);
				bar5 = new JLabel(drawBar5);
			} 
			else {
				drawBar5.setIconWidth(i5);
			}
			container.removeAll();
			container.add(bar1);
			container.add(bar2);
			container.add(bar3);
			container.add(bar4);
			container.add(bar5);
			graph.add(container);
			bar5.repaint();
			bar5.updateUI();
			count5++;
		});
	}
}