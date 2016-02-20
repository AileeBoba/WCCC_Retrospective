/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package telemarketingphonenumberlist;

import javax.swing.JOptionPane;

/**
 * @author garyanewsome
 */
public class TelemarketingPhoneNumberList {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // initialize arrays
    String[] names = {"Harrison, Rose",
      "James, Jean",
      "Smith, William",
      "Smith, Brad"};
    String[] phoneNumbers = {"555-2234",
      "555-9098",
      "555-1785",
      "555-9224"};

    String input = JOptionPane.showInputDialog(
            "Please enter a name, or the first few characters of a name: ");

    for (int i = 0; i < names.length; i++) {
      if (names[i].substring(0, input.length()).equals(input)) {
        System.out.print(names[i]);
        System.out.print("\t\t" + phoneNumbers[i] + "\n");
      }
    }
  }
}
