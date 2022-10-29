import java.awt.*;

public abstract class Shape {

    protected String colour;
    protected boolean filled;
    protected int xCenter;
    protected int yCenter;

    public Shape(int xCenter, int yCenter, String colour, boolean filled) {
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