/*
 * Gary A. Newsome
 * CPT_213 Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package time_calculator;

import javax.swing.JOptionPane;

/**
 * @author garyanewsome
 */
public class Time_calculator {

  public static void main(String[] args) {
    final double SECONDS_PER_MINUTE = 60;
    final double SECONDS_PER_HOUR = 3600;
    final double SECONDS_PER_DAY = 86400;
        
    double seconds;
    String userInput;

    // get the user's input
    userInput = 
            JOptionPane.showInputDialog("Please enter a number of seconds:");
    seconds = Double.parseDouble(userInput);
    
    // calculate and display
    if (seconds >= SECONDS_PER_MINUTE){
      double minutes = seconds / SECONDS_PER_MINUTE;
      JOptionPane.showMessageDialog(null, "There are " + minutes + 
              " minutes in " + seconds + " seconds.");
    }
    
    if (seconds >= SECONDS_PER_HOUR){
      double hours = seconds / SECONDS_PER_HOUR;
      JOptionPane.showMessageDialog(null, "There are " + hours + 
              " hours in " + seconds + " seconds.");
    }
    
    if (seconds >= SECONDS_PER_DAY){
      double days = seconds / SECONDS_PER_DAY;
      JOptionPane.showMessageDialog(null, "There are " + days + 
              " days in " + seconds + " seconds.") ;
    }
    System.exit(0);
  } // end main
  
} // end class
