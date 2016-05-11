/*
 * Gary A. Newsome
 * CPT 213_WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package objectbinarysearcher;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Chapter 17 Programming Challenge 3 Object Binary Searcher
 * @author garyanewsome
 */
public class ObjectBinarySearcher {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // initialize scanner
    Scanner keyboard = new Scanner(System.in);
    // create the array to be sorted
    String [] searchData = {"Moe", "Larry", "Curly", "Schemp", "Joe"};
    
    // sort the array
    Arrays.sort(searchData);
    System.out.println(Arrays.asList(searchData));
    System.out.print("Please enter a name to search for: ");
    String str = keyboard.nextLine();
    System.out.println("You entered " + str);
    
    int position = search(searchData, str);
    if (position != -1){
      System.out.println(str + " is found at position " + position);
    }else{
      System.out.println(str + " is not in the array.");
    }
  }
  
  public static int search(Comparable [] array, Comparable value){
    int lower = 0;
    int upper = array.length-1;
    
    while (lower <= upper){
      int middle = (lower + upper)/2;
      if(value.compareTo(array[middle]) == 0){
        return middle;
      }
      if (value.compareTo(array[middle]) < 0){
        upper = middle -1;
      }else{
        lower = middle +1;
      }
    }
      return -1;
    }
}
