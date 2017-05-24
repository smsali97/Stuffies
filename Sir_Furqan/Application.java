package Sir_Furqan;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// application for running a simple bank account
		boolean flag = true;		
		boolean accountExists = false;
		BankAccount b1 = null;
		System.out.println("1. Open a Bank Account");
		System.out.println("2. Deposit money in the Bank Account");
		System.out.println("3. Withdraw money from the Bank Account");
		System.out.println("4. View Bank Account Details");
		System.out.println("5. Exit!");

		do {
			int x = in.nextInt();

			switch (x) {

			case 1:
				if (!accountExists) {
					System.out.println("Enter name and your " + "account type and balance");
					 b1 = new BankAccount(in.next(), in.next(), in.nextInt());
					accountExists = true;
					System.out.println("Account created!");
					break;
				} else {
					System.out.println("You already have an account! :(");
					break;
				}

			case 2:
				if (!accountExists) {
					System.out.println("Please create an account first!");
					break;
				}

				System.out.println("Deposit money");
				b1.depositAmount(in.nextDouble());
				System.out.println("Deposited");
				break;

			case 3:
				if (!accountExists) {
					System.out.println("Please create an account first!");
					break;
				}
				System.out.println("Amount to withdraw:");
				b1.withdrawAmount(in.nextDouble());
				System.out.println("End of transaction.");
				break;

			case 4:
				if (!accountExists) {
					System.out.println("Please create an account first!");
					break;
				}
				System.out.println("Your name: " + b1.getAccountTitle());
				System.out.println("Your type: " + b1.getAccountType());
				System.out.println("Your balance: " + b1.getAccountBalance());
				break;

			case 5:
				System.out.println("Goodbye!");
				flag = false;

			default:
				break;
			}

		} while (flag);
		in.close();
	}
}
