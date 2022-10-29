import javax.swing.*;
import java.awt.*;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();
        shapesManager.setDisplayName(true);
        shapesManager.setDisplayBoundingBox(false);
        shapesManager.addShape(new Circle(400,400,Color.blue,false, 80));
        shapesManager.addShape(new Rectangle(50,300,Color.red, false, 75,100));
        shapesManager.addShape(new Square(600,100,Color.yellow,true,80));

        //Create and configure our JFrame (window)
        CustomWindow customWindow = new CustomWindow(shapesManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("L00177784 CA1");
        customWindow.setVisible(true);

    }
}
