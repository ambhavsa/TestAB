package cart;

import entity.Item;

import java.util.Map;

public interface CartService {

    void addItemToCart(String barcode);
    Map<Item, Integer> getCart();
    void clearCart();
}
