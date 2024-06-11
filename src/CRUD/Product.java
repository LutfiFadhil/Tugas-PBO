/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

/**
 *
 * @author USER
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter untuk nama produk
    public String getName() {
        return name;
    }

    // Getter untuk harga produk
    public double getPrice() {
        return price;
    }

    // Getter dan setter untuk jumlah produk
    // (Kode lain yang sesuai)

    // Jangan lupa untuk mengimplementasikan metode getter dan setter untuk quantity

    public String getQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



