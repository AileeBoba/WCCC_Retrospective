/*
 * Gary a. Newsome
 * CPT 163_27 Java Programming
 * Westmoreland County Community College
 * Paul Scarrone
 * Assignment 6 DRY Refactoring
 * class: Dimensions
 */
package howdryiam;

/**
 * @author garyanewsome
 * @author samuraipanzer
 */

// Fields
public class Dimensions {
  private double width = 0;
  private double height = 0;
  private double depth = 0;
  private String units = "in";

  /**
   * Constructs a dimension of a 3d box
   * @param width
   * @param height
   * @param depth
   * @param units 
   */
  public Dimensions(double width, double height, double depth, String units) {
	this.depth = depth;
	this.height = height;
	this.units = units;
	this.width = width;
  } // end Dimensions
  /**
   * Constructs dimension of a 3d box using default `in` units
   * @param width
   * @param height
   * @param depth 
   */
  public Dimensions(double width, double height, double depth) {
	this.depth = depth;
	this.height = height;
	this.width = width;
  } // end Dimensions
  
  private String withUnits(double measure){
	return measure + this.units;
  } // end withUnits
  
  public String widthWithUnits(){
	return withUnits(this.width);
  } // end widthWithUnits
  
  public String heightWithUnits(){
	return withUnits(this.height);
  } // end heightWithUnits
  
  public String depthWithUnits(){
	return withUnits(this.depth);
  } // end depthWithUnits
  
} // end class Dimensions
