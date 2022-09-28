package Labs;

import java.util.*;
/**
 * Write a description of class solarSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class solarSystem
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you weigh:");
        double weight = scanner.nextDouble();
        double mass = weight/9.81;
        
        System.out.println("Choose a Planet:\nMer -Mercury\nVen -Venus\nMo -Moon\nEa -Earth\nMa - Mars\nJup -Jupiter\nSat - Saturn\nNep - Neptune\n Ur - Uranus");
        String choice = scanner.nextLine();
        
        
        switch(choice){
            case(choice.equals("Mer")):
                
            }
        }
    }
}
