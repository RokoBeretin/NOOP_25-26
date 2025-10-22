package pckg_paymentstrategy;

public class ShoppingCart{
    private int totalAmount;

    public ShoppingCart() {
        this.totalAmount = 0;
    }

    public void addItem(int price) {
        totalAmount += price;
    }

    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(totalAmount);
    }

}
