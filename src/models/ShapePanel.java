package models;

import controllers.FaceService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ShapePanel extends JPanel implements MouseListener {

    private String shapeType;
    private Shape shape;

    public ShapePanel(String shapeType) {
        this.shapeType = shapeType;
        shape = FaceService.getShape(shapeType);
        this.addMouseListener(this);
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shape.draw(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        shape = FaceService.getShape(shapeType);
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
