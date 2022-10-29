import javax.swing.*;
import java.awt.*;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();
        shapesManager.addShape(new Circle(200,200,Color.blue,false, 100));
        shapesManager.addShape(new Rectangle(200,200,Color.green,false,100,100));

        //Create and configure our JFrame (window)
        CustomWindow customWindow = new CustomWindow(shapesManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Test Window");
        customWindow.setVisible(true);

    }
}
