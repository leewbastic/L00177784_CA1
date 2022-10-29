import java.awt.*;

public class Circle extends Shape{
    private final int radius;

    public Circle(int xCenter, int yCenter, Color colour, boolean filled, int radius) {
        super(xCenter, yCenter, colour, filled);
        this.radius = radius;
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(colour);
        g.drawOval(xCenter - radius, yCenter - radius,radius * 2,radius * 2);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                ", xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                '}';
    }
}
