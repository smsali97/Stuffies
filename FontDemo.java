import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// Create a pane to hold the circle
		Pane pane = new StackPane();
		
		// Create a circle and set its properties
		Circle c = new Circle();
		c.setRadius(100);
		c.setStroke(Color.CHOCOLATE);
		c.setStrokeWidth(10);
		c.setFill(new Color(0.5, 0.3, 0.3, 1));
		pane.getChildren().add(c);
		
		// Create a label and set its properties
		Label label = new Label("Java Fx is confusing");
		label.setTextFill(new Color(1,1,1,1));
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		pane.getChildren().add(label);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("FontDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
