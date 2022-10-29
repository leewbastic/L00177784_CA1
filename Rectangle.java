import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    private int height;

    public Rectangle(int xCenter, int yCenter, Color colour, boolean filled, int width, int height) {
        super(xCenter, yCenter, colour, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int xCenter, int yCenter, Color colour, boolean filled, int width) {
        super(xCenter, yCenter, colour, filled);
        this.width = width;
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
