package e02;

import java.util.Scanner;

public class SumOfOddDigits
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      String input = in.nextLine();
      
      int sum = 0;
      
      for (int x = 0; x< input.length(); x++){
          int num = Character.getNumericValue(input.charAt(x)); 
          if(input.charAt(x) % 2 == 1){
              sum += num;
          }
      }
          
      // Get the input

      // The sum of odd digits of the input
      //enter Q to stop user enters (10 45 7 123 Q)

         // Only add digit if it is odd

      // Output the result
      
      System.out.print(sum);
   }
}
