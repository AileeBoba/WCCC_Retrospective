/*
 * Gary A. Newsome
 * CPT 213_WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package sumofnumbers;

import javax.swing.JOptionPane;

/**
 * Chapter 16 Programming Challenge 8 Sum of Numbers
 * @author garyanewsome
 */
public class SumOfNumbers {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String yourNum = 
    JOptionPane.showInputDialog("Please enter a number: ");
    
    double num = Double.parseDouble(yourNum);
    
    JOptionPane.showMessageDialog(null, ("The sum of all numbers from 1 through " + num + 
            " is equal to " + sum(num)));
  }
  
  public static double sum(double num){
    double total;
    if (num > 1){
      total = num + sum(num-1);
    } else {
      total = 1;
    }
    return total;
  }
}
