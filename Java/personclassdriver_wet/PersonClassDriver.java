/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package personclassdriver;

import java.util.Scanner;

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

    // Create the objects
    Person me = new Person();
    Person myFamily = new Person();
    Person myFriend = new Person();

    println("This program will accept user input for 3 instances of the \n"
            + "person class, and then return those values to you.");
    // set info for 'me' instance
    println("\nLets start with you, or me as it were.");
    print("Please enter your name: ");
    String name = keyboard.nextLine();
    me.setName(name);
    print("Please enter your address: ");
    String address = keyboard.nextLine();
    me.setAddress(address);
    print("Please enter your age, be honest: ");
    int age = keyboard.nextInt();
    me.setAge(age);
    // clear buffer
    keyboard.nextLine();
    print("Please enter you phone number: ");
    String phone = keyboard.nextLine();
    me.setPhone(phone);

    // set info for 'myFamily' instance
    println("\nNow lets do a family member.");
    print("Please enter a name: ");
    String familyName = keyboard.nextLine();
    myFamily.setName(familyName);
    print("Please enter an address: ");
    String familyAddress = keyboard.nextLine();
    myFamily.setAddress(familyAddress);
    print("Please enter an age: ");
    int familyAge = keyboard.nextInt();
    myFamily.setAge(familyAge);
    // clear buffer
    keyboard.nextLine();
    print("Please enter a phone number: ");
    String familyPhone = keyboard.nextLine();
    myFamily.setPhone(familyPhone);

    // set info for 'myFriend' instance
    println("\nNow lets do a friend.");
    print("Please enter a name: ");
    String friendName = keyboard.nextLine();
    myFriend.setName(friendName);
    print("Please enter an address: ");
    String friendAddress = keyboard.nextLine();
    myFriend.setAddress(friendAddress);
    print("Please enter an age: ");
    int friendAge = keyboard.nextInt();
    myFriend.setAge(friendAge);
    // clear buffer
    keyboard.nextLine();
    print("Please enter a phone number: ");
    String friendPhone = keyboard.nextLine();
    myFriend.setPhone(friendPhone);

    println("");  //for spacing
    
    // Display 'me' instance info
    println("My name is " + me.getName());
    println("My address is " + me.getAddress());
    println("I am " + me.getAge() + " years old.");
    println("My phone number is " + me.getPhone());

    // Display 'myFriend1' instance info
    println("\nMy family member is:" + myFamily.getName());
    println("Their address is " + myFamily.getAddress());
    println("Their is " + myFamily.getAge() + " years old.");
    println("Their phone number is " + myFamily.getPhone());

    // Display 'me' instance info
    println("\nMy friend today is:" + myFriend.getName());
    println("Their address is " + myFriend.getAddress());
    println("Their " + myFriend.getAge() + " years old.");
    println("Their phone number is " + myFriend.getPhone());
  }

  /**
   * print method - accepts a string and prints it using System.out.print
   * @param msg 
   */
  public static void print(String msg) {
    System.out.print(msg);
  }

  /**
   * println method - accepts a string and prints it using System.out.println
   * @param msg 
   */
  public static void println(String msg) {
    System.out.println(msg);
  }
}
