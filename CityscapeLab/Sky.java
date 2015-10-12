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
 * Creates a sky and stars
 * 
 * @author Kevin Tu
 * @pre nothing, ignores incorrect user input 
 */
public class Sky
{
    /** description of instance variable x (add comment for each instance variable) */
    //technically boolean, whethere there are stars out or not
    int ster;
    /**
     * Default constructor for objects of class Class
     */         
    public Sky(int s)
    {
       ster = s;
    }
    public void draw(Graphics2D g2)
    {
         
        Rectangle color = new Rectangle(-30,-30,1200,1200);
        Color sky = new Color(0,0,10);
        g2.setColor(sky);
        g2.fill(color);
        
        //only runs if user wants stars (input of 1)
        if(ster==1)
        {
            int[] xVal;xVal=new int[20];
            int[] yVal;yVal=new int[20];
            for(int i=0;i<20;i++)
            {
                Random rand = new Random();
                int x1 = rand.nextInt(820);int y1=rand.nextInt(620);
                xVal[i]=x1;yVal[i]=y1;
            }

            for(int e=0;e<20;e++)
            {
                Color white = new Color(150,150,150);
                g2.setColor(white);
                g2.fill(new Rectangle(xVal[e],yVal[e],1,1));

            }
        }
        
    }
}
