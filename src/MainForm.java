import models.Circle;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {

    private static int sizeWidth = 700;
    private static int sizeHeight = 700;
    private static int locationX;
    private static int locationY;

//    private static FaceCanvas canvas;
    private static FacePanel facePanel;

    public MainForm(String title) {
        super(title);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        locationX = (screenSize.width - sizeWidth) / 2;
        locationY = (screenSize.height - sizeHeight) / 2;
        this.setBounds(locationX, locationY, sizeWidth, sizeHeight);

//        this.add(new MyCanvas());
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame mainForm = new MainForm("Рожица");
//        canvas = new FaceCanvas();
//        mainForm.add(canvas);
//        canvas.addShape(new Circle(sizeWidth / 2, sizeHeight / 2, Color.YELLOW));

        facePanel = new FacePanel(sizeWidth, sizeHeight);
        mainForm.add(facePanel);

    }
}
