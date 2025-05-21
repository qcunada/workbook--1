package week6.ShoppingCartSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Cup Noodles",2);
        Product product2 = new Product("soda",4);
        Product product3 = new Product("candy",1.50);

        ShoppingCart cart1 = new ShoppingCart();
        System.out.println("Cart 1");

        cart1.addItem(product1);
        cart1.addItem(product2);
        cart1.addItem(product3);

        cart1.printReceipt();

        DiscountedProduct discountedProduct1 = new DiscountedProduct("soap",8.50,0.30);
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem(discountedProduct1);
        cart2.printReceipt();


    }
}
