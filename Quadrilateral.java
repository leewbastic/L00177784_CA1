import java.awt.*;
import java.awt.Point;
import java.util.Arrays;

public class Quadrilateral extends Shape implements Rotateable{
    private Point [] points;

    public Quadrilateral(int xCenter, int yCenter, Color colour, boolean filled, Point[] points) {
        super(xCenter, yCenter, colour, filled);
        this.points = points;
        setupBoundingBox();
    }

    public Quadrilateral(Point centerPoint, Point[] points){
        super(centerPoint.x, (int) centerPoint.y, Color.black, true);
        this.points = points;
        setupBoundingBox();
    }

    public Quadrilateral(Point centerPoint, Point p1, Point p2, Point p3, Point p4){
        super(centerPoint.x, centerPoint.y, Color.black, false);
        this.points = new Point[]{p1,p2,p3,p4};
        setupBoundingBox();
    }

    public Quadrilateral(Rectangle rectangle){
        super(rectangle.xCenter, rectangle.yCenter,rectangle.colour, rectangle.filled);
        this.points = new Point[]{
                (new Point(rectangle.xCenter- rectangle.width/2,rectangle.yCenter-rectangle.height/2)),
                (new Point(rectangle.xCenter+ rectangle.width/2,rectangle.yCenter-rectangle.height/2)),
                (new Point(rectangle.xCenter+ rectangle.width/2,rectangle.yCenter+rectangle.height/2)),
                (new Point(rectangle.xCenter- rectangle.width/2,rectangle.yCenter+rectangle.height/2))
        };
        setupBoundingBox();
    }

    @Override
    public void setupBoundingBox() {
        int[] xCoordinates = {points[0].x, points[1].x, points[2].x, points[3].x};
        int[] yCoordinates = {points[0].y, points[1].y, points[2].y, points[3].y};
        Arrays.sort(xCoordinates);
        Arrays.sort(yCoordinates);
        boundingBox = new BoundingBox(new Point(xCoordinates[0],yCoordinates[3]),new Point(xCoordinates[3],yCoordinates[0]));
    }

    @Override
    public void drawShape(Graphics g) {
        int[] xCoordinates = {points[0].x, points[1].x, points[2].x, points[3].x};
        int[] yCoordinates = {points[0].y, points[1].y, points[2].y, points[3].y};
        int numberOfPoints = points.length;
        g.setColor(colour);
        if (filled){
            g.fillPolygon(xCoordinates, yCoordinates, numberOfPoints);
        }
        g.drawPolygon(xCoordinates, yCoordinates, numberOfPoints);
    }

    @Override
    public void drawBoundingBox(Graphics g) {
        g.setColor(Color.lightGray);
        g.drawRect(this.boundingBox.getBottomLeft().x, this.boundingBox.getTopRight().y, this.boundingBox.getTopRight().x - this.boundingBox.getBottomLeft().x, this.boundingBox.getBottomLeft().y - this.boundingBox.getTopRight().y);
    }

    @Override
    public void rotate90Degrees() {
        for (int i = 0; i < points.length; i++){
            points[i] = Utility.rotatePoint(points[i], new Point(this.xCenter, this.yCenter), Consts.ANGLE_TO_ROTATE);
        }
        setupBoundingBox();
    }
}
