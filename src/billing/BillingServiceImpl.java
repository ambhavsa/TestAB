package billing;

import entity.Item;

import java.util.Map;

public class BillingServiceImpl implements BillingService {

    private static final String BILL_PRINT_FORMAT = "\n%d" + " x " + "%s" + " @ " + "%f = %f";
    private static final String TOTAL = "\n\nTotal %f= ";
    private Double billAmount = 0.0;

    @Override
    public Double getTotalBillAmount(Map<Item, Integer> cart) {
        Item item;
        Double price;
        Integer quantity;
        for (Map.Entry entry : cart.entrySet()) {
            item = ((Item) entry.getKey());
            price = item.getPrice();
            quantity = (Integer) entry.getValue();
            billAmount = calculateFinalAmount(billAmount, price, quantity);
            printItemsAndTotal(item, quantity, price);
        }
        printTotal(billAmount);
        return billAmount;
    }

    private Double calculateFinalAmount(Double billAmount, Double price, Integer quantity) {
        billAmount += price * quantity;
        return billAmount;
    }

    private static void printItemsAndTotal(Item item, Integer quantity, Double price) {
        System.out.printf(BILL_PRINT_FORMAT, quantity, item.getLabel(), item.getPrice(), price);
    }

    private static void printTotal(Double total) {
        System.out.printf(TOTAL, total);
    }

}
