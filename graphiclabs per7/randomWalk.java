import java.awt.*;
import java.util.*;
import TurtleGraphics.*;
/**
 * Write a description of class random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class randomWalk
{
    public static void main(String[] args){
        Random random = new Random();
        StandardPen pen = new StandardPen();
        
        for ( int x = 0; x<=10000; x++){
            int choice = random.nextInt(4);
            pen.move(10);
            pen.turn((choice *90) + 90);
            
        }
    }
}
