package Controlers;

import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Triangulo;
import Interfaces.Drawable;

import java.awt.*;

public class Container {
    private Drawable currentShape = null;

    public void drawTriangle() {
        currentShape = new Triangulo();
    }

    public void drawSquare() {
        currentShape = new Cuadrado();
    }

    public void drawCircle() {
        currentShape = new Circulo();
    }

    public void clear() {
        currentShape = null;
    }

    public void draw(Graphics g) {
        if (currentShape != null) {
            currentShape.draw(g);
        }
    }

}
