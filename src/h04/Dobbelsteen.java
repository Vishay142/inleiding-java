package h04;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.pink);
        g.setColor(Color.white);
        g.fillRoundRect(600, 200, 600, 600, 60, 60);
        g.setColor(Color.black);
        g.fillOval(650, 250, 200, 200);
        g.setColor(Color.black);
        g.fillOval(950, 250, 200, 200);
        g.setColor(Color.black);
        g.fillOval(650, 550, 200, 200);
        g.setColor(Color.black);
        g.fillOval(950, 550, 200, 200);

    }
}
