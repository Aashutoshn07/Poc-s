package OnlineShop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        if (product.getQuantityInStock() >= quantity) {
            cartItems.add(product);
            product.setQuantityInStock(product.getQuantityInStock() - quantity);
        } else {
            System.out.println("Insufficient quantity in stock for " + product.getName());
        }
    }

    public void viewCart() {
        System.out.println("Shopping Cart:");
        for (Product product : cartItems) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void placeOrder() {
        System.out.println("Order Placed!");
        cartItems.clear();
    }
}
