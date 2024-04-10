public class ShopMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        CartItem item1 = new CartItem("Item1", 10.0, 2);
        CartItem item2 = new CartItem("Item2", 20.0, 1);

        cart.addItem(item1);
        cart.addItem(item2);

        Double totalCost = cart.getTotalCost();

        System.out.println("Total Cost: $"+ totalCost);
    }
}
