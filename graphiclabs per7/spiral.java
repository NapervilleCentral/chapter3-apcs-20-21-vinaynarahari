import java.awt.*;
import TurtleGraphics.*;
/**
 * Write a description of class sprial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class spiral
{
    public static void main(String[] args)
    {
        
        StandardPen pen = new StandardPen();
        
        for(int x=0 , y =1; 10>=x; x++ ,y++)
        {
            pen.move(10+(5*x));
            pen.turn(90);
            
            pen.setWidth(5);
            
        }
        
        
    }
}
