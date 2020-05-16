import models.Circle;
import models.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Shapes extends JPanel implements Iterator {

    private List<Shape> shapes;

    public Shapes() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object s : shapes) {
            if (s instanceof Circle){
                ((Circle) s).draw(g);
            }
        }
    }

    @Override
    public void remove() {
    }

    @Override
    public void forEachRemaining(Consumer action) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
