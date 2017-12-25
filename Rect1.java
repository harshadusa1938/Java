import java.applet.Applet;
import java.awt.Graphics;
 
public class Rect1 extends Applet{
 
        public void paint(Graphics g){
               
                /*
                 * to draw rectangle in an applet window use,
                 * void drawRect(int x1,int y1, int width, int height)
                 * method.
                 *
                 * This method draws a rectangle of specified width and
                 * height at (x1,y1)
                 */
               
                //this will draw a rectangle of width 50 & height 100 at (10,10)
                g.drawRect(10,10,50,100);
               
                /*
                 * If you speficy same width and height, the drawRect method
                 * will draw a square!
                 */
               
                //this will draw a square
                g.drawRect(100,100,50,50);
        }
}