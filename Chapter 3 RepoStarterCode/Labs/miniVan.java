package Labs;
import java.util.*;

/**
 * Vinay Narahari
 * 9/30/22
 * miniVan
 * This Program reads inputs and tells you whether or not the left or right door is open or not
 * Variable List: gear, lockSet, doorLeft, doorRight, insideLeft, insideRight, outsideLeft,vanSettings
 */
public class miniVan
{
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Minivan Inputs: ");
        String vanSettings = scanner.nextLine();
        int inputLen = vanSettings.length();
        
        String gear = vanSettings.substring(8);
        String lockSet = vanSettings.substring(0,8);
        // creates boolean values and sets them default to false
        boolean doorLeft = false;
        boolean doorRight= false;
        boolean insideLeft= false;
        boolean insideRight= false;
        boolean outsideLeft= false;
        boolean outsideRight = false;
        // checks if van is in park
        if(vanSettings.substring(8).equals("P")){
            //checks if masterlock is activated 
            if(lockSet.charAt(3) == '1'){
            // checks if child lock is on
                if(lockSet.charAt(2) == '0'){
                    if(lockSet.charAt(4) == '1'){
                        insideLeft = true;
                    }
                    if(lockSet.charAt(5) == '1'){
                        insideRight = true;
                    }
                }else{
                    insideLeft = false;
                    insideRight = false;
                }
                    // sets values to true if left and right door are open and master lock is activated
                if(lockSet.charAt(0) == '1'){
                        doorLeft = true;
                    }
                if(lockSet.charAt(1) == '1'){
                        doorRight = true;
                    }// statements check outside doors are activated or not
                if(lockSet.charAt(6) == '1'){
                        outsideLeft = true;
                    }
                if(lockSet.charAt(7) == '1'){
                        outsideRight = true;
                    }
            }else{
                doorLeft = false;
                doorRight = false;
                outsideLeft = false;
                outsideRight = false;
            }
            
        }else{
            System.out.println("Left door is closed");
            System.out.println("Right door is closed");
        }
        if((doorLeft== true|| insideLeft == true ||outsideLeft == true)){
            System.out.println("Left door is open");
        }else System.out.println("Left door is closed");
        
        if((doorRight== true|| insideRight == true ||outsideRight == true)){
            System.out.println("Right door is open");
        }else System.out.println("Right door is closed");
        
        
    }
}
