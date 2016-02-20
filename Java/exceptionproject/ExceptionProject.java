/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package exceptionproject;

/**
 * main class / program driver
 *
 * @author garyanewsome
 */
public class ExceptionProject {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a ProductionWorker object with valid data
    println("John Doe does it right!");
    createWorker("John Doe", 123, "1-2-34",
            ProductionWorker.DAY_SHIFT, 16.50);

    // try to create a ProductionWorker with an invalid employee number
    println("John Doe enters invalid employee number!");
    createWorker("John Doe", 12345, "1-2-34",
            ProductionWorker.DAY_SHIFT, 16.50);

    // try to create a ProductionWorker with an invalid shift number
    println("John Doe enters invalid shift number!");
    createWorker("John Doe", 123, "1-2-34",
            666, 16.50);

    // try to create a ProdcutionWorker with a negative pay rate
    println("We try to pay John Doe less than nothing!");
    createWorker("John Doe", 123, "1-2-34",
            ProductionWorker.DAY_SHIFT, -16.50);
  }
  
  /**
   * createWorker method
   * @param name The employee's name
   * @param employeeNumber The employee's number
   * @param hireDate The employee's hire date
   * @param shift The employee's shift number
   * @param payRate The employee's pay rate
   */
  
  public static void createWorker(String name, int employeeNumber, String hireDate,
            int shift, double payRate){
    ProductionWorker pw;
    
    // Attempt to create an instance of ProductionWorker class
    // and catch any resulting exceptions
    try{
      pw = new ProductionWorker(name, employeeNumber, hireDate,
          shift, payRate);
      // If we make it to this point the object was created successfully
      println("Object Created!");
      System.out.println(pw);
    } catch (InvalidEmployeeNumber e){
      println(e.getMessage());
    } catch (InvalidShift e){
      println(e.getMessage());
    } catch (InvalidPayRate e) {
      println(e.getMessage());
    }
  }

  
  /**
   * println method Accepts and string and prints it to the console
   * using System.out.println();
   * @param msg 
   */
  public static void println(String msg) {
    System.out.println(msg);
  }
}
