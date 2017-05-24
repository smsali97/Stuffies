import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentred extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	
		Pane pane = new Pane();
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.LEMONCHIFFON);
		circle.setFill(Color.BLACK);
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane,200,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Centred Circle!");
		primaryStage.show();
	}
}
