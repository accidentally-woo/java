package io.java.v8.syntax.clazz;

public class OrderProduct {
    private String name;
    private Integer price;

    public OrderProduct(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void printNamePrice() {
        System.out.println(name + ", " + price);
    }
}
