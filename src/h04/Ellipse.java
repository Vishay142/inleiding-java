package h04;

import java.awt.*;
import java.applet.*;

public class Ellipse extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillOval(400, 200, 1000, 500);

    }
}