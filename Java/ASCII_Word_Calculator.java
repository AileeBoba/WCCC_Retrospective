/*
Gary A. Newsome
CPT 163 Java Programming
Westmoreland County Community College
Paul Scarrone
 */
package ascii_word_calculator;
import java.util.Scanner; 
/*
In class assignment 09.09.15
Creating a loop within the ASCII program
 */
public class ASCII_Word_Calculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Introduction and User Input
        System.out.println("Please enter a word, and out system");
        System.out.println("will return the ASCII value of your word.\n");
        System.out.print("Enter your word here: ");
        
        String strWord = keyboard.nextLine();
        
        int intCount = strWord.length();
        int intTotal = 0;
        
        // for(int i = 0; i < strWord.length();i++) Paul's method using string.length
        for (int x = 0; x < intCount; x++){
            int intChar = strWord.charAt(x);
            intTotal += intChar;
            // intTotal += stWord.CharAt(i);
        } // end for
        
        // output
        System.out.println("Your ASCII total for the word \n" +
                strWord + " is: " + intTotal);
                
    } // end main
} // end app
