import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class CustomPanel extends JPanel {
    private ShapesManager shapesManager;
    private ArrayList<Shape> intersectingShapes = new ArrayList<>();

    public CustomPanel(ShapesManager shapesManager) {
        this.shapesManager = shapesManager;
        addListener();
    }

    public void addListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                intersectingShapes = getIntersectingShapes(e);
                for (Shape currShape : intersectingShapes) {
                    if (e.getButton() != 3) {
                        currShape.filled = !currShape.filled;
                    }else{
                        if (currShape.getClass().getSimpleName().equals("Rectangle")) {
                            Rectangle r = (Rectangle) currShape;
                            r.moveXTenUnits();
                        }
                        if (currShape.getClass().getSimpleName().equals("Quadrilateral")){
                            Quadrilateral q = (Quadrilateral) currShape;
                            q.rotate90Degrees();
                        }
                    }
                }
                repaint();
            }
        });
    }
    private ArrayList<Shape> getIntersectingShapes(MouseEvent event) {
        ArrayList<Shape> intersectingShapes = new ArrayList<>();
        for (Shape currShape : shapesManager.getShapes()) {
            if (inBounds(currShape.boundingBox, new Point(event.getX(), event.getY()))) {
                intersectingShapes.add(currShape);
            }
        }
        return intersectingShapes;
    }

    private boolean inBounds(BoundingBox boundingBox, Point point)
    {
        return (point.getX() > boundingBox.getBottomLeft().x && point.getX() < boundingBox.getTopRight().x) && (point.getY() < boundingBox.getBottomLeft().y && point.getY() > boundingBox.getTopRight().y);
    }

    @Override
    protected void paintComponent(Graphics graphicsContext) {
        super.paintComponent(graphicsContext);
        shapesManager.drawShapes(graphicsContext);
    }

}