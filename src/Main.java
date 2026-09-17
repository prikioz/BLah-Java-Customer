import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ArrayList stores references to Customer objects
        ArrayList<Customer> customers = new ArrayList<>();

        // Get information for 2 customers
        for (int i = 1; i <= 2; i++) {

            System.out.println("Enter information for Customer " + i);

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Address: ");
            String address = input.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            // Create a Customer object
            Customer customer = new Customer(
                    name,
                    address,
                    phoneNumber,
                    email
            );

            // Store the reference to the object in the ArrayList
            customers.add(customer);

            System.out.println();
        }

        // Print all customer information
        System.out.println("===== CUSTOMER INFORMATION =====");

        for (Customer customer : customers) {
            customer.printCustomerInfo();
            System.out.println("-------------------------------");
        }

        input.close();
    }
}