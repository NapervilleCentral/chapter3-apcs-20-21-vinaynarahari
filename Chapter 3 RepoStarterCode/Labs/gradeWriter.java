package Labs;

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
      double gradeNum = 0;
      double gradeNum1;
      if (letterGrade.indexOf("A") == 0){
          gradeNum = 4;
      }else if (letterGrade.indexOf("B") == 0){
          gradeNum = 3;
      }else if (letterGrade.indexOf("C") == 0){
          gradeNum = 2;
      }else if (letterGrade.indexOf("D") == 0){
          gradeNum = 1;
      }else if (letterGrade.indexOf("F") == 0){
          gradeNum = 0;
      }
      
      if(letterGrade.indexOf("-") == 1){
          if ( letterGrade.indexOf("-") == 1 && letterGrade.indexOf("F") != 0){
              gradeNum-=.3;
          }else{
              System.out.println(gradeNum);
          }
      }
      if(letterGrade.indexOf("+") == 1){
          if (letterGrade.indexOf("+") == 1 && letterGrade.indexOf("A") != 0 || letterGrade.indexOf("+") == 1 && letterGrade.indexOf("F") != 0){
              gradeNum +=.3;
          }
          else{
              System.out.println(gradeNum);
          }
      }
      System.out.println("Your Grade is: " + gradeNum);
  }
      
      /*
      if (letterGrade.indexOf("+") == 1 && letterGrade.indexOf("A") != 0 || letterGrade.indexOf("+") == 1 && letterGrade.indexOf("F") != 0){
          System.out.println(gradeNum);
      }
      if (letterGrade.indexOf("+") == 1){
          gradeNum+=.3;
      }
      if ( letterGrade.indexOf("-") == 1 && letterGrade.indexOf("F") != 0){
          System.out.println(gradeNum);
      }
      if (letterGrade.indexOf("-") == 1){
          gradeNum-=.3;
      }
      */
}

