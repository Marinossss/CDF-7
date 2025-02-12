package gr.aueb.cf.ch19.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static gr.aueb.cf.ch6.ArraysAsCollections.mapToDouble;

public class MapMain {
    public static void main(String[] args) {
        List<Product> products = List.of
                (new Product("Apple", 10.5, 45),
                new Product("Oranges", 8.5,20),
                new Product("Mangoes", 18.5, 50),
                new Product("Strawberries", 12.4,30),
                new Product("Oranges", 10.5,80));

        ArrayList<String> listOfFruitNames = products.stream()
                .map(Product::getName)
                .collect(Collectors.toCollection(ArrayList::new));

        int totalQuantities = products.stream()
                .filter(p -> p.getName().equals("Oranges"))
                .mapToInt(Product::getQuantity)
                .sum();
        System.out.println(totalQuantities);


        double totalPrice = products.stream()
                .filter(p -> p.getName().equals("Oranges"))
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println(totalPrice);


    }
}