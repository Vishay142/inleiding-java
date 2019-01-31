package h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 120, 350, 120);
        g.drawRect(50, 150, 300, 120);
        g.drawRoundRect(50, 300, 300, 120, 30, 30);

        g.setColor(Color.magenta);
        g.fillRect(400, 150, 300, 120);

        g.setColor(Color.black);
        g.drawOval(400, 150, 300, 120);

        g.setColor(Color.magenta);
        g.fillOval(400, 300, 300, 120);

        g.setColor(Color.black);
        g.drawOval(750, 150, 300, 120);

        g.setColor(Color.black);
        g.drawOval(830, 300, 120, 120);

        g.setColor(Color.magenta);
        g.fillArc(750, 150, 300, 120, 0, 45);

        g.setColor(Color.black);
        g.drawString("Lijn", 180, 140);
        g.drawString("Rechthoek", 160, 290);
        g.drawString("Afgeronde rechthoek", 130, 450);
        g.drawString("Gevulde rechthoek met ovaal", 470, 290);
        g.drawString("Gevulde ovaal", 500, 450);
        g.drawString("Taartpunt met ovaal eromheen", 820, 290);
        g.drawString("Cirkel", 870, 450);
    }
}
