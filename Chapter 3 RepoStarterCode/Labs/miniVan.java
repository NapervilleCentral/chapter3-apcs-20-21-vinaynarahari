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
        
        boolean doorLeft = false;
        boolean doorRight= false;
        boolean insideLeft= false;
        boolean insideRight= false;
        boolean outsideLeft= false;
        boolean outsideRight = false;
        
        if(vanSettings.substring(8).equals("P")){
            if(lockSet.charAt(2) == '1'){
                insideLeft = false;
                insideRight = false;
            }else if(lockSet.charAt(2) == '0'){
                if(lockSet.charAt(4) == '1'){
                    insideLeft = true;
                }
                if(lockSet.charAt(5) == '1'){
                    insideRight = true;
                }
            }
            if(lockSet.charAt(3) == '0'){
                doorLeft = false;
                doorRight =true;
            }else if(lockSet.charAt(3) == '1'){
                if(lockSet.charAt(0) == '1'){
                    doorLeft = true;
                }
                if(lockSet.charAt(1) == '1'){
                    doorRight = true;
                }
            }
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
