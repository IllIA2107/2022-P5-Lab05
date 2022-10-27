// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(x1,10,width,height);

        for(int k = 0; k <= 97; k++){
            g.drawLine(x1 + k * 10, y1, x2, y2 - k * 6);
        }

        for(int k = 0; k <= 97; k++){
            g.drawLine(x2 - k * 10,y1, x1, y1 - k * 6);
        }

        for(int k = 0; k <= 97; k++){
            g.drawLine(x1 + k * 10, x1, x2, x1 + k * 6);
        }

        for(int k = 0; k <= 97; k++){
            g.drawLine(x2 - k * 10,x1, x1, x1 + k * 6);
        }


        int x12 = 238;
        int y12 = 168;
        int x22= 763;
        int y22= 483;
        g.drawRect(x12,y12,525,315);

        for(int k = 0; k <= 105; k++){
            g.drawLine(x12 + k * 5, y12, x22, y12 + k * 3);
        }

        for(int k = 0; k <= 105; k++){
            g.drawLine(x22 - k * 5,y12, x12, y12 + k * 3);
        }

        for(int k = 0; k <= 105; k++){
            g.drawLine(x12 + k * 5,y22, x22, y22 - k * 3);
        }

        for(int k = 0; k <= 105; k++){
            g.drawLine(x22 - k * 5,y22, x12, y22 - k * 3);
        }
    }
}
