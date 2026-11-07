package src.Managers;
import src.Models.customer;
import java.util.ArrayList;
public class CustomerManager {
    private ArrayList<customer> customers;
    public CustomerManager() {
        customers = new ArrayList<>();
    }
    public void addCustomer(customer customer) {
        customers.add(customer);
    }
    public void displayCustomers() {
        for (customer customer : customers) {
            customer.displaycustomerdetails();
            System.out.println();
        }
    }
    public customer searchCustomer(int customerid) {
        for (customer customer : customers) {
            if (customer.getcustomerid() == customerid) {
                return customer;
            }
        }
        return null;
    }
    public void updateCustomerPhone(int customerid, String phone) {
        customer customer = searchCustomer(customerid);
        if (customer != null) {
            customer.updatephone(phone);
            System.out.println("Phone updated successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }
    public void updateCustomerEmail(int customerid, String email) {
        customer customer = searchCustomer(customerid);
        if (customer != null) {
            customer.updateemail(email);
            System.out.println("Email updated successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }
    public void updateCustomerAddress(int customerid, String address) {
        customer customer = searchCustomer(customerid);
        if (customer != null) {
            customer.updateaddress(address);
            System.out.println("Address updated successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }
    public void deleteCustomer(int customerid) {
        customer customer = searchCustomer(customerid);
        if (customer != null) {
            customers.remove(customer);
            System.out.println("Customer deleted successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }
}
