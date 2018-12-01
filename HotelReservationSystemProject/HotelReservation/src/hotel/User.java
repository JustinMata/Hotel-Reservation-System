package hotel;

import java.util.ArrayList;

public abstract class User {
    private String id;
    private String password;
    private String username;
    ArrayList<Reservation> reservations;
    
    public User(String username,String id, String password) {
        this.id = id;
        this.password = password;
        this.username = username;

    }
    
    public String getId() {
        return id;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public ArrayList<Reservation> getReservations() {
    	return reservations;
    }
    
    public void setPassword(String newPwd) {
        this.password = newPwd;
    }
    
    public boolean verification(String id, String password) {
        if(this.id.equals(id) && this.password.equals(password))
        {
        	System.out.println("Log in Sucess");
        	return true;
        }
        System.out.println("Log in Fail");
        return false;
    }
    
    public String toString() {
        return "Name: " + username + "  ID: " + id;
    }
}


