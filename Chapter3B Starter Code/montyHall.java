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
  
        int h  = 0 , g = 0 , j =0;
        
        for(int x = 0; 1000>=x ; x++){
            int y = random.nextInt(3) + 1;  // user
            int c = random.nextInt(3) + 1;  // right door
            
            if(y == c){
                g++;
            }else if ( y==2){
                h++;
            }else if( y ==3){
                j++;
            }
            
        }
        System.out.println(g);
        System.out.println(h+j);
    }
}
