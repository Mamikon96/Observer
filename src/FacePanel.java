import models.Circle;
import models.Shape;
import models.ShapePanel;
import utils.FaceConstants;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FacePanel extends JLayeredPane {


    private int panelWidth;
    private int panelHeight;

    private List<Shape> shapes;

    private Map<String, Shape> shapesMap = new HashMap<>();

    private List<JPanel> faceElements = new ArrayList<>();

    public FacePanel(int panelWidth, int panelHeight) {
        this.panelWidth = panelWidth;
        this.panelHeight = panelHeight;
        shapes = new ArrayList<>();

        initShapes();
        initListeners();
//        this.add(shapes);
    }

    private void addShape(Shape shape) {
//        shapes.addShape(shape);
        shapes.add(shape);
        repaint();
    }

    private void add(String shapeType, Shape shape) {
        shapesMap.put(shapeType, shape);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /*for (Object s : shapes) {
            if (s instanceof Circle){
                ((Circle) s).draw(g);
            }
        }*/

        for (String type: shapesMap.keySet()) {
            if (shapesMap.get(type) instanceof Circle) {
                ((Circle) shapesMap.get(type)).draw(g);
            }
        }
    }

    private void initShapes() {
        // Face
        int faceWidth = 570;
        int faceHeight = 610;
        add(FaceConstants.FACE, new Circle(
                (panelWidth - faceWidth) / 2,
                (panelHeight - faceHeight) / 2,
                faceWidth,
                faceHeight,
                Color.YELLOW));

        // Left Eye
        int leftEyeWidth = 100;
        int leftEyeHeight = 100;
        /*add(FaceConstants.LEFT_EYE, new Circle(
                (3*panelWidth/4 - leftEyeWidth) / 2,
                (3*panelHeight/4 - leftEyeHeight) / 2,
                leftEyeWidth,
                leftEyeHeight,
                Color.WHITE));*/
        int leftEyeInnerWidth = 30;
        int leftEyeInnerHeight = 30;
        /*add(FaceConstants.LEFT_EYE_INNER, new Circle(
                (3*panelWidth/4 - leftEyeInnerWidth) / 2,
                (3*panelHeight/4 - leftEyeInnerHeight) / 2,
                leftEyeInnerWidth,
                leftEyeInnerHeight,
                Color.BLACK));*/

        ShapePanel leftEyePanel = new ShapePanel(FaceConstants.LEFT_EYE);
        leftEyePanel.setBounds((3*panelWidth/4 - leftEyeWidth) / 2,
                (3*panelHeight/4 - leftEyeHeight) / 2,
                leftEyeWidth,
                leftEyeHeight);
        leftEyePanel.setOpaque(true);
        leftEyePanel.setBackground(Color.YELLOW);
        this.add(leftEyePanel, new Integer(0), 0);

        // Right Eye
        int rightEyeWidth = 100;
        int rightEyeHeight = 100;
        /*add(FaceConstants.RIGHT_EYE, new Circle(
                (5*panelWidth/4 - rightEyeWidth) / 2,
                (3*panelHeight/4 - rightEyeHeight) / 2,
                rightEyeWidth,
                rightEyeHeight,
                Color.WHITE));
        int rightEyeInnerWidth = 30;
        int rightEyeInnerHeight = 30;
        add(FaceConstants.RIGHT_EYE_INNER, new Circle(
                (5*panelWidth/4 - rightEyeInnerWidth) / 2,
                (3*panelHeight/4 - rightEyeInnerHeight) / 2,
                rightEyeInnerWidth,
                rightEyeInnerHeight,
                Color.BLACK));*/

        ShapePanel rightEyePanel = new ShapePanel(FaceConstants.RIGHT_EYE);
        rightEyePanel.setBounds((5*panelWidth/4 - rightEyeWidth) / 2,
                (3*panelHeight/4 - rightEyeHeight) / 2,
                rightEyeWidth,
                rightEyeHeight);
        rightEyePanel.setOpaque(true);
        rightEyePanel.setBackground(Color.YELLOW);
        this.add(rightEyePanel, new Integer(0), 0);

        // Nose
        int noseWidth = 70;
        int noseHeight = 140;
        /*add(NOSE, new Circle(
                (panelWidth - noseWidth) / 2,
                (panelHeight - noseHeight) / 2,
                noseWidth,
                noseHeight,
                Color.RED));*/
        Circle circle = new Circle(
                0,
                0,
                noseWidth,
                noseHeight,
                Color.RED);


        /*CirclePanel circlePanel = new CirclePanel(circle);
        circlePanel.setBounds((panelWidth - noseWidth) / 2,
                (panelHeight - noseHeight) / 2,
                noseWidth,
                noseHeight);
        circlePanel.setOpaque(true);
        circlePanel.setBackground(Color.YELLOW);*/

        ShapePanel circlePanel = new ShapePanel(FaceConstants.NOSE);
        circlePanel.setBounds((panelWidth - noseWidth) / 2,
                (panelHeight - noseHeight) / 2,
                noseWidth,
                noseHeight);
        circlePanel.setOpaque(true);
        circlePanel.setBackground(Color.YELLOW);
        this.add(circlePanel, new Integer(0), 0);

        // Mouth
        int mouthWidth = 240;
        int mouthHeight = 100;
        /*add(FaceConstants.MOUTH, new Circle(
                (panelWidth - mouthWidth) / 2,
                (6*panelHeight/4 - mouthHeight) / 2,
                mouthWidth,
                mouthHeight,
                Color.WHITE));*/

        ShapePanel mouthPanel = new ShapePanel(FaceConstants.MOUTH);
        mouthPanel.setBounds((panelWidth - mouthWidth) / 2,
                (6*panelHeight/4 - mouthHeight) / 2,
                mouthWidth,
                mouthHeight);
        mouthPanel.setOpaque(true);
        mouthPanel.setBackground(Color.YELLOW);
        this.add(mouthPanel, new Integer(0), 0);

    }

    private void initListeners() {

    }
}
