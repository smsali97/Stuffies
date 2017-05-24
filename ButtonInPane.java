import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
	
	public void start(Stage primaryStage ) {
		// Create a pane!
		StackPane pane = new StackPane();
		
		
		ImageView iv = new ImageView("http://www.freeiconspng.com/uploads/green-button-icon-png-13.png");
		//iv.scaleXProperty().setValue(0.2);
		//iv.scaleYProperty().setValue(0.2);
		
		
		Button button = new Button("",iv);
		button.scaleXProperty().setValue(0.2);
		button.scaleYProperty().setValue(0.2);
		pane.getChildren().add(button);
		//pane.getChildren().add(iv);
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Button in a pane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
