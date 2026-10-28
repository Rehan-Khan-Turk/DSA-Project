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
}
