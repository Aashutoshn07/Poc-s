package OnlineShop;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static Store instance;
    private List<Product> products;
    private List<User> users;

    private Store() {
        products = new ArrayList<>();
        users = new ArrayList<>();
    }

    public static Store getInstance() {
        if (instance == null) {
            instance = new Store();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice() +
                    " (Quantity: " + product.getQuantityInStock() + ")");
        }
    }

    public List<User> getUsers() {
        return users;
    }
}
