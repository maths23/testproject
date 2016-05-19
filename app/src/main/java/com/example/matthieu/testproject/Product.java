package com.example.matthieu.testproject;

/**
 * Created by eung on 19/05/16.
 */
public class Product {

    private int id;
    private int prix;
    private String name;
    private String surname;


    public Product(int id, int prix) {
        this.id = id;
        this.prix = prix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
