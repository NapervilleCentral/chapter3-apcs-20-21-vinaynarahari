package Labs;
import java.util.*;
import java.text.*;
/**
 * Vinay Narahari
 * 9/30/22
 * solarSystem
 * This Program tells you what your weight in different planets is
 * Variable List: weight, planet, newWeight, mass, choice
 */
public class solarSystem
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you weigh (in pounds):");
        double weight = scanner.nextDouble();
        
        System.out.println("Choose a Planet:\nMer -Mercury\nVen -Venus\nMo -Moon\nEa -Earth\nMa - Mars\nJup -Jupiter\nSat - Saturn\nNep - Neptune\nUr - Uranus");
        Scanner planetChoice = new Scanner(System.in);
        String choice = planetChoice.nextLine();
        double mass = weight/9.807;
        String planet = " ";
        double newWeight  = 0;
        DecimalFormat format = new DecimalFormat("0.##");
        
        switch(choice){
            case"Mer" :
                newWeight = mass * 3.7;
                planet = "Mercury";
                break;
            case"Ven" :
                newWeight = mass * 8.87;
                planet = "Venus";
                break;
            case"Mo" :
                newWeight = mass * 1.62;
                planet = "Moon";
                break;
            case"Ea" :
                newWeight = mass * 9.807;
                planet = "Earth";
                break;
            case"Ma" :
                newWeight = mass * 3.721;
                planet = "Mars";
                break;
            case"Jup" :
                newWeight = mass * 24.72;
                planet = "Jupiter";
                break;
            case"Sat" :
                newWeight = mass * 10.44;
                planet = "Saturn";
                break;
            case"Nep" :
                newWeight = mass * 11.15;
                planet = "Neptune";
                break;
            case"Ur" :
                newWeight = mass * 8.87;
                planet = "Uranus";
                break;
            default:
                System.out.println("Wrong Input!");
            }
            System.out.println("Your Weight in " + planet +"is " + format.format(newWeight)); 
            
        }
}
