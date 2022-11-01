import java.awt.*;
import java.awt.Point;
import java.awt.event.MouseEvent;
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
            if (displayName) {
                currShape.displayName(graphicsContext);
            }
            if (displayBoundingBox){
                currShape.drawBoundingBox(graphicsContext);
            }
        }
    }

    public void setDisplayName(boolean displayName) {
        this.displayName = displayName;
    }

    public void setDisplayBoundingBox(boolean displayBoundingBox) {
        this.displayBoundingBox = displayBoundingBox;
    }

    public ArrayList<Shape> getShapes()
    {
        return shapes;
    }

    private ArrayList<Shape> getIntersectingShape(MouseEvent event){
        return null;
    }

    private boolean inBounds(BoundingBox boundingBox, Point point){
        return true;
    }

}
