/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package exceptionproject;

/**
 * InvalidShift class
 * Exception thrown by ProductionWorker class
 * when an invalid shift number is received
 * @author garyanewsome
 */
public class InvalidShift extends Exception {
  
  /**
   * Constructor
   */
  public InvalidShift(){
    super("ERROR: Invalid Shift Number!");
  }
}
