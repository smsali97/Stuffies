
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DragDropPractice extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		Label t1 = new Label("DRAG ME!");
		Label t2 = new Label("DROP HERE!");
		gridPane.setAlignment(Pos.CENTER);
		gridPane.add(t1, 0, 0);
		gridPane.add(t2, 1, 0);
		gridPane.setPadding(new Insets(10));
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		Scene scene = new Scene(gridPane, 250, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		t1.setOnDragDetected( e-> {
			Dragboard db = t1.startDragAndDrop(TransferMode.MOVE);
			ClipboardContent cc = new ClipboardContent();
			cc.putString(t1.getText());
			db.setContent(cc);
			e.consume();
		});
		
		t2.setOnDragOver( e-> {
			if (e.getGestureSource() != t2  && e.getDragboard().hasString() ) {
				e.acceptTransferModes(TransferMode.COPY_OR_MOVE);
			e.consume();
			}
		});
		
		t2.setOnDragEntered( e-> {
			if (e.getGestureSource() != t2 && e.getDragboard().hasString()) {
				t2.setTextFill(Color.GREEN);
				e.consume();
			}
		});
		
		t2.setOnDragExited( e-> {
			t2.setTextFill(Color.BLACK);
			e.consume();
		});
		
		t2.setOnDragDropped( e-> {
			Dragboard db2 = e.getDragboard();
			boolean success = false;
			if (db2.hasString()) {
				t2.setText(db2.getString());
				success = true;
			}
			e.setDropCompleted(success);
			e.consume();
		});
		
		t1.setOnDragDone( e-> {
			if (e.getTransferMode() == TransferMode.MOVE) {
				t1.setText("Done!");
				e.consume();
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
