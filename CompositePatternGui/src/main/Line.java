package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Line extends JFrame implements IShape {
	int x1,y1,x2,y2;
	
	public Line(int x1,int y1,int x2,int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.red);
		g2d.drawLine(x1, y1, x2, y2);
		System.out.println("Line drawing"+"("+x1+","+y1+")"+"("+x2+","+y2+")");
		
	}
	

	
	
/*	public JPanel draw() {
		System.out.println("aisi");
		JPanel p = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				Shape line = new Line2D.Double(x1, y1, x2, y2);
				Shape rect = new Rectangle(3, 3, 303, 303);
				Shape circle = new Ellipse2D.Double(100, 100, 100, 100);
				Shape roundRect = new RoundRectangle2D.Double(20, 20, 250, 250, 5, 25);
				g2.draw(line);
				g2.draw(rect);
				g2.draw(circle);
				g2.draw(roundRect);
				System.out.println("aisi");
			}
		};
		
		
		return p;
		
		
	}*/


	
	
}
