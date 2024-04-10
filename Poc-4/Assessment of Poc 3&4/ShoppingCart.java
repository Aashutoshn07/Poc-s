import java.util.ArrayList;
import java.util.List;

public class ShoppingCart  {
    List <CartItem> cartItems;

    public ShoppingCart(){
        cartItems = new ArrayList<>();
    }
    public void addItem(CartItem item){
        cartItems.add(item);
    }
    public Double getTotalCost(){
        Double totalCost = 0.0;
        for(CartItem item: cartItems){
            totalCost += item.getTotalPrice();
        }
        return totalCost;
    }
}
