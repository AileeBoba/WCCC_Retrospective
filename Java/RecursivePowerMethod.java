/*
 * Gary A. Newsome
 * CPT 213_WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package recursivepowermethod;

/**
 * Chapter 16 Programming Challenge 7 Recursive Power Method
 * @author garyanewsome
 */
public class RecursivePowerMethod {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    double x = 2, y = 10;
    
    System.out.println(x + " raised to the power of " + y + 
            " is " + pow(x, y));
  }
  /**
   * The pow method raises a number to a power
   * @param x The number to raise
   * @param y The power to raise x to
   * @return The value of x raised to the power of y
   */
  public static double pow(double x, double y){
    if (y > 0){
      return x * pow(x, y-1);
    } else {
      return 1;
    }
  }
}
