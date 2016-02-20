/*
 * Gary a. Newsome
 * CPT 163_27 Java Programming
 * Westmoreland County Community College
 * Paul Scarrone
 * Assignment 6 DRY Refactoring
 * class: LabelPrinter
 */
package howdryiam;

/**
 * @author garyanewsome
 * @author samuraipanzer
 */

// Fields
public class LabelPrinter {
    private Address address = null;
    private Dimensions dimension = null;

/**
 * Contructs the fields of a shipping label
 * @param address
 * @param dimension 
 */

public LabelPrinter(Address address, Dimensions dimension) {
    this.address = address;
    this.dimension = dimension;
  }
  
/**
 * prints the address to the "label"
 */
  public void printLabel(){
	String depth = this.dimension.depthWithUnits();
	String width = this.dimension.widthWithUnits();
	String height = this.dimension.heightWithUnits();
	println("Name: " + this.address.getAttn());
	println("Street: " + this.address.getStreet());
	println("City: " + this.address.getCity());
	println("State: " + this.address.getState());
	println("Zip: " + this.address.getZip());
	println("Dimensions: " + depth + " x " + width + " x " + height);
        println("");
  }
  /**
   * Method replaces the System.out.println call
   * @param str accepts a string and prints it to the console
   * with a CR return
   */
  public static void println(String str){
    System.out.println(str);
} // end println
}
