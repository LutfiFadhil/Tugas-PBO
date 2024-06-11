/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

/**
 *
 * @author USER
 */
import java.util.ArrayList;

public class Store {
    private final ArrayList<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    // Metode untuk menambahkan produk ke dalam toko
    public void addProduct(Product product) {
        products.add(product);
    }

    // Getter untuk mendapatkan daftar produk dalam toko
    public ArrayList<Product> getProducts() {
        return products;
    }
}


