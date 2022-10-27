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
        StandardPen pen = new StandardPen();
        double theta =0;
        double r,x,y ;
        double pi = Math.PI * 2;
        pen.up(); 
        for(double z = 0 ; 100>= z; z++){
            theta = z * ((pi)/100); 
            r = Math.cos(theta *2);
            x= r * Math.cos(theta);
            y = r * Math.sin(theta);
 
            pen.move((x*100), (y*100));
            pen.down();
            
        }
        
        
        
    }
}
