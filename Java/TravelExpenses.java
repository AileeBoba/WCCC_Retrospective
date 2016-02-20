/*
 * Gary A. Newsome
 * CPT 213_WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package travelexpenses;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * Chapter 12 Programming Challenge 4 Travel Expenses Main Class
 *
 * @author garyanewsome
 */
public class TravelExpenses extends JFrame {

  private JLabel tripDays;
  private JLabel airfare;
  private JLabel carRentalFees;
  private JLabel milesDriven;
  private JLabel parkingFees;
  private JLabel taxiCharges;
  private JLabel registrationFees;
  private JLabel lodgingFees;

  private JTextField tripDaysTextField;
  private JTextField airfareTextField;
  private JTextField carRentalFeesTextField;
  private JTextField milesDrivenTextField;
  private JTextField parkingFeesTextField;
  private JTextField taxiChargesTextField;
  private JTextField registrationFeesTextField;
  private JTextField lodgingFeesTextField;

  private JButton resetButton;
  private JButton calcButton;

  final int WINDOW_WIDTH = 350;
  final int WINDOW_HEIGHT = 400;

  /**
   * Constructor
   */
  public TravelExpenses() {

    // set the title
    setTitle("Travel Expenses");

    // set the window size
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    // specify what happens when the close button is clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new GridLayout(9, 2));

    // build the panel and add it to the frame
    buildPanel();

    // display the window
    setVisible(true);
  }

  /**
   * the buildPanel method adds a label, a text field, and a button to a panel
   */
  private void buildPanel() {
    // create labels to display user instructions
    tripDays = new JLabel("Number of days: ");
    airfare = new JLabel("Airfare expenses: ");
    carRentalFees = new JLabel("Car rental fees: ");
    milesDriven = new JLabel("Miles driven: ");
    parkingFees = new JLabel("Parking fees: ");
    taxiCharges = new JLabel("Taxi charges: ");
    registrationFees = new JLabel("Registration fees: ");
    lodgingFees = new JLabel("Lodging per night: ");

    // create text fields for user entry
    tripDaysTextField = new JTextField(10);
    airfareTextField = new JTextField(10);
    carRentalFeesTextField = new JTextField(10);
    milesDrivenTextField = new JTextField(10);
    parkingFeesTextField = new JTextField(10);
    taxiChargesTextField = new JTextField(10);
    registrationFeesTextField = new JTextField(10);
    lodgingFeesTextField = new JTextField(10);

    // create a button with the caption "Reset"
    resetButton = new JButton("Reset");

    // create a button with the caption "Calculate"
    calcButton = new JButton("Calculate");

    // add an action listener to the button
    resetButton.addActionListener(new ResetButtonListener());

    // add an action listener to the button
    calcButton.addActionListener(new CalcButtonListener());

    // crete a JPanel object and let the panel
    // field reference it
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();
    JPanel panel11 = new JPanel();
    JPanel panel12 = new JPanel();
    JPanel panel13 = new JPanel();
    JPanel panel14 = new JPanel();
    JPanel panel15 = new JPanel();
    JPanel panel16 = new JPanel();
    JPanel panel17 = new JPanel();
    JPanel panel18 = new JPanel();

    // add the label, text field, and button
    // components to the panel
    panel1.add(tripDays);
    panel2.add(tripDaysTextField);
    panel3.add(airfare);
    panel4.add(airfareTextField);
    panel5.add(carRentalFees);
    panel6.add(carRentalFeesTextField);
    panel7.add(milesDriven);
    panel8.add(milesDrivenTextField);
    panel9.add(parkingFees);
    panel10.add(parkingFeesTextField);
    panel11.add(taxiCharges);
    panel12.add(taxiChargesTextField);
    panel13.add(registrationFees);
    panel14.add(registrationFeesTextField);
    panel15.add(lodgingFees);
    panel16.add(lodgingFeesTextField);
    panel17.add(resetButton);
    panel18.add(calcButton);

    // add the panel to the frame's content pane
    add(panel1);
    add(panel2);
    add(panel3);
    add(panel4);
    add(panel5);
    add(panel6);
    add(panel7);
    add(panel8);
    add(panel9);
    add(panel10);
    add(panel11);
    add(panel12);
    add(panel13);
    add(panel14);
    add(panel15);
    add(panel16);
    add(panel17);
    add(panel18);

  }

  /**
   * ResetButtonListener is an action listener class for the Reset Button
   */
  private class ResetButtonListener implements ActionListener {

    /**
     * the actionPerformed method executes when the user clicks on the
     * resetButton
     *
     * @param e The event object
     */
    @Override
    public void actionPerformed(ActionEvent e) {
      calcButton.setBackground(Color.LIGHT_GRAY);
      tripDaysTextField.setText("");
      airfareTextField.setText("");
      carRentalFeesTextField.setText("");
      milesDrivenTextField.setText("");
      parkingFeesTextField.setText("");
      taxiChargesTextField.setText("");
      registrationFeesTextField.setText("");
      lodgingFeesTextField.setText("");
    }
  }

  /**
   * CalcButtonListener is an action listener class for the Calculate Button
   */
  private class CalcButtonListener implements ActionListener {

    /**
     * the actionPerformed method executes when the user clicks on the calculate
     * button
     *
     * @param e The event object
     */
    @Override
    public void actionPerformed(ActionEvent e) {
      // constants
      final double MEAL_PER_DIEM = 37.00;
      final double PARKING_PER_DAY = 10.00;
      final double TAXI_PER_DAY = 20.00;
      final double LODGING_PER_DAY = 95.00;
      final double PER_MILES_DRIVEN = 0.27;
       
      // populate String variables from text fields
      String tripDaysIn = tripDaysTextField.getText();
      String airfareIn = airfareTextField.getText();
      String carRentalFeesIn = carRentalFeesTextField.getText();
      String milesDrivenIn = milesDrivenTextField.getText();
      String parkingFeesIn = parkingFeesTextField.getText();
      String taxiChargesIn = taxiChargesTextField.getText();
      String registrationFeesIn = registrationFeesTextField.getText();
      String lodgingFeesIn = lodgingFeesTextField.getText();
      
      // convert Strings to numeric variables
      int tripDays = Integer.parseInt(tripDaysIn);
      double airfare = Double.parseDouble(airfareIn);
      double carRentalFees = Double.parseDouble(carRentalFeesIn);
      double milesDriven = Double.parseDouble(milesDrivenIn);
      double parkingFees = Double.parseDouble(parkingFeesIn);
      double taxiCharges = Double.parseDouble(taxiChargesIn);
      double registrationFees = Double.parseDouble(registrationFeesIn);
      double lodgingFees = Double.parseDouble(lodgingFeesIn);

      // calculations
      double total = (MEAL_PER_DIEM * tripDays) + (airfare + carRentalFees
              + (milesDriven * PER_MILES_DRIVEN) + parkingFees + taxiCharges
              + registrationFees + (lodgingFees * tripDays));
      
      double parkingFeesMax = tripDays * PARKING_PER_DAY;
      double parkingPaid;
      if(parkingFees > parkingFeesMax){
        parkingPaid = parkingFeesMax;
      } else {
        parkingPaid = parkingFees;
      }
      
      double lodgingFeesMax = tripDays * LODGING_PER_DAY;
      double lodgingPaid;
      if ((lodgingFees * tripDays) > lodgingFeesMax){
        lodgingPaid = lodgingFeesMax;
      } else {
        lodgingPaid = lodgingFees * tripDays;
      }
      
      double taxiFeesMax = tripDays * TAXI_PER_DAY; 
      double taxiPaid;
      if (taxiCharges > taxiFeesMax){
        taxiPaid = taxiFeesMax;
      } else {
        taxiPaid = taxiCharges;
      }
      double totalAllowed = (MEAL_PER_DIEM * tripDays) + airfare
              + carRentalFees + (milesDriven * PER_MILES_DRIVEN)
              + parkingPaid + taxiPaid + registrationFees
              + lodgingPaid;

      // display the results and gray the input console
      calcButton.setBackground(Color.GRAY);
      JOptionPane.showMessageDialog(null, String.format("The total expenses"
              + "for this trip are $ %.2f\n", total)
              + String.format("The expenses allowed for this trip are "
                      + "$%.2f\n", totalAllowed));
      
      // calculate and display the over/under
      if (total > totalAllowed) {
        JOptionPane.showMessageDialog(null, String.format("The business person "
                + "exceeded their allotted expenses the balance due is: "
                + "$%.2f", (total - totalAllowed)));
      } else  if (total < totalAllowed) {
        JOptionPane.showMessageDialog(null, String.format("The business person "
                + "is under the allotted expense allowance by : "
                + "$%.2f", (totalAllowed - total)));
      } else {
        JOptionPane.showMessageDialog(null, "The business person perfectly "
                + "calculate the expense of this trip");
      }
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    new TravelExpenses();
  }

}
