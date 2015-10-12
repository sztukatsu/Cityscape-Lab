import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;


/**
 * Class Car containts instructions for cars to be drawn
 * 
 * 
 * @Kevin Tu
 */
public class Car
{
    /** description of instance variable x (add comment for each instance variable) */
    //speed of car (user input)
    private int speed;
    //color of car (randomly generated)
    private int color;
    //starting position (hard coded)
    private int xPos;
    /**
     * Default constructor 
     * @pre speed,color,starting position
     * @post an instance of the car Class is created
     */         
    public Car(int c,int s,int p)
    {
       color = c;
       speed = s;
       xPos = p;
    }
    public void draw(Graphics2D g2)
    {
         Rectangle body = new Rectangle(xPos,455,30,5);
         Ellipse2D.Double ftire = new Ellipse2D.Double(xPos+5,460,5,5);
         Ellipse2D.Double btire = new Ellipse2D.Double(xPos+20,460,5,5);
         int[] xVal = {xPos+5,xPos+10,xPos+20,xPos+25};
         int[] yVal = {455,450,450,455};
         Polygon windshield = new Polygon(xVal,yVal,yVal.length);
         
         //determines color of car. 
         Color cyan = new Color(0,80,80);
         Color green = new Color(0,80,0);
         Color red = new Color(80,0,0);
         Color yellow = new Color(80,80,0);
         
         if(color == 0){g2.setColor(green);};
         if(color == 1){g2.setColor(red);};
         if(color == 2){g2.setColor(yellow);};
         g2.fill(body);
         g2.setColor(Color.BLACK);g2.fill(ftire);g2.fill(btire);
         g2.setColor(cyan);g2.fill(windshield);
         
    }
}
