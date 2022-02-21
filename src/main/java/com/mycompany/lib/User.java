package com.mycompany.lib;

public class User {
    private String nom;
    private String prenom;
    private int age;
    public User(String nom, String prenom, int age) {
        this.nom = nom;
        this.age = age;
        this.prenom=prenom;
    }
    
    @Override
    public String toString() {
        return String.format("Hello %s %s, tu as %d ans lol ", prenom, nom,age);
    }
}
