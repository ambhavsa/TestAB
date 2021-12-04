package cart;

import entity.Item;
import productCataloge.ProductCatalogCache;

import java.util.HashMap;
import java.util.Map;

public class CartServiceImpl implements CartService {

    private static Map<Item, Integer> itemsInCart = new HashMap<>();

    @Override
    public void addItemToCart(String barcode) {
        Item i = ProductCatalogCache.getValue(barcode);
        checkAndAddItem(i);
    }

    private void checkAndAddItem(Item i) {
        if (!itemsInCart.containsKey(i)) {
            itemsInCart.put(i, 1);
        } else {
            itemsInCart.put(i, itemsInCart.get(i) + 1);
        }
    }

    @Override
    public Map<Item, Integer> getCart() {
        return itemsInCart;
    }

    @Override
    public void clearCart() {
        itemsInCart.clear();
    }


//    @Override
//    public int getItemCount(String barcode) {
//        Item i = ProductCatalogCache.getItem(barcode);
//        if (!itemsInCart.containsKey(i)) {
//            return 0;
//        }
//        return itemsInCart.get(barcode);
//    }
}
