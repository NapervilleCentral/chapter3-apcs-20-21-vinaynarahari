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
        System.out.println("How much do you weigh (in pounds):");
        double weight = scanner.nextDouble();
        
        System.out.println("Choose a Planet:\nMer -Mercury\nVen -Venus\nMo -Moon\nEa -Earth\nMa - Mars\nJup -Jupiter\nSat - Saturn\nNep - Neptune\nUr - Uranus");
        Scanner planetChoice = new Scanner(System.in);
        String planet = planetChoice.nextLine();
        double mass = weight/9.807;
        double newWeight = 0;
        
        
        switch(planet){
            case"Mer" :
                newWeight = mass * 3.7;
                System.out.println("Your mass on Mercury would be " + newWeight);
                break;
            case"Ven" :
                newWeight = mass * 8.87;
                System.out.println("Your mass on Venus would be " + newWeight);
                break;
            case"Mo" :
                newWeight = mass * 1.62;
                
                System.out.println("Your mass on the Moon would be " + newWeight);
                break;
            case"Ea" :
                newWeight = mass * 9.807;
                System.out.println("Your mass on Earth would be " + newWeight);
                break;
            case"Ma" :
                newWeight = mass * 3.721;
                System.out.println("Your mass on Mars would be " + newWeight);
                break;
            case"Jup" :
                newWeight = mass * 24.72;
                System.out.println("Your mass on Jupiter would be " + newWeight);
                break;
            case"Sat" :
                newWeight = mass * 10.44;
                System.out.println("Your mass on Saturn would be " + newWeight);
                break;
            case"Nep" :
                newWeight = mass * 11.15;
                System.out.println("Your mass on Neptune would be " + newWeight);
                break;
            case"Ur" :
                newWeight = mass * 8.87;
                System.out.println("Your mass on Uranus would be " + newWeight);
                break;
            default:
                System.out.println("Wrong Input!");
            
                
            }
            
            
        }
}
