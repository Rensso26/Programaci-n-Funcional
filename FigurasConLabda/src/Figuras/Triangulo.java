package Figuras;

import Interfaces.Drawable;

import java.awt.*;

public class Triangulo implements Drawable {
    @Override
    public void draw(Graphics g) {
        int[] xPoints = { 600, 400, 500 };
        int[] yPoints = { 400, 400, 250 };
        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
