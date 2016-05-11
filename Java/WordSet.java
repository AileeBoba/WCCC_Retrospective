/*
 * Gary A. Newsome
 * CPT 213_WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package wordset;

import java.util.Scanner;
import java.util.TreeSet;
/**
 * Chapter 19 Programming Challenge 1 Word Set
 * @author garyanewsome
 */
public class WordSet {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    // prompt user for input
    System.out.println("Please enter a sentence of your choosing \n" +
            "and we will magically break the sentence into an organized \n" +
            "list of sorted words.");
    System.out.print("Enter your senetence here -->: ");
    String input = keyboard.nextLine();
    // tokenize input
    String[] tokens = input.split(" ");
    // create a TreeSet class
    TreeSet<String> yourWords = new TreeSet<>();
    // add string array to TreeSet
    for(String s : tokens){
      yourWords.add(s);
    }
    System.out.println("Your words, sorted of course.\n");
    // output TreeSet
    yourWords.forEach(
      word->{
        System.out.println(word);
      });
    }
}
