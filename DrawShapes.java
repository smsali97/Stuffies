import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

public class DrawShapes extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		Arc arc = new Arc(100, 100, 20, 20, Math.PI/2, 2);
		arc.setStrokeWidth(2);
		arc.setFill(Color.AZURE);
		StackPane pane = new StackPane();
		pane.getChildren().add(arc);
		Scene scene = new Scene(pane, 800, 800);
		
		primaryStage.setTitle("Arc time!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
