package Labs;
import java.util.*;

/**
 * Write a description of class triangleCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class triangleCheck
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to enter Sides (S) or Angles (A)?");
        String triType = scanner.nextLine();
        // this algo sees if user wanted to enter in angles and asks for three diffrent angles
        if(triType.indexOf("A") == 0){
            System.out.println("Enter First Angle: ");
            int angle1 = scanner.nextInt();
            System.out.println("Enter Second Angle: ");
            int angle2 = scanner.nextInt();
            System.out.println("Enter Third Angle: ");
            int angle3 = scanner.nextInt();
            // sees this algo sees if angles are going ot be a triangle (equal to 180)
            if(180 == (angle1+angle2+angle3)){
                // checks to see if there any negative angles or if any angle is 0 
                if(angle1 > 0 && angle2 > 0 && angle3 > 0){
                    /* if statements below checks to see if angles are 90 or equal or if 
                     * they are just equal to 180 for their respecitve outputs*/
                    if(angle1 == 90||angle2 == 90||angle3 == 90){
                        System.out.println("Right Triangle");
                    }if (angle1==angle2 && angle2==angle3){
                        System.out.println("Equilateral Triangle");
                    }if(angle1 == angle2 && angle1 != angle3 || angle2==angle3 && angle3 != angle1){
                        System.out.println("Isoceles Triangle");
                    }else{
                        System.out.println("This is a triangle");
                    }
                }else{
                    System.out.println("Not a Triangle");
                }
            }else{
                System.out.println("Not a Triangle");
            }
            // if statemnt below checks to see if input is side
        }if(triType.indexOf("S") == 0){
        
            System.out.println("Enter First Side: ");
            int side1 = scanner.nextInt();
            System.out.println("Enter Second Side: ");
            int side2 = scanner.nextInt();
            System.out.println("Enter Third Side: ");
            int side3 = scanner.nextInt();
            
            if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
                if(side1 == side2 || side2 == side3){
                    System.out.println("Isoceles Triangle");
                }if(Math.pow(side1,2) + Math.pow(side2,2) == Math.pow(side3,2) ||Math.pow(side2,2) + Math.pow(side3,2) == Math.pow(side1,2) || Math.pow(side3,2) + Math.pow(side1,2) == Math.pow(side2,2)){
                    System.out.println("Right triangle");
                }if(side1 == side2&& side2 == side3){
                    System.out.println("Equilateral Triangle");
                }
            }else{
                System.out.println("Not a Triangle");
            }
        }
    }
}   
