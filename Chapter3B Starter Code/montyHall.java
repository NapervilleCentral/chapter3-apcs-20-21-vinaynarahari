import java.util.*;
/**
 * Write a description of class montyHall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class montyHall
{
    public static void main(String[] args){
        
        Random random = new Random();
  
        int h  = 0 , g = 0 , j =0; //creating arbritrary values to add later
        // if they choose to win 
        for(int x = 0; 1000>=x ; x++){
            int y = random.nextInt(3) + 1;  // user
            int c = random.nextInt(3) + 1;  // right door
            
            if(y == c){
                g++;
            }else 
                h++;
            
        }
        System.out.println("Win "+ h);
        System.out.println("loss " + g);
        
        g =0;
        h =0;
        // if they choose to not switch
        for( int i = 0; 1000>=i; i++){
            int y = random.nextInt(3) + 1;  // user
            int c = random.nextInt(3) + 1;  // right door
            if( y ==c){
                h++;
            }else
                g++;
        }
        System.out.println("Win "+ h);
        System.out.println("loss " + g);
        
    }
}
