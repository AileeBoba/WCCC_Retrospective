/*
Gary A. Newsome
CPT 163_27 Java Programming 1
Westmoreland County Community College
Paul Scarrone
 */
package gan_assignment4_methods;
import java.util.Scanner; // Import Scanner utility

/**
 * Convert Assignment 2 Conditional Statement Menu
 * to a menu using methods
 * @author Gary A. Newsome
 */
public class GAN_Assignment4_Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Create Scanner
            Scanner keyboard = new Scanner(System.in);
        // Declarations
            int intMenuSelect; // Menu selection
        
        do{    
        // Menu
        println("Greetings, welcome to the menu\n"
            + "Please choose from one of the options listed below:\n"
            + "--------------------------------------------------\n"
            + "1.) Run the default ASCII word counting program from\n"
            + "\tweek 1. This will give you the value of the word 'Gary'\n"
            + "2.) Run the alternate ASCII word counting program\n"
            + "\tThis alternate will give you the value of\n"
            + "\ta word of your choosing\n"
            + "3.) Say 'Hi!'.\n"
            + "4.) Super top secret.\n"
            + "5.) Contact the programmer.\n"
            + "\nPress 0 (zero) to exit.");
        
        print("\nPlease enter your selection: ");
        intMenuSelect = keyboard.nextInt();
        
        if (intMenuSelect > 5){
            println("Invalid entry, please select a menu option\n"
                    + "between 1 and 5, or press 0 (zero) to exit.");
            print("Menu choice: ");
            intMenuSelect = keyboard.nextInt();
        } // end if validation
        
        println("\n\n"); // blank lines for spacing
        
        // Menu selection structure
        switch (intMenuSelect){
            case 0:
                System.out.println("Thank you, have a pleasant day.");
                break;
            case 1:
                asciiGary();
                break;
            case 2:
                asciiCalc();
                break;
            case 3:
                sayHi();
                break;
            case 4:
                superTopSecret();
                break;
            case 5:
                contactGAN();
                break;
        } // end switch  
        
        println(""); // spacing
        
        }while (intMenuSelect != 0); // end do-while
    } // end main
    
    /**
     * print method
     * replaces System.out.print() with print
     * @param str accepts a string and prints it to the console
     * without a CR return
     */
    public static void print(String str){
    System.out.print(str);
    } // end Print Method
    
    /**
     * println method
     * replaces System.out.print() with println
     * @param str accepts a string and prints it to the console
     * with a CR return
     */
    public static void println(String str){
    System.out.println(str);
    } // end Print Method
    
    /**
     * method calculates the ASCII value of the word Gary
     */
    public static void asciiGary(){
        char charG = 'G';
        char charA = 'A';
        char charR = 'R';
        char charY = 'Y';
        int intG = (int)charG;
        int intA = (int)charA;
        int intR = (int)charR;
        int intY = (int)charY;
    
        println("You have selected choice 1:\n"
            + "The ASCII number for the character " + charG + " is "
                + intG + ".\n"
            + "The ASCII number for the character " + charA + " is "
                + intA + ".\n"
            + "The ASCII number for the character " + charR + " is "
                + intR + ".\n"
            + "The ASCII number for the character " + charY + " is "
                + intY + ".\n"
            + "\nThe grand total of these ASCII numbers is "
                + (charG + charA + charR + charY) + ".");
    } // end asciiGary
    
    /**
     * method calculates the ASCII value for a user defined String
     */
    public static void asciiCalc(){
        Scanner keyboard = new Scanner(System.in);
        // Introduction and User Input
        println("Please enter a word, and out system"
            + "will return the ASCII value of your word.\n"
            + "Enter your word here: ");
        
        String strWord = keyboard.nextLine();
        
        int intCount = strWord.length();
        int intTotal = 0;
        
        for (int x = 0; x < intCount; x++){
            int intChar = strWord.charAt(x);
            intTotal += intChar;
        } // end for
        
        // output
        System.out.println("Your ASCII total for the word \n" +
                strWord + " is: " + intTotal);
    } // end asciiCalc
    
    /**
     * method returns the word "Hi!"
     */
        public static void sayHi(){
        println("Hi!");
    } // end sayHi
        
    /**
     * method informs the user to go away
     */
        public static void superTopSecret(){
            println("You have selected choice 4:\n"
                + "Excuse me, I said this was super top secret.\n"
                + "\tNow go away,\n\t\tplease.");
        } // end superTopSecret
    
    /**
     * method displays contact information of the programmer
     */
        public static void contactGAN(){
            println ("You have selected choice 5:\n"
                + "Gary A. Newsome can be reached at: "
                + "newsomeg@my.wccc.edu\n"
                + "or on GitHub @ garyanewsome");
        } // end contactGAN
        
        
    
    
}
