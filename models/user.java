package models;
import java.util.regex.Pattern;
public class user {
    private int UserID;
    private String username;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String role;
    private boolean active;
    public user(int UserID, String username, String name, String email, String password, String phone, String role) {
        setUserID(UserID);
        setUsername(username);
        setname(name);
        setemail(email);
        setpassword(password);
        setphone(phone);
        setrole(role);
        this.active=true;
    }
    public int getUserID() {
        return UserID;
    }
    public void setUserID(int UserID) {
        if (UserID <= 0){
            throw new IllegalArgumentException("User ID must be positive");
        }
        this.UserID=UserID;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        if (username==null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        this.username=username.trim();
    }
    public String getname() {
        return name;
    }
    public void setname(String name){
        if (name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name=name.trim();
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        if (email==null ||
            !Pattern.matches("^[\\\\w.-]+@[\\\\w.-]+\\\\.[A-Za-z]{2,}$",email)) {
                throw new IllegalArgumentException("Invalid Email.Please enter a valid email address");
            }
            this.email=email.trim();
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        if (password==null || password.length()<8){
            throw new IllegalArgumentException("Invalid Password.Please enter a valid password");
        }
        this.password=password;
    }
    public String getphone(){
        return phone;
    }
    public void setphone(String phone){
        if (phone==null || phone.trim().isEmpty()){
            throw new IllegalArgumentException("Phone cannot be empty");
        }
        this.phone=phone.trim();
    }
    public String getrole(){
        return role;
    }
    public void setrole(String role){
        if(role==null ||
            !(role.equalsIgnoreCase("Admin")||
            role.equalsIgnoreCase("Sales Staff")||
            role.equalsIgnoreCase("Manager")||
            role.equalsIgnoreCase("Customer"))){
                throw new IllegalArgumentException("Invalid User Role");
            }
            this.role=role.trim();
    }
    public boolean isActive() {
        return  active;
    }
    public void setActive(boolean active){
        this.active=active;
    }
    public boolean login(String enteredusername, String enteredpassword ) {
        return active && username.equals(enteredusername) && password.equals(enteredpassword);
    }
    public void logout(){
        System.out.println(name + "is logged out");
    }
    public void displayUserdetails() {
        System.out.println("UserID: " + UserID );
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Role: " + role);
        System.out.println("Status: " + (active ? "Active" : "Inactive"));
    }
    public void deactivateUser() {
        active=false;
    }
    public void activateUser() {
        active=true;
    }
    public String toString() {
        return "UserID: " + UserID + ",Name: " + name + ",Username: " + username + ",Email: " + email + ",Phone: " 
        + phone + ",Role: " + role + ",Status: " + (active ? "Active" : "Inactive");
    }
}
