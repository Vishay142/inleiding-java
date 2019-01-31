package h04;

import java.awt.*;
import java.applet.*;

public class Flag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.red);
        g.fillRect(20, 130, 500, 100);
        g.setColor(Color.white);
        g.fillRect(20, 230, 500, 100);
        g.setColor(Color.blue);
        g.fillRect(20, 330, 500, 100);
        g.setColor(Color.black);
        g.fillRect(20, 130, 10, 500);
    }
}
