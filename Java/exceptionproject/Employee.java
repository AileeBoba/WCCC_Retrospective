/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package exceptionproject;

/**
 * Employee Class
 * 
 * @author garyanewsome
 */
public class Employee {
  private String name;              // Employee name
  private int employeeNumber;       // Empoyee number
  private String hireDate;          // Employee hire date
  
  /**
   * Constructor
   * @param name The employees name
   * @param employeeNumber The employee's number
   * @param hireDate The employee's hire date
   * @throws exceptionproject.InvalidEmployeeNumber
   */
  public Employee(String name, int employeeNumber,
            String hireDate)throws InvalidEmployeeNumber{
        this.name = name;
        this.employeeNumber = employeeNumber;
        setEmployeeNumber(employeeNumber);
        this.hireDate = hireDate;
  }
  /**
   * no-arg contructor initializes an object with null
   * strings for name, employeeNumber and hireDate
   */
  public Employee(){
    this.name = "";
    this.employeeNumber = 0;
    this.hireDate = "";
  }
  /**
   * setName method Sets the employee's name
   * @param name 
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * setEmployeeNumber method Sets the employee's number
   * @param employeeNumber
   * @throws InvalidEmployeeNumber 
   */
  public void setEmployeeNumber(int e)throws InvalidEmployeeNumber {
    if (isValidEmpNum(e))
      this.employeeNumber = e;
    else
      throw new InvalidEmployeeNumber();
  }

  /**
   * setHireDate method Sets the employee's hire date
   * @param hireDate 
   */
  public void setHireDate(String hireDate) {
    this.hireDate = hireDate;
  }

  public String getName() {
    return name;
  }

  public int getEmployeeNumber() {
    return employeeNumber;
  }

  public String getHireDate() {
    return hireDate;
  }
  /**
   * isValidEmpNum is a private method that
   * determines whether a string is a 
   * valid employee number
   * @param e The string containing the employee number
   * @return true/false dependant upon validity of input
   */
  private boolean isValidEmpNum(int e){
    boolean status = true;
    
    if (e < 0 || e > 9999){
      status = false;
    }
    
    return status;
  }
  
  /**
   * toString method
   * @return A reference to a String representation of
   * the object
   */
  public String toString(){
    String str = "Name: " + this.name + "\nEmployee Number: ";
    
    if (employeeNumber == 0)
      str += "INVALID EMPLOYEE NUMBER";
    else
      str += employeeNumber;

    str += ("\nHire Date: " + hireDate);
    return str;
  }
  
}
