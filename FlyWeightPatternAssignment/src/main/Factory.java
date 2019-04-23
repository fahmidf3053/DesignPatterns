package main;
public class Factory {

    private Rectangle[][] rectangles;

    public Factory() {
        this.rectangles = new Rectangle[1000][1000];

    }

    public Rectangle getRectangle(int width, int height,String color)
    {

        if(rectangles[width][height] != null)
        {	
        	rectangles[width][height].color=color;
            return rectangles[width][height];
        }
        else
        {
            return rectangles[width][height] = new Rectangle(width, height,"red");
        }
    }
}