package main;

import java.awt.Graphics2D;

public interface IShape {
	void expand(Graphics2D g2d);
	void draw(Graphics2D g2d);
	void vanish(Graphics2D g2d);
	void shrink(Graphics2D g2d);
}
