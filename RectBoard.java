

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectBoard extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		// TODO Auto-generated method stub

		GridPane board = new GridPane();
		board.setAlignment(Pos.CENTER);
		
		Pane pane = new Pane();
		int size = 40;
		
		board.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Rectangle rect = new Rectangle(size*j, size*i, size, size);
				int rem = (i+j) % 2;
				if ( rem == 0) {
					rect.setFill(Color.BLACK);
				}
				else {
					rect.setFill(Color.WHITE);
				}
				
				pane.getChildren().add(rect);
				
			}
		}
		
		Scene scene = new Scene(pane, 8*size, 8*size);
		primaryStage.setTitle("Checkboard");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
