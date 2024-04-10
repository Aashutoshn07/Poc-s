public class CartItem {
    private String name;
    private Double price;
    private int quantity;

    public CartItem(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getTotalPrice(){
        return price * quantity;
    }
}