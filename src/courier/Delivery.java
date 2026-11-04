package courier;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<DeliveryAgent>agents = new ArrayList<>();
    static ArrayList<parcel>parcels = new ArrayList<>();
    static ArrayList<Delivery>deliveries = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);


//-------------------------------
//REGISTER CUSTOMER
//-------------------------------

    public static void registerCustomer() {

        System.out.println("\n====CUSTOMER REGISTRATION====");

        System.out.print("Customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Mobile: ");
        String mobile = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, mobile, email, city, address);

        customers.add(customer);

        System.out.println("\nCustomer registered successfully!");
    }

// ===============================
// REGISTER DELIVERY AGENT
// ===============================

    public static void registerAgent() {

        System.out.println("\n===== DELIVERY AGENT REGISTRATION =====");

        System.out.println("Register Delivery Agent function");

    }
}