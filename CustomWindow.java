import javax.swing.*;
import java.awt.*;

public class CustomWindow extends JFrame {

    private CustomPanel mainPanel;

    public CustomWindow(ShapesManager shapesManager) {
        mainPanel = new CustomPanel(shapesManager);

        //add new panel to the frame
        add(mainPanel, BorderLayout.CENTER);

        //set the dimensions of the frame
        setSize(Consts.FRAME_WIDTH, Consts.FRAME_HEIGHT);
    }


}