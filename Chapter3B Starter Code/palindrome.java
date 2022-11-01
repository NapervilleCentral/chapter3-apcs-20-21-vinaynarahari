import java.util.*;
/**
 * Vinay Narahari
 * 10/31/22
 * This Program checks to see if user input is a palindrome or not
 *Variable List: y, x, word, newword
 */
public class palindrome
{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter The Word: ");
       String word = scanner.nextLine();
       int y = 0;
       String newword = " ";
       
       for(int x = 0; (word.length()-1) > x; x++){
           newword = word;
           // if statement removes the spaces in the user entered phrase
           if(newword.indexOf(" ") == x){
               newword = word.substring(0,x) + word.substring(x+1, word.length());
           }
           
            /* if statement checks to see if the char at index x is the same
               as the char at the index of the length -1 (full length of the
               word) - x */
           if(newword.charAt(x) == newword.charAt((newword.length()-1) - x)){
               y++;
           }
       }
       // if statement checks to see if the counter y is equal to the length of the user entry
       if(y == (newword.length()-1)){
           System.out.println("Word is a Palindrome!");
       }else
           System.out.println("Word is not a Palindrome!");
           
    
    
    }
}
