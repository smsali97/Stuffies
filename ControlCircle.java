import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
	
	private CirclePane circlePane = new CirclePane();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Hold two buttons in an HBox
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		
		Button btnEnlarge = new Button("Enlarge");
		Button btnShrink = new Button("Shrink");
		
		hBox.getChildren().addAll(btnEnlarge,btnShrink);
		
		// Create and register a handler!
		btnEnlarge.setOnAction(new EnlargeHandler());
		btnShrink.setOnAction(new ShrinkHandler());
		
		BorderPane bp = new BorderPane();
		bp.setCenter(circlePane);
		bp.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		// Create a scene
		Scene scene = new Scene(bp, 200, 150);
		primaryStage.setTitle("ControlCircle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	class EnlargeHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			circlePane.enlarge();
		}
	}
	
	class ShrinkHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			circlePane.shrink();
		}
	}
	

	public static void main(String[] args) {
		// Application starts from here
		Application.launch(args);
	}
	
	class CirclePane extends StackPane {
		private Circle circle = new Circle(50);
		
		public CirclePane() {
			getChildren().add(circle);
			circle.setStroke(Color.BLACK);
			circle.setFill(Color.CADETBLUE);
		}
		
		public void enlarge() {
			circle.setRadius(circle.getRadius() + 5);
			circle.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
		}
		
		public void shrink() {
			circle.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
			circle.setRadius(circle.getRadius() > 5 ? circle.getRadius()
					- 5 : circle.getRadius() );
		}
		
	}

}
