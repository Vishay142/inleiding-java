package h05;

import java.awt.*;
import java.applet.*;

public class Variabelen extends Applet{
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(lijnkleur);
        g.drawLine(50, 100, breedte, hoogte);
        g.drawRect(50, 120, breedte, hoogte);
        g.drawRoundRect(50, 245, breedte, hoogte, 30, 30);

        g.setColor(opvulkleur);
        g.fillRect(400, 150, breedte, hoogte);

        g.setColor(lijnkleur);
        g.drawOval(400, 150, breedte, hoogte);

        g.setColor(opvulkleur);
        g.fillOval(400, 300, breedte, hoogte);

        g.setColor(lijnkleur);
        g.drawOval(750, 150, breedte, hoogte);

        g.setColor(lijnkleur);
        g.drawOval(830, 300, breedte, hoogte);

        g.setColor(opvulkleur);
        g.fillArc(750, 150, breedte, hoogte, 0, 45);
    }
}