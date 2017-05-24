
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEvent extends Application {

	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Text text = new Text(20, 20, "Draggy!");
		pane.getChildren().add(text);
		text.setOnMouseDragged( e-> {
			text.setX(e.getX());
			text.setY(e.getY());
		});
		
		
		Scene scene = new Scene(pane, 300, 300);
		pane.setOnMousePressed( e-> {
			text.setX(scene.getWidth()/2);
			text.setY(scene.getHeight()/2);
			text.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
			
		});		
		
		primaryStage.setTitle("MouseEventDemo!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
