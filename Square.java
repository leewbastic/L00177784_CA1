import java.awt.*;

public class Square extends Rectangle{

    public Square(int xCenter, int yCenter, Color colour, boolean filled, int width) {
        super(xCenter, yCenter, colour, filled, width);
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(colour);
        if (!filled) {
            g.drawRect(xCenter - width / 2, yCenter - width / 2, width, width);
        } else {
            g.fillRect(xCenter - width / 2, yCenter - width / 2, width, width);
        }


    }
}
