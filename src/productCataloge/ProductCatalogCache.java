package productCataloge;

import entity.Item;

import java.util.*;

public final class ProductCatalogCache {

    private final static Map<String, Item> productCatalog = new HashMap<>();


    public static Map<String, Item> getProductCatalog() {
        return productCatalog;
    }

    static {
        buildProductCatalogue("010010", new Item("Apple", 12.2, "010010"));
        buildProductCatalogue("010020", new Item("Carrot", 15.2, "010020"));
        buildProductCatalogue("010030", new Item("Oranges", 18.2, "010030"));
    }


    private static void buildProductCatalogue(String barCode, Item item) {
        productCatalog.put(barCode, item);
    }

    public static Item getValue(String barCode) {
        return productCatalog.get(barCode);
    }

}
