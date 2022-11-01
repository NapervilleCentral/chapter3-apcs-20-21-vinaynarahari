import java.util.*;
/**
 * Vinay Narahari
 * 10/31/22
 * This Program produces parksides other triangle
 *Variable List: rows, start , holder, z, x, x2,y, initRowValue, counter
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
        // for loop runs for the triangle to be verically complete (so it can have the desired amount of rows)
        for(int x = rows,count = 2 ; x>=0 ; x--,count++){
            //makes it so that it starts at a new line for each row
            System.out.println();
            
            int z =x, x2 = x-1, initRowValue =0, counter = x-1;
            /*while loop leverages a placeholder value of z( which is equal to x) and prints the spaces at the front of the row in accordance to how many rows have
            gone by since the first row (double spaces for formatting)*/
            while(z<rows){
                System.out.print("  ");
                z++;
            }
            // for loop to print out numbers in each row
            for(int y = 0 ; x2>= 0 ;x2--,y++){
                
                holder = holder + y;
                //if statement sets the beginning value of each row to a variable so that it can be incremented 
                if(y==0){
                    initRowValue = holder;
                }
                // while loop increases the starting increment as you go farther and farther away from the initial row 
                while(counter<(rows-1)){
                    y++;
                    counter++;
                }
                /* if statement checks ot see if holder is greater than 9 and proceeds to then use modulus and since mod of 9 would be 0 there is another 
                 * if statement to increase holder to 1 when mod 9 occurs  */
                if(holder>9){
                    if(holder%9 == 0)
                        holder = (holder%9)+1;
                    else
                        holder = holder%9;
                }
            
                
                System.out.print(" " + holder);
            }
            // sets holder to the inital row value and adds it with an overall counter to get the start value of each row
            holder = initRowValue + count;
            //if statement checks to see if holder is greater than 9 and then subtracts that value by 9 to get the desired value 
            if(holder>9){
                    holder = holder-9;
                }
            
            
        }

    }
}
