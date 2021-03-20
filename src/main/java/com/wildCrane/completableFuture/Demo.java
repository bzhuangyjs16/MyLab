package com.wildCrane.completableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Demo {
    public static void main(String[] args) {
        Shop shop = new Shop("BestShop");
        Double d = shop.getPrice("my favorite product");
        System.out.println(d);
        Future<Double> futurePrice = shop.getPriceAsync("my favorite product");
        doSomethingElse();
        try {
            double price = futurePrice.get();
            System.out.printf("Price is %.2f%n", price);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void doSomethingElse() {
        System.out.println("Doing something else...");
    }
}
