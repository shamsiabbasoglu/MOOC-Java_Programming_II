
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (shoppingCart.containsKey(product)) {
            shoppingCart.get(product).increaseQuantity();
            return;
        }
        shoppingCart.put(product, new Item(product, 1, price));
    }
    
    public int price() {
        int sum = 0;
        for (Item item : shoppingCart.values()) {
            sum += item.price();
        }
        return sum;
    }
    
    public void print() {
        for (Item item : shoppingCart.values()) {
            System.out.println(item);
        }
    }
}
