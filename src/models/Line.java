package models;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Line implements Shape {

    private int x;
    private int y;
    private int width;
    private int height;

    public Line(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Line(int x, int y, int width, int height) {
        this(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        Line2D.Float line = new Line2D.Float(x, y, width, height);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(1f));
        g2d.setColor(Color.BLACK);
        g2d.draw(line);
    }
}
