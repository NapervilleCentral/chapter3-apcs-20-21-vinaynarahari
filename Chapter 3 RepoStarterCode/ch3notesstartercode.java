/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;


public class ch3notesstartercode
{
public static void main (String [] args)
{
            
        Scanner keyboard = new Scanner(System.in);
        int x ;
        System.out.println("How old are you?");
        x= keyboard.nextInt();
        // for extended ifs order is IMPORTANT
        if(x<55)// this if statment must be resolved as a boolean // if you only have one statement you dont need ot tab but you should do that
            {
                System.out.println // all of this is considered one line - dettermined by semi colon 
                ("you are younger than Mr. hayes, and more likely ot be better looking than him also"); // blujay doesnt like a return
                // statements below will not print because its going to find the first true statement and then skip everything else 
            }if (x<20)
            {
                if(x>18)
                {
                    System.out.println("Your in College");
                }
                if(x>13)
                {
                    System.out.println("Your in High School");
                }
                if(x<10){
                    System.out.println("What Grade School are you in?");
                    keyboard.nextLine(); // clears input buffer
                    String school = keyboard.nextLine();
                    if (school.equals("Steeple Run") )
                    {
                        System.out.println("You are not a star");
                    }
                    if(school.equals("Scott"))
                    {
                        System.out.println("Go Eagles!!");
                
                    }
                }
                if(x>0)
                {
                    System.out.println("Your Alive!");
                }
            }
           
        
/**/
        String word1 = "apple";
        String word2 = "cat";
        String word3 = "dog";

        if(word2.compareTo(word1)<0)//;end a statement BAD BAD simicolen
        {
            System.out.println(word2 +" is before " + word1  );
            System.out.println("and cats are evil" );
        }//ctrl M - will match brackets
        else
        System.out.println(word1 +" is before " + word2  );

        if(word2.compareTo(word3)<0)
            System.out.println(word2 +" is before " + word3  );
    /*

      int num = 5, num1 =10, num2 = 4;  // standard hours in a work week

      System.out.print ("Enter a number ");
      num = Keyboard.nextInt();

       System.out.print ("Enter a  second number ");
       num1 = Keyboard.nextInt();

       System.out.print ("Enter a  third number ");
       num2 = Keyboard.nextInt();

      System.out.println ();
/*

       boolean a = true, b = false, c = false,d;
        //System.out.println(a  );
      // c =(a = true) || (b = true);
      // System.out.println(a + "-" + b + "-" + c);


    //   c = (a = false) || (b = true);
    //   System.out.println(a + "-" + b+ "-" + c);

//     c =(a = false) && (b = true);
 //    System.out.print(a + "-" + b+ "-" + c);
//
//     c = (a = true) && (b = false);
//     System.out.print(a + "-" + b + "-" + c);

//     d =!(a = true) || (b = true) && (c = true);
//     System.out.print(a + "-" + b + "-" + c+ "-" + d);


/*  */

    }// end of main


}// end of class









