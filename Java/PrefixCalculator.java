/*
 * Gary A. Newsome
 * CPT 213_WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package prefixcalculator;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Chapter 22 Programming Challenge 4 Prefix Calculator
 * @author garyanewsome
 */
public class PrefixCalculator extends Application {
  // private TextField variables
  private TextField inputTextField;
  private TextField resultsTextField;

  @Override
  public void start(Stage primaryStage) throws Exception{
    //PrefixCalculator pc = new PrefixCalculator();

    Label inputLabel = new Label("Prefix Expression: ");
    inputTextField = new TextField();

    Label resultsLabel = new Label("Result: ");
    resultsTextField = new TextField();
    resultsTextField.setEditable(false);
    
    Button calc = new Button("Calculate");
    
    VBox vb = new VBox(10);
    vb.getChildren().addAll(inputLabel, inputTextField, calc, resultsLabel, resultsTextField);
    EventHandler<ActionEvent> handle = new CmdTextListener();
    calc.setOnAction(handle);

    // set the stage (figuratively)
    primaryStage.setTitle("Prefix Calculator");
    primaryStage.setScene(new Scene(vb));
    primaryStage.show();
  }

  private class CmdTextListener implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent evt) {
      String pExpr = inputTextField.getText();
      Node exprTree = buildExpr(new Scanner(pExpr));
      int value = eval(exprTree);
      resultsTextField.setText(String.valueOf(value));
    }

    Node buildExpr(Scanner sc) {
      String s = sc.next();
      if (isNumber(s)) {
        return new Node(s, null, null);
      } else {
        // s is an operator, so build a non-leaf tree
        Node leftOp = buildExpr(sc);
        Node rightOp = buildExpr(sc);
        return new Node(s, leftOp, rightOp);
      }
    }
    private int eval(Node tree) {
      if (tree.left == null && tree.right == null) {
        return Integer.parseInt(tree.value);
      } else {
        int leftOp = eval(tree.left);
        int rightOp = eval(tree.right);
        if (tree.value.equals("*")) {
          return leftOp * rightOp;
        }
        if (tree.value.equals("+")) {
          return leftOp + rightOp;
        }
      }
      return 0; // will never be reached
    }
    private boolean isNumber(String s) {
      return Character.isDigit(s.charAt(0));
    }
  }
      private class Node {
      String value;
      Node left, right;
      Node(String v, Node l, Node r){
        value = v;
        left = l;
        right = r;
      }
    }
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
}
