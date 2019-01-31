package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Draw extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(650, 350, 500, 500);
        g.drawLine(650, 350, 900, 100);
        g.drawLine(1150, 350, 900, 100);
        g.drawRect(750, 600, 100, 100);
        g.drawRect(980, 650, 100, 200);
    }
}
