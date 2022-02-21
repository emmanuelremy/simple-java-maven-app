package com.mycompany.lib;

public class User {
    private String nom;
    private int age;
    public User(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    @Override
    public String toString() {
        
        return String.format("Hello %s, tu as %d ans ", nom,age);
    }
}
