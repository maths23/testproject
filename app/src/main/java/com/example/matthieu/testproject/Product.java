package com.example.matthieu.testproject;

/**
 * Created by eung on 19/05/16.
 */
public class Product {

    private int id;
    private int prix;

    public Product(int id, int prix) {
        this.id = id;
        this.prix = prix;
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
