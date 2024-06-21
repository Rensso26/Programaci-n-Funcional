package Figuras;

import Interfaces.Drawable;

import java.awt.*;

public class Cuadrado implements Drawable {


    @Override
    public void draw(Graphics g) {
        int[] xPoints = { 600, 400, 400, 600 };
        int[] yPoints = { 400, 400, 250, 250 };
        g.setColor(Color.BLUE);
        g.fillPolygon(xPoints, yPoints, 4);
    }
}
