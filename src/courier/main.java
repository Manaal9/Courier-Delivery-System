package courier;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<DeliveryAgent> agents = new ArrayList<>();
    static ArrayList<parcel> parcels = new ArrayList<>();
    static ArrayList< Delivery> deliveries = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    // ============================
// REGISTER CUSTOMER
// ============================

    public static void registerCustomer() {

        System.out.println("\n===== CUSTOMER REGISTRATION =====");

        System.out.print("Customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Mobile: ");
        String mobile = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();
    }
}