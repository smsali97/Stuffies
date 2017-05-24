import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application {
	
	private TextField irField = new TextField();
	private TextField ynField = new TextField();
	private TextField laField = new TextField();
	private TextField mpField = new TextField();
	private TextField tpField = new TextField();
	private Button btCalculcate = new Button("Calculate");
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Label interestRate = new Label("Annual Interest Rate");
		Label yearNo = new Label("Number of Years: ");
		Label loanAmount = new Label("Loan Amount: ");
		Label monthlyPayment = new Label("Monthly Payment: ");
		Label totalPayment = new Label("Total Payment: ");
		
		
		irField.setAlignment(Pos.BOTTOM_RIGHT);
		ynField.setAlignment(Pos.BOTTOM_RIGHT);
		laField.setAlignment(Pos.BOTTOM_RIGHT);
		mpField.setAlignment(Pos.BOTTOM_RIGHT);
		tpField.setAlignment(Pos.BOTTOM_RIGHT);
		
		mpField.setEditable(false); tpField.setEditable(false);
		
		GridPane gp = new GridPane();
		gp.setHgap(5); gp.setVgap(5);
		gp.add(interestRate, 0, 0);
		gp.add(yearNo, 0, 1);
		gp.add(loanAmount, 0, 2);
		gp.add(monthlyPayment, 0, 3);
		gp.add(totalPayment, 0, 4);
		
		gp.add(irField, 1, 0);
		gp.add(ynField, 1, 1);
		gp.add(laField, 1, 2);
		gp.add(mpField, 1, 3);
		gp.add(tpField, 1, 4);
		
		gp.add(btCalculcate, 1, 5);
		GridPane.setHalignment(btCalculcate, HPos.RIGHT);
		
		btCalculcate.setOnAction( e -> calculateLoanPayment() );
		
		Scene scene = new Scene(gp,400,250);
		primaryStage.setTitle("LoanCalculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void calculateLoanPayment() {
		double interest = Double.parseDouble(irField.getText());
		int year = Integer.parseInt(ynField.getText());
		double loanA = Double.parseDouble(laField.getText());
		
		Loan loan = new Loan(interest, year, loanA);
		mpField.setText(String.format("$%.2f", loan.getMonthlyPayment()));
		tpField.setText(String.format("$%.2f", loan.getTotalPayment()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
