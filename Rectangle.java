import java.awt.*;

public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int xCenter, int yCenter, Color colour, boolean filled, int width, int height) {
        super(xCenter, yCenter, colour, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawShape(Graphics g) {
        g.drawRect(xCenter - width/2,yCenter - width/2, width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                ", xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                '}';
    }
}
