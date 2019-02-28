package h06;

import java.awt.*;
import java.applet.*;


public class Teller extends Applet {
    int seconde;
    int minuut;
    int uur;
    int dag;
    int jaar;

    public void init() {
        seconde = 1;
        minuut = (1 * 60);
        uur = (60 * 60);
        dag = (3600 * 24);
        jaar = (86400 * 365);
    }

    public void paint(Graphics g) {
        g.drawString("Een minuut: " + minuut, 50, 20 );
        g.drawString("Een uur: " + uur, 50, 40 );
        g.drawString("Een dag: " + dag, 50, 60 );
        g.drawString("Een jaar: " + jaar, 50, 80 );
    }
}