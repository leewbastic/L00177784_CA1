import java.awt.*;

public abstract class Shape {

    protected Color colour;
    protected boolean filled;
    protected int xCenter,yCenter;
    protected BoundingBox boundingBox;

    public Shape(Color colour, int xCenter, int yCenter, boolean filled) {
        this.colour = colour;
        this.filled = filled;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public abstract void setupBoundingBox();

    public abstract void drawShape(Graphics g);

    public abstract void drawBoundingBox(Graphics g);

    public void displayName(Graphics g) {
        g.setColor(Color.black);
        g.drawString(getClass().getSimpleName(),xCenter,yCenter);
    }
}
