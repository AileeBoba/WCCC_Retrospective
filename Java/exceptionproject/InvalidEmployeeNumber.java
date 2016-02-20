/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package exceptionproject;

/**
 * InvalidEmployeeNumber class
 * Exception thrown by the Employee class
 * when an invalid employee number is received.
 * @author Gary
 */
public class InvalidEmployeeNumber extends Exception{
  
  /**
   * Constructor
   */
  public InvalidEmployeeNumber(){
  super("ERROR: Invalid Employee Number!");
  }
}
