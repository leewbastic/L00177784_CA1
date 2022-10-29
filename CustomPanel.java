import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    private ShapesManager shapesManager;

    public CustomPanel(ShapesManager shapesManager){
        this.shapesManager = shapesManager;
    }

    @Override
    protected void paintComponent(Graphics graphicsContext) {
        super.paintComponent(graphicsContext);
        shapesManager.drawShapes(graphicsContext);

    }
}