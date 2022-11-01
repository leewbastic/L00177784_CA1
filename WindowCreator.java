import javax.swing.*;
import java.awt.Point;
import java.awt.*;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();
        shapesManager.setDisplayName(true);
        shapesManager.setDisplayBoundingBox(true);
        shapesManager.addShape(new Circle(400,400,Color.blue,false, 80));
        shapesManager.addShape(new Rectangle(50,300,Color.red, false, 75,100));
        shapesManager.addShape(new Square(600,100,Color.yellow,true,80));
        Rectangle rect1 = new Rectangle(400,300,Color.pink,true,50,60);
        shapesManager.addShape(new Quadrilateral(rect1));
        shapesManager.addShape(new Quadrilateral(new Point(500,500),new Point(500,400), new Point(550,420), new Point(525,540), new Point(480,480)));

        //Create and configure JFrame and passing in our shapesManager
        CustomWindow customWindow = new CustomWindow(shapesManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("L00177784 CA1");
        customWindow.setVisible(true);

    }
}
