/*
 * Gary A. Newsome
 * CPT 213 Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package pennys.pkgfor.pay;

import java.util.Scanner;
/**
 *
 * @author garyanewsome
 */
public class PennysForPay {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    // declare and initialize salary at $0.01
    double salary = 0.01;
    
    // prompt user, and gather inut for daysWorked
    print("Please enter the numbers of day worked: ");
    int daysWorked = keyboard.nextInt();
    
    // input validation
    while(daysWorked < 1){
      print("Please enter the number of days worked (must be 1 or greater): ");
      daysWorked = keyboard.nextInt();
    }
    // calculate and output
    for(int i = 0; i < daysWorked; i++){
      System.out.printf("Day %d \tSalary: $%.2f\n", (i+1),salary);
      salary = salary * 2;
    }
    
    System.out.printf("\nFor " + daysWorked + " days worked you received $" +
            "%.2f\n\n", salary);
    
  } // end main
  
  public static void print(String msg){
    System.out.print(msg);
  } // end print
  
} // end class
