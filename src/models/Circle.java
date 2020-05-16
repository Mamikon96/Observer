package models;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle implements Shape {

    private int x;
    private int y;
    private int width;
    private int height;

    private Color color;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circle(int x, int y, int width, int height) {
        this(x, y);
        this.width = width;
        this.height = height;
    }

    public Circle(int x, int y, int width, int height, Color color) {
        this(x, y, width, height);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, height);

        g2d.setColor(color);
        g2d.fill(circle);
    }
}
