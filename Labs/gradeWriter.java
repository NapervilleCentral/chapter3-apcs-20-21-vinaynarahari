import java.util.*;
/**
 * Write a description of class gradeWriter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gradeWriter
{
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("What is your letter grade? ");
      
      String letterGrade = scanner.nextLine();
      double gradeNum;
      double gradeNum1;
      if (letterGrade.indexOf("A") == 0){
          gradeNum = 4;
          System.out.println(gradeNum);
      }else if (letterGrade.indexOf("B") == 0){
          gradeNum = 4;
          System.out.println(gradeNum);
      }else if (letterGrade.indexOf("C") == 0){
          gradeNum = 4;
          System.out.println(gradeNum);
      }else if (letterGrade.indexOf("D") == 0){
          gradeNum = 4;
          System.out.println(gradeNum);
      }else if (letterGrade.indexOf("F") == 0){
          gradeNum = 4;
          System.out.println(gradeNum);
      }
      
      if (letterGrade.indexOf("+") == 1 && letterGrade.indexOf("A") != 0){
        
      }
      
  }
}
