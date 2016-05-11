/*
 * Gary A. Newsome
 * CPT 213 WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package colorchangingbuttons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Chapter 15 Programming Challenge 6 Color Changing Buttons
 * @author garyanewsome
 */
public class ColorChangingButtons extends Application {

    HBox pane = new HBox(20);
  
  @Override
  public void start(Stage stage) {
    // create label and buttons
    Label label = new Label("Color, choose wisely...");
    label.setFont(Font.font ("Comic Sans MS", 20));
    label.setTextFill(Color.web("#000000"));
    
    // create button red
    Button red = new Button("Red");
     
    red.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent event){
        pane.setStyle("-fx-background-color: #FF0000");
        label.setTextFill(Color.web("#A2F900"));
      }
     });
    // create button blue
    Button blue = new Button("Blue");
    
    blue.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent event){
        pane.setStyle("-fx-background-color: #0000FF");
        label.setTextFill(Color.web("#00FFFF"));
      }
    });
    // create button yoda
    Button yoda = new Button("Yoda");
    
    yoda.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent event){
        pane.setStyle("-fx-background-color: #A2F900");
        label.setTextFill(Color.web("#800000"));
      }
    });
  
    // setup pane
    pane.setStyle("-fx-background-color: #778899");
    pane.setAlignment(Pos.CENTER);
    pane.getChildren().addAll(label, red, blue, yoda);
    
    // set the label as the root of the scene graph
    stage.setTitle("Color Changing Buttons");
    stage.setScene(new Scene(pane, 600, 100));
    stage.show(); 
  }
}
