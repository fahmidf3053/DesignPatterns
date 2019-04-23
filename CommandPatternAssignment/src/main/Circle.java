package main;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circle implements IShape{
	int x,y,r;
	
	public Circle(int x,int y,int r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	@Override
	public void expand(Graphics2D g2d) {
		g2d.setColor(Color.white);
		g2d.drawOval(x, y, r, r);
		r=r*2;
		draw(g2d);
		
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.red);
		g2d.drawOval(x, y, r, r);
		System.out.println("Drawing circle with center ("+x+","+y+") and radius of "+r);
		
	}

	@Override
	public void vanish(Graphics2D g2d) {
		g2d.setColor(Color.white);
		g2d.drawOval(x, y, r, r);
		System.out.println("Vanishing circle with center ("+x+","+y+") and radius of "+r);
		
	}

	@Override
	public void shrink(Graphics2D g2d) {
		g2d.setColor(Color.white);
		g2d.drawOval(x, y, r, r);
		r=r/2;
		draw(g2d);
		
	}

}
