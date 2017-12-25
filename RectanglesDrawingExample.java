//package net.codejava.graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * This program demonstrates how to rectangles using Graphics2D object.
 * @author www.codejava.net
 *
 */
public class RectanglesDrawingExample extends JFrame {

	public RectanglesDrawingExample() {
		super("Rectangles Drawing Demo");
		
		setSize(480, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	void drawRectangles(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
				
		int x = 20;
		int y = 40;
		int width = 440;
		int height = 140;

		Stroke stroke1 = new BasicStroke(6f);
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(stroke1);		
		g2d.drawRect(x, y, width, height);
		
		float[] dashingPattern1 = {2f, 2f};
		Stroke stroke2 = new BasicStroke(2f, BasicStroke.CAP_BUTT, 
				BasicStroke.JOIN_MITER, 1.0f, dashingPattern1, 2.0f);
		
		g2d.setColor(Color.RED);
		g2d.setStroke(stroke2);		
		g2d.drawRect(x + 20, y + 20, width - 40, height - 40);
		
		float[] dashingPattern2 = {10f, 4f};
		Stroke stroke3 = new BasicStroke(4f, BasicStroke.CAP_BUTT, 
				BasicStroke.JOIN_MITER, 1.0f, dashingPattern2, 0.0f);
		
		g2d.setColor(Color.GREEN);
		g2d.setStroke(stroke3);		
		g2d.drawRect(x + 40, y + 40, width - 80, height - 80);
		
		
		float[] dashingPattern3 = {10f, 10f, 1f, 10f};
		Stroke stroke4 = new BasicStroke(4f, BasicStroke.CAP_SQUARE, 
				BasicStroke.JOIN_MITER, 1.0f, dashingPattern3, 0.0f);
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(stroke4);		
		g2d.drawRect(x + 60, y + 60, width - 120, height - 120);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		drawRectangles(g);
	}
	
	public static void main(String[] args) throws Exception {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new RectanglesDrawingExample().setVisible(true);
			}
		});
	}
}