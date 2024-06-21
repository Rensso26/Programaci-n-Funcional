package Figuras;

import Interfaces.Drawable;

import java.awt.*;

public class Circulo implements Drawable {
    @Override
    public void draw(Graphics g) {
        int diameter = Math.min(800/2, 600/2) - 20;
        int x = (800 - diameter)/2;
        int y = (600 - diameter)/2 ;
        g.setColor(Color.GREEN);
        g.fillOval(x, y, diameter, diameter);
    }
}
