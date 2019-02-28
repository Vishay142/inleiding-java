package h06;

import java.awt.*;
import java.applet.*;


public class Reken extends Applet {
    int Ster;
    int Maan;



    public void init() {
        Ster = 2147483647;
        Maan = 1;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " +  Maan + Ster, 20, 20);
    }
}
