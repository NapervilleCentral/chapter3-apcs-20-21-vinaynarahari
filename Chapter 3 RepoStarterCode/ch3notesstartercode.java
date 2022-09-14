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
      /*      
        Scanner keyboard = new Scanner(System.in);
        int x = 5;
        System.out.println("How old are you?");
                                                                            ;
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
           
        */        
/*
        String word1 = "apple";
        String word2 = "cat";
        String word3 = "dog";

        if(word2.compareTo(word1)<0)//;end a statement BAD BAD simicolen  // if char comes before you get negative results , if it is equals it gives you 0 and if its greater it gives a number greater than 1
        {
            System.out.println(word2 +" is before " + word1  );
            System.out.println("and cats are evil" );
        }//ctrl M - will match brackets
        else
        System.out.println(word1 +" is before " + word2  );

        if(word2.compareTo(word3)<0)
            System.out.println(word2 +" is before " + word3  );
    /*
       Scanner Keyboard = new Scanner(System.in);
       
      
       System.out.print ("Enter a number ");
       int num = Keyboard.nextInt();
    
       System.out.print ("Enter a  second number ");
       int num1 = Keyboard.nextInt();

       System.out.print ("Enter a  third number ");
       int num2 = Keyboard.nextInt();
        if (num > num1){
            if(num> num2){
                System.out.println(num + " is the highest number!");
            }
        }
        else if (num1 > num){
            if(num1> num2){
                System.out.println(num1 + " is the highest number!");
            }
        }
        else(num2 != num1){
                System.out.println(num2 + " is the highest number!");
        }

      
*/
// system below is short circuiting 
       // boolean a = false, b = false,c = false,d;
        //System.out.println(a  );
        //c =(a = true) || (b = true);
        //System.out.println(a + "-" + b + "-" + c);


     //  c = (a = false) || (b = true);
       // System.out.println(a + "-" + b+ "-" + c);
    // basically && makes it so that all statements have to be true wheras || makes it so that only one of the statements have to be true
    //c =(a = false) && (b = true);
    //System.out.println(a + "-" + b+ "-" + c);
   //  c = (a = true) && (b = false);
    // System.out.println(a + "-" + b + "-" + c);
    // not is done first and then the rest happens (order ! , || , &&)
    /* code below explanation
     * (does not - true = false )- basically opposite (true or true = true) and the it will be (false or true which will always be true) - all of them are true as a result
    */
    //d =!(a = true) || (b = true) && (c = true);
    //System.out.println(a + "-" + b + "-" + c+ "-" + d);


/*  */
/* misc notes
    extended if are like or operator
    nested if is like and operator 
    compare to is like putting things in order 
    semi colon ends the statement 
    ending if statment before bracket is syntatically correct
    short cirucitng- is when any statement ( only one) you odnt need to ask or need the others
*/
   // below is how to do proper float checking 
    double wallet = 1* .01 + 2 * .05 + 3 * .10 + 4 * .25;
    final double toleranceLevel = 0.01;
    if  (Math.abs(wallet - 1.41) < toleranceLevel)
    {
        System.out.println("Correct");
    }else
    {
        System.out.println(wallet);
        System.out.println("Add good?");
    }
    }// end of main


}// end of class









