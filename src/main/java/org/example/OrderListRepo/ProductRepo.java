package org.example.OrderListRepo;

import java.util.ArrayList;
import java.util.List;
public class ProductRepo {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int produktnummer) {
        products.removeIf(product -> product.Produktnummer() == produktnummer);
    }


    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    public static void main(String[] args) {
        var repo = new ProductRepo();

        repo.addProduct(new Product(101, "Mate", 1.20));


        repo.getAllProducts().forEach(System.out::println);

    }
}