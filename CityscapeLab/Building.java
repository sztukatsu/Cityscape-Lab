import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;
import java.awt.Color;


/**
 * Contains instructions for the creation of a building. body+windows
 * 
 * @Kevin Tu
 * 
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    //left position from which building is created
    private int xLeft;
    //width of building (randomly generated)
    private int width;
    //height of building (randomly generated)
    private int height;
    //percent of windows lit (user input)
    private int percent;
    
    /**
     * Default constructor for objects of class Building
     * takes parameters and stores them into instance variables
     * @pre 4 integer parameters
     * @post instances of the buidling class can be created
     */         
    public Building(int p, int x, int w, int h)
    {
       xLeft = x;
       width = w;
       height = h;
       percent = p;
      
    }
    
    //all windows are 5 by 5
    public void draw(Graphics2D g2)
    {
        Color facade = new Color(20,20,20);
        g2.setColor(facade);
        Rectangle structure = new Rectangle(xLeft, 150 + height , width+5, 305 - height);
        g2.fill(structure);
        int winrow = 150 + height;
        Color w_on = new Color(100,100,0);
        Random rand = new Random();
        //for how many windows can fit side by side
        for(int i = 5; i <= width; i+=10)
        {
            //for how many windows can fit top to botom
            for(int e = 5; e < 300-height; e+=10)
            {
                int win_yn = rand.nextInt(100)+1;
                    if(win_yn < percent-1)
                    {
                    //windows are lit
                    g2.setColor(w_on);
                }
                    else
                    {
                    g2.setColor(Color.DARK_GRAY);
                    //windows are dark
                }   
                g2.fill(new Rectangle(xLeft+i,150+height+e,5,5));
            }
        }    
    }
}
