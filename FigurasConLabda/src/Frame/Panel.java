package Frame;

import Controlers.Container;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JFrame {

    private JPanel  tr = new JPanel ();
    Container container = new Container ();

    public Panel() {

        //parametros de la venta
        setTitle("Figuras");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300,200,800, 600);

        //panel para los botones
        JPanel panel = new JPanel();

        panel.setLayout(null);
        tr.setLayout(null);

        //primer boton
        JButton btn1 = new JButton("Triángulo");
        panel.add(btn1);
        btn1.setBounds(50, 50,100,50);
        //acción del boton

        btn1.addActionListener(s -> {
            container.drawTriangle();
            repaint();
        });



        //segundo boton
        JButton btn2 = new JButton("Cuadrado");
        panel.add(btn2);
        btn2.setBounds(50, 200,100,50);
        //acción del segundo boton
        btn2.addActionListener(s-> {
            container.drawSquare();
            repaint();
        });



        JButton btn3 = new JButton("Circulo");
        panel.add(btn3);
        btn3.setBounds(50, 380,100,50);

        btn3.addActionListener(s->{
            container.drawCircle();
            repaint();
        });



        add(panel);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        container.draw(g);

    }

}
