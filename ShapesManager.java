import java.awt.*;
import java.util.ArrayList;

public class ShapesManager {

    private ArrayList<Shape> shapes = new ArrayList<>();



    public void addShape(Shape shapeToAdd)
    {

        shapes.add(shapeToAdd);
    }

    public void drawShapes(Graphics graphicsContext) {
        for(Shape currShape:shapes) {
            currShape.drawShape(graphicsContext);
        }
    }



}
