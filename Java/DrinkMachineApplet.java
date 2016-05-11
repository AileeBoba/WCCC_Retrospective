/*
 * Gary A. Newsome
 * CPT 213_WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package DrinkMachineApplet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Chapter 14 Programming Challenge 7 DrinkMachine Applet
 *
 * @author garyanewsome
 */
public class DrinkMachineApplet extends Applet {

  /**
   * Initialization method that will be called after the applet is loaded into
   * the browser.
   */
  private Panel signPanel;
  private Panel subPanel;
  private Panel costPanel;
  private Panel selectionPanel;
  private Panel infoPanel;
  private TextField money;

  int cInv = 20;
  int dInv = 20;
  int yInv = 20;
  int oInv = 20;
  int pInv = 20;
  final double COST = 0.75;
  double userMoney, change, due;

  Color custom = new Color(139, 0, 0);
  /**
   * init method
   */
  public void init() {
    // build the panels
    buildSignPanel();
    buildSubPanel();
    buildCostPanel();
    buildSelectionPanel();
    infoPanel();

    // create the layout manager
    setLayout(new GridLayout(5, 1));

    // add the panels to the applet
    add(signPanel);
    add(subPanel);
    add(costPanel);
    add(selectionPanel);
    add(infoPanel);

  }

  /**
   * buildSignPanel method creates the header for out DrinkMachineApplet
   */
  public void buildSignPanel() {
    // create the panel
    signPanel = new Panel();

    // create the label to display
    Label banner = new Label("~Sarcasm Cola~");
    banner.setForeground(Color.white);
    banner.setFont(new Font("Cursive", Font.ITALIC, 24));

// create the layout manager
    signPanel.setLayout(new FlowLayout());

    // add the label to the panel
    signPanel.setBackground(custom);
    signPanel.add(banner);
  }
  
  /**
   * build subPanel method adds the subtitle to the applet
   */
  public void buildSubPanel(){
      // create the panel
    subPanel = new Panel();

    // create the label to display
    Label subtitle = new Label("Your digital drink machine interface!");
    subtitle.setForeground(Color.yellow);
    subtitle.setFont(new Font("Sanserif",Font.BOLD,12));

// create the layout manager
    subPanel.setLayout(new FlowLayout());

    // add the label to the panel
    subPanel.setBackground(Color.black);
    subPanel.add(subtitle);
  }
  /**
   * buildCostPanel method creates the cost panel
   * and display the price of our fabulous drinks.
   */
  public void buildCostPanel(){
    // create the panel
    costPanel = new Panel();

    // create the label to display
    Label cost = new Label("Only $0.75");
    cost.setForeground(Color.white);
    cost.setFont(new Font("Cursive", Font.BOLD, 20));

// create the layout manager
    costPanel.setLayout(new FlowLayout());

    // add the label to the panel
    costPanel.setBackground(custom);
    costPanel.add(cost);
  }

  /**
   * buildSelectionMethod build the buttons for the user to make their selection
   */
  private void buildSelectionPanel() {
    // create the panel
    selectionPanel = new Panel();

    // create the buttons for selection
    Button cola = new Button("Standard");
    cola.setBackground(Color.black);
    cola.setForeground(Color.white);
    cola.setFont(new Font("Cursive", Font.BOLD | Font.ITALIC , 12));
    Button diet = new Button("Skinny");
    diet.setBackground(Color.black);
    diet.setForeground(Color.white);
    diet.setFont(new Font("Cursive", Font.BOLD | Font.ITALIC , 12));
    Button yellow = new Button("VROOM!");
    yellow.setBackground(Color.yellow);
    yellow.setForeground(Color.blue);
    yellow.setFont(new Font("Cursive", Font.BOLD | Font.ITALIC , 12));
    Button orange = new Button("Sunshine");
    orange.setBackground(Color.orange);
    orange.setForeground(Color.red);
    orange.setFont(new Font("Cursive", Font.BOLD | Font.ITALIC , 12));
    Button purple = new Button("Dinosaur");
    purple.setBackground(Color.magenta);
    purple.setForeground(Color.white);
    purple.setFont(new Font("Cursive", Font.BOLD | Font.ITALIC , 12));

    // add an action llistener to the buttons
    cola.addActionListener(new colaButtonListener());
    diet.addActionListener(new dietButtonListener());
    yellow.addActionListener(new yellowButtonListener());
    orange.addActionListener(new orangeButtonListener());
    purple.addActionListener(new purpleButtonListener());

    // set layout manager for the panel
    selectionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    //selectionPanel.setLayout(new GridLayout(5, 1));

    // add the buttons to the panel
    selectionPanel.add(cola);
    selectionPanel.add(diet);
    selectionPanel.add(yellow);
    selectionPanel.add(orange);
    selectionPanel.add(purple);
  }

  /**
   * private inner class that handles the action event that is generate when the
   * user selects a choice
   */
  private class colaButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      // validate user money
      if (money.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Nothing in life is free...");
      } else {
        userMoney = Double.parseDouble(money.getText());
      }
      // calculate
      if (cInv <= 0) {
        JOptionPane.showMessageDialog(null, "All gone!, please make another selection.");
      } else if (userMoney > COST) {
        cInv--;
        change = userMoney - COST;
        JOptionPane.showMessageDialog(null, String.format("Please enjoy your "
                + "Soda/Pop/Cola, your change is $%.2f", change));
      } else if (userMoney == COST) {
        cInv--;
        JOptionPane.showMessageDialog(null, "Thank you!");
      } else { // userMoney >= COST
        due = COST - userMoney;
        JOptionPane.showMessageDialog(null, String.format("Please tender an "
                + " additional $%.2f", due));
      }
    }
  }

  private class dietButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      // validate user money
      if (money.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Nothing in life is free...");
      } else {
        userMoney = Double.parseDouble(money.getText());
      }
      // calculate
      if (dInv <= 0) {
        JOptionPane.showMessageDialog(null, "All gone!, please make another selection.");
      } else if (userMoney > COST) {
        dInv--;
        change = userMoney - COST;
        JOptionPane.showMessageDialog(null, String.format("Please enjoy your "
                + "diet skinny soda, your change is $%.2f", change));
      } else if (userMoney == COST) {
        dInv--;
        JOptionPane.showMessageDialog(null, "Thank you!");
      } else { // userMoney >= COST
        due = COST - userMoney;
        JOptionPane.showMessageDialog(null, String.format("Please tender an "
                + " additional $%.2f", due));
      }
    }
  }

  private class yellowButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      // validate user money
      if (money.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Nothing in life is free...");
      } else {
        userMoney = Double.parseDouble(money.getText());
      }
      // calculate
      if (yInv <= 0) {
        JOptionPane.showMessageDialog(null, "All gone!, please make another selection.");
      } else if (userMoney > COST) {
        yInv--;
        change = userMoney - COST;
        JOptionPane.showMessageDialog(null, String.format("Please enjoy your "
                + "VROOM!, enjoy the caffeine jolt, your change is $%.2f", change));
      } else if (userMoney == COST) {
        yInv--;
        JOptionPane.showMessageDialog(null, "Thank you!");
      } else { // userMoney >= COST
        due = COST - userMoney;
        JOptionPane.showMessageDialog(null, String.format("Please tender an "
                + " additional $%.2f", due));
      }
    }
  }

  private class orangeButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      // validate user money
      if (money.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Nothing in life is free...");
      } else {
        userMoney = Double.parseDouble(money.getText());
      }
      // calculate
      if (oInv <= 0) {
        JOptionPane.showMessageDialog(null, "All gone!, please make another selection.");
      } else if (userMoney > COST) {
        oInv--;
        change = userMoney - COST;
        JOptionPane.showMessageDialog(null, String.format("Please enjoy your "
                + "orange soda, a taste of pure sunshine, your change is $%.2f", change));
      } else if (userMoney == COST) {
        oInv--;
        JOptionPane.showMessageDialog(null, "Thank you!");
      } else { // userMoney >= COST
        due = COST - userMoney;
        JOptionPane.showMessageDialog(null, String.format("Please tender an "
                + " additional $%.2f", due));
      }
    }
  }

  private class purpleButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      // validate user money
      if (money.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Nothing in life is free...");
      } else {
        userMoney = Double.parseDouble(money.getText());
      }
      // calculate
      if (pInv <= 0) {
        JOptionPane.showMessageDialog(null, "All gone!, please make another selection.");
      } else if (userMoney > COST) {
        pInv--;
        change = userMoney - COST;
        JOptionPane.showMessageDialog(null, String.format("Please enjoy your "
                + "purple sodipop, your change is $%.2f", change));
      } else if (userMoney == COST) {
        pInv--;
        JOptionPane.showMessageDialog(null, "Thank you!");
      } else { // userMoney >= COST
        due = COST - userMoney;
        JOptionPane.showMessageDialog(null, String.format("Please tender an "
                + " additional $%.2f", due));
      }
    }
  }

  /**
   * infoPanel Method creates information panel for user to interact with
   */
  public void infoPanel() {
    // create the panel
    infoPanel = new Panel();
    infoPanel.setBackground(custom);
    infoPanel.setForeground(Color.white);
    infoPanel.setFont(new Font("Cursive", Font.BOLD, 14));

// create a label.
    Label tendered = new Label("Pay me!");

// create a text field to pretend to take money
    money = new TextField(5);
    money.setForeground(Color.black);

// set the layout manager
    infoPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    

// add items to the panel
    infoPanel.add(tendered);
    infoPanel.add(money);

  }
}
