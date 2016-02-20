/*
 * Gary a. Newsome
 * CPT 163_27 Java Programming
 * Westmoreland County Community College
 * Paul Scarrone
 * Assignment 6 DRY Refactoring
 * class: Address
 */
package howdryiam;

/**
 * @author garyanewsome
 * @author samuraipanzer
 */

// Fields
public class Address {
  private String attn = "";
  private String street = "";
  private String city = "";
  private String state = "";
  private int zip = 0;

/**
 * Constructs the fields of an address
 * @param attn accepts a String for a person's name
 * @param street accepts a String for a person's address
 * @param city accepts a String for the person's city
 * @param state accepts a String for the person's state
 * @param zip accepts an integer for the person's zip code
 */
    public Address(String attn, String street,
            String city, String state, int zip){
        this.attn = attn;
        this.city = city;
        this.state = state;
        this.street = street;
        this.zip = zip;
      } // end Address

    /**
     * Accessor to get and return attn
     * @return attn
     */
    public String getAttn() {
        return attn;
    } // end getAttn
    /**
     * Accessor to get and return street address
     * @return street
     */
    public String getStreet() {
        return street;
    } // end getStreet
    /**
     * Accessor to get and return city
     * @return city
     */
    public String getCity() {
        return city;
    } // end getCity
    /**
     * Accessor to get and return state
     * @return state
     */
    public String getState() {
        return state;
    } // end getState
    /**
     * Accessor to get and return zip code
     * @return zip
     */
    public int getZip() {
        return zip;
    } // end getZip

} // end class Address
