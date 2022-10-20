import java.util.*;
/**
 * Write a description of class palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class palindrome
{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter The Word: ");
       String word = scanner.nextLine();
       int y = 0;
       for(int x = 0; (word.length()-1) > x; x++){
           if(word.charAt(" ") != word.length()){
               
           }
           if(word.charAt(x)==word.charAt(word.length()-(x+1))){
               y++;
           }
       }
       if(y == (word.length()-1)){
           System.out.println("Word is a Palindrome!");
       }else
           System.out.println("Word is not a Palindrome!");
           
    
    
    }
}
