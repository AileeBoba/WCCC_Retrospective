/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package exceptionproject;

import java.text.DecimalFormat;

/**
 * ProductionWorker Class
 * @author Gary
 */
public class ProductionWorker extends Employee{
  // Constants for day and night shifts
  public static final int DAY_SHIFT = 1;
  public static final int NIGHT_SHIFT = 2;
  
  private int shift;          // employee's shift
  private double payRate;     // employee's pay rate
  
  /**
   * Constructor initializes an object with a name
   * employee number, hire date, shift, and pay rate
   * @param name The employees name
   * @param employeeNumber The employee's number
   * @param hireDate The employee's hire date
   * @param shift The employees shift
   * @param payRate The employee's pay rate
   * @throws exceptionproject.InvalidEmployeeNumber
   * @throws exceptionproject.InvalidShift
   * @throws exceptionproject.InvalidPayRate
   */
  public ProductionWorker(String name, int employeeNumber, String hireDate,
            int shift, double payRate)
            throws InvalidEmployeeNumber,
                   InvalidShift,
                   InvalidPayRate{
    super(name, employeeNumber, hireDate);
    setShift(shift);
    setPayRate(payRate);
  }
  
  /**
   * no-arg constructor initializes an object with
   * null strings of namel emplooyee number, and hire
   * date. The day shift is selected and the pay rate
   * is set to 0.0
   */
  public ProductionWorker(){
    super();
    shift = DAY_SHIFT;
    payRate = 0.0;
  }
  /**
   * @param shift
   * @throws InvalidShift 
   */
  
  public void setShift(int shift) throws InvalidShift{
    if(shift != DAY_SHIFT && shift != NIGHT_SHIFT){
      throw new InvalidShift();
    } else {
      this.shift = shift;
    }
  }
  
  public void setPayRate(double payRate) throws InvalidPayRate{
    if (payRate < 0){
      throw new InvalidPayRate();
    } else {
      this.payRate = payRate;
    }
  }

  public int getShift() {
    return shift;
  }

  public double getPayRate() {
    return payRate;
  }
  
  /**
   * toString method
   * @return A reference to a String representation of
   * the object
   */
  public String toString(){
    DecimalFormat dollar = new DecimalFormat("#,##0.00");
    String str = super.toString();
    
    str += "\nShift: ";
    if (shift == DAY_SHIFT)
      str += "Day";
    else if (shift == NIGHT_SHIFT)
      str += "Night";
    else
      str += "INVALID SHIFT NUMBER";
    
    str += ("\nHourly Pay Rate: $" + 
            dollar.format(payRate));
    
    return str;
  }
}
