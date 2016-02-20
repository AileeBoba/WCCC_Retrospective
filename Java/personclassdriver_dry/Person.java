/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package personclassdriver;

/**
 * Person class
 * @author garyanewsome
 */
public class Person {

  private String name;         // holds a person's name
  private String address;      // holds a person's address
  private int age;             // holds a person's age
  private String phone;  // holds a person's phone number

  /**
   * The no-arg constructor initializes and empty object
   */
  public Person() {
    name = "";
    address = "";
    age = 0;
    phone = "";
  }

  /**
   * The parameterized constructor accepts arguments for the object's fields.
   *
   * @param myName A person's name
   * @param myAddress A person's address
   * @param myAge A person's age
   * @param myPhone A person's phone number
   */
  public Person(String myName, String myAddress, int myAge, String myPhone) {
    name = myName;
    address = myAddress;
    age = myAge;
    phone = myPhone;
  }

  /**
   * The setName method set the person's name
   * @param myName The person's name
   */
  public void setName(String myName) {
    name = myName;
  }

  /**
   * The setAddress method sets the person's address #param myAddress The
   * person's address.
   * @param myAddress A person's address.
   */
  public void setAddress(String myAddress) {
    address = myAddress;
  }

  /**
   * The setAge method set the person's age
   * @param myAge The person's age.
   */
  public void setAge(int myAge) {
    age = myAge;
  }

  /**
   * The setPhone method sets the person's phone number
   * @param phone A person's phone number.
   */
  public void setPhone(String myPhone) {
    phone = myPhone;
  }
  
   /**
   * The getName method returns the person's name
   * @return The person's name
   */
  public String getName() {
    return name;
  }

  /**
   * The getAddress method returns the person's address.
   * @return The person's address.
   */
  public String getAddress() {
    return address;
  }

  /**
   * The getAge method returns the person's age
   * @return The person's age.
   */
  public int getAge() {
    return age;
  }

  /**
   * The getPhone method returns the person's phone number
   * @return The person's phone number.
   */
  public String getPhone() {
    return phone;
  }
  
}
