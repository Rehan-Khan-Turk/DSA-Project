package models;

public class customer {
    private int customerid;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String cnic;

    public customer (int customerid, String name, String phone, String email, String address, String cnic) {
        setcustomerid(customerid);
        setname(name);
        setphone(phone);
        setemail(email);
        setaddress(address);
        setcnic(cnic);
    }
    public int getcustomerid(){
        return customerid;
    }
    public void setcustomerid(int customerid){
        if (customerid <=0) {
            throw new IllegalArgumentException("Customer ID must be positive");
        }
        this.customerid =customerid;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be Empty.");
        }
        this.name=name.trim();
    }
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        if (phone == null || !phone.matches("\\d{11}")){
            throw new IllegalArgumentException("Phone must contain 11 digits");
        }
        this.phone=phone;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        if (email == null ||
            !email.matches ("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
                throw new IllegalArgumentException("Invalid Email Address");
            }
            this.email=email;
    }
    public String getaddress() {
        return address;
    }
    public void setaddress(String address){
        if (address==null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        this.address=address.trim();
    }
    public String getcnic() {
        return cnic;
    }
    public void setcnic(String cnic){
        if (cnic==null || !cnic.matches("\\d{5}-\\d{7}-\\d")) {
            throw new IllegalArgumentException("CNIC must be in XXXXX-XXXXXXX-X format.");
        }
        this.cnic=cnic;
    }
    public void updatephone(String phone){
        setphone(phone);
    }
    public void updateemail(String email){
        setemail(email);
    }
    public void updateaddress(String address){
        setaddress(address);
    }
    public void displaycustomerdetails(){
         System.out.println("Customer ID: " + customerid);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("CNIC: " + cnic);
    }
    @Override 
     public String toString() {
        return "Customer ID: " + customerid + ", Name: " + name + ", Phone: " + phone + ", Email: " + email + ", Address: " + address + ", CNIC: " + cnic;
    }
}
