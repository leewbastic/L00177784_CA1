import javax.swing.*;
import java.awt.Point;
import java.awt.*;

public class TesterApp {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();
        shapesManager.setDisplayName(true);
        shapesManager.setDisplayBoundingBox(true);
        shapesManager.addShape(new Circle(600,400,Color.blue,false, 80));
        shapesManager.addShape(new Rectangle(50,300,Color.red, false, 75,100));
        shapesManager.addShape(new Square(600,100,Color.yellow,true,80));
        Rectangle rect1 = new Rectangle(400,300,Color.pink,true,50,100);
        shapesManager.addShape(new Quadrilateral(rect1));
        shapesManager.addShape(new Quadrilateral(new Point(150,150),new Point(100,100), new Point(180,80), new Point(190,200), new Point(80,190)));

        //Create and configure JFrame and passing in the shapesManager
        CustomWindow customWindow = new CustomWindow(shapesManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("L00177784 CA1");
        customWindow.setVisible(true);

    }
}
