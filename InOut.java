import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class User {

    final String userId = "Admin";
    final String passwrd = "Admin@123";

    public User() {

    }
}

class customer {

    String customerName;
    int customerID=0;
    String pass;
    int orderID = 0;
    // private String address;
    ArrayList<customerHistory> itemsPurchased = new ArrayList<>();
    Date dateCreated = new Date();

    boolean access;

    customer() {
    }

    customer(String customerName, String pass) {
        this.customerName = customerName;
        this.pass = pass;
        customerID=this.customerID++;

    }

    public void login(String customerName, String pass) {

        if (customerName.equals(this.customerName) && pass.equals(this.pass)) {
            access = true;
            System.out.println("Access granted");
        } else {
            access = false;
            System.out.println("\nAccess Denied. Try again.");
        }
    }
    

    public void Order(ArrayList<Items> a, String item, int qty, String address) {
        int index = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).ItemNames.equals(item)) {
                index = i;
            }
        }
        if (a.get(index).Qt > qty) {
            a.get(index).Qt -= qty;
            a.get(index).orderID = orderID++;
            System.out.print("Your order has been placed!"
                    + "\nProduct " + item);
            System.out.println("\nOrder ID: " + orderID);
            System.out.println("Date: " + dateCreated);
            System.out.println("Address: " + address);
            System.out.println("Thank you for shopping with us!");
        }

    }

    public String toString() {
        return "Customer Name: " + customerName +"\nCustomer ID: " + customerID ;
    }

}
class customerHistory extends customer {

    String itemName;
    int orderid;
    Date date = new Date();

    customerHistory(String itemName) {
        orderid = super.orderID;
        date = super.dateCreated;
    }

    public void addCustomerHistory(String itemName) {
        this.itemName = itemName;
        super.itemsPurchased.add(new customerHistory(itemName));
    }
    
}

class Items extends customer {

    String ItemNames;
    int Qt;

    Items(String ItemNames, int Qt) {
        this.ItemNames = ItemNames;
        this.Qt = Qt;
    }

    public void addItem(ArrayList<Items> prod, String ItemNames, int Qt) {
        int index = 0;
        for (int i = 0; i < prod.size(); i++) {
            if (prod.get(i).ItemNames.equals(ItemNames)) {
                index = i;
            }
        }
        prod.get(index).Qt = this.Qt + Qt;
    }

    public String toString() {
        return "Item: " + ItemNames + "\nQuantity: " + Qt;
    }
}

public class InOut {

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {

        Scanner in = new Scanner(System.in);
        // User user = new User();
        ArrayList<Items> products = new ArrayList<Items>();
        products.add(new Items("S22", 50));
        products.add(new Items("S24", 50));
        products.add(new Items("S36", 50));
        products.add(new Items("S40", 50));
        products.add(new Items("S46", 50));

        products.add(new Items("SA22", 50));
        products.add(new Items("SA24", 50));
        products.add(new Items("SA36", 50));
        products.add(new Items("SA40", 50));
        products.add(new Items("SA46", 50));

        products.add(new Items("LG22", 50));
        products.add(new Items("LG24", 50));
        products.add(new Items("LG36", 50));
        products.add(new Items("LG40", 50));
        products.add(new Items("LG46", 50));

        products.add(new Items("P22", 50));
        products.add(new Items("P24", 50));
        products.add(new Items("P36", 50));
        products.add(new Items("P40", 50));
        products.add(new Items("P46", 50));

        ArrayList<customer> Customers = new ArrayList<customer>();
        //USER LOGIN
        String UserN = "";
        String Upass = "";
        while (UserN.equals("Admin") == false && Upass.equals("Admin@123") == false) {
            System.out.println("---USER LOGIN---");
            System.out.print("User name: ");
            UserN = in.next();
            System.out.print("Password: ");
            Upass = in.next();
            if (UserN.equals("Admin") == false && Upass.equals("Admin@123") == false) {
                System.out.println("Wrong input. Try Again.");

            }
        }
        System.out.println("\nAccess Granted!");
        //CUSTOMER LOGIN
        int choice = -1;
        while (choice != 0) {
            System.out.println("\nWelcome to In & Out!\n");
            System.out.println("1. Register.\n"
                    
                    + "2. Add item.\n"
                    + "3. List of items.\n"
                    + "4. Purchase.\n"
                    + "0. Exit\n");

            System.out.print("Your choice: ");
            choice = in.nextInt();
            if (choice == 1) {
                in.nextLine();
                System.out.print("Input your user name -> ");
                String userName = in.nextLine();
                System.out.print("Input your password -> ");
                String passw = in.nextLine();
                Customers.add(new customer(userName, passw));
                
                FileWriter f = new FileWriter("Customers.txt",true);
                BufferedWriter bw = new BufferedWriter(f);
                PrintWriter output = new PrintWriter(bw);
                for (int i=0;i< Customers.size();i++)
                {
                    output.println(Customers.get(i).toString());
                }
                output.close();
            }
            
            in.nextLine();
            if (choice == 2) {
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(products.get(i));
                    System.out.println("");
                }
                System.out.print("Which item do you wish to add? ");
                String itm = in.nextLine();
                System.out.print("Input Quantity: ");
                int qty = in.nextInt();
                int index = 0;
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).ItemNames.equals(itm)) {
                        index = i;
                    }
                }
                products.get(index).Qt += qty;
            }
            if (choice == 3) {
                //System.out.print(products);
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(products.get(i));
                    System.out.println("");
                }
            }
            in.nextLine();

            if (choice == 4) {

                System.out.print("Input your name: ");
                String n = in.nextLine();

                for (int i = 0; i < products.size(); i++) {
                    System.out.println(products.get(i));
                    System.out.println("");
                }
                System.out.print("Which item do you wish to purchase? ");

                String purchaseItem = in.nextLine();
                System.out.print("\nInput quantity: ");
                int qt = in.nextInt();
                in.nextLine();
                System.out.print("Input address: ");
                String address = in.nextLine();
                int index = 0;
                for (int i = 0; i < Customers.size(); i++) {
                    if (Customers.get(i).customerName.equals(n)) {
                        index = i;
                    }
                }
                Customers.get(index).Order(products, purchaseItem, qt, address);
                /*for (int i = 0; i < Customers.size(); i++) {
                    if (Customers.get(i).equals(n)) {
                        index2 = i;
                    }
                }*/
                //Customers.get(index2).itemsPurchased.add(new customerHistory(purchaseItem));
                
                FileWriter f = new FileWriter("PurchaseDetails.txt",true);
                BufferedWriter bw = new BufferedWriter(f);
                PrintWriter output = new PrintWriter(bw);
                for (int j=0;j<Customers.size();j++)
                {   
                    output.print("Product bought: "+ purchaseItem);
                    output.print("--OrderID: "+ Customers.get(index).orderID);
                    output.print("--Address: "+ address);
                    output.print("--Quantity: "+ qt);
                    output.println();
                }
                output.close();
            }
            in.close();
        }

    }
}

