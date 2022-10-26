import TurtleGraphics.*;
import java.awt.*;
/**
 * Write a description of class fourLeaf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fourLeaf
{
    public static void main(String[] args)
    {
        double theta =Math.PI;
        theta = theta/100;
        double r,x,y ;
        
        for(int z = 1 ; 100>= z; z++){
            theta = z * theta; 
            r = Math.cos(theta *2);
        }
        
        
        
    }
}
