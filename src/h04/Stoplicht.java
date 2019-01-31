package h04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(700, 100, 450, 800, 60, 60);
        g.setColor(Color.red);
        g.fillOval(825, 150, 200, 200);
        g.setColor(Color.orange);
        g.fillOval(825, 400, 200, 200);
        g.setColor(Color.green);
        g.fillOval(825, 650, 200, 200);
    }
}