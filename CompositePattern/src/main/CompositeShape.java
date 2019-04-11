package main;

import java.util.ArrayList;

public abstract class CompositeShape implements IShape {
	ArrayList<IShape> shapes=new ArrayList<>();
    public void draw()
    {
        buildShape();
        for (IShape shape: shapes)
        {
            shape.draw();
        }
    }

    abstract public void buildShape();
}
