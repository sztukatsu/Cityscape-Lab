/*
 * Kevin Tu 2015 All Food Rights Reserved
 */


import javax.swing.JFrame;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    // the cityscape will be animated for alot more than 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 60000;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // ...
        Scanner keyboard = new Scanner(System.in);
        System.out.print("spacing between buildings (1-5):  ");
        int spacing = keyboard.nextInt()+2;
        System.out.print("percentage of windows lit (0-100):  ");
        int percent = keyboard.nextInt()+2;
        System.out.print("average speed of cars (0-10):  ");
        int speed = keyboard.nextInt();
        System.out.print("do you like stars? (1/0):  ");
        int ster = keyboard.nextInt();
        
    
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(spacing,percent,speed,ster);
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 50 );
        }
        
    }

}
