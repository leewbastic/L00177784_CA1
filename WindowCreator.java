import javax.swing.*;
import java.awt.*;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();
        shapesManager.setDisplayName(true);
        shapesManager.setDisplayBoundingBox(false);
        shapesManager.addShape(new Circle(200,200,Color.blue,false, 100));
        shapesManager.addShape(new Rectangle(51,51,Color.red, false, 50,100));
        shapesManager.addShape(new Square(600,100,Color.yellow,true,80));

        //Create and configure our JFrame (window)
        CustomWindow customWindow = new CustomWindow(shapesManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Test Window");
        customWindow.setVisible(true);

    }
}
