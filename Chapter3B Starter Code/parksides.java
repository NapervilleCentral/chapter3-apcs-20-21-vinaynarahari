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
        
        for(int x = rows,count = 2 ; x>=0 ; x--,count++){
            
            System.out.println();
            int z =x;
            while(z<rows){
                System.out.print("  ");
                z++;
            }
            int t = x-1;
            int initrowvalue =0;
            int tempvar = x-1;
            for(int y = 0 ; t>= 0 ;t--,y++,tempvar++){
                
                holder = holder + y;
                if(y==0){
                    initrowvalue = holder;
                }
                while(tempvar<(rows-1)){
                    y++;
                    tempvar++;
                }
                if(holder>9){
                    holder = holder%9;
                }
            
                
                System.out.print(" " + holder);
            }
            holder = initrowvalue + count;
            if(holder>9){
                    holder = holder-9;
                }
            
            
        }

    }
}
