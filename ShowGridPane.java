import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShowGridPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		GridPane gpane = new GridPane();
		gpane.setAlignment(Pos.CENTER);
		gpane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		gpane.setHgap(5.5);
		gpane.setVgap(gpane.getHgap());
		
		
		gpane.add(new Label("First Name"), 0, 0);
		gpane.add(new TextField(), 1, 0);
		gpane.add(new Label("MI:"), 0, 1);
		gpane.add(new TextField(), 1, 1);
		gpane.add(new Label("Last Name:"), 0, 2);
		gpane.add(new TextField(), 1, 2);
		
		Button btAdd = new Button("Add Name");
		btAdd.setTextFill(Color.GOLDENROD);
		gpane.add(btAdd, 1, 3);
		GridPane.setHalignment(btAdd, HPos.RIGHT);
		Scene scene = new Scene(gpane);
		scene.setFill(Color.ALICEBLUE);
		primaryStage.setTitle("ShowGridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);

	}

}
