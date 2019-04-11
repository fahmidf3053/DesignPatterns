package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Triangle implements IShape{
	ArrayList <Line> lines=new ArrayList<Line>();
	
	public Triangle(Line a,Line b,Line c) {
		lines.add(a);
		lines.add(b);
		lines.add(c);		
	}
	
	public void draw(Graphics2D g2d) {
		for(IShape line: lines) {
			line.draw(g2d);
			
		}
	
	}

	
}
