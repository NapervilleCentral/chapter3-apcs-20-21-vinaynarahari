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
        
        for(int x =rows, y =0;x >= 0;x--, y++){
            
            holder = holder + y;
            if (holder>9){
                holder = start; 
                
            }
            System.out.print(holder + " ");
            
        }
        
        for(int k =rows-1, i =0 ; k!=0; k--){
            System.out.println();
            while(k<rows){
                System.out.print(" ");
                int z = k;
                z++;
            }
            holder = holder + i;
            if (holder>9){
                holder = start; 
                
            }
            System.out.print(holder + " ");
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
