
/**
 * Write a description of class lol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lol
{
    public static void main(String[] args){
        
      String word = "awwaggwas";
      String newWord ="";
      for (int x = 0; (word.length()-1) > x; x++)
      {
          if(word.indexOf("g") == x){
              newWord = word.substring(0,x) + word.substring(x+1,word.length());
          }
        
      }
      System.out.println(newWord);
        
    
    }
}
