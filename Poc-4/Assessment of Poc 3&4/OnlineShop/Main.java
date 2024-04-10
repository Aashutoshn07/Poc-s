package OnlineShop;

public class Main {
    public static void main(String[] args) {
        Store store = Store.getInstance();
        Product product1 = new Product("Product 1", 10.0, 5);
        Product product2 = new Product("Product 2", 20.0, 3);
        store.addProduct(product1);
        store.addProduct(product2);

        User user1 = new User("user1");
        store.registerUser(user1);

        store.displayProducts();

        ShoppingCart cart1 = user1.getCart();
        cart1.addItem(product1, 2);
        cart1.addItem(product2, 1);

        cart1.viewCart();
        cart1.placeOrder();
    }
}