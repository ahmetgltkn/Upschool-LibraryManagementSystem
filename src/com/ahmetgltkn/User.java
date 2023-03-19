package com.ahmetgltkn;

public class User {
    private String name;
    private String email;
    private String address;

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printUserInfo(){
        System.out.println("Kullanıcı adı: " + name);
        System.out.println("E-posta: " + email);
        System.out.println("Adres: " + address);
        System.out.println();
    }
}
