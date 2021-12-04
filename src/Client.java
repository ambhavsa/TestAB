import billing.BillingService;
import billing.BillingServiceImpl;
import cart.CartService;
import cart.CartServiceImpl;

public class Client {

    public static void main(String[] args) {

        CartService cartService = new CartServiceImpl();
        cartService.clearCart();
        cartService.addItemToCart("010010");
        cartService.addItemToCart("010020");
        cartService.addItemToCart("010020");
        cartService.addItemToCart("010030");

        BillingService bill = new BillingServiceImpl();
        Double totalBillAmount = bill.getTotalBillAmount(cartService.getCart());
    }
}
