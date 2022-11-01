import java.awt.*;
import java.awt.Point;

public class Circle extends Shape {
    private final int radius;

    public Circle(int xCenter, int yCenter, Color colour, boolean filled, int radius) {
        super(xCenter, yCenter, colour, filled);
        this.radius = radius;
        setupBoundingBox();
    }

    @Override
    public void drawBoundingBox(Graphics g) {
        g.setColor(Color.lightGray);
        g.drawRect(xCenter - radius, yCenter - radius,radius * 2,radius * 2);
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(colour);
        if (filled){
            g.fillOval(xCenter - radius, yCenter - radius,radius * 2,radius * 2);
        } else {
            g.drawOval(xCenter - radius, yCenter - radius,radius * 2,radius * 2);
        }
    }

     @Override
    public void setupBoundingBox() {
        boundingBox = new BoundingBox(new Point(this.xCenter-radius,this.yCenter+radius),new Point(this.xCenter+radius,this.yCenter-radius));
    }
}
