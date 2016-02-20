/*
 * Chapter 6 Programming Challenge #4
 */
package gan_assignment5objects;

/**
 * RetailItemClass
 * @author Gary A. Newsome
 */
public class RetailItem {
    
    // Fields
    private String description;  // holds a brief description of the item
    private int unitsOnHand;     // holds to number of units on hand
    private double price;        // holds the price of an item
    
    /**
     * Constructor
     * @param description accepts a string for an items description
     * @param unitsOnHand accepts an integer for the number of units on hand
     * @param price accepts a double for the price of the item
     */
    public RetailItem(String description,
            int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    } // end of constructor
    
    // Accessors and Mutators
    /**
     * Mutator to set the description field
     * @param description 
     */
    public void setDescription(String description){
        this.description = description;}
    /**
     * Mutator to set the number of units on hand
     * @param unitsOnHand 
     */
    public void setUnitsOnHand(int unitsOnHand){
        this.unitsOnHand = unitsOnHand;}
    /**
     * Mutator to set the price of the item
     * @param prince 
     */
    public void setPrice(double prince){
        this.price = price;}
    
    /**
     * Accessors to get and return items description
     * @return strDescription
     */
    public String getDescription(){return this.description;}
    /**
     * Accessors to get and return number of units on hand
     * @return intUnitsOnHand
     */
    public int getUnitsOnHand(){return this.unitsOnHand;}
    /**
     * Accessors to get and return price of the item
     * @return dblPrice
     */
    public double getPrice(){return this.price;}
    
} // end RetailItem
