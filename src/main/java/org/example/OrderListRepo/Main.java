package org.example.OrderListRepo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int proNum = sc.nextInt();
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(proNum, "Rs Chrono watch", 79.20));

        OrderListRepo orderRepo = new OrderListRepo();
        orderRepo.addOrder(new Order(23, productRepo.getAllProducts().get(0), 2, LocalDate.now()));

        for (Order order : orderRepo.getAllOrders()) {
            System.out.println(order);
        }

        orderRepo.removeOrder(1);
    }
}
