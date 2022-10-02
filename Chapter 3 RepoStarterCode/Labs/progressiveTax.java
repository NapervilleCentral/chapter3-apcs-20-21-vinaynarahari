package Labs;

import java.util.*;
/**
 * Vinay Narahari
 * 9/30/22
 * progressiveTax
 * Prints the tax levels at different incomes
 * Variable List: preTax , taxAmount
 */
public class progressiveTax
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Income");
        double preTax = scanner.nextDouble();
        double taxAmount = 0;
        // progressive tax for each of the tax brackets and gets the tax amount if it for each range(prints it as well)
    
        if( 50000>= preTax){
            taxAmount = preTax * .01;
            System.out.println("Tax Amount: " + (taxAmount));
        }else if( preTax >50000 && 75000>= preTax){
            taxAmount = (preTax -50000) * .02;
            System.out.println("Tax Amount: " + (taxAmount + 500));
        }else if( preTax >75000 && 100000>= preTax){
            taxAmount = (preTax -75000) * .03;
            System.out.println("Tax Amount: " + (taxAmount + 1000));
        }else if( preTax >100000 && 250000>= preTax){
            taxAmount = (preTax -100000) * .04;
            System.out.println("Tax Amount: " + (taxAmount + 1750));
        }else if( preTax >250000 && 500000>= preTax){
            taxAmount = (preTax -250000)  * .05;
            System.out.println("Tax Amount: " + (taxAmount + 7750));
        }else if( preTax >500000){
            taxAmount = (preTax -500000)  * .06;
            System.out.println("Tax Amount: " + (taxAmount + 20250));
        }
    }
}
