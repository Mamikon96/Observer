package models;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ring implements Shape {

    private int x;
    private int y;
    private int width;
    private int height;

    private Color color;

    public Ring(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ring(int x, int y, int width, int height) {
        this(x, y);
        this.width = width;
        this.height = height;
    }

    public Ring(int x, int y, int width, int height, Color color) {
        this(x, y, width, height);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, height);

        g2d.setColor(color);
        g2d.fill(circle);

        Ellipse2D.Double circleInner = new Ellipse2D.Double(x + width/2 - 0.3*width/2, y + height/2 - 0.3*height/2, 0.3*width, 0.3*height);

        g2d.setColor(Color.BLACK);
        g2d.fill(circleInner);
    }
}
