package h06;

import java.awt.*;
import java.applet.*;


public class Getallen extends Applet {


    int inkomst;
    int uitkomst;

    public void init() {
        inkomst = 113;
        uitkomst = (inkomst / 4);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("Jan krijgt: " + uitkomst, 20, 60);
        g.drawString("Ali krijgt: " + uitkomst, 20, 80);
        g.drawString("Jeanette krijgt: " + uitkomst, 20, 100);
        g.drawString("Vishay krijgt: " + uitkomst, 20, 120);
    }
}