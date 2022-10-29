import java.awt.*;
import java.util.ArrayList;

public class ShapesManager {
    private boolean displayName = true;
    private boolean displayBoundingBox = true;

    private ArrayList<Shape> shapes = new ArrayList<>();


    public void addShape(Shape shapeToAdd)
    {

        shapes.add(shapeToAdd);
    }

    public void drawShapes(Graphics graphicsContext) {
        for(Shape currShape:shapes) {
            currShape.drawShape(graphicsContext);
            currShape.displayName(graphicsContext);
            System.out.println(Integer.toString(currShape.xCenter) + Integer.toString(currShape.yCenter));
        }
    }

    public boolean isDisplayName() {
        return displayName;
    }

    public void setDisplayName(boolean displayName) {
        this.displayName = displayName;
    }

    public boolean isDisplayBoundingBox() {
        return displayBoundingBox;
    }

    public void setDisplayBoundingBox(boolean displayBoundingBox) {
        this.displayBoundingBox = displayBoundingBox;
    }
}
