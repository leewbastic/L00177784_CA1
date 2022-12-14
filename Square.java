import java.awt.*;
import java.awt.Point;

public class Square extends Rectangle {

    public Square(Color colour,int xCenter, int yCenter, boolean filled, int width) {
        super(colour, xCenter, yCenter, filled, width);
        setupBoundingBox();
    }

    @Override
    public void drawBoundingBox(Graphics g) {
        g.setColor(Color.lightGray);
        g.drawRect(xCenter - width / 2, yCenter - width / 2, width, width);
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(colour);
        if (filled) {
            g.fillRect(xCenter - width / 2, yCenter - width / 2, width, width);
        } else {
            g.drawRect(xCenter - width / 2, yCenter - width / 2, width, width);
        }
    }

    @Override
    public void setupBoundingBox() {
        boundingBox = new BoundingBox(new Point(this.xCenter-width/2,this.yCenter+width/2),new Point(this.xCenter+width/2,this.yCenter-width/2));
    }
}
