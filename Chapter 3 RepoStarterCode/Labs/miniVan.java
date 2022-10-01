package Labs;
import java.util.*;

/**
 * Write a description of class MiniVan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class miniVan
{
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Minivan Inputs: ");
        String vanSettings = scanner.nextLine();
        
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
            // checks if child lock is on
            if(lockSet.charAt(2) == '1'){
                insideLeft = false;
                insideRight = false;
            }/*checks if child lock is off and sees if inside doors are activated*/else if(lockSet.charAt(2) == '0'){
                if(lockSet.charAt(4) == '1'){
                    insideLeft = true;
                }
                if(lockSet.charAt(5) == '1'){
                    insideRight = true;
                }
            }
            //checks if masterlock is activated 
            if(lockSet.charAt(3) == '0'){ 
                doorLeft = false;
                doorRight =true;
            }else if(lockSet.charAt(3) == '1'){
                // sets values to true if lef tand right door are open and master lokc is acitvated
                if(lockSet.charAt(0) == '1'){
                    doorLeft = true;
                }
                if(lockSet.charAt(1) == '1'){
                    doorRight = true;
                }
            }
            // statements check outside doors are activated or not
            if(lockSet.charAt(6) == '1'){
                outsideLeft = true;
            }else{
                outsideLeft = false;
            }
            if(lockSet.charAt(7) == '1'){
                outsideRight = true;
            }else{
                outsideRight = true;
            }
        }
        if(vanSettings.substring(8).equals("R")){
            doorLeft= false;
            doorRight= false;
            insideLeft= false;
            insideRight= false;
            outsideLeft= false;
            outsideRight = false;
        }
        // statements below print out if doors are open or not
        if((doorLeft== true|| insideLeft == true ||outsideLeft == true)){
            System.out.println("Left door is open");
        }else{
            System.out.println("Left door is closed");
        }
        if((doorRight== true|| insideRight == true ||outsideRight == true)){
            System.out.println("Right door is open");
        }else{
            System.out.println("Right door is closed");
        }
    }
}
