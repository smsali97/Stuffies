

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HandleEvent extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		// Create a pane
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel!");
		
		OKHandlerClass handler1 = new OKHandlerClass();
		btOK.setOnAction(handler1);
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2);
		pane.getChildren().addAll(btOK,btCancel);
		
		//Create a scene and place it on the stage
		Scene scene = new Scene(pane,Color.ALICEBLUE);
		primaryStage.setTitle("HandleEvent");
		primaryStage.setFullScreen(true);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		

	}
	
	class OKHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			System.out.println("OK button clicked");
		}
	}
	
	class CancelHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			System.out.println("Cancle button clicked");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
