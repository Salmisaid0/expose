package com.salmi20015.vivlo;

public class User {
    private String username;
    private String password;
    private String  email;
    private int phoneNumber;
    public User(String user ,String password , String email, int phoneNumber){
        this.username=user;
        this.password=password;
        this.email=email;
        this.phoneNumber=phoneNumber;

    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username
                ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String passworld) {
        this.password = password;
    }

    public void setUsername(String user) {
        this.username = username;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
