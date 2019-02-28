package h06;

import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet {

    double a;
    double b;
    double c;
    double uitkomst;
    int d;
    int uitkomsttwee;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 10;
        uitkomst = (a + b + c) / 3;
        uitkomsttwee = (int) (uitkomst * uitkomsttwee);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}