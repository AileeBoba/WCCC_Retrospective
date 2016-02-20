/*
Gary A. Newsome
CPT_163_27 Java Programming
Westmoreland County Community College
Paul Scarrone
Assignment 2 - Conditional Statement
*/
package javaapplication6;
import java.util.Scanner; // Import Scanner utility
/*
Write a conditional structure to emulate a text based menu.
The menu must have 5 items, as well as a Exit / Quit option. Menu should
also have the option to run the ASCII word counter from lesson 1.
 */
public class JavaApplication6 {

    public static void main(String[] args) {
        // Create Scanner
            Scanner keyboard = new Scanner(System.in);
        // Declarations
            int intMenuSelect; // Menu selection
          
            char charG = 'G';
            char charA = 'A';
            char charR = 'R';
            char charY = 'Y';
            int intG = (int)charG;
            int intA = (int)charA;
            int intR = (int)charR;
            int intY = (int)charY;

            char charP = 'P';
           // char charA = 'A'; // Already declared, (left for readability)
            char charU = 'U';
            char charL = 'L';
            int intP = (int)charP;
            //int intA = (int)charA; // Already declared
            int intU = (int)charU;
            int intL = (int)charL;
           
        // Menu
        System.out.println("Greetings, welcome to the Assignment 2");
        System.out.println(" conditional statement menu program.\n\n");
        System.out.println("Please choose from one of the options listed below:");
        System.out.println("---------------------------------------------------");
        System.out.println("1.) Run the default ASCII word counting program from");
        System.out.println("\tweek 1. This will give you the value of the word 'Gary'");
        System.out.println("2.) Run the alternate ASCII word counting program.");
        System.out.println("\tThis alternate will give you the value of the word 'Paul'");
        System.out.println("3.) To be determined, or that is my best guess.");
        System.out.println("4.) Super top secret.");
        System.out.println("5.) Contact the programmer.");
        System.out.println("\nPress 0 (zero) to exit.");
        
        System.out.print("\nPlease enter your selection: ");
        intMenuSelect = keyboard.nextInt();
        
        System.out.println("\n\n"); // blank lines for spacing
        
        // Menu selection structure
        
        switch (intMenuSelect){
            case 0:
                System.out.println("Thank you, have a pleasant day.");
                break;
            case 1:
                System.out.println("You have selected choice 1:\n");
                System.out.println("The ASCII number for the character " + charG + " is " + intG + ".");
                System.out.println("The ASCII number for the character " + charA + " is " + intA + ".");
                System.out.println("The ASCII number for the character " + charR + " is " + intR + ".");
                System.out.println("The ASCII number for the character " + charY + " is " + intY + ".");
                System.out.println("\nThe grand total of these ASCII numbers is " + (charG + charA + charR + charY) + ".");
                break;
            case 2:
                System.out.println("You have selected choice 2:\n");
                System.out.println("The ASCII number for the character " + charP + " is " + intP + ".");
                System.out.println("The ASCII number for the character " + charA + " is " + intA + ".");
                System.out.println("The ASCII number for the character " + charU + " is " + intU + ".");
                System.out.println("The ASCII number for the character " + charL + " is " + intL + ".");
                System.out.println("\nThe grand total of these ASCII numbers is " + (charP + charA + charU + charL) + ".");
                break;
            case 3:
                System.out.println("You have selected choice 3:\n");
                System.out.println("To be determined.\n\t...smells fishy to me...");
                break;
            case 4:
                System.out.println("You have selected choice 4:\n");
                System.out.println("Excuse me, I said this was super top secret.\n\tNow go away,\n\t\tplease.");
                break;
            case 5:
                System.out.println("You have selected choice 5:\n");
                System.out.println("Gary A. Newsome can be reached at:");
                System.out.println("newsomeg@my.wccc.edu");
                System.out.println("or on GitHub @ garyanewsome");
                break;
            default:
                System.out.println("Please enter a menu option 1-5,\nor enter 0 (zero) to exit");
                                    
            } // end switch
        
        } // end main
    } // end app
    

