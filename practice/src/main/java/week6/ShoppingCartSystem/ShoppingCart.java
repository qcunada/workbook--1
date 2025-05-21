package week6.ShoppingCartSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart(List<Product> items) {
        this.items = items;
    }
    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addItem(Product product){
        items.add(product);
    }
    public void printReceipt(){
        double tax =  0.21; //21% tax rate

        for (Product item : items){
            System.out.println("Item : " + item.getName() + "\nOriginal Price: $" + String.format("%.2f",item.getPrice()) + "\nTax amount: " + String.format("%.2f",(item.getPrice() * tax)) + "\nTotal after tax: $" + String.format("%.2f",(item.getPrice() +(item.getPrice() * tax))));
            System.out.println("-------------------");
        }
    }
}

