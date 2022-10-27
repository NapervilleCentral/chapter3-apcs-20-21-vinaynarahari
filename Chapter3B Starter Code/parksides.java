import java.util.*;
/**
 * Write a description of class parksides here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class parksides
{
    public static void main(String[] args){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the Seed: ");
        Scanner scanner1 = new Scanner(System.in);
        int start = scanner1.nextInt();
        int holder = start;
        String empty = "";
        
        for(int x = rows, y =0, count = 0 ; x>=0 ; y++, x--,count++){
            
            holder = holder + y;
            if (holder>9){
                holder = start; 
                
            }
            
            
            if(count == rows){
                System.out.println();
            }
            
    
            while(x<rows){
                System.out.print(" ");
                x++;
            }
        }

        
        /*
           holder = holder + y;
            if (holder>9){
                holder = start; 
                
            }
            System.out.print(holder + " ");
            newrow = newrow-z;
            while(newrow<rows){
                empty.concat(" ");
                x=1;
            }
         */ 
    }
}
