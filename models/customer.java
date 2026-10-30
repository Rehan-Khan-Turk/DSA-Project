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
}
