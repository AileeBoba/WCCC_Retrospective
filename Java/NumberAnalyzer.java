/*
 * Gary A. Newsome
 * CPT 213_WA Java Programming II
 * Westmoreland County Community college
 * Janet Powell
 */
package numberanalyzer;

/**
 * Chapter 18 Programming Challenge 7 Number Analyser
 * @author garyanewsome
 */
public class NumberAnalyzer<T extends Number> {
  private T[] array;
  
  /**
   * constructor
   * @param array
   */
  public NumberAnalyzer(T[] array){
    this.array = array;
  }
  
  /**
   * getHighest method return the highest number in the array
   * @return highest
   */
  public T getHighest(){
    T highest = array[0];
    for (int i = 0; i < array.length; i++){
      if(highest.doubleValue() < array[i].doubleValue()){
        highest = array[i];
      }
    }
    return highest;
  }
  
  /**
   * getLowest method returns the lowest number in the array
   * @return lowest
   */
  public T getLowest(){
    T lowest = array[0];
    for (int i = 0; i < array.length; i++){
      if(lowest.doubleValue() > array[i].doubleValue()){
        lowest = array[i];
      }
    }
    return lowest;
  }
  
  /**
   * getTotal method returns the total value of the sum of the array
   * @return total
   */
  public Double getTotal(){
    Double total = 0.0;
    for (int i =0; i < array.length; i++){
      total +=  array[i].doubleValue();
    }
    return total;
  }
  
  /**
   * getAvg method returns the average value of the contents of the array
   * @return
   */
  public Double getAvg(){
    return (getTotal() / array.length);
  }
  
    /**
   * printArray method prints the length and individual items of the array
   */
  public void printArray(){
    System.out.println("Our preloaded array of " + array.length +
            " generic items.");
    for (int i = 0; i < array.length; i++){
      System.out.print(array[i]);
      if (i < array.length - 1){
        System.out.print(", ");
      }
    }
    System.out.println("\n");
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Double[] numArray = {44.0, 77.0, 11.0, 99.0, 55.0, 22.0};
    
    NumberAnalyzer<Double> na = new NumberAnalyzer<>(numArray);
    na.printArray();
    System.out.println("The highest value within our array is " + na.getHighest());
    System.out.println("The lowest value within our array is " + na.getLowest());
    System.out.println("The fabulous grand total of our array is " + na.getTotal());
    System.out.printf("The average of our array items, rounded to " +
            "two decimal places, is %.2f\n", na.getAvg());
    System.out.println("\nHave a pleasant day.");
  
  }
}
