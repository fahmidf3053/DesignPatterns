package main;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Reactangle implements IShape{
	ArrayList <Line> lines=new ArrayList<Line>();
	
	public Reactangle(Line a,Line b,Line c,Line d) {
		lines.add(a);
		lines.add(b);
		lines.add(c);
		lines.add(d);
	}
	
	public void draw(Graphics2D g2d) {
		for(IShape line: lines) {
			line.draw(g2d);
			
		}
	
	}

}
