import javax.swing.*;
import java.awt.Point;
import java.awt.*;

public class TesterApp {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();
        shapesManager.setDisplayName(true);
        shapesManager.setDisplayBoundingBox(true);

        //Create shapes and add to Shapemanager
        shapesManager.addShape(new Circle(Color.blue,600,400,false, 80));
        shapesManager.addShape(new Rectangle(Color.red,50,300, false, 75,100));
        shapesManager.addShape(new Square(Color.yellow,600,100,true,80));
        Rectangle rect1 = new Rectangle(Color.pink,400,300,true,50,100);
        shapesManager.addShape(new Quadrilateral(rect1));
        shapesManager.addShape(new Quadrilateral(new Point(150,150),new Point(100,100), new Point(180,80), new Point(190,200), new Point(80,190)));

        //Create and configure JFrame and passing in the shapesManager
        CustomWindow customWindow = new CustomWindow(shapesManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("L00177784 CA1");
        customWindow.setVisible(true);

    }
}
