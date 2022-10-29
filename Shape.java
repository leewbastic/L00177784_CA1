import java.awt.*;
import java.awt.Point;

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

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int getxCenter() {
        return xCenter;
    }

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    public abstract void drawShape(Graphics g);

    public void displayName(Graphics g){
        g.setColor(Color.black);
        g.drawString(getClass().getSimpleName(),xCenter,yCenter);
    }

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