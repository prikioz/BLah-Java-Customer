public class Customer {

    // Customer information
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    // Constructor
    public Customer(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Print customer information
    public void printCustomerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}