package billing;

import entity.Item;

import java.util.Map;

public interface BillingService {

    Double getTotalBillAmount(Map<Item, Integer> cart);
}
