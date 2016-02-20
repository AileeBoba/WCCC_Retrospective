/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package personclassdriver;

import java.util.Scanner;   // intialize Scanner

/**
 * Driver for the person class
 *
 * @author garyanewsome
 */
public class PersonClassDriver {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    println("Welcome, this program will record then display the name, \n" +
            "address, age and phone number of both you a \n" + 
            "family member and a friend.\n");
    
    // create 'me' instance of Person class
    println("Lets start with you or me as it were.");
    Person me = setInfo(keyboard);
    
    // create 'myFamily' instance of Person class
    println("Now lets do the same for a family member.");
    Person myFamily = setInfo(keyboard);
    
    // create 'myFriend' instance of Person class
    println("OK, one last time, this time for a friend.");
    Person myFriend = setInfo(keyboard);

    println("");  // for spacing 
    
    // output instance of Person class
    println("Now, here is you, or me.");
    getInfo(me);
    
    println("Moving onto our family member.");
    getInfo(myFamily);
    
    println("Finally, our friend.");
    getInfo(myFriend);
    
  }
  /**
   * print method accepts a String and outputs it with System.out.print
   * @param msg 
   */
  public static void print(String msg){
    System.out.print(msg);
  }
  
  /**
   * println method accepts a String and outputs it wirh System.out.println
   * @param msg 
   */
  public static void println(String msg){
    System.out.println(msg);
  }
  
  /**
   * setInfo method accepts the keyboard and accepts the info for the Person
   * class and then creates the instance
   * @param keyboard
   * @return Person instance
   */
  public static Person setInfo(Scanner keyboard) {
  print("Please enter name: ");
  String name = keyboard.nextLine();
  print("Please enter your address: ");
  String address = keyboard.nextLine();
  print("Please enter your age (no cheating now.)");
  int age = keyboard.nextInt();
  // clear buffer
  keyboard.nextLine();
  print("Please enter your phone number: ");
  String phone = keyboard.nextLine();
  println("");

  Person info = new Person(name, address, age, phone);
  return info;

  }
  /**
   * getInfo method accepts an instance of the Person class, calls the get methods
   * and outputs the data to the screen
   * @param person 
   */
  public static void getInfo(Person person){
    println("Name: " + person.getName());
    println("Address: " + person.getAddress());
    println("Age: " + person.getAge());
    println("Phone number: " + person.getPhone());
    println("");
  }

}

