import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /*user input spacing between buildings*/
    static int spacing;
    /*user input lit window percentage*/
    static int percent;
    /*user input car animation speed*/
    static int speed;
    /*user input star (kinda boolean)*/
    static int ster;
    /*yaaa so im like the constructor. i recieve user input and sets them to variables*/
    
    //takes in user input vales and stores them in static variables.
    //@pre user input, correct input
    //@post 4 static variables
    public CityscapeComponent(int s,int p, int d,int r)
    {
        spacing = s;
        percent = p;
        speed = d;
        ster = r;
    }
    Random rand = new Random();
    int width1 = rand.nextInt(4)*10 + 50;int width2 = rand.nextInt(4)*10 + 50;int width3 = rand.nextInt(4)*10 + 50;
    int width4 = rand.nextInt(4)*10 + 50;int width5 = rand.nextInt(4)*10 + 50;int width6 = rand.nextInt(4)*10 + 50;
    int width7 = rand.nextInt(4)*10 + 50;int width8 = rand.nextInt(4)*10 + 50;int width9 = rand.nextInt(4)*10 + 50;
    int width10 = rand.nextInt(4)*10 + 50;int width11 = rand.nextInt(4)*10 + 50;int width12 = rand.nextInt(4)*10 + 50;
    int width13 = rand.nextInt(4)*10 + 50;
    int height1 = rand.nextInt(20)*10;int height6 = rand.nextInt(20)*10;int height10 = rand.nextInt(20)*10;
    int height2 = rand.nextInt(20)*10;int height7 = rand.nextInt(20)*10;int height11 = rand.nextInt(20)*10;
    int height3 = rand.nextInt(20)*10;int height8 = rand.nextInt(20)*10;int height12 = rand.nextInt(20)*10;
    int height4 = rand.nextInt(20)*10;int height9 = rand.nextInt(20)*10;int height13 = rand.nextInt(20)*10;
    int height5 = rand.nextInt(20)*10;
    int chrom1 = rand.nextInt(3);int chrom3 = rand.nextInt(3);int chrom5 = rand.nextInt(3);int chrom7 = rand.nextInt(3);
    int chrom2 = rand.nextInt(3);int chrom4 = rand.nextInt(3);int chrom6 = rand.nextInt(3);int chrom8 = rand.nextInt(3);
    int cp1 = 50; int cp2 = 200; int cp3 = 400; int cp4 = 600; int cp5 = 750;
    /*
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {

        Graphics2D g2 = (Graphics2D) g;
        
        Building b1 = new Building(percent,-30,width1,height1);int x1 = width1 -30 + spacing * 4;
        Building b2 = new Building(percent,x1,width2,height2);int x2 = x1 + width2 + spacing * 4;
        Building b3 = new Building(percent,x2,width3,height3);int x3 = x2 + width3 + spacing * 4;
        Building b4 = new Building(percent,x3,width4,height4);int x4 = x3 + width4 + spacing * 4;
        Building b5 = new Building(percent,x4,width5,height5);int x5 = x4 + width5 + spacing * 4;
        Building b6 = new Building(percent,x5,width6,height6);int x6 = x5 + width6 + spacing * 4;
        Building b7 = new Building(percent,x6,width7,height7);int x7 = x6 + width7 + spacing * 4;
        Building b8 = new Building(percent,x7,width8,height8);int x8 = x7 + width8 + spacing * 4;
        Building b9 = new Building(percent,x8,width9,height9);int x9 = x8 + width9 + spacing * 4;
        Building b10 = new Building(percent,x9,width10,height10);int x10 = x9 + width10 + spacing * 4;
        Building b11 = new Building(percent,x10,width11,height11);int x11 = x10 + width11 + spacing * 4;
        Building b12 = new Building(percent,x11,width12,height12);int x12 = x11 + width12 + spacing * 4;
        Building b13 = new Building(percent,x12,width13,height13);int x13 = x12 + width13 + spacing * 4;
        
        Sky sk1 = new Sky(ster);
        sk1.draw(g2);
        
        Color r_top = new Color(30,30,30);
        g2.setColor(r_top);
        g2.fill(new Rectangle(-30,445,1000,30));
        Color r_bed = new Color(10,10,10);
        g2.setColor(r_bed);
        g2.fill(new Rectangle(-30,475,1000,200));
        
        Car c1 = new Car(chrom1,speed,cp1);Car c4 = new Car(chrom4,speed,cp4);Car c3 = new Car(chrom3,speed,cp3);
        Car c2 = new Car(chrom2,speed,cp2);Car c5 = new Car(chrom5,speed,cp5);
        
        cp1+=speed;cp2+=speed;cp3+=speed;cp4+=speed;cp5+=speed;
        
        g2.setColor(Color.BLACK);
        g2.drawString("Think outside the box!",1300,500);
        g2.drawString("Artwork by Kevin Tu",1310,515);
        
        b1.draw(g2);b2.draw(g2);b3.draw(g2);b4.draw(g2);b5.draw(g2);b6.draw(g2);b7.draw(g2);
        b8.draw(g2);b9.draw(g2);b10.draw(g2);b11.draw(g2);b12.draw(g2);b13.draw(g2);
        
        c1.draw(g2);c2.draw(g2);c3.draw(g2);c4.draw(g2);c5.draw(g2);
        if(cp1>820){cp1=-20;}if(cp2>820){cp2=-20;}if(cp3>820){cp3=-20;}if(cp4>820){cp4=-20;}if(cp5>820){cp5=-20;}

    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        //didn't do anything with this.
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }
    
}
