import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class SimpleEventDemo2 extends Application implements EventHandler <ActionEvent>{
    public void start(Stage primaryStage) {
	  // Create a button and place it in the center
	HBox pane = new HBox(10);
	pane.setAlignment(Pos.CENTER);
    Button jbtOK = new Button("OK");
    
    pane.getChildren().add(jbtOK);

	// register the button for an event
    
    jbtOK.setOnAction(this);

	Scene scene = new Scene(pane, 200, 200);
	primaryStage.setTitle("SimpleEventDemo2");
	primaryStage.setScene( scene );
	primaryStage.show();

  }

  /** Main method */
  public static void main( String args[])
	{
		launch(args);
	}


  public void handle(ActionEvent e) {
	  System.out.println("It is OK");
	}  
}