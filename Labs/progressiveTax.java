import java.util.*;
/**
 * Write a description of class progressiveTax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class progressiveTax
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double preTax = scanner.nextDouble();
        double taxAmount = 0;
        
        double incomeLevel = preTax / 50000;
        if( 50000>= preTax){
            System.out.println("No Tax!");
        }else if( preTax >50000 && 75000>= preTax){
            taxAmount = preTax * .02;
            System.out.println("Tax Amount: " + taxAmount);
        }else if( preTax >75000 && 100000>= preTax){
            taxAmount = preTax * .03;
            System.out.println("Tax Amount: " + taxAmount);
        }else if( preTax >100000 && 250000>= preTax){
            taxAmount = preTax * .04;
            System.out.println("Tax Amount: " + taxAmount);
        }else if( preTax >250000 && 500000>= preTax){
            taxAmount = preTax * .05;
            System.out.println("Tax Amount: " + taxAmount);
        }else if( preTax >500000){
            taxAmount = preTax * .06;
            System.out.println("Tax Amount: " + taxAmount);
        }
    }
}
