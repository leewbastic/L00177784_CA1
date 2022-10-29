import java.awt.*;

public abstract class Shape {

    protected Color colour;
    protected boolean filled;
    protected int xCenter,yCenter;

    public Shape(int xCenter, int yCenter, Color colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public abstract void drawShape(Graphics g);

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                ", xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                '}';
    }
}