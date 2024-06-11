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
import java.util.Date;

public class Order {
    private Customer customer;
    private ArrayList<Product> products;
    private Date orderDate;

    public Order(Customer customer, ArrayList<Product> products) {
        this.customer = customer;
        this.products = products;
        this.orderDate = new Date(); // Tanggal pesanan dibuat saat ini
    }

    // Getter and Setter methods
    // (Other relevant code)
}

