/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Menu;

import CRUD.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan informasi produk
        System.out.println("Masukkan nama produk: ");
        String productName = scanner.nextLine();

        // Menangani input harga produk
        double productPrice = 0;
        boolean validPrice = false;
        while (!validPrice) {
            try {
                System.out.println("Masukkan harga produk: ");
                productPrice = scanner.nextDouble();
                validPrice = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Harga produk harus berupa angka. Silakan coba lagi.");
                scanner.next(); // Membersihkan token yang tidak valid dari input
            }
        }

        System.out.println("Masukkan jumlah produk: ");
        int productQuantity = scanner.nextInt();

        Product product = new Product(productName, productPrice, productQuantity);

        System.out.println("Produk baru ditambahkan: " + product.getName() + " (Harga: " + product.getPrice() + ", Jumlah: " + product.getQuantity() + ")");

    }
}



