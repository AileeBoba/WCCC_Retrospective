/*
Gary A. Newsome
CPT 163_27 Java Programming
Westmoreland County Community College
Paul Scarrone
 */
package assignment3_loops;
import java.util.Scanner;
/*
Using a while or a for loop
Create a program that will take a word,
of at least 5 characters
and output the reverse of that word.
 */
public class Assignment3_Loops {
    
    public static void main(String[] args) throws InterruptedException{
        Scanner keyboard = new Scanner(System.in); // Initialize Scanner
        
        // Declarations
        String strContinue;     // To get users input on contine or exit
        char charContinue;      // To hold the first character
        
        // Welcome
        print("This program will accept a word of your choosing,\n"
                + "and output that word in reverse.\n"
                + "For this exercise please use a word 5 (five)\n"
                + "characters or greater. Let's begin.\n\n");
        
        // Start Program
        do{
            print("Please enter your word here: ");
        
        String strWord = keyboard.nextLine();
        
        // Validate input is > 5 characters
        while (strWord.length() < 5){
            print("Please enter a word 5 characters or greater.\n"
                + "Please enter your word here: ");
            
            strWord = keyboard.nextLine();
        } // end while validation
        
        // output
        print("\nDrum roll please............\n\n"
                +"Your word in reverse is: ");
       
        // reverse word
        for (int i = strWord.length() - 1; i >= 0; i--){
            System.out.print(strWord.charAt(i));
            Thread.sleep(150);
        } // end for
        
        // exit
        print("\n\nPlease enter 'Y' to continue, or"
            + " anyother key to exit the program.");
        strContinue = keyboard.nextLine();
        charContinue = strContinue.charAt(0);
        charContinue = Character.toUpperCase(charContinue);
        
        print("\n");
        
        }while (charContinue == 'Y');
        
    } // end main
    
    // print method (no return)
    public static void print(String str){
    System.out.print(str);
    } // end Print Method
    
} // end class Assignment3_Loops
