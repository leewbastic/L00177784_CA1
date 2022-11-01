import java.awt.*;
import java.awt.Point;

public class Rectangle extends Shape implements Moveable {
    protected int width;
    protected int height;

    public Rectangle(int xCenter, int yCenter, Color colour, boolean filled, int width, int height) {
        super(xCenter, yCenter, colour, filled);
        this.width = width;
        this.height = height;
        setupBoundingBox();
    }

    public Rectangle(int xCenter, int yCenter, Color colour, boolean filled, int width) {
        super(xCenter, yCenter, colour, filled);
        this.width = width;
    }
    @Override
    public void drawBoundingBox(Graphics g) {
        g.setColor(Color.lightGray);
        g.drawRect(xCenter - width / 2, yCenter - height / 2, width, height);
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(colour);
        if (!filled) {
            g.drawRect(xCenter - width / 2, yCenter - height / 2, width, height);
        } else {
            g.fillRect(xCenter - width / 2, yCenter - height / 2, width, height);
        }
    }

    @Override
    public void setupBoundingBox() {
        boundingBox = new BoundingBox(new Point(this.xCenter-width/2,this.yCenter+height/2),new Point(this.xCenter+width/2,this.yCenter-height/2));
    }


    @Override
    public void moveXTenUnits() {
        this.xCenter += 10;
        setupBoundingBox();
    }
}
