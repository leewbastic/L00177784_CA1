import java.awt.Point;

public final class Utility {

    private Utility(){}

    public static Point rotatePoint(Point point, Point centrePoint, int angle){
        float sinTheta = (float) Math.sin(Math.toRadians(angle));
        float cosTheta = (float) Math.cos(Math.toRadians(angle));

        int x = point.x - centrePoint.x;
        int y = point.y - centrePoint.y;

        int newX = (int) Math.floor((x*cosTheta) - (y*sinTheta));
        int newY = (int) Math.floor((x*sinTheta) + (y*cosTheta));

        return new Point(newX + centrePoint.x,newY + centrePoint.y);
    }
}
