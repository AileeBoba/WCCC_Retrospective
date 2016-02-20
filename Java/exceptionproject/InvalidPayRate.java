/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package exceptionproject;

/**
 * InvalidPayRate class
 * Exception thrown by ProductionWorker class
 * when it receives a negative pay rate
 * @author garyanewsome
 */
public class InvalidPayRate extends Exception{
  
  /**
   * Constructor
   */
  public InvalidPayRate(){
    super("ERROR: Negative Pay Rate! - Invalid.");
  }
}
