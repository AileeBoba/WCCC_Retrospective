/*
 * Gary a. Newsome
 * CPT 163_27 Java Programming
 * Westmoreland County Community College
 * Paul Scarrone
 * Assignment 6 DRY Refactoring
 * class: HOWDRYIAM
 */
package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * @author garyanewsome
   * @author saumaripanzer
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
			
	Address address1 = buildLabel(keyboard);
	Dimensions dim1 = boxSize(keyboard);
	LabelPrinter label1 = new LabelPrinter(address1, dim1);
	
	Address address2 = buildLabel(keyboard);
	Dimensions dim2 = boxSize(keyboard);
	LabelPrinter label2 = new LabelPrinter(address2, dim2);
	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
        
  } // end main 
  
    /**
     * Replaces System.out.println
     * @param message accepts a String and prints it to the console
     * with a CR return
    */  
    public static void println(String message){
	System.out.println(message);
    } // end println
    /**
     * Replaces System.out.print
     * @param message accepts a String and prints it to the console
     * without a CR return
     */
    public static void print(String message){
        System.out.print(message);
    } // end print

  
  public static Address buildLabel(Scanner keyboard){	
	println("Shipping address:");
	print("Attn: ");
	String name = keyboard.next();
	print("Street: ");
	String street = keyboard.next();
	print("City: ");
	String city = keyboard.next();
	print("State: ");
	String state = keyboard.next();
	print("ZipCode: ");
	int zip = keyboard.nextInt();
        println(""); // for spacing
        
        Address address = new Address(name, street, city, state, zip);
        return address;
        } // end Address buildLabel
  
  public static Dimensions boxSize(Scanner keyboard){
	println("Box dimensions:");
	print("Height: ");
	double height = keyboard.nextDouble();
	print("Width: ");
	double width = keyboard.nextDouble();
	print("Depth: ");
	double depth = keyboard.nextDouble();
        println("\n"); // for spacing
        
        Dimensions dim = new Dimensions(width, height, depth);
        return dim;
        } // end Dimensions boxSize
  
} // end class HowDryIAM
