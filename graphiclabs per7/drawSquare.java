import TurtleGraphics.*;
import java.awt.*;
/**
 * Write a description of class drawSquare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class drawSquare
{
    public static void main(String[] args)
    {
        StandardPen pen = new StandardPen();  
        Color newColor = new Color(128.0.128);
        pen.move(100);
        pen.setColor(Color.red);
        pen.setWidth(100);
        pen.turn(90);
        pen.move(50);
        pen.turn(-90);
        pen.move(100);
        pen.turn(90);
        pen.move(50);
        pen.setColor(newColor); 
    }
    
}
