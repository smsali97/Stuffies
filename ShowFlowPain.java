import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		FlowPane pane = new FlowPane(5, 5);
		pane.setPadding(new Insets(11, 12, 13, 14));
		
		Label firstName = new Label("First Name");
		TextField tf = new TextField();
		Label middleName = new Label("MI: ");
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1);
		Label lastName = new Label("Last Name: ");
		TextField tfLn = new TextField("Type it!");
		pane.getChildren().addAll(firstName,tf,middleName,tfMi);
		pane.getChildren().addAll(lastName,tfLn);
		Scene s = new Scene(pane, 200, 250);
		primaryStage.setTitle("Show FlowPane");
		primaryStage.setScene(s);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application.launch(args);
	

	}

}
