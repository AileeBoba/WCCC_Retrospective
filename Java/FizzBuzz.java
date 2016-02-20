/*
 Gary A. Newsome
CPT_163_27 Java Programming 1
FIZZBUZZ
 */
package fizzbuzz;
import java.util.Scanner;


public class FizzBuzz {

   public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Please enter a integer between 1 and 100.");
       int intNumber = keyboard.nextInt();
       
       if (intNumber % 3 == 0 && intNumber % 5 == 0){
           System.out.println("FizzBuzz!!!!");
       }else if (intNumber %3 == 0){
           System.out.println("Fizz!");
       }else if (intNumber % 5 == 0){
           System.out.println("Buzz!");
       }else{
           System.out.println("ZZUbZZIf?!?!");
       }
       
    }
    
}
