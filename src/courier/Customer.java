package courier;

public class Customer {

    private  int customerId;
    private String name;
    private String mobile;
    private String email;
    private String city;
    private String address;

    public Customer( int customerId,String name, String mobile, String email, String city, String address) {

        this.customerId = customerId;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }
    public void displayCustomer() {

        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
        System.out.println("Mobile      : " + mobile);
        System.out.println("Email       : " + email);
        System.out.println("City        : " + city);
        System.out.println("Address     : " + address);
    }
}