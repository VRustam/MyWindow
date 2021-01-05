package Section_11.com.Rustam;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    public MyWindow(String title){
        super(title);
        setSize(600,400);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font Arial = new Font("Arial", Font.BOLD,16);

        g.setFont(Arial);
        g.drawString("JAVA LESSONS",120,200);


        Font Britannic = new Font("Britannic",Font.BOLD,20);
        g.setFont(Britannic);
        g.drawString("New",100,159);
    }
}
